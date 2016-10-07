package com.hzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
@RequestMapping("/shop")
public class ShopcarController {

    @RequestMapping("/shopcar")
    @ResponseBody
    public  Object shopcar(@RequestParam("bookId") String[] bookId ){
       for(int i=0;i<bookId.length;i++){
           System.out.println(bookId[i]);
       }
        System.out.println("购物车正在启动");
        return  "Ok";
    }


}
