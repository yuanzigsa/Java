package com.yz.service;

import com.yz.dao.UserInfoDao;
import com.yz.model.ResultInfo;
import com.yz.po.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    public ResultInfo userLogin(String uname,String upwd){
        ResultInfo resultInfo = new ResultInfo();
       if (isEmptu(uname) || isEmptu(upwd)) {
           resultInfo.setCode(500);
           resultInfo.setMsg("用户名或者密码不能为空！");
           return resultInfo;
       }
       UserInfo userInfo = userInfoDao.queryUserByName(uname);
       if (userInfo == null){
           resultInfo.setCode(500);
           resultInfo.setMsg("用户名不存在！");
           return resultInfo;
       }
       if (!upwd.equals(userInfo.getUserPwd())){
           resultInfo.setCode(500);
           resultInfo.setMsg("用户名密码不正确！");
           return resultInfo;
       }
       resultInfo.setCode(200);
       resultInfo.setMsg("登录成功");
       return resultInfo;
    }

/**
 * 判断字符串是否为空
 * 为空返回true，否则返回false
 *
 * **/
    public Boolean isEmptu(String str) {
        if (str == null || str.trim() == "") {
            return true;
        }
        return false;
    }
}
