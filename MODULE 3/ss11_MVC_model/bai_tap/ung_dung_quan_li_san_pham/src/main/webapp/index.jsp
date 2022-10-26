<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 24-Oct-22
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h2>Home page</h2>
  <p>
    <a href="/products">Product list</a>
  </p>
  <form action= /products>
    <input name="action" value="search" type="hidden">
    <input name="nameSearch" type="text">
    <input type="submit" value="search">
  </form>
  </body>
</html>
