package com.yz.controller;

import com.yz.model.ResultInfo;
import com.yz.po.UserInfo;
import com.yz.service.UserInfoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;
/**
 * 用户登录
 *             1.接受参数
 *             2.调用业务逻辑层对应的方法，得到登录结果（ResultInfo对象）
 *             3.响应结果
 * **/
    public ResultInfo userLogin(String uname,String upwd){
        ResultInfo resultInfo = userInfoService.userLogin(uname,upwd);
        return resultInfo;
    }
}
