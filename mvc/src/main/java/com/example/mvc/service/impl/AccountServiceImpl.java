package com.example.mvc.service.impl;

import com.example.mvc.dao.AccountDao;
import com.example.mvc.service.AccountService;
import com.example.mvc.table.tables.pojos.TAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;

    @Override
    public List<TAccount> selectByUsername(String username) {

        return accountDao.selectAccountByUsername(username);
    }
}
