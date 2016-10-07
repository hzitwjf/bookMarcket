package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import java.util.List;


/**
 * Created by Administrator on 2016/10/6.
 */
public interface BookServices {
    List<Book> findAll();
    Page<Book> searchBookByParams(int page,int rowcount);
    Book findById(String bookId);

}
