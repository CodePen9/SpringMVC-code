package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title:
 * @author: JiangPeng
 */
@Controller
public class BookController {

    @RequestMapping(value = "/book/{id}",method = RequestMethod.GET)
    public String getBook(@PathVariable("id")String id){
        System.out.println("get"+id+"book");
        return "hello";
    }
    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public String delBook(@PathVariable("id")Integer bid){
        System.out.println("delete"+bid+"book");
        return "hello";
    }
    @RequestMapping(value = "/book/{id}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id")Integer bid){
        System.out.println("update"+bid+"book");
        return "hello";
    }
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String addBook(){
        System.out.println("addbooks");
        return "hello";
    }

}
