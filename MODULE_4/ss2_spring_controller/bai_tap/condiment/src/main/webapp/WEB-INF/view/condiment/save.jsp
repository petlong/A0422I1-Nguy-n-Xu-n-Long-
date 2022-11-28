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
<h2>Sandwich Condiments</h2>
<form action="/condiment/save" method="post">
    <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <br>
    <button type="submit">Save</button>
    <p>Result: ${listCondiment}</p>
</form>
</body>
</html>
