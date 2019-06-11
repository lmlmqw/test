package com.example.mvc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/add")
    public String add(){
        System.out.println("进入该URL");
		System.out.println("进入该URL");
        return "添加成功";
    }


}
