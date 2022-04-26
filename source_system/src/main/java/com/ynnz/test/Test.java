package com.ynnz.test;

import com.ynnz.pojo.Source;
import com.ynnz.servlet.impl.SourceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/27 9:50
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SourceServiceImpl sourceService = context.getBean(SourceServiceImpl.class);
        List<Source> sources = sourceService.querySource();
        System.out.println(sources);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    }
}
