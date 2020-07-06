package com.jiang.controller;

import com.jiang.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Title:
 * @author: JiangPeng
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name")String username,
                           @RequestHeader("User-Agent")String useragent,
                           @CookieValue("JSESSIONID")String jid){
        System.out.println("handle01"+username);
        System.out.println("User-Agent"+useragent);
        System.out.println("JsessionId是"+jid);
        return "hello";
    }
    /*
        SpringMVC如何获取请求带来的各种信息

       @RequestParam：获取请求参数
       @RequestHeader：
       @CookieValue：
     */

    @RequestMapping("/book")
    public String addBook(Book book){
        System.out.println(book);
        return "hello";
    }

    @RequestMapping("/handle03")
    public String handle03(HttpSession session, HttpServletRequest request){
        request.setAttribute("reqParam","我是请求域中的");
        session.setAttribute("sessionParam","我是session域中的");
        return "hello";
    }


}
