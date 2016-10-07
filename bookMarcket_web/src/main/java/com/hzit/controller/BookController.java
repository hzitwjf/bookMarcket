package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.interceptor.comment;
import com.hzit.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class BookController extends comment {
    @Autowired
    private BookServices bookServices;
      @RequestMapping("/findAll")
      @ResponseBody
    public  Object findAll(){
       List<Book> list= bookServices.findAll();
        return  list;

    }
    @RequestMapping("/findByPage")
        public  String findByPage(@RequestParam(name="page",defaultValue = "0")Integer page,ModelMap modelMap){
        if(page<=0){
            page=0;
        }
            Page<Book> pagebook= bookServices.searchBookByParams(page, 4);
                  modelMap.put("pagebook",pagebook);
                  modelMap.put("currentpage",page);
                        return "index";

    }


}
