package com.hzit.services;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {
    User checkLogin(String userName,String userPwd);
    int add(User u);
}
