<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 10/19/2022
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<h1>List Employee</h1>
<a href="/employee?action=add"> Add new</a>
<c:if test="${mess !=null}">
    <span class="text-danger">${mess}</span>
</c:if>
<table class="table table-striped">
    <tr>
        <th>STT</th>
        <th>Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>IdCard</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Position</th>
        <th>EducationDegreeId</th>
        <th>DivisionId</th>
        <th>UserName</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${employee.getId()}</td>
            <td>${employee.getName()}</td>
            <td>${employee.getBirthday()}</td>
            <td>${employee.getIdCard()}</td>
            <td>${employee.getSalary()}</td>
            <td>${employee.getPhone()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getAddress()}</td>
            <c:forEach var="position" items="${positionList}">
                <c:if test="${position.positionId==employee.getPositionId()}">
                    <td>${position.positionName}</td>
                </c:if>
            </c:forEach>
            <td>${employee.getEducationDegreeId()}</td>
            <td>${employee.getDivisionId()}</td>
            <td>${employee.getUserName()}</td>
            <td>
                <button type="button" onclick="infoDelete('${employee.getId()}','${employee.getName()}')" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>

</table>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/student" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="delete" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá sinh viên </span><span id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>

    </div>
</div>
<script>
    function infoDelete(id, name) {
      document.getElementById("deleteName").innerText=name;
      document.getElementById("deleteId").value=id;
    }
</script>
</body>
</html>
