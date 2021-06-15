package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    @ResponseBody
    public String studentCount() {

        log.info("查询当前学生总人数");
        Integer studentCount = studentService.queryStudentCount();
        return "学生总人数:" + studentCount;
    }

}
