package com.shansheng.service.impl;

import com.shansheng.dao.AccountDao;
import com.shansheng.domain.Account;
import com.shansheng.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 帅气胡
 * @date 2019/3/15 13:39
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountDao accountDao;


    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户...");
        accountDao.saveAccount(account);
    }
}
