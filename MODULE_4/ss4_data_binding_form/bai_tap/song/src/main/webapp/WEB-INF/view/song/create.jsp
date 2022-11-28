<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/28/2022
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h2>Add new Song</h2>
<form:form action="/song/create" method="post" modelAttribute="song">

    <label>Name song: </label>
    <form:input type="text" path="nameSong"/><br>

    <label>Singer: </label>
    <form:input type="text" path="singer"/><br>

    <label>Kind of Music</label>
    <form:input type="text" name="kindOfMusic" path="kindOfMusic"/><br>

    <label>File</label>
    <form:radiobuttons path="file" items="${fileList}"></form:radiobuttons>

    <button type="submit">Create</button>

</form:form>
</body>
</html>
