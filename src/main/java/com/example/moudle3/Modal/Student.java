package com.example.moudle3.Modal;



import java.time.LocalDate;


public class Student {
    private int id;
    private String name;
    private String birth;
    private String email;
    private String address;
    private String phone;
    private String clasRoom;

    public Student() {
    }

    public Student(int id, String name, String birth, String email, String address, String phone, String clasRoom) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.clasRoom = clasRoom;
    }

    public Student(String name, String birth, String email, String address, String phone, String clasRoom) {
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.clasRoom = clasRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClasRoom() {
        return clasRoom;
    }

    public void setClasRoom(String clasRoom) {
        this.clasRoom = clasRoom;
    }
}