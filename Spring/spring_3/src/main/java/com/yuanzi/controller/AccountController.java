package com.yuanzi.controller;

import com.yuanzi.service.AccountService;
import com.yuanzi.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller
public class AccountController {
    @Resource
    private AccountService accountService;

    @Autowired
    private PropertyUtil propertyUtil;

    public void test(){
        System.out.println("AccountController...");
        accountService.test();
        propertyUtil.test();
    }
}
