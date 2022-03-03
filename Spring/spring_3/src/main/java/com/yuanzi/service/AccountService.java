package com.yuanzi.service;

import com.yuanzi.dao.AccentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccentDao accentDao;

    public void test(){
        System.out.println("AccountService...");
        accentDao.test();
    }
}
