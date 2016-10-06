package TestServicesIpml;

import com.fc.platform.commons.page.Page;
import com.hzit.StartSpring;
import com.hzit.dao.entity.Book;
import com.hzit.services.BookServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value= StartSpring.class)
public class TestBookServicesImpl {

    @Autowired
    private BookServices bookServices;
    @Test
    public  void testbookfindAll(){
               List<Book> list= bookServices.findAll();
            for(Book l:list){

                System.out.println(l.getBookAuthor());
            }


    }
    @Test
    public  void testbypage(){

        Page<Book> pb= bookServices.searchBookByParams(0,3);
            for(Book b:pb ){
                System.out.println(b.getBookAuthor());

                }
                System.out.println("总页数为："+pb.getTotalPages());

                 System.out.println("总行数为："+pb.getTotalElements());
    }








}
