<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Окно авторизации</title>
</head>
<body>
<body bgcolor="E0FFFF">
<style>
div.a {
text-align:center;
}
</style>
<body bgcolor="E0FFFF">
<div class="a">
<h1>Введите логин и пароль</h1>
	<div class ="form">
    <form action="${pageContext.request.contextPath}/JavaLogin" method="post">
<label for="login">Логин</label>
<input type="text" name="login" id="login" value="${login}"><br>
<label for="pass">Пароль</label>
<input type="password" name="pass" id="pass" value="${pass}"><br>
<input type="submit" name="sign" value="Войти">
			<input type="button" value="Назад" onclick="history.back();"/>
		</form>
	</div>
</body>
</html>