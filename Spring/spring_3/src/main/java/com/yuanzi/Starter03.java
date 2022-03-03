package com.yuanzi;

import com.yuanzi.controller.AccountController;
import com.yuanzi.service.TypeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  SpringIOC扫描器
 *      作用：
 *          可以对Bean对象进行统一的管理，简化的配置信心，提高开发效率
 *      使用：
 *          1.在配置文件中开启自动扫描，设置扫描包范围（引入context命名空间）
 *          2.在需要实例化的bean对象山上添加指定的注解（声明在类级别，bean对象的id属性默认是类的首字母小写）
 *          Controller层：（控制层）
 *
 * **/
public class Starter03 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring03.xml");
        AccountController accountController = (AccountController) factory.getBean("accountController");
        accountController.test();
    }
}
