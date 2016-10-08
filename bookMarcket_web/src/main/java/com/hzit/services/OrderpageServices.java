package com.hzit.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface OrderpageServices {

    Page<OrderVo> findbyorder(Integer userId,int page,int rowcount);

}
