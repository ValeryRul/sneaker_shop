<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 28.05.2021
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Data</title>
</head>
<body>
    <form action="user/update" method="post">
    <label for="firstName"/><strong>Имя*</strong>
        <input type="text" id="firstName" value="${sessionScope.user.firstName}">
    </label>
    <label for="lastName"><strong>Фамилия*</strong>
        <input type="text" id="lastName" value="${sessionScope.user.lastName}">
    </label>
    <label for="oldPassword"><strong>Старый пароль*</strong>
        <input type="text" id="oldPassword">
    </label>
        <label for="newPassword"><strong>Новый пароль*</strong>
            <input type="text" id="newPassword">
        </label>
        <label for="newPassword"><strong>Новый пароль*</strong>
            <input type="text" id="newPassword">
        </label>
    <input type="submit" value="Сохранить изменения">
    </form>
</body>
</html>
