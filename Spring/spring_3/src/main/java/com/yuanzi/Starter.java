package com.yuanzi;

import com.yuanzi.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) factory.getBean("userService");
        userService.test();

    }
}
