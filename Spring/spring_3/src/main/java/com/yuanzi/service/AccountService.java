package com.yuanzi.service;

import com.yuanzi.dao.AccontDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccontDao accontDao;

    public void test(){
        System.out.println("AccountService...");
        accontDao.test();
    }
}
