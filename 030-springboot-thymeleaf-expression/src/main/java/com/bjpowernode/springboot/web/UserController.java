package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import com.sun.xml.internal.bind.v2.runtime.output.XMLEventWriterOutput;
import javafx.scene.chart.ValueAxis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setName("lisi");
        user.setAge(22);

        mv.setViewName("userDetail");
        mv.addObject("user", user);

        return mv;
    }

    @RequestMapping(value = "/user/detail1")
    public String userDetail(Model model) {
        User user = new User();
        user.setId(1002);
        user.setName("wangwu");
        user.setAge(25);

        model.addAttribute("user", user);
        return "userDetail1";
    }

    @RequestMapping(value = "url")
    public String urlExpression(Model model) {

        model.addAttribute("id", 1001);
        model.addAttribute("name", "zhangsan");
        model.addAttribute("age", 27);

        return "url";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String name) {
        return "请求路径/test，参数是：" + name;
    }

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(Integer id, String name, Integer age) {
        return "请求路径/test1,参数id=" + id + ",name=" + name + ",age=" + age;
    }

    @RequestMapping(value = "/test2/{id}")
    @ResponseBody
    public String test2(@PathVariable("id") Integer id) {
        return "id=" + id;
    }

    @RequestMapping(value = "/test3/{id}/{name}")
    @ResponseBody
    public String test3(@PathVariable("id") Integer id,
                        @PathVariable("name") String name) {
        return "id=" + id + "----name=" + name;
    }

    @RequestMapping(value = "/property")
    public String property() {
        return "property";
    }

}
