package com.ynnz.Test;

import com.ynnz.bean.Classes;
import com.ynnz.bean.Employee;
import com.ynnz.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class MainTest {
    public static void main(String[] args) {
        //加载spring核心配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Javabean对象
        //强制转换
        Student student = (Student) app.getBean("student");
        System.out.println(student.getPhone().call());

        Employee employee = (Employee) app.getBean("employee");
        System.out.println(employee.getName() + "有一辆" + employee.getCar().getCarNo() + "的" + employee.getCar().getBrand());

        ApplicationContext app2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Classes classes = (Classes) app2.getBean("classes");
        System.out.println(classes);
    }
}
