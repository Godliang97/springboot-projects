package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello,SpringBoot");
        mv.setViewName("say");
        return mv;
    }

    //将Model和View拆分开的写法
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("message", "HelloWorld");
        return "say";
    }
}
