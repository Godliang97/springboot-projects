package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    //根基学生id查询详情
    Student queryStudentById(Integer id);
}
