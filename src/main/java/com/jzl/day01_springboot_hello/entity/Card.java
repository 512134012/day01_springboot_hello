package com.jzl.day01_springboot_hello.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-03 下午 9:50
 */

@Entity
@Table(name = "t_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer card_no;
    private Date start_time;
    private Date end_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCard_no() {
        return card_no;
    }

    public void setCard_no(Integer card_no) {
        this.card_no = card_no;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}
