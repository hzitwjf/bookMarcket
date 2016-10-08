package com.hzit.controller;

import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderpageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderpageController {
        @Autowired
    private OrderpageServices orderpageServices;

/*    @RequestMapping("/findorderpage")
    public String findorderpage(ModelMap modelMap){

     List<OrderVo>list= orderpageServices.findbyorder();
        modelMap.put("orderlist",list);
            return "orderlist";
    }*/

}
