package com.example.moudle3.DAO;

import com.example.moudle3.Modal.Student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class StudentDao {
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from classroom";
        Connection connection = ConnectionMySQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String birth = resultSet.getString("birth");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classRoom = resultSet.getString("class");
                students.add(new Student(id,name,birth,email,address,phone,classRoom));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public void CreateStudent(Student student) {
        String spl = "insert into classroom values(?,?,?,?,?,?)";
        Connection connection = ConnectionMySQL.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(spl);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getBirth());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getPhone());
            preparedStatement.setString(6, student.getClasRoom());
            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean edit(Student student) {
        String spl = "update classroom set name=?, birth=?,email= ?,address=?,phone=?,class =? where id = ?";
        Connection connection = ConnectionMySQL.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(spl);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getBirth());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getPhone());
            preparedStatement.setString(6, student.getClasRoom());
            preparedStatement.setString(7, student.getClasRoom());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void delete(int id) {

        String sql = "delete from classroom where id =?";
        Connection connection = ConnectionMySQL.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> searchStudent(String names) {
        List<Student> students = new ArrayList<>();
        String sql = "select * from classroom where name like concat('%' ,?, '%') ";

        Connection connection = ConnectionMySQL.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,names);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String birth = resultSet.getString("birth");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classRoom = resultSet.getString("class");
                students.add(new Student(id,name,birth,email,address,phone,classRoom));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    public  Student findIndex(int id){
        String sql = "select * from classroom where id =" +id;
        Connection connection = ConnectionMySQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            String name = resultSet.getString("name");
            String birth = resultSet.getString("birth");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String classRoom = resultSet.getString("class");
            return new Student(id,name,birth,email,address,phone,classRoom);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
