package com.jzl.thymeleaf.controller;

import com.jzl.thymeleaf.entity.Star;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：day01_springboot_hello
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-06-04 上午 11:31
 */

@Controller
@RequestMapping("view")
public class StarController {

    @RequestMapping("hello")
    public String helloStar(Model model){
        model.addAttribute("starName","超级玛丽");

        //对象的方式
        Star star = new Star(18,"不知火舞");
        model.addAttribute("star",star);

        //集合的方式
        List<Star>list = new ArrayList<>();
        list.add(new Star(21,"娜可露露"));
        list.add(new Star(22,"橘右京"));
        model.addAttribute("list",list);

        return "index";
    }

    @RequestMapping("ccc")
    public void ccc(Model model){

    }

}
