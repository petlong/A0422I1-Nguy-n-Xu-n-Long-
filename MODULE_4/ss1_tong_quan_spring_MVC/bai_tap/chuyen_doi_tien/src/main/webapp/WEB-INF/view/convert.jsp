<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/27/2022
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h2>Convert</h2>
<form action="/convert" method="post">
    <p>USA<input type="text" value="${amount}" name="amount"></p>
    <p>VND: ${result}</p>
    <input type="submit" value="convert">
</form>
</body>
</html>
