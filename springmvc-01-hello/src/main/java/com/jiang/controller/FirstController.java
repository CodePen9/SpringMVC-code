package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title:
 * @author: JiangPeng
 */
@Controller
public class FirstController {
    /*
        1.告诉SpringMVC这是一个处理器，可以处理请求；
        @Controller 标识那个组件是控制器
     */
    //@RequestMapping：请求映射注解  /hello 表示当前项目下的hello请求
    @RequestMapping("/hello")
    public String myFirstRequest(){
        System.out.println("request recover....");
        return "hello";
    }

    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    public String demo01(){
        return "demo";
    }

}
