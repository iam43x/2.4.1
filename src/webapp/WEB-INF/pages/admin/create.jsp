<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Панель админитратора</title>
</head>
<body>
<h1 style="text-align: center">Добавить нового пользователя</h1>
<hr>
<form style="text-align: center" method="post" action="/admin/add">
    <label for="login">Логин:</label>
    <input id="login" type="text" name="username">
    <label for="password">Пароль:</label>
    <input id="password" type="password" name="password">
    <label for="role">Права:</label>
    <input id="role" type="checkbox" name="role" value="ADMIN">Admin</input>
    <input type="checkbox" name="role" value="USER" checked>User</input>

    <input type="submit" value="Добавить">
</form>
<p></p>
<form style="text-align: center" method="get" action="/admin">
    <p style="text-align:center;">${message}</p>
    <input type="submit" value="Назад">
</form>
</body>
</html>