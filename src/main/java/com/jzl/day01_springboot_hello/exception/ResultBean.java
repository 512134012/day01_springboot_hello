package com.jzl.day01_springboot_hello.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-04 上午 9:58
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String respCode;
    private T data;

}
