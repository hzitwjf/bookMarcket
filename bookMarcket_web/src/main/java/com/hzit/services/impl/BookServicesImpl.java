package com.hzit.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
}
