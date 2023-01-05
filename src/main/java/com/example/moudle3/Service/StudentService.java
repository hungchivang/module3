package com.example.moudle3.Service;

import com.example.moudle3.DAO.StudentDao;
import com.example.moudle3.Modal.Student;

import java.util.List;

public class StudentService {
    StudentDao studentDao= new StudentDao();
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    public void createStudent(Student student){
        studentDao.CreateStudent(student);
    }

    public void edit(Student student) {
        studentDao.edit(student);
    }

    public void delete(int id){
        studentDao.delete(id);
    }

    public List<Student> searchStudent(String name) {
        return studentDao.searchStudent(name);
    }

    public  Student findById(int id) {
        return studentDao.findIndex(id);
    }
}
