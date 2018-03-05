package com.zhang.jiwei.dao;

import java.util.List;

import com.zhang.jiwei.entity.Account;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-05 上午 10:28
 */
public interface AccountDao {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
