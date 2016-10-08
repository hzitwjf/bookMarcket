package com.hzit.controller;


import com.hzit.dao.entity.User;
import com.hzit.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserController extends BaseController{
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
    @RequestMapping("findUser")
    @ResponseBody
    public int findUser(@RequestParam("userName")String userName){
        List<User> user=userServices.findUser(userName);
        if (user.size()>=1){
            return 1;
        }else {
            return -1;
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
            return "redirect:/add";
        }else {
            return "redirect:/sucess";
        }
    }
    @RequestMapping("add")
    public String add(){

        return "register";
    }
    @RequestMapping("sucess")
    public String sucess(){
        return "register_success";
    }
}
