package com.ynnz.controller;

import com.ynnz.entity.Student;
import com.ynnz.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.security.provider.MD2;

import java.util.List;

/**
 * @Title: TestController
 * @Description:
 * @PACKAGE_NAME：com.ynnz.controller
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/5/6 8:55
 */
//标记该类为控制器类，可以处理数据的请求和响应
@Controller
public class TestController {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentService studentService = (StudentService) context.getBean("studentService");

    //设置数据请求的路径、地址
    @RequestMapping("/test")
    public String test() {
        return "main.jsp";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        return "success";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "成功";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/getAccPwd")
    @ResponseBody
    public String getAccPwd(String account, @RequestParam("pwd") String password) {
        System.out.println("账号：" + account + " 密码：" + password);
        return "获取账号密码成功";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/getInsert")
    @ResponseBody
    public String getInsert(Student student) {
        System.out.println(student);
        return "获取新增数据成功";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/test3")
    public String test3(Model model) {
        String name = "李飞";
        model.addAttribute("name", name);
        return "main.jsp";
    }

    //设置数据请求的路径、地址
    @RequestMapping("/test4")
    public ModelAndView test4(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        String name = "李飞test4";
        //打包
        modelAndView.addObject("name", name);
        //发送
        modelAndView.setViewName("main.jsp");
        return modelAndView;
    }
}
