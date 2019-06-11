package com.example.mvc.service;

import com.example.mvc.table.tables.pojos.TAccount;

import java.util.List;

public interface AccountService {


//        按照 用户名相似 找出 不是admin 的用户集合
    List<TAccount> selectByUsername(String username);

}
