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
    <title>Dictonary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/dictionary/search" method="post">
    <input type="text" name="inputWord" placeholder="Enter your word: " value="${inputWord}"/>
    <input type = "submit" id = "submit" value = "search"/>
    <p>Result: ${result}</p>
</form>
</body>
</html>
