<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Окно авторизации</title>
</head>
<body>
<style>
div.a {
text-align:center;
}
input[type=submit] {
  color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(212,75,56); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
border: none; /* убираем некрасивую тень */
}
input[type=submit]:hover {background: rgb(232,95,76); }
input[type=submit]:active { background: rgb(152,15,0); }
.font {
font-family: "Times new roman", Times, serif}
</style>
<div class="a">
<div class ="font">
<h1>Введите логин и пароль</h1>
	<div class ="form">
    <form action="${pageContext.request.contextPath}/JavaLogin" method="post">
<label for="login">Логин</label>
<input type="text" name="login" id="login" placeholder="Логин" value="${login}"><br>
<label for="pass">Пароль</label>
<input type="password" name="pass" id="pass" placeholder="Пароль" value="${pass}"><br>
<input type="submit" name="sign" value="Войти">
		</form>
	</div>
	</div>
</body>
</html>