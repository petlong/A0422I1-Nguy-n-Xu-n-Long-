<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20-Oct-22
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product discount</title>
    <style>
    </style>
  </head>
  <body>
  <form action="/calculate" method="post">
    <h2>Product Discount Calculator</h2>
    <label>Product: </label>
    <input type="text" name="product" placeholder="product"/>
    <label>Price: </label>
    <input type="text" name="price" placeholder="price" />
    <label>Discount Percent: </label>
    <input type="text" name="discount" placeholder="discount"/>%<br><br>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
  </form>
  </body>
</html>
