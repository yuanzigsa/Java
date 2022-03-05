package com.yuanzi.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;


@Repository
public class AccontDao implements InitializingBean {
    public void test(){
        System.out.println("AccountDao...");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("AccountDao init...");
    }
    public void destory() {
        System.out.println("AccountDao销毁了");
    }
}
