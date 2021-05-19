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
input[type=submit] {
  color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
border: none; /* убираем некрасивую тень */
}
input[type=submit]:hover {background: rgb(0,96,255); }
input[type=submit]:active { background: rgb(0,64,255); }
.form-fields-group {
  position: relative;
}
.form-fields-group-label {
    position: absolute;
    font-size: 13px;
    color: #27252a;
    font-family: 'Roboto', sans-serif;
    top: 10px;
    left: 15px;
 
}
.form-fields-input {
    width: 300px;
    padding: 30px 15px 10px;
    border: none;
    background: #EAEAEE;
    border-radius: 5px;
    font-family: 'Roboto', sans-serif;
    font-size: 15px;
}
input:focus ~ label, label:focus {
  color: blue;
}
.font {
font-family: "Times new roman", Times, serif
}
</style>
<div class="a">
<div class ="font">
<h1>Добро пожаловать на сайт калькулятора потребительского кредита!</h1>
<div>
<h3>Для продолжения введите логин и пароль</h3>
	<div class ="form">
    <form action="${pageContext.request.contextPath}/JavaLogin" method="post">
    <div class="form-fields-group">
<label class="form-fields-group-label" for="login">Логин</label>
<input type="text" name="login" id="login" class="form-fields-input" placeholder="Логин" value="${login}" required><br><br>
  </div> 
   <div class="form-fields-group">
<label class="form-fields-group-label" for="pass">Пароль</label>
<input type="password" name="pass" id="pass" class="form-fields-input" placeholder="Пароль" value="${pass}"required><br><br>
<h4>Неверный логин и/или пароль</h4>
<input type="submit" name="sign" value="Войти">
</div>
		</form>
	</div>
	</div>
</div>
</div>
</body>
</html>