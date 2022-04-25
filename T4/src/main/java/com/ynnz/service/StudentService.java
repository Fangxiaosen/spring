package com.ynnz.service;

import com.ynnz.entity.Student;

public interface StudentService {
    /**
     * 新增学生的信息方法
     * @param student
     * @return
     */
    int insertStudent(Student student);
}
