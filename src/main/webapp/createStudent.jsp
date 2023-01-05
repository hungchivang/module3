<%--
  Created by IntelliJ IDEA.
  User: hungchivang
  Date: 1/4/2023
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Create Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="/create" method="post">
    <h3>Add new Student</h3>
    <div class="form-group">
        <label for="exampleFormControlInput1">Name</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Name" name="name">
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleFormControlInput1">Email address</label>
        <input type="email" class="form-control" id="exampleFormControlInput2" placeholder="Enter email" name="email">
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleFormControlInput1">Date of Birth</label>
        <input type="text" class="form-control" id="exampleFormControlInput3" placeholder="Enter Date of birth as YYYY-MM-DD" name="birth">
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleFormControlInput1">Address</label>
        <input type="text" class="form-control" id="exampleFormControlInput4" placeholder="Enter address" name="address">
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleFormControlInput1">Phone Number</label>
        <input type="text" class="form-control" id="exampleFormControlInput5" placeholder="Enter phone number" name="phone">
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleFormControlSelect1">Class</label>
        <select class="form-control" id="exampleFormControlSelect1" placeholder="Open this select menu" name="class">
            <option></option>
            <option>C0922h1</option>
            <option>C0822h1</option>
            <option>C0722h1</option>
        </select>
    </div>
    <div class="mt-4 pt-2">
        <button type="submit" class="btn btn-success btn-lg ms-2">Submit</button>
    </div>
<%--    <div class="form-group">--%>
<%--        <label for="exampleFormControlSelect2">Example multiple select</label>--%>
<%--        <select multiple class="form-control" id="exampleFormControlSelect2">--%>
<%--            <option>1</option>--%>
<%--            <option>2</option>--%>
<%--            <option>3</option>--%>
<%--            <option>4</option>--%>
<%--            <option>5</option>--%>
<%--        </select>--%>
<%--    </div>--%>
</form>
</body>
</html>
