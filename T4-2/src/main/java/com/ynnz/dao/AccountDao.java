package com.ynnz.dao;

public interface AccountDao {
    /**
     * 加钱
     * @param id
     * @param money
     */
    void addMoney(String id,double money);

    /**
     * 减钱
     * @param id
     * @param money
     */
    void reduceMoney(String id,double money);
}
