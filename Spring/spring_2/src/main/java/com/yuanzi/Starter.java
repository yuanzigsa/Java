package com.yuanzi;

import com.yuanzi.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring配置文件的加载
 * 1.通过响度路径加载配置文件
 * 2.通过绝对路径加载配置文件
 * **/
public class Starter {
    public static void main(String[] args) {
        //1.通过相对路径加载配置文件
        //BeanFactory factory = new ClassPathXmlApplicationContext("SpringContext.xml");

        //2.通过绝对路径加载配置文件
         BeanFactory factory = new FileSystemXmlApplicationContext("D:\\Java\\Spring\\spring_2\\src\\main\\resources\\SpringContext.xml");
       UserService userService = (UserService) factory.getBean("userService");
        userService.test();
    }
}
