package com.example.mvc.controller;


import com.example.mvc.service.AccountService;
import com.example.mvc.table.tables.pojos.TAccount;
import com.example.mvc.vo.Username;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/selectByUsername/{username}")
    public List<TAccount> selectByUsername(@PathVariable("username") String username) {
        System.out.println(username);
        return accountService.selectByUsername(username);
    }

    @GetMapping("/test")
    public void testVo(@RequestBody Username username) {
        System.out.println("进入该URL");
		System.out.println("进入该URL");
		System.out.println("进入该URL");
		System.out.println("进入该URL");
		System.out.println("进入该URL");
		System.out.println("进入该URL");
        System.out.println(username);

    }
}
