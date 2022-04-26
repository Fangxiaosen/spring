package com.ynnz.service;

import com.alibaba.fastjson.JSON;
import com.ynnz.pojo.Source;
import com.ynnz.servlet.impl.SourceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/querySource")
public class QuerySource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Component frame = null;
        //JOptionPane.showInternalMessageDialog(frame, "information","information", JOptionPane.INFORMATION_MESSAGE);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SourceServiceImpl sourceService = context.getBean(SourceServiceImpl.class);
        List<Source> querysource = sourceService.querySource();
        String jsonString = JSON.toJSONString(querysource);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
