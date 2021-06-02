<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 13.05.2021
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../menu.jsp"/>
    <c:out value="${product.brand} ${product.article}"/>
    <a href="/product/new">
        <button>Редактировать</button>
    </a>
    <a href=<c:url value="product/${product.article}"/>>
        <button>Удалить</button>
    </a>
    <a href = <c:url value="/basket/add?article=${product.article}"/>>
        <button>Добавить продукт</button>
    </a>

</body>
</html>