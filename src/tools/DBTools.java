package tools;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * 这是数据库工具类
 * @author 冯秋翼
 */
public class DBTools {
    public static SqlSessionFactory sessionFactory;

    static{
        try {
            //使用MyBatis提供的Resources类加载mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
            //构建sqlSession的工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获得一个数据库会话实例。
     * @return 数据库会话实例对象。
     */
    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }

}