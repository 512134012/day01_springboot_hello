package com.jzl.day01_springboot_hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jzl.day01_springboot_hello.mapper")
public class Day01SpringbootHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day01SpringbootHelloApplication.class, args);
    }

}
