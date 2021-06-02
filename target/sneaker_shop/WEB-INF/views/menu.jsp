<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 28.04.2021
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Franklin Store</title>
</head>
<body>
<header>
    <h1>Franklin Store</h1>
</header>
<table>
    <tr>
        <td><button><a href="man/product">Мужское</a></button></td>
        <td><button><a href="woman/product">Женское</a></button></td>
        <td><button><a href="unisex/product">Унисекс</a></button></td>
        <td><button><a href="child/product">Детское</a></button></td>
        <td><button><a href="/basket/">Корзина</a></button></td>

        <c:if test="${sessionScope.user} == null}">
            <td><button><a href="/auth/">Авторизация</a></button></td>
        </c:if>
    </tr>
</table>
</body>
</html>
