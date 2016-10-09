package com.hzit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/10/9.
 */
@Controller
public class OrderDetailController {
    @Autowired
    private  OrderDetailController orderDetailController;


    @RequestMapping("")
    public String orderdetail(){


        return  "";
    }




}
