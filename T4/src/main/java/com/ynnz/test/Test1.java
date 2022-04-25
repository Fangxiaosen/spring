package com.ynnz.test;

import com.ynnz.dao.StudentDao;
import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test1
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/26 19:18
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = new Student();
        student.setId(1002);
        student.setName("码云");
        student.setSex("男");
        student.setAge(22);
        //调用业务层的方法实现西新增
        int count = studentService.insertStudent(student);
        if (count > 0) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
