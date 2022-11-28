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
</head>
<body>
<h1>Add new employee</h1>
<a href="/employee">Back list employee</a>
<p>${mess}</p>
<form action="/employee?action=add" method="post">
<%--        <pre>ID:   <input type="text" name="id"/></pre>--%>
    <pre>Name:     <input type="text" name="name"> </pre>
<%--    <pre>Gender :  <input type="radio" name="gender" value="true">Nam <input type="radio" value="false" name="gender"> Nữ </pre>--%>
    <pre>Birthday: <input type="date" name="birthday"> </pre>
    <pre>IdCard:     <input type="text" name="idCard"> </pre>
    <pre>Phone:     <input type="text" name="phone"> </pre>
    <pre>Email:    <input type="text" name="email"> </pre>
    <pre>Address:    <input type="text" name="address"> </pre>
    <pre>Salary:    <input type="text" name="salary"> </pre>
    <pre>PositionId:
        <select name="positionId">
                     <option value="">Null</option>
                          <c:forEach var="position" items="${positionList}">
                              <option value="${position.positionId}"> ${position.positionName}</option>
                          </c:forEach>
                    </select>
    </pre>
    <pre>EducationDegreeId:    <input type="text" name="educationDegreeId"> </pre>
    <pre>DivisionId:    <input type="text" name="divisionId"> </pre>
    <pre>UserName:    <input type="text" name="userName"> </pre>
<%--    <pre>ClassId:  <select name="classId">--%>
<%--                     <option value="1"> C11</option>--%>
<%--                     <option value="2"> C12</option>--%>
<%--                     <option value="3"> A08</option>--%>
<%--                    </select>--%>
<%--    </pre>--%>
    <pre>           <button>Save</button></pre>
</form>
</body>
</html>
