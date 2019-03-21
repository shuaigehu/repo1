package com.shansheng.service;

import com.shansheng.domain.Account;

import java.util.List;

/**
 * @author 帅气胡
 * @date 2019/3/15 13:36
 */
public interface AccountService {

    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

}
