package TestServicesIpml;

import com.fc.platform.commons.page.Page;
import com.hzit.StartSpring;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.dao.vo.OrderdetailVo;
import com.hzit.services.OrderDetailServices;
import com.hzit.services.OrderServices;
import com.hzit.services.OrderpageServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value= StartSpring.class)
public class TestOrderServicesImpl {

    @Autowired
    private OrderServices orderServices;
    @Autowired
    private OrderpageServices orderpageServices;
    @Autowired
    private OrderDetailServices orderDetailServices;

    @Test
    public void testOrderadd(){
        OrderVo orderVo=new OrderVo();
        orderVo.setUserId(1);
        BookVo bookVo=new BookVo();
        bookVo.setBookId(1);
        bookVo.setShopCount(2);
        bookVo.setBookPrice(100);

        BookVo bookVo2=new BookVo();
        bookVo2.setBookId(2);
        bookVo2.setShopCount(1);
        bookVo2.setBookPrice(50);
        List list=new ArrayList();
        list.add(bookVo);
        list.add(bookVo2);
        orderVo.setBookVoList(list);
        orderServices.addorder(orderVo);
    }
    /*@Test
    public  void findbyorderpage(){
      List<OrderVo>list=orderpageServices.findbyorder();
        for(OrderVo o:list){
            System.out.println(o.getOrderPrice());
        }

    }*/
     @Test
    public  void findbyorderpage(){
      Page<OrderVo> list=orderpageServices.findbyorder(6,0,3);
        for(OrderVo o:list){
            System.out.println(o.getOrderPrice());
        }
         System.out.println("总页数为："+list.getTotalPages());

         System.out.println("总行数为："+list.getTotalElements());

    }
    @Test
    public void findByOrderId(){
        List<OrderdetailVo> list=orderDetailServices.findByOrderId("919f6e76-44cc-4dde-b0f9-088646f090bc");
        for (OrderdetailVo o : list){
            System.out.println(o.getBookAuthor());
            System.out.println(o.getBookPicUrl());
        }
    }
}
