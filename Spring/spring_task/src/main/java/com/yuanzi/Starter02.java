package com.yuanzi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter02 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");
    }
}
