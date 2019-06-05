package com.jzl.day01_springboot_hello.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-04 上午 10:53
 */


@Data
public class Student {

    private int id;
    //@NotNull(message = "名字不为空")
    private String name;


}
