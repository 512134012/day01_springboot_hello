package com.jzl.day01_springboot_hello;

import com.jzl.day01_springboot_hello.dao.ICardDao;
import com.jzl.day01_springboot_hello.entity.Card;
import com.jzl.day01_springboot_hello.entity.TUser;
import com.jzl.day01_springboot_hello.mapper.TUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Day01SpringbootHelloApplicationTests {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private ICardDao cardDao;

    @Test
    public void contextLoads() {
        TUser tuser = userMapper.selectByPrimaryKey(1);
        System.out.println(tuser.getName()+tuser.getRolename());

    }

    @Test
    public void jpaTest() {
        Card card = new Card();
        card.setCard_no(123456);
        card.setStart_time(new Date());
        card.setEnd_time(new Date());

        cardDao.save(card);
    }

}
