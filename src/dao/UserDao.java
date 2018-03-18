package dao;

import domain.User;

import java.util.List;

/**
 * 用户的DAO
 * 本接口将由配置文件mapper/usermapper.xml注入实现
 * @author 冯秋翼
 */
public interface UserDao {

    /**
     * 新建新用户，需求五个字段(username,password,gender,birthday,contact)。插入成功会设置id字段。
     * @param user 用户。username如果与现有的重复会抛出异常，请先查询是否有同名用户。
     */
    public void insertUser(User user);

    /**
     * 通过Id字段删除用户
     * @param user 用户
     */
    public void deleteUserById(User user);

    /**
     * 通过id字段更新用户信息。支持更新(password,gender,birthday,contact)四个字段。不想更新的字段请保留默认值。
     * @param user 用户
     */
    public void changeUserInfo(User user);

    /**
     * 多字段查询，支持字段(id,username,gender,birthday,contact)。不查询字段请保留默认值。
     * @param user 用户
     * @return 查询到的User列表
     */
    public List<User> selectUser(User user);
}
