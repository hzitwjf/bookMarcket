package com.hzit.services;

import com.hzit.dao.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {
    List<User> checkLogin(String userName, String userPwd);
    int add(User u);
    List<User> findUser(String userName);
}
