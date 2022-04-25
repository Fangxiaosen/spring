package com.ynnz.dao.impl;

import com.ynnz.dao.StudentDao;
import com.ynnz.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Title: StudentDaoImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.dao.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/26 19:03
 */

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Resource(name = "template") //引用其他类的对象
    private JdbcTemplate template;

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into student values(?,?,?,?)";
        return template.update(sql, student.getId(), student.getName()
                , student.getSex(), student.getAge()
        );
    }
}
