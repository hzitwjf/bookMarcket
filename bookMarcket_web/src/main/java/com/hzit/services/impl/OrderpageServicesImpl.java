package com.hzit.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderpageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderpageServicesImpl implements OrderpageServices {
    @Autowired
    private OrderMapper orderMapper;

/*    @Override
    public List<OrderVo> findbyorder(Integer userId, int page, int rowcount) {
        PageRequest pageRequest=new PageRequest(page,rowcount);

        return null;
    }*/

    @Override
    public Page<OrderVo> findbyorder(Integer userId,int page, int rowcount) {
        PageRequest pageRequest=new PageRequest(page,rowcount);
        Map map=new HashMap();
        map.put("userId",userId);
        Page<OrderVo> list=orderMapper.findbyorder(map, pageRequest);
        return list;
    }

}
