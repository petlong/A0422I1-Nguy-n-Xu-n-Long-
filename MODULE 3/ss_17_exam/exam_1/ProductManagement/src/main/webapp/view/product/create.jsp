<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 10/21/2022
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"--%>
<%--          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"--%>
<%--            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"--%>
<%--            crossorigin="anonymous"></script>--%>
    <link href="/bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/bootstrap-5.1.3-dist/js/bootstrap.js"></script>
</head>
<body>
<%--<%@ include file="../common/header.jsp" %>--%>
<div class="row">
    <div class="col-1"></div>
    <div class="col-11">
        <h1>Tạp thông tin thuê trọ</h1>
        <p>${mess}</p>
        <form action="/product?action=save" method="post">
            <%--        <pre>ID:   <input type="text" name="id"/></pre>--%>
            <pre>Tên người thuê:   <br/>  <input type="text" name="nameThue" required> </pre>
            <pre>Số điện thoại:   <br/>  <input type="text" name="phoneThue" required> </pre>
                <pre>Ngày thuê: <input type="date" name="ngayThue"> </pre>
            <pre>Hình thức thanh toán:  <select name="idThanhToan" required>
                     <option value="">Select category</option>
                          <c:forEach var="category" items="${thanhToanList}">
                              <option value="${category.idThanhToan}"> ${category.nameThanhToan}</option>
                          </c:forEach>
                    </select>
            </pre>
                <pre>Ghi chú:   <br/>  <input type="text" name="noteThue">  </pre>

                <pre>           <button class="btn btn-primary">Create</button> | <button type="button" onclick="location.href='http://localhost:8080/product';" class="btn btn-secondary"> Back</button></pre>

        </form>


    </div>


</div>


</body>
</html>
