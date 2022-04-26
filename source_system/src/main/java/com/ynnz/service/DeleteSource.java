package com.ynnz.service;

import com.ynnz.pojo.Source;
import com.ynnz.servlet.impl.SourceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteSource")
public class DeleteSource extends HttpServlet {
    //@Resource(name = "source")
    private Source source = new Source();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SourceServiceImpl sourceService = context.getBean(SourceServiceImpl.class);
        String id = request.getParameter("id");
        source.setId(Integer.parseInt(id));
        int i = sourceService.deleteSource(source);
        if (i > 0) {
            System.out.println("成功");
            request.getRequestDispatcher("/querySource").forward(request, response);
        } else {
            System.out.println("失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
