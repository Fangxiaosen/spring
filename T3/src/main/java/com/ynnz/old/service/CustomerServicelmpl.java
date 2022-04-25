package com.ynnz.old.service;

/**
 * @Title: CustomerServicelmpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/25 9:29
 */
public class CustomerServicelmpl implements CustomerService{
    @Override
    public void buyIpadMini() {
        System.out.println("购买一台mini平板");
    }

    @Override
    public void buyIphone() {
        System.out.println("购买一台手机");
    }
}
