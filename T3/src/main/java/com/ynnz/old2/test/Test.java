package com.ynnz.old2.test;

import com.ynnz.old2.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 10:53
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("old/old2/applicationContext2.xml");
        OrderService bean = context.getBean(OrderService.class);
        bean.insertOrder();
    }
}
