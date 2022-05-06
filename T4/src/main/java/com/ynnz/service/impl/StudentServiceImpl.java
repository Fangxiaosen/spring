//package com.ynnz.service.impl;
//
//import com.ynnz.dao.StudentDao;
//import com.ynnz.entity.Student;
//import com.ynnz.service.StudentService;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.Map;
//
//
////创建接口对象
////@Component("studentService")
//public class StudentServiceImpl implements StudentService {
//    @Resource(name = "studentDao")
//    //private StudentDao studentDao;
//
//    @Override
//    public int insertStudent(Student student) {
//        return studentDao.insertStudent(student);
//    }
//
//    @Override
//    public int deleteStudent(Student student) {
//        return studentDao.deleteStudent(student);
//    }
//
//    @Override
//    public List<Map<String, Object>> queryStudent() {
//        return studentDao.queryStudent();
//    }
//
//    @Override
//    public int updateStudent(Student student) {
//        return studentDao.updateStudent(student);
//    }
//
//    @Override
//    public Student getStudentById(int id) {
//        return studentDao.getStudentById(id);
//    }
//
//    @Override
//    public List<Student> queryStudents() {
//        return studentDao.queryStudents();
//    }
//}
