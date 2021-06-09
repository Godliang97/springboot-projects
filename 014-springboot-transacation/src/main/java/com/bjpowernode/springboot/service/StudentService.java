package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    //根据学生id更新学生信息
    int updateStudentById(Student student);
}
