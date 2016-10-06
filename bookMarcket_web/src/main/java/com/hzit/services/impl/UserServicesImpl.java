package com.hzit.services.impl;

import com.hzit.dao.entity.User;
import com.hzit.services.UserServices;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServicesImpl implements UserServices {
    @Override
    public User checkLogin(String userName, String userPwd) {
        return null;
    }

    @Override
    public int add(User u) {
        return -1;
    }
}
