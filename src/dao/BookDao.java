package dao;

import domain.Book;

import java.util.List;

/**
 * 书籍的DAO(data access object)
 * 本接口将由配置文件mapper/bookmapper.xml注入实现
 * @author 冯秋翼
 */
public interface BookDao {

    /**
     * 添加书
     * @param book 欲添加的书，需要四个非空字段:name,author,type,publisher
     */
    public void insertBookAndSetId(Book book);

    /**
     * 查询书，名字模糊匹配，其他字段精确匹配，如果不想匹配某一字段，请将不要调用那一字段的setter方法。一共能检索除了id和到期时间的五个字段。
     * @param book 欲查询的书，如果任何字段都不设置，则返回所有图书。这会消耗大量查询资源，请注意！
     * @return 查到的书的列表
     */
    public List<Book> selectBooks(Book book);

    /**
     * 仅通过id字段删除书，请先用查询获得书的id
     * @param book 至少包含id字段的book对象
     */
    public void deleteBookById(Book book);

    /**
     * 仅通过id字段借阅书。id,borrower,dueTime三个字段必须非空。
     * 如果该书已有人借阅，借书操作不会发生。
     * dueTime使用java.sql.Date类，请查阅java官方手册。
     * @param book 书
     */
    public void borrowBook(Book book);

    /**
     * 仅通过id字段还书。
     * @param book 书
     */
    public void returnBook(Book book);

    /**
     * 仅通过id字段更新书。至少需要非空的一个id字段和{name,author,type,publisher}字段中的一个或几个。
     * @param book 书
     */
    public void updateBook(Book book);
}
