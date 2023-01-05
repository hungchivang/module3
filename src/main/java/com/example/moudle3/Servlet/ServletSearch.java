package com.example.moudle3.Servlet;

import com.example.moudle3.Modal.Student;
import com.example.moudle3.Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/search")
public class ServletSearch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name1");
        StudentService studentService =new StudentService();
        List<Student> students = studentService.searchStudent(name);
        request.setAttribute("students", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowStudent.jsp");
        dispatcher.forward(request,response);
    }
}
