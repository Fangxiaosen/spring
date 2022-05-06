package com.ynnz.service;

import com.ynnz.entity.Student;

import java.util.List;

public interface StudentService {
    // 新增学生信息
    public abstract int insertStudent(Student student);

    // 修改学生信息
    public abstract int updateStudent(Student student);

    // 删除学生信息
    public abstract int deleteStudent(int id);

    // 查询所有学生信息
    public abstract List<Student> queryStudents();

    // 根据id查询学生信息
    public abstract List<Student> queryStudentById(int id);
}