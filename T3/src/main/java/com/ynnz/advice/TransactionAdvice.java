package com.ynnz.advice;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Title: TransactionAdvice
 * @Description:
 * @PACKAGE_NAME：com.ynnz.advice
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 8:56
 */
public class TransactionAdvice {
    //环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("开启事务！");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("提交事务！");
        return proceed;
    }
    public void after(){
        System.out.println("关闭事务！");
    }
}
