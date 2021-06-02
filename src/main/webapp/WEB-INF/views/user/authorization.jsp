<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 25.05.2021
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<form method="post" action="/auth" >
    <label for="login">Введите логин:</label>
    <input type="text" id="login" name="login"/>
    <label for="password">Введите пароль:</label>
    <input type="password"  id="password" name="password"/>
    <input type="submit" value="Отправить">
</form>
</body>
</html>
