package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface BookServices {
    List<Book> findAll();
    Page<Book> searchBookByParams(@Param("map") Map<String, String> map, Pageable pageable);
}
