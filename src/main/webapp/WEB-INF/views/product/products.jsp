<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 28.04.2021
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../menu.jsp"/>
<c:forEach items="${products}" var="product">
        <a href = "<c:url value = "/product/${product.article}"/>">
            <c:out value="${product.brand} ${product.article}"/>
        </a>
</c:forEach>
</body>
</html>
