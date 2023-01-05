package com.example.moudle3.Servlet;

import com.example.moudle3.Modal.Student;
import com.example.moudle3.Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(urlPatterns = "/edit")
public class ServletEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentService studentService = new StudentService();
        Student student = studentService.findById(id);
        request.setAttribute("student1", student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/EditStudent.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("birth");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String classroom = request.getParameter("class");

        StudentService studentService = new StudentService();
        studentService.edit(new Student(name,date,email,address,phone,classroom));
        response.sendRedirect("/show");
    }
}
