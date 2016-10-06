package TestServicesIpml;


import com.hzit.StartSpring;
import com.hzit.dao.entity.User;
import com.hzit.services.UserServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.asm.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(StartSpring.class)
public class TestUserServicesIpml {
    @Autowired
    UserServices services;
    @Test
    public void checkUser(){
        List<User> list=services.checkLogin("李四","123");
        for (User u : list){
            System.out.println(u.getUserName());
            System.out.println(u.getUserEmail());
        }
    }
}
