<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/28/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Songs</title>
</head>
<body>
<h1>List songs</h1>
<a href="/song/create">Create Student</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Singer</th>
        <th>Kind of music</th>
        <th>File</th>
    </tr>
    <c:forEach items="${songList}" var="song">
        <tr>
            <td>${song.nameSong}</td>
            <td>${song.singer}</td>
            <td>${song.kindOfMusic}</td>
            <td>${song.file}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
