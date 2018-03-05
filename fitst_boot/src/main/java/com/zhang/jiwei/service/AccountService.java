package com.zhang.jiwei.service;

import java.util.List;

import com.zhang.jiwei.entity.Account;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-05 下午 15:43
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
