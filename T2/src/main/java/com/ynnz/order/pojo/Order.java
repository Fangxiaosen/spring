package com.ynnz.order.pojo;

/**
 * @Title: Order
 * @Description:
 * @PACKAGE_NAME：com.ynnz.order
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 8:42
 */
public class Order {
    private String orderNo;
    private String orderName;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
