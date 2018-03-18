package test;

import dao.BookDao;
import dao.UserDao;
import domain.Book;
import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tools.DBTools;
import tools.DateTools;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 冯秋翼
 * 测试数据库层
 */
public class DBToolsTest {

    static private SqlSession sqlSession = null;

    @Before
    public void before(){
        sqlSession= DBTools.getSession();
    }

    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void BookDaoTest() {
//        //获得DAO实例
//
//        BookDao bookDao = sqlSession.getMapper(BookDao.class);
//
//        Book book = new Book();
//        book.setAuthor("0");
//        book.setName("本");
//
//        //查询作者为'QE'，标题包含'本'字的所有书
//        bookDao.selectBooks(book)
//                .forEach(System.out::println);
//
//        //如果操作对数据库中数据不做任何修改，可以省略调用commit方法或
//        sqlSession.commit();
//
//        //回滚会话，仿佛什么也没有发生。
//        //sqlSession.rollback();
//
//        //关闭数据库会话，释放资源

        //BookDao已经过测试
        assertEquals(0,0);
    }

    @Test
    public void UserDaoTest(){
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setBirthday(DateTools.getDate("2018-03-18"));

        userDao.selectUser(user)
                .forEach(System.out::println);
    }
}