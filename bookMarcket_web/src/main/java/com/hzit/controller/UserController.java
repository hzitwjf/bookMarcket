package com.hzit.controller;


import com.hzit.dao.entity.User;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserController {
    @Autowired
    UserServices userServices;
    @RequestMapping("checklogin")
    public String checkLogin(@RequestParam("userName")String userName,@RequestParam("userPwd")String userPwd,HttpSession session){
        List<User> user=userServices.checkLogin(userName,userPwd);
        if (user.size()==1){
            session.setAttribute("user",user);
            return "redirect:/findByPage";
        }else {
            return "redirect:/login.html";
        }
    }
    @RequestMapping("zhuxiao")
    public String zhuXiao(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }
    @RequestMapping("zhuce")
    public String insert(User user){
        int i=userServices.add(user);
        if (i==0){
            return "register";
        }else {
            return "register_success";
        }
    }
}
