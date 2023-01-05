package com.example.moudle3.Servlet;

import com.example.moudle3.Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class ServletDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentService studentService = new StudentService();
        studentService.delete(id);
        response.sendRedirect("/show");
    }

}
