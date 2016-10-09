package com.hzit.controller;

import com.hzit.dao.vo.OrderdetailVo;
import com.hzit.services.OrderDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@Controller
public class OrderDetailController {
    @Autowired
    private OrderDetailServices orderDetailServices;


    @RequestMapping("toorderdetail")
    public String orderdetail(@RequestParam("orderId")String orderId,ModelMap modelMap){
        List <OrderdetailVo>list= orderDetailServices.findByOrderId(orderId);
                modelMap.put("detail",list);
                return  "orderdetail";
    }




}
