<%--
  Created by IntelliJ IDEA.
  User: prata
  Date: 03.03.2021
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Регистрация</title>
</head>
<body>

<form:form action="/reg" modelAttribute="user" method="post"  >
    <label for="firstName">
        Имя*
    </label>
    <form:input path="firstName" id="firstName"/>
    <label for="lastName">
        Фамилия*
    </label>
    <form:input path="lastName" type="text" id="lastName"/><br>
    <label for="email">
        Адрес e-mail*
    </label>
    <form:input path="email" type="text" id="email"/>
    <label for="password">
        Твой пароль*
        <small>
            Пароль должен состоять не менее чем из 8 символов и содержать заглавные и строчные буквы, а также цифры или специальные знаки
        </small>
    </label>
    <form:input path="password" type="password" id="password"/>
    <label for="password_confirmation">
        Повторите пароль*
    </label>
    <input type="password" name="password_confirmation" id="password_confirmation"><br>
    <label for="news_loyalty_program">
        Хотите подписаться на рассылку и попасть в программу лояльности?
        <input type="checkbox" value="1" name="news_loyalty_program" id="news_loyalty_program">
    </label>
    <label for="root">
        Выберите роль пользователя (админ):
    </label>
    <form:select path="root" size="1" id="root">
        <option value="admin">Administrator</option>
        <option value="user">User</option>
    </form:select>
    <label for="sex">
        Выберите пол:
    </label>
    <form:select path="sex" size="1" id="sex">
        <option value="man">Man</option>
        <option value="woman">Woman</option>
    </form:select>
    <input type="submit" value="Создать аккаунт">
</form:form>
</body>
</html>
