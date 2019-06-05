package com.jzl.day01_springboot_hello.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-04 上午 10:00
 */

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        return new ResultBean("500","404你懂的!!!");
        //  return new ResultBean("500",e.getMessage());
    }

}
