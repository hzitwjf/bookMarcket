package com.hzit.controller;


import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserController {
    @Autowired
    UserServices userServices;
    @RequestMapping("checklogin")
    public String checkLogin(){

        return null;
    }

}
