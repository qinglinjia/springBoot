package com.example.daoImpl;

import com.example.bean.Account;
import com.example.dao.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiaql
 * @create 2019-06-28 16:34
 */
@Repository
public class AccountDaoImpl implements IAccountDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int add(Account account) {
        return jdbcTemplate.update("INSERT INTO account(name,money) VALUES(?,?)",
                account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("UPDATE account SET name=?,money=? WHERE id=?",
                account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM TABLE account where id=?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query("select * from account where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Account.class));
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper<>(Account.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
