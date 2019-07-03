package com.example.service;

import com.example.bean.Account;

import java.util.List;

/**
 * @author jiaql
 * @create 2019-06-28 16:42
 */
public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
