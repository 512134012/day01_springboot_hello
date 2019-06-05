package com.jzl.day01_springboot_hello.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jzl.day01_springboot_hello.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-03 下午 1:53
 */

@Controller
@RequestMapping("my")
public class MyBoot {


    private Logger logger = LoggerFactory.getLogger(MyBoot.class);

    @Value("${image.server}")
    private String imageServer;

    @RequestMapping("hello")
    @ResponseBody
    public String test(){
        return "hello!!!world"+imageServer;
    }

    @RequestMapping("logger")
    @ResponseBody
    public Date getDate(Date date){
       logger.info(date.toString());
       logger.info("你好[{}],你是第[{}]个登录网址的用户","jzl","1");
       return date;
    }

    @RequestMapping("valid")
    @ResponseBody
    public String validStudent(@Valid Student student){
        student.getId();
        return "hello!!!!!!!";
    }
}
