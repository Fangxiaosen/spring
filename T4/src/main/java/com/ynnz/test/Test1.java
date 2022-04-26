package com.ynnz.test;

import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入是否开启事务");
        String input = scanner.nextLine();
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

        for (Student queryStudent : studentService.queryStudents()) {
            System.out.println(queryStudent.getId());
            System.out.println(queryStudent.getName());
            System.out.println(queryStudent.getSex());
            System.out.println(queryStudent.getAge());
        }

        //Student student1 = studentService.getStudentById(Integer.parseInt("1002"));
        //System.out.println(student1.getId());

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
