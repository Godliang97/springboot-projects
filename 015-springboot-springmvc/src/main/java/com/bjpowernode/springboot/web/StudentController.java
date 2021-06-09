package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//相当于控制层类上加@Controller + 方法上加@ResponseBody
//意味着当前控制层类中所有方法返还的都是JSON对象
@RestController
//@Controller
public class StudentController {

    @RequestMapping(value = "/student")
//    @ResponseBody
    public Object student() {
        Student student = new Student();
        student.setId(1);
        student.setName("haha");
        return student;
    }

    //该方法请求方式支持：GET和POST请求
    @RequestMapping(value = "/queryStudentById", method = {RequestMethod.GET, RequestMethod.POST})
    public Object queryStudentById(Integer id) {
        Student student = new Student();
        student.setId(id);
        return student;
    }

    //    @RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2")//相当于上一句话，只接收GET请求，如果请求方式不对会报405错误
    //该注解通常在查询数据的时候使用 --> 查询
    public Object queryStudentById2() {
        return "Only GET Method";
    }

    //    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert") //相当于上一句话
    //该注解通常在新增数据的时候使用 --> 新增
    public Object insert() {
        return "Insert success";
    }

    //    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")//相当于上一句话
    //该注解通常在删除数据时使用 --> 删除
    public Object delete() {
        return "delete Student";
    }

    //    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping(value = "/update") //相当于上一句话
    //该注解通常在修改数据的时候使用 --> 更新
    public Object update() {
        return "update student info";
    }
}
