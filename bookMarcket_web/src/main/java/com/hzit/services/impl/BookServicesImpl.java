package com.hzit.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.services.BookServices;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Page<Book> searchBookByParams(@Param("map") Map<String, String> map, Pageable pageable) {
        return null;
    }
}
