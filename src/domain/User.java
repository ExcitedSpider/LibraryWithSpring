package domain;

import java.sql.Date;

/**
 * User类bean
 * @author 冯秋翼
 */
public class User {
    private int id;
    private String username;
    private String password;
    private int gender = -1;
    private Date birthday;
    private String contact;

    public static final int GENDER_MALE = 0;
    public static final int GENDER_FEMALE = 1;

    public User() {
    }

    public User(int id, String username, String password, int gender, Date birthday, String contact) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", contact='" + contact + '\'' +
                '}';
    }
}
