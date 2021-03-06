package com.ynnz.test;

import com.mysql.jdbc.Connection;
import com.ynnz.service.JdbcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcService jdbcService = (JdbcService) context.getBean("jdbcService");
        Connection connection = jdbcService.getConnection();
        if (connection != null) {
            System.out.println("获取数据库连接成功");
        }
        System.out.println("业务代码执行成功！");
        jdbcService.close(connection);
    }
}
