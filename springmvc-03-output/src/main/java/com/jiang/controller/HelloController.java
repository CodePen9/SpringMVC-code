package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title:
 * @author: JiangPeng
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello");
        return "hello";
    }
}
