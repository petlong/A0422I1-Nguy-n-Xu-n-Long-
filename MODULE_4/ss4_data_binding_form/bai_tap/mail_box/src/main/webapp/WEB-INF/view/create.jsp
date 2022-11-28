<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/28/2022
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<h2>Setting</h2>
<form:form action="/create" method="post" modelAttribute="mail">

    <label>Language</label>
        <form:select path="languages">
            <form:options items="${languagesList}"></form:options>
        </form:select>

    <label>Page Size</label>
    <form:select path="pageSize">
        <form:options items="${sizeList}"></form:options>
    </form:select>

    <label>Spams Filter</label>
    <form:radiobutton path="spamsFilter"/><br>

    <label>Signature</label>
    <form:input type="text" name="signature" path="signature"/><br>
    <%--    <form:select path="gender">--%>
    <%--        <form:options items="${genderList}"></form:options>--%>
    <%--    </form:select>--%>
    <%--    <form:checkboxes path="gender" items="${genderList}"></form:checkboxes>--%>
<%--    <form:radiobuttons path="gender" items="${genderList}"></form:radiobuttons>--%>
    <button type="submit">Create</button>
    <button type="reset">Cancel</button>

</form:form>
</body>
</html>
