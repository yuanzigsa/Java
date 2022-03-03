package com.yuanzi.service;

import com.yuanzi.dao.IUserDao;
import com.yuanzi.dao.UserDao;
import com.yuanzi.dao.UserDao1;

import javax.annotation.Resource;

public class UserService {
/**
 * @Resourse注解
 * 实现Bean对象的自动注入
 *      1.默认会根据bea标签的id属性查找（属性字段名与bean标签的id属性值相等）
 *      2.如果属性名名称未找到，则会根据类型（class）查找
 *      3.属性字段可以提供set方法，也可以不提供
 *      4.注解可以声明在我们的属性字段级别或set方法级别
 *      5.可以设置name属性，如果设置了name属性，name属性的值必须与bean标签的id属性保持一致
 *      6.如果注入的是接口，接口只有一个实现类时，能正常注入，如果接口有多个实现类
 *
 * **/
    @Resource
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    /**
     * 注入接口
     * **/
    @Resource
    private IUserDao iUserDao;
    public void test(){
        System.out.println("UserService...");
        userDao.test();
        iUserDao.test();
    }
}
