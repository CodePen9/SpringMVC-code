package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title:
 * @author: JiangPeng
 */

@Controller
public class RequestMappingTest {
    @RequestMapping("/user/{id}")
    public String demo(@PathVariable("id")String id){
        System.out.println(id);
        return "hello";
    }
}
