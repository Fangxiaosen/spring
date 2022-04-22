package com.ynnz.service;

import com.ynnz.entity.Book;
import com.ynnz.entity.Student;

/**
 * @Title: BorrowAndReturnService
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:38
 */
public class BorrowAndReturnService {
    //借书的方法
    public void borrowBook(Student student, Book book){
        System.out.println("学生编号："+student.getStuId()+"，学生姓名："+student.getStuName()+"，借阅书名："+book.getBookName()+"，编号："+book.getBookId()+"的书籍！");
    }

//    还书的方法
    public void returnBook(Student student,Book book){
        System.out.println("学生编号："+student.getStuId()+"，学生姓名："+student.getStuName()+"，归还书名："+book.getBookName()+"，编号："+book.getBookId()+"的书籍！");

    }
}
