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
<div class="row">
    <div class="col-1"></div>
    <div class="col-11">
        <%--        Sửa so với create --%>
        <h1>Edit product ${product.nameProduct} </h1>
<%--        <a href="/product">Back list</a>--%>
        <p>${mess}</p>
        <%--        Sửa so với create --%>

        <form action="/product?action=edit" method="post">
            <pre hidden>ID:   <input type="text" name="id" value="<c:out value='${product.idProduct}'/>"/></pre>
            <%--            đang sửqa--%>
            <pre>Name:   <br/>  <input type="text" name="name" value="<c:out value='${product.nameProduct}'/>" required> </pre>
            <pre>Price:   <br/>  <input type="text" name="price" value="<c:out value='${product.price}'/>"
                                        required> </pre>
            <pre>Quantity:   <br/>  <input type="text" name="quantity" value="<c:out value='${product.quantity}'/>"
                                           required> </pre>
            <pre>Color:   <br/>  <input type="text" name="color" value="<c:out value='${product.color}'/>"
                                        required> </pre>
            <pre>Description:   <br/>  <input type="text" name="description"
                                              value="<c:out value='${product.description}'/>">  </pre>
            <pre>Category:  <select name="categoryId" required>
                     <option value="">Select category</option>
                          <c:forEach var="category" items="${categoryModelList}">
                              <%--                              lấy chỗ model--%>
                              <option value="${category.idCategory}" ${category.idCategory == product.idCategory ? 'selected' : '' }> ${category.nameCategory}</option>
                          </c:forEach>
                    </select>
            </pre>
            <pre>           <button class="btn btn-primary">Save</button> | <button type="button"
                                                                                      onclick="location.href='http://localhost:8080/product';"
                                                                                      class="btn btn-secondary"> Back</button></pre>
            <%--            đang sửa--%>

        </form>


    </div>


</div>

</body>
</html>
