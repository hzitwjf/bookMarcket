package com.hzit.services.impl;

import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.mapper.OrderdetailMapper;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderServicesImpl implements OrderServices {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderdetailMapper orderdetailMapper;

    @Override
    //添加事务支持，出现异常时所有操作将回滚
    @Transactional
    public boolean addorder(OrderVo orderVo) {
        try{
            String orderId=UUID.randomUUID().toString();
            //增加订单数据
            Order ord=new Order();
            ord.setOrderId(orderId);
            //把date转换成string类型
            Date date=new Date();
            ord.setOrderCreateTime(date.toString());
            ord.setOrderStatus("已完成");
            ord.setUserId(orderVo.getUserId());
            List<BookVo> detail=orderVo.getBookVoList();
            int sum=0;
            for(BookVo d:detail){
                sum+=d.getBookPrice()*d.getShopCount();
            }
            ord.setOrderPrice(sum);
            orderMapper.insertOrder(ord);
            //增加订单详情数据

            for(BookVo d:detail){
                sum+=d.getBookPrice()*d.getShopCount();
                Orderdetail orderdetail=new Orderdetail();
                orderdetail.setOrderId(orderId);
                orderdetail.setBookId(d.getBookId());
                orderdetail.setOrderdetailNum(d.getShopCount());
                orderdetail.setOrderdetailPrice(d.getBookPrice());
                orderdetailMapper.insertOrderdetail(orderdetail);

            }
                 return  true;
            }catch (Exception ex){
                ex.printStackTrace();
                 return false;
        }

}
}
