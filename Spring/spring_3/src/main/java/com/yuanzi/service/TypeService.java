package com.yuanzi.service;

import com.yuanzi.dao.TypeDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TypeService {

    @Autowired
    private TypeDao typeDao;

    public void test(){
        System.out.println("TypeService...");
        typeDao.test();
    }
}
