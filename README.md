# 软件体系结构课程设计 --图书管理系统
感谢各位老哥。
- Spring  框架
- Java     实现
- MySQL 数据库

##一点说明
- src/sqlMapConfig.xml文件的21行，22行改成你自己数据库的账号密码。
- lib文件夹下是所有的依赖jar包（除了JUnit4，如果你喜欢别的测试套件）。如果你缺了可以在里面翻。
- 项目文档/LIBRARY SQL.txt文件记录了建数据库和建表语句，请手动在数据库终端输入。

## DAO的使用
### 范式
- 调用DBTools的静态方法获得数据库会话实例。
```java
SqlSession sqlSession= DBTools.getSession();
```
- 通过注入获得想要的DAO对象。
```java
BookDao bookDao = sqlSession.getMapper(BookDao.class);
```
- 查看每个DAO类的文档调用DAO对象的方法进行数据库访问操作。javadoc文档在项目文档/javadoc里。
```java
//查询作者为'QE'，标题包含'本'字的所有书
Book book = new Book();
        book.setAuthor("0");
        book.setName("本");
bookDao.selectBooks(book)
            .forEach(System.out::println);
```
- 如果操作涉及修改数据库，需要commit(提交修改)或rollback(回滚修改)。
```java
sqlSession.commit();
//or
sqlSession.rollback();
```
- 最后关闭会话
```
sqlSession.close();
```

### 完整例子
```java
        //获得DAO实例
        SqlSession sqlSession= DBTools.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = new Book();
        book.setAuthor("0");
        book.setName("本");

        //查询作者为'QE'，标题包含'本'字的所有书
        bookDao.selectBooks(book)
                .forEach(System.out::println);

        //如果操作对数据库中数据不做任何修改，可以省略调用commit或rollback
        //提交修改
        sqlSession.commit();

        //回滚修改，仿佛什么也没有发生。
        //sqlSession.rollback();

        //关闭数据库会话，释放资源
        sqlSession.close();
```
