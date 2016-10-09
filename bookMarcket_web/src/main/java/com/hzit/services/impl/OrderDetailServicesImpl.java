package com.hzit.services.impl;

import com.hzit.dao.mapper.OrderdetailMapper;
import com.hzit.dao.vo.OrderdetailVo;
import com.hzit.services.OrderDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@Service
public class OrderDetailServicesImpl implements OrderDetailServices {
    @Autowired
    private OrderdetailMapper orderdetailMapper;
    @Override
    public List<OrderdetailVo> findByOrderId(String orderId) {
        List<OrderdetailVo> list=orderdetailMapper.findByOrderId(orderId);
        return list;
    }
}
