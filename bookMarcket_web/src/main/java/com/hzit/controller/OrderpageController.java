package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderpageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderpageController {
        @Autowired
    private OrderpageServices orderpageServices;

    @RequestMapping("/findorderpage")
    public String findorderpage(Integer userId,@RequestParam(name="page",defaultValue = "0")Integer page,ModelMap modelMap,HttpSession session){

            if(page<=0){
                page=0;
            }
            List<User>listuser= (List<User>) session.getAttribute("user");
              User u=listuser.get(0);
        Page<OrderVo> list= orderpageServices.findbyorder(u.getUserId(),page,4);
            modelMap.put("orderlist",list);
            modelMap.put("currenpage",page);
            return "orderlist";
    }

}
