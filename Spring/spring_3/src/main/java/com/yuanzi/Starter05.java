package com.yuanzi;

import com.yuanzi.dao.AccontDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter05 {
    public static void main(String[] args) {
//        //加载配置文件
//        BeanFactory factory = new ClassPathXmlApplicationContext("spring05.xml");
//        AccontDao accontDao = (AccontDao) factory.getBean("accountDao");
        /*AccentDao accentDao = (AccentDao) factory.getBean("accountDao");
        System.out.println(accentDao);

        AccentDao accentDao2 = (AccentDao) factory.getBean("accountDao");
        System.out.println(accentDao2);*/
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring05.xml");
        ac.close();
    }
}
