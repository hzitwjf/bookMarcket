package com.hzit.services.impl;

import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderpageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderpageServicesImpl implements OrderpageServices {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<OrderVo> findbyorder() {
        return   orderMapper.findbyorder();

    }
}
