package com.ynnz.entity;

/**
 * @Title: Book
 * @Description:
 * @PACKAGE_NAME：com.ynnz.entity
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:35
 */
public class Book {
    private String bookId;

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    private String bookName;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book() {
    }

    public Book(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}
