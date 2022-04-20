package com.ynnz.test;

import com.ynnz.entity.Major;
import com.ynnz.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 9:33
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        Major major = (Major) context.getBean("major");
        System.out.println(major);
    }

}
