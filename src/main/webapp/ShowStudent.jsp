<%--
  Created by IntelliJ IDEA.
  User: hungchivang
  Date: 1/4/2023
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Classroom</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <form action="/search" method="post">
        <div>
            <button type="button" class="btn btn-info"><a href="create">Add</a></button>
            <div style="margin-left: 760px">
                <input type="text" placeholder="Search" name = "name1">
                <button type="submit" style="color: #3c97bf" >Search</button>
                <a href="/carHome" style="margin-left: 20px;font-size: x-large"><i class="ti-home"></i></a>
            </div>
        </div>
    </form>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.birth}</td>
                <td>${student.email}</td>
                <td>${student.address}</td>
                <td>
                    <button type="button" class="btn btn-warning" style="color: black"><a href="edit?id=${student.id}">Edit</a></button>
                    <button type="button" class="btn btn-danger" style="color: white"><a href="delete?id=${student.id}">Delete</a></button>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
