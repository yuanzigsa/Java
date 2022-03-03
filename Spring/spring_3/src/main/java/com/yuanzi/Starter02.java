package com.yuanzi;

import com.yuanzi.service.TypeService;
import com.yuanzi.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  实现Bean对象的自动注入
 *  1.默认根据类型（Class）查找，与属性字段无关
 *  2.属性字段可以提供set方法 也可以不提供
 *  3.注解可以声明在属性字段级别或set方法类别
 *  4.如果需要设置属性字段通过id属性值查找，则需要结合@Qualifier注解使用，并设置@ualifier注解的value属性值
 * **/
public class Starter02 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");
        TypeService typeService = (TypeService) factory.getBean("typeService");
        typeService.test();


    }
}
