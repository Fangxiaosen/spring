package com.ynnz.service;

import com.ynnz.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    /**
     * 新增学生的信息方法
     *
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 删除
     *
     * @param student
     * @return
     */
    int deleteStudent(Student student);

    /**
     * @return
     */
    List<Map<String, Object>> queryStudent();

    /**
     * 更新
     *
     * @param student
     * @return
     */
    int updateStudent(Student student);
}
