package com.jzl.day01_springboot_hello.dao;

import com.jzl.day01_springboot_hello.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-03 下午 8:39
 */

@Component
public interface ICardDao extends JpaRepository<Card,Integer> {
}
