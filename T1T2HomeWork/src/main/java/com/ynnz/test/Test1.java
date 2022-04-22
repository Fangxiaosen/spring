package com.ynnz.test;

import com.ynnz.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test1
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:31
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getName() + "有一辆" + employee.getCar().getColor() + "的" + employee.getCar().getBrand());
    }

}
