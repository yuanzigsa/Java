package com.yuanzi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");

    }
}
