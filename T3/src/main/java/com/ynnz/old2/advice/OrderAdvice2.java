package com.ynnz.old2.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Title: OrderAdvice
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 10:25
 */

@Component
@Aspect //声明为通知类
public class OrderAdvice2 {
    //设置切入点
    @Pointcut("execution(* com.ynnz.service.*.*(..))")
    public void pc() {
    }

    //新增订单之前先申请
    @Before("com.ynnz.old2.advice.OrderAdvice2.pc()")
    public void before() {
        System.out.println("客户提交了订单申请...等待");
    }

    public void closeOrder() {
        System.out.println("关闭订单成功，赠送手机膜一张！");
    }
}
