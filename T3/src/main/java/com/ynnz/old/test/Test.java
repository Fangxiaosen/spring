package com.ynnz.old.test;

import com.ynnz.old.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 9:11
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("old/applicationContext2.xml");
        //OrderService orderService = context.getBean(OrderService.class);
        //OrderService orderService = (OrderService) context.getBean("orderService");
        //orderService.insertOrder();
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.buyIpadMini();
        customerService.buyIphone();
    }

}
