package com.ynnz.controller;

import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Title: StudentController
 * @Description:
 * @PACKAGE_NAME：com.ynnz.controller
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/5/6 10:57
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryStudents")
    public String queryStudents(Model model) {
        List<Student> studentList = studentService.queryStudents();
        model.addAttribute("studentList", studentList);
        return "main.jsp";
    }
    @RequestMapping("/deleteStudents")
    public String deleteStudents(int id) {
        int i = studentService.deleteStudent(id);
        if (i>0){
            return "queryStudents";
        }
        return null;
    }
}
