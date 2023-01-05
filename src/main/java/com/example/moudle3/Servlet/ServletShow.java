package com.example.moudle3.Servlet;

import com.example.moudle3.Modal.Student;
import com.example.moudle3.Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/show")
public class ServletShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        List<Student> studentList = studentService.getAll();
        request.setAttribute("students", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowStudent.jsp");
        dispatcher.forward(request, response);
    }

}
