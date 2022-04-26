package com.ynnz.dao.impl;

import com.ynnz.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Title: AccountDaoImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.dao.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/29 10:56
 */
@Component("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource(name = "template")
    private JdbcTemplate template;

    @Override
    public void addMoney(String id, double money) {

        String sql = "update account set money=money+? where id = ?";
        template.update(sql, money, id);
    }

    @Override
    public void reduceMoney(String id, double money) {
        String sql = "update account set money=money-? where id = ?";
        template.update(sql, money, id);
    }
}
