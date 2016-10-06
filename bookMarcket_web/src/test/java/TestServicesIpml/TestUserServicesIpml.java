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
        List<User> list=services.checkLogin("张三","123");
        for (User u : list){
            System.out.println(u.getUserName());
            System.out.println(u.getUserEmail());
        }
    }
    @Test
    public void add(){
        User user=new User();
        user.setUserName("少杰");
        user.setUserPwd("heheda");
        user.setUserEmail("2378@qq.com");
        int i=services.add(user);
        System.out.printf("影响了"+i+"行");
    }
}
