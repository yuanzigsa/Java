package com.yz;

import com.yz.controller.UserInfoController;
import com.yz.model.ResultInfo;
import com.yz.po.UserInfo;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * JUnit单元测试
     * 1.不能是静态方法
     * 2.不能有参数
     * 3.返回值是void
     * 4.每个单元测试方法上都需要设置@Test注解
 * **/
public class UserInfoTest {
    @Test
    public void test01(){
        System.out.println("test01...");
    }
    @Test
    public void test02(){
        System.out.println("test02...");
    }
    @Test
    public void testLogin(){
        //加载配置文件
        BeanFactory factory = new ClassPathXmlApplicationContext("spring04.xml");
        UserInfoController userInfoController = (UserInfoController) factory.getBean("userInfoController");
        ResultInfo resultInfo = userInfoController.userLogin("user","123456");
        System.out.println(resultInfo);
    }
}
