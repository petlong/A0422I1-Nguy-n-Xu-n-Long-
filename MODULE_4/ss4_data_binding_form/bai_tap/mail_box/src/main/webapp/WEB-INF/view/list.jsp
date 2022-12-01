<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/28/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h2>Mail Information</h2>
<a href="/edit">Setting</a>
<table>
    <tr>
        <td>Language:</td>
        <td>${languages}</td>
    </tr>
    <tr>
        <td>Page Size:</td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>Spams Filter:</td>
        <td>${spamsFilter}</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td>${signature}</td>
    </tr>
</table>
</body>
</html>
