<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 14.05.2021
  Time: 4:40
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
<form:form action="/product/new" modelAttribute="product" method="post">
    <p>Choose brand:
        <form:select path="brand">
        <option value="New Balance">New Balance</option>
        <option value="Nike">Nike</option>
        <option value="Adidas">Adidas</option>
        </form:select>
    </p>
    <label for="model">Enter model:</label>
    <form:input type="text" path="model" id="model"/>
    <label for="article">Enter Article</label>
    <form:input type="text" path="article" id="article"/>
    <label for="price">Price</label>
    <form:input type="number" path="price" id="price"/>
    <p>Choose sex:
        <form:select path="sex" size="1">
            <option value="man">man</option>
            <option value="woman">woman</option>
            <option value="unisex">unisex</option>
            <option value="child">child</option>
        </form:select>
    </p>
    <input type="submit" value="Send">
</form:form>
</body>
</html>
