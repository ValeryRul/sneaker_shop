<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 28.05.2021
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Account</title>
</head>
<body>
    <jsp:include page="../menu.jsp"/>
    <c:out value="Привет, ${sessionScope.user.firstName}"></c:out>
    <a href="/account/detail"><button>Мои данные</button></a>
    <a href="/account/address"><button>Мои адреса</button></a>
    <a href="/account/order"><button>Мои заказы</button></a>
</body>
</html>
