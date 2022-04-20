package com.ynnz.test;

import com.ynnz.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 8:33
 */
public class Test {
    public static void main(String[] args) {
    //加载spring核心配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring容器里面的对象
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
