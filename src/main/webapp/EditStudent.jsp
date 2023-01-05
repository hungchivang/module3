<%--
  Created by IntelliJ IDEA.
  User: hungchivang
  Date: 1/4/2023
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="" method="post">
  <h3>Edit Student Info</h3>
  <div class="form-group">
    <label for="exampleFormControlInput1">Name</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Name" value="${student1.name}">
  </div>
  <p></p>
  <div class="form-group">
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput2" placeholder="Enter email" value="${student1.email}">
  </div>
  <p></p>
  <div class="form-group">
    <label for="exampleFormControlInput1">Date of Birth</label>
    <input type="date" class="form-control" id="exampleFormControlInput3" placeholder="Enter Date of birth as YYYY-MM-DD" value="${student1.birth}">
  </div>
  <p></p>
  <div class="form-group">
    <label for="exampleFormControlInput1">Address</label>
    <input type="text" class="form-control" id="exampleFormControlInput4" placeholder="Enter address" value="${student1.address}">
  </div>
  <p></p>
  <div class="form-group">
    <label for="exampleFormControlInput1">Phone Number</label>
    <input type="text" class="form-control" id="exampleFormControlInput5" placeholder="Enter phone number" value="${student1.phone}">
  </div>
  <p></p>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Class</label>
    <select class="form-control" id="exampleFormControlSelect1" placeholder="Open this select menu" value="${student1.clasRoom}">
      <option></option>
      <option>C0922h1</option>
      <option>C0822h1</option>
      <option>C0722h1</option>
    </select>
  </div>
  <div class="mt-4 pt-2">
    <button type="submit" class="btn btn-success btn-lg ms-2">Submit</button>
  </div>
</form>
</body>
</html>
