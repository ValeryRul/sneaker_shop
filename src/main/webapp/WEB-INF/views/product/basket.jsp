<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 24.05.2021
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>Корзина</title>
</head>
<body>
<jsp:include page="../menu.jsp"/>
<c:forEach items="${products}" var="product">

        <c:out value="${product.brand}"/>

</c:forEach>

</body>
</html>
