package com.ynnz.service.impl;

import com.ynnz.dao.AccountDao;
import com.ynnz.service.AccountService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Title: AccountServiceImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/29 11:04
 */
@Component("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transFerMoney(String fromId, String toId, double money) {
        accountDao.reduceMoney(fromId,money);
        accountDao.addMoney(toId,money);
    }
}
