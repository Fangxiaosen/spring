package com.ynnz.test;

import com.ynnz.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/29 11:09
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transFerMoney("1001","1002",200);
    }

}
