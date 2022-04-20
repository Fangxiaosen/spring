package com.ynnz.test;

import com.ynnz.order.pojo.Order;
import com.ynnz.role.pojo.Role;
import com.ynnz.user.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Title: TestMain
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 8:47
 */
public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        User user = (User) context.getBean("user");
        Role role = (Role) context.getBean("role");
        Order order = (Order) context.getBean("order");
        System.out.println(user);
        System.out.println(role);
        System.out.println(order);
    }
}
