<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.success-message {
color:darkgreen;
    background-color: white;
    border: 1px solid #d6e9c6;
    border-radius: 5px;
    padding: 10px;
    margin-bottom: 20px;
    text-align: center;
}
</style>
</head>
<body>
<div class="success-message">
    <%
    out.println("Book Details Added Successfully!");
    %>
</div>
<%@include file="home.html"%>
</body>
</html>