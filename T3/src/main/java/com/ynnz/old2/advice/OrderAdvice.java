package com.ynnz.old2.advice;

/**
 * @Title: OrderAdvice
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 10:25
 */
public class OrderAdvice {
    //新增订单之前先申请

    public void before() {
        System.out.println("客户提交了订单申请...等待");
    }

    public void closeOrder() {
        System.out.println("关闭订单成功，赠送手机膜一张！");
    }
}
