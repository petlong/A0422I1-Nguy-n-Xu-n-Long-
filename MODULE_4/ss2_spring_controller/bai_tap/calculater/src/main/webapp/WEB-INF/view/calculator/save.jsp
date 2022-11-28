<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/27/2022
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="/calculator/save" method="post">
    <p><input type="text" name="firstOperand" value="${firstOperand}">
        <input type="text" name="secondOperand" value="${secondOperand}"></p>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(*)">
    <input type="submit" name="operator" value="Division(/)">
    <p>Result: ${result}</p>
</form>
</body>
</html>
