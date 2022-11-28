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
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"--%>
<%--          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"--%>
<%--            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"--%>
<%--            crossorigin="anonymous"></script>--%>
    <link href="/bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet">
    <script src="/bootstrap-5.1.3-dist/js/bootstrap.js"></script>
    <style>
        a{
            text-decoration: none;
            color: black;
        }
    </style>
</head>
<body>

<div class="row">
    <div class="col-6">
        <%--form create--%>
        <form action="/product" method="get">
            <input hidden type="text" name="action" value="save">
            <button type="submit">+ Add new product</button>
        </form>
        <%--form create--%>
    </div>
    <div class="col-6">
        <%--form search--%>
        <form action="/product" method="get">
            <input hidden type="text" name="action" value="search">
            <input type="text" name="searchId" placeholder="nhập Id" value="<c:out value='${searchId}'/>">
            <input type="text" name="searchName" placeholder="nhập tên" value="<c:out value='${searchName}'/>">
            <input type="text" name="searchPhone" placeholder="nhập số điện thoại" value="<c:out value='${searchPhone}'/>">
            <button type="submit">Search</button>
        </form>
        <%--form search--%>
    </div>
</div>

<c:if test="${mess !=null}">
    <span class="text-danger">${mess}</span>
</c:if>
<c:if test="${messCreate !=null}">
    <span class="text-danger">${messCreate}</span>
</c:if>
<table class="table table-striped">
    <tr>
        <th><a href="/product">Danh sách phòng trọ</a></th>
    </tr>
    <tr>
        <th>STT</th>
        <th>Mã phòng</th>
        <th>Tên người thuê</th>
        <th>Số điện thoại</th>
        <th>Ngày thuê</th>
        <th>Thanh toán</th>
        <th>Ghi chú</th>
        <th>Action</th>
    </tr>
<%--    DƯỚI NÀY CHƯA                                                                                               --%>
    <c:forEach var="product" items="${thueList}" varStatus="status">

            <tr>
                <td>${status.count}</td>
                <td>${product.getIdThue()}</td>
                <td>${product.getNameThue()}</td>
                <td>${product.getPhoneThue()}</td>
                <td>${product.getDateThue()}</td>

                <c:forEach var="category" items="${thanhToanList}">
                    <c:if test="${category.idThanhToan==product.getIdThanhToan()}">
                        <td>${category.nameThanhToan}</td>
                    </c:if>
                </c:forEach>

                <td>${product.getNoteThue()}</td>
                <td>
                    <button type="button" onclick="infoDelete('${product.getIdThue()}','${product.getNameThue()}')"
                            class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </button>

<%--                    <button type="button"--%>
<%--                            onclick="location.href='http://localhost:8080/product?action=edit&id=${product.getIdThue()}';"--%>
<%--                            class="btn btn-primary">--%>
<%--                        Edit--%>
<%--                    </button>--%>
                </td>
            </tr>

    </c:forEach>

</table>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/product" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="delete" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá sản phẩm này </span><span id="deleteName"></span>
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
        document.getElementById("deleteName").innerText = name;
        document.getElementById("deleteId").value = id;
    }

</script>
</body>
</html>
