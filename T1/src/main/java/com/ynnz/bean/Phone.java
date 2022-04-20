package com.ynnz.bean;

/**
 * @Title: Phone
 * @Description:
 * @PACKAGE_NAME：com.ynnz.bean
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 18:58
 */
public class Phone {
    private String message;

    public String call() {
        //System.out.println(message);
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //@Override
    //public String toString() {
    //    return "Phone{" +
    //            "message='" + message + '\'' +
    //            '}';
    //}
}
