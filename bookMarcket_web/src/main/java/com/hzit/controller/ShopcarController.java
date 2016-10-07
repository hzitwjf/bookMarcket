package com.hzit.controller;

import com.hzit.dao.entity.Book;
import com.hzit.services.BookServices;
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
        private BookServices bookServices;
    @RequestMapping("/shopcar")
    @ResponseBody
    public  Object shopcar(@RequestParam("bookId") String[] bookId ){

        System.out.println("购物车正在启动");
        //通过bookid获取book对象
        for(int i=0;bookId!=null && i<bookId.length;i++ ){
            String  currentbookId=bookId[i];
            Book book=bookServices.findById(currentbookId);
     }
        return  "Ok";
    }


}
