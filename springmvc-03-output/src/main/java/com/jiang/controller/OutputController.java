package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Title:
 * @author: JiangPeng
 */

@SessionAttributes(value = "msg")
@Controller
public class OutputController {

/*
    1.使用原生API....request
    2.在方法处传入Map、Model、或者ModelMap给这些参数
    保存的所有数据都会放在域中
 */
    @RequestMapping("/handle01")
    public String handle01(Map<String,Object> map){
        map.put("msg","map你好");
        return "hello";
    }

    @RequestMapping("/handle02")
    public String handle02(Model model){
        model.addAttribute("msg","model你好");
        return "hello";
    }

    @RequestMapping("/handle03")
    public String handle03(ModelMap modelMap){
        modelMap.addAttribute("msg","modelmap你好");
        return "hello";
    }

    @RequestMapping("/handle04")
    public ModelAndView handle04(){
        // 之前我们return的叫viewName视图名，视图解析器会帮我们拼串得到最后的真实地址
        // 现在我们是通过new ModelAndVie(”viewName“) 在viewName中写入我们之前return的字符串，即视图名
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg","hellomodelandview");
        return mv;
    }

}
