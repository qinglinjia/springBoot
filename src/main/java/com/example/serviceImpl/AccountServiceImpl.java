package com.example.serviceImpl;

import com.example.bean.Account;
import com.example.dao.IAccountDAO;
import com.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jiaql
 * @create 2019-06-28 16:43
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    @Override
    @Transactional
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    @Transactional
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
