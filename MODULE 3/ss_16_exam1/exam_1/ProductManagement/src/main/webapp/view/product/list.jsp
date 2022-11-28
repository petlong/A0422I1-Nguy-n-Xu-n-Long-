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
            <input type="text" name="searchName" placeholder="nhập tên" value="<c:out value='${searchName}'/>">
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
        <th><a href="/product">Danh sách sách</a></th>
    </tr>
    <tr>
        <th>STT</th>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Mô tả</th>
        <th>Số lượng</th>
        <th></th>
    </tr>
<%--    DƯỚI NÀY CHƯA                                                                                               --%>
    <c:forEach var="sach" items="${sachList}" varStatus="status">
        <%--        test thử phân trang --%>
<%--        <c:if test="${( (page == 0) || (page<=10 && (status.count<=page))  || (page>10 && page<=20&& (status.count >10 && status.count<=20))) }">--%>
            <%--        test thử test thử phân trang --%>
            <tr>
                <td>${status.count}</td>
<%--                <td>${product.getIdProduct()}</td>--%>
                <td>${sach.getMaSach()}</td>
                <td>${sach.getTenSach()}</td>
                <td>${sach.getTacGia()}</td>
                <td>${sach.getMoTa()}</td>
                <td>${sach.getQuantity()}</td>

<%--                <c:forEach var="category" items="${categoryModelList}">--%>
<%--                    <c:if test="${category.idCategory==product.getIdCategory()}">--%>
<%--                        <td>${category.nameCategory}</td>--%>
<%--                    </c:if>--%>
<%--                </c:forEach>--%>

                <td>
<%--                    <button type="button" onclick="infoDelete('${product.getIdProduct()}','${product.getNameProduct()}')"--%>
<%--                            class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--                        Delete--%>
<%--                    </button>--%>
<%--                </td>--%>
<%--                <td>--%>
                    <button type="button"
                            onclick="location.href='http://localhost:8080/product?action=add&id=${sach.getMaSach()}';"
                            class="btn btn-primary">
                        Mượn
                    </button>
                </td>
            </tr>
            <%--        test thử --%>
<%--        </c:if>--%>
        <%--        test thử --%>

    </c:forEach>

</table>
<!-- Modal -->
<%--<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <form action="/product" method="get">--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>--%>
<%--                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <input name="action" value="delete" hidden>--%>
<%--                    <input name="deleteId" id="deleteId" hidden>--%>
<%--                    <span class="text-danger">Bạn có muốn xoá sản phẩm này </span><span id="deleteName"></span>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                    <button type="submit" class="btn btn-primary">Delete</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<div class="modal fade" id="exampleModalEdit" tabindex="-1" aria-labelledby="exampleModalEditLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <form action="/employee" method="get">--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="exampleModalEditLabel">Modal title</h5>--%>
<%--                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <input name="action" value="edit" hidden>--%>
<%--                    <input name="deleteId" id="editId" hidden>--%>
<%--                    <span class="text-danger">Bạn có sửa nhân viên này không? </span><span id="editName"></span>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                    <button type="submit" class="btn btn-primary">Delete</button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>

<script>
    function infoDelete(id, name) {
        document.getElementById("deleteName").innerText = name;
        document.getElementById("deleteId").value = id;
    }

    // function infoEdit(id, name) {
    //     document.getElementById("deleteName").innerText = name;
    //     document.getElementById("edId").value = id;
    // }
</script>
<%--Phân trang--%>
<%--<nav aria-label="Page navigation example">--%>
<%--    <ul class="pagination">--%>
<%--        <li class="page-item"><a class="page-link"--%>
<%--                                 href="${page == 30 ? '/employee?page=20' : (page == 20 ? '/employee?page=10' : (page == 10 ? '/employee?page=10' : '' ))}">Previous</a>--%>
<%--        </li>--%>
<%--        <li class="page-item"><a class="page-link" href="/employee?page=10">1</a></li>--%>
<%--        <li class="page-item"><a class="page-link" href="/employee?page=20">2</a></li>--%>
<%--        <li class="page-item"><a class="page-link" href="/employee?page=30">3</a></li>--%>
<%--        <li class="page-item"><a class="page-link"--%>
<%--                                 href="${page == 10 ? '/employee?page=20' : (page == 20 ? '/employee?page=30' : (page == 30 ? '/employee?page=30' : '' ))}">Next</a>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--</nav>--%>

<%--Phân trang--%>

<%--footer--%>
</body>
</html>
