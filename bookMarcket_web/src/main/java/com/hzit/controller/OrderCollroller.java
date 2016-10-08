package com.hzit.controller;

import com.hzit.dao.entity.User;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderCollroller {
       @Autowired
       private OrderServices orderServices;

    @RequestMapping("/orderadd")
    @ResponseBody
    public  Object orderadd(HttpSession session){
          //从session中获取用户对象
            List<User>  user= (List<User>) session.getAttribute("user");
          //从session中获取购物车对象
             Map<Integer,BookVo> map=(Map)session.getAttribute("shopcar");
            //获取购物车中所有的值
             Collection<BookVo> v= map.values();
            //将购物车中所有的值放到集合中，便于放入到订单对象中
            List list=new ArrayList();
            for(BookVo b:v){
                list.add(b);

            }
            OrderVo orderVo=new OrderVo();

            for(User u:user){
                orderVo.setUserId(u.getUserId());
                }
            orderVo.setBookVoList(list);
          boolean bool=  orderServices.addorder(orderVo);
            return bool;
    }





}
