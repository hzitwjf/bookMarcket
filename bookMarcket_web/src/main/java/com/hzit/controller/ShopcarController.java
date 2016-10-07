package com.hzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class ShopcarController {

    @RequestMapping("/shopcar")
    @ResponseBody
    public  Object shopcar(){
        System.out.println("购物车正在启动");
        return  "Ok";
    }


}
