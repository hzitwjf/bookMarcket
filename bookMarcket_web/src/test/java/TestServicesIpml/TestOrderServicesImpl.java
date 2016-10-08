package TestServicesIpml;

import com.hzit.StartSpring;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.services.OrderServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value= StartSpring.class)
public class TestOrderServicesImpl {

    @Autowired
    private OrderServices orderServices;

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
}
