<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21-Oct-22
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            border: 2px solid cyan;
        }

        th, td {
            padding: 5px;
            text-align: center;
            font-size: 20px;
            border-bottom: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    <h1 style="text-align: center">Danh sách khách hàng
    </h1>
    <tr>
        <Th>STT</Th>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="status1">
        <tr>
            <td>${status1.count}</td>
            <td>${customer.getTen()}</td>
            <td>${customer.getNgay_sinh()}</td>
            <td>${customer.getDai_chi()}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
