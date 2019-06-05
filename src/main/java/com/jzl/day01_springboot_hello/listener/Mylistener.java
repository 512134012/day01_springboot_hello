package com.jzl.day01_springboot_hello.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-03 下午 5:17
 */

@Component
public class Mylistener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener destroy.....");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener init.....");
    }
}
