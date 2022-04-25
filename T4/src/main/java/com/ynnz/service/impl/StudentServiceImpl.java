package com.ynnz.service.impl;

import com.ynnz.dao.StudentDao;
import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Title: StudentServiceImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.service.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/26 19:12
 */
//创建接口对象
@Component("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
