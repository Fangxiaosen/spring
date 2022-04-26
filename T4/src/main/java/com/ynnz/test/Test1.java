package com.ynnz.test;

import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = context.getBean(Student.class);
        //设置新增数据
        student.setId(1002);
        student.setName("码云");
        student.setSex("男");
        student.setAge(55);
        //调用业务层的方法实现新增
        int count = studentService.insertStudent(student);
        if (count > 0) {
            System.out.println("新增成功");
        } else {
            System.out.println("新增失败");
        }
        //新增成功后查询
        System.out.println(studentService.queryStudent());
        //更新的方法-第一条数据，设置数据
        student.setId(1002);
        student.setName("普云");
        student.setSex("女");
        student.setAge(42);
        int updateStudent = studentService.updateStudent(student);
        if (updateStudent > 0) {
            System.out.println("更新成功");
            System.out.println(studentService.queryStudent());
        } else {
            System.out.println("更新失败");
            System.out.println(studentService.queryStudent());
        }
        //调用业务层的方法实现删除
        student.setId(1002);
        int i = studentService.deleteStudent(student);
        if (i > 0) {
            System.out.println("删除id为" + student.getId() + "成功");
        } else {
            System.out.println("删除id为" + student.getId() + "失败");
        }

    }
}
