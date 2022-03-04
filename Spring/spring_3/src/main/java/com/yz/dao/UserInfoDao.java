package com.yz.dao;

import com.yz.po.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDao {

    private final String USER_NAME = "admin";
    private final String USER_PWD ="123456";

    public UserInfo queryUserByName(String userName){
        UserInfo userInfo = null;
        //判断用户名是否正确
        if (USER_NAME.equals(userName)){
            userInfo = new UserInfo();
            userInfo.setUserId(1);
            userInfo.setUserName(userName);
            userInfo.setUserPwd(USER_PWD);
        }

        return userInfo;
    }
}
