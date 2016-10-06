package com.hzit.services.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> checkLogin(String userName, String userPwd) {
        Map map=new HashMap();
        map.put("userName",userName);
        map.put("userPwd",userPwd);
        List<User> list=userMapper.searchUserByParams(map);
        return list;
    }

    @Override
    public int add(User u) {
       int i= userMapper.insertUser(u);
        return i;
    }
}
