package com.hzit.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BookServicesImpl implements BookServices {
        @Autowired
         private BookMapper bookMapper;
    @Override
    public List<Book> findAll() {
        return    bookMapper.searchBookByParams(null);

             }

    @Override
    public Page<Book> searchBookByParams(int page,int rowcount) {

        PageRequest pageRequest=new PageRequest(page,rowcount);
        Page<Book> list=bookMapper.searchBookByParams(null, pageRequest);

         return list;
    }

    @Override
    public Book findById(String bookId) {
            Map map=new HashMap();
            map.put("bookId",bookId);
         List<Book> list=bookMapper.searchBookByParams(map);
               if(list.size()==1){
                  return  list.get(0);
               }else{
                   return null;
               }
             }
}
