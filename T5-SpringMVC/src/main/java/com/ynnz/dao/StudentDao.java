package com.ynnz.dao;

import com.ynnz.entity.Student;

import java.util.List;

public interface StudentDao {
    //新增学生信息
    int insertStudent(Student student);
}
