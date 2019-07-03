package com.example.dao;

import com.example.bean.Account;

import java.util.List;

/**
 * Created by jiaql on 2019/6/28.
 */
public interface IAccountDAO {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
