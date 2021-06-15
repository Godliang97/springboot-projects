package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/message")
    public String message(Model model){

        model.addAttribute("data","SpringBoot集成Thymeleaf模板引擎");

        return "message";
    }
}
