package com.example.demo;

import com.example.bean.Account;
import com.example.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jiaql
 * @create 2019-06-28 16:46
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id,
                                @RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        account.setId(id);
        int t = accountService.update(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        int t = accountService.add(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }


    }


}
