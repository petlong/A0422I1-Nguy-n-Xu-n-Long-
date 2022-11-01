<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28-Oct-22
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Home page</h2>
  <p>
    <a href="/users">User list</a>
  </p>
  <form action= /users>
    <input name="action" value="search" type="hidden">
    <input name="country" type="text">
    <input type="submit" value="search">
  </form>
  </body>
</html>
