package com.example.moudle3.Filter;

import com.example.moudle3.Modal.Student;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {})
public class CheckFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        Student student = (Student) session.getAttribute("client");
        if(student == null){
            res.sendRedirect("/show");
        }else {
            chain.doFilter(req,res);
        }
    }
}
