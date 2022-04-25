package com.ynnz.test;

import com.ynnz.entity.Book;
import com.ynnz.entity.Student;
import com.ynnz.service.BorrowAndReturnService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test2
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:48
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        Book book = (Book) context.getBean("book");
        BorrowAndReturnService service = (BorrowAndReturnService) context.getBean("service");
        student.setStuId("3486");
        student.setStuName("赵xx");
        book.setBookId("B1578");
        book.setBookName("红楼梦");
        service.borrowBook(student, book);
        System.out.println("10天后");
        service.returnBook(student, book);

    }
}
