package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    public Object student(Integer id, Integer age) {
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //    @RequestMapping(value = "/student/detail/{id}/{age})
    @GetMapping(value = "/student/detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id,
                           @PathVariable("age") Integer age) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("age", age);
        return map;
    }

    //    @RequestMapping(value = "/student/detail/{id}/{status}")
    @DeleteMapping(value = "/student/detail/{id}/{status}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("status", status);
        return map;
    }

    //以上代码student1和student2会出现请求路径迷糊的错误
    //通常在RESTful风格方式中方法的请求方式会按增删改查的请求来区分
    //修改请求路径
    //RESTful请求风格要求路径中使用的单词都是名词，最好不要出现动词

    @DeleteMapping(value = "/student/{id}/detail/{city}")
    public Object student3(@PathVariable("id") Integer id,
                           @PathVariable("city") Integer city) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("city", city);
        return map;
    }

    @PostMapping(value = "/student/{id}")
    public String addStudent(@PathVariable("id") Integer id) {
        return "add student ID:" + id;
    }

    @PutMapping(value = "/student/{id}")
    public String updateStudent(@PathVariable("id") Integer id) {
        return "update student ID" + id;
    }
}
