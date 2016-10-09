package com.hzit.services;

import com.hzit.dao.vo.OrderdetailVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public interface OrderDetailServices {
    List<OrderdetailVo> findByOrderId(String orderId);
}
