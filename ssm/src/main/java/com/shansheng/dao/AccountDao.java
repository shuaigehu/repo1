package com.shansheng.dao;

import com.shansheng.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 帅气胡
 * @date 2019/3/15 13:32
 *
 * 账户dao接口
 */
@Repository
public interface AccountDao {

    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

}
