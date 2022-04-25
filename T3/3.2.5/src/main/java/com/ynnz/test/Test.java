package com.ynnz.test;

import com.ynnz.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService bean = context.getBean(EmployeeService.class);
        bean.work();
        bean.drink();
        bean.knock();
    }
}
