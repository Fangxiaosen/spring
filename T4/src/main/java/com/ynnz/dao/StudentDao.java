package com.ynnz.dao;

import com.ynnz.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    /**
     * 新增学生信息的方法
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
     * 查询的方法
     *
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
