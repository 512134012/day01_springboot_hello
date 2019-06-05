package com.jzl.day01_springboot_hello.config;

import com.jzl.day01_springboot_hello.filter.SpringBootFilter;
import com.jzl.day01_springboot_hello.listener.Mylistener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-03 下午 5:01
 */

@Configuration
public class MyConfig {

    @Autowired
    private SpringBootFilter filter;

    @Autowired
    private Mylistener mylistener;

    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.setName("SpringBootFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(mylistener);
        return bean;
    }
}
