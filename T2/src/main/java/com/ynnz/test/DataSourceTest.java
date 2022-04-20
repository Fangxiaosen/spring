package com.ynnz.test;

import com.ynnz.pojo.DataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * @Title: DataSourceTest
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 9:48
 */
public class DataSourceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Properties properties = dataSource.getProperties();
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("driverClassName"));
    }

}
