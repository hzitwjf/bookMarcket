package com.hzit.controller;

import com.hzit.dao.entity.Book;
import com.hzit.dao.vo.BookVo;
import com.hzit.interceptor.comment;
import com.hzit.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
@RequestMapping("/shop")
public class ShopcarController extends comment {
     @Autowired
      private BookServices bookServices;

    @RequestMapping("/shopcar")
    public  String shopcar(@RequestParam("bookId") String[] bookId,HttpSession session){

        System.out.println("购物车正在启动");
        //通过bookid获取book对象
          Map map=(Map)session.getAttribute("shopcar");
        if(map==null){
            map=new HashMap();
        }
        for(int i=0;bookId!=null && i<bookId.length;i++ ){
            String  currentbookId=bookId[i];
            Book book=bookServices.findById(currentbookId);
            BookVo bookVo=new BookVo();
            bookVo.setBookAuthor(book.getBookAuthor());
            bookVo.setBookId(book.getBookId());
            bookVo.setBookStock(book.getBookStock());
            bookVo.setBookPrice(book.getBookPrice());
            bookVo.setBookPicUrl(book.getBookPicUrl());

            BookVo shopcarbookid= (BookVo) map.get(bookVo.getBookId());
            if(shopcarbookid==null){
                bookVo.setShopCount(1);
            }else{
                bookVo.setShopCount(shopcarbookid.getShopCount()+1);
            }

            map.put(bookVo.getBookId(),bookVo);
     }
                session.setAttribute("shopcar",map);
                return  "redirect:/shop/toshopping";
    }
        @RequestMapping("/toshopping")
        public String shop(){
            return  "shopping";
        }

}
