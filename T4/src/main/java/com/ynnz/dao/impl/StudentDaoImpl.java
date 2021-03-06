package com.ynnz.dao.impl;

import com.ynnz.dao.StudentDao;
import com.ynnz.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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

    @Override
    public int deleteStudent(Student student) {
        String sql = "delete from student where id = ?";
        return template.update(sql, student.getId());

    }

    @Override
    public List<Map<String, Object>> queryStudent() {
        String sql = "SELECT * from student";
        return template.queryForList(sql);
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update student set name=?,sex=?,age=? where id = ?";
        return template.update(sql, student.getName()
                , student.getSex(), student.getAge(), student.getId()
        );
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "select * from student where id = ?";
        Student studentTemp = (Student) template.queryForList(sql, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(Integer.parseInt(resultSet.getString("id")));

                return student;
            }
        });
        return studentTemp;
    }

    @Override
    public List<Student> queryStudents() {
        String sql = "select * from student";
        List<Student> list = template.query(sql, new Object[]{}, new BeanPropertyRowMapper<Student>(Student.class));
        return list;
    }
}
