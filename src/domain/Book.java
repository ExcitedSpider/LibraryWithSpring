package domain;

import java.sql.Date;

/**
 * 代表Book的bean
 * @author 冯秋翼
 */
public class Book {
    private int id = -1;
    private String name;
    private String author;
    private int type = -1;
    private String publisher;
    private int borrower = -1;
    private Date dueDate;

    public Book(int id, String name, String auther, int type, String publisher, int borrower, Date dueDate) {
        this.id = id;
        this.name = name;
        this.author = auther;
        this.type = type;
        this.publisher = publisher;
        this.borrower = borrower;
        this.dueDate = dueDate;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auther) {
        this.author = auther;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getBorrower() {
        return borrower;
    }

    public void setBorrower(int borrower) {
        this.borrower = borrower;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", publisher='" + publisher + '\'' +
                ", borrower=" + borrower +
                ", dueDate=" + dueDate +
                '}';
    }
}
