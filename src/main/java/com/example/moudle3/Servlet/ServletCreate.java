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
import java.util.List;

@WebServlet(urlPatterns = "/create")
public class ServletCreate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        List<Student> studentList = studentService.getAll();
        request.setAttribute("students", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/createStudent.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String birth = request.getParameter("birth");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String classroom = request.getParameter("class");

        StudentService studentService = new StudentService();
        studentService.createStudent(new Student(name,birth,email,address,phone,classroom));
        response.sendRedirect("/show");
    }
}
