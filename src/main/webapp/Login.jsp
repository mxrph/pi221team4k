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
.right {
float:right;
}
.center {
text-align:center;
}
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
    z-index:99999999;
        top: 40px;
    	left: 145px;
        margin-right: -50%;
        transform: translate(-50%, -50%)
      
 
}
.form-fields-group-label1 {
    position: absolute;
    font-size: 13px;
    color: #27252a;
    font-family: 'Roboto', sans-serif;
    z-index:99999999;
        top: 40px;
    	left: 150px;
        margin-right: -50%;
        transform: translate(-50%, -50%)
      
 
}

.form-fields-input {
    width: 300px;
    padding: 30px 15px 10px;
    border: none;
    background: #EAEAEE;
    border-radius: 5px;
    font-family: 'Roboto', sans-serif;
    font-size: 15px;
     top: 50%;
        left: 50%;
        margin-right: +50%;
        transform: translate(+35%, +35%)
}
input:focus ~ label, label:focus {
  color: blue;
}
.font {
font-family: "Times new roman", Times, serif
}
.form_auth_block_head_text{
    display: block;
    text-align: center;
    padding: 10px;
    font-size: 20px;
    font-weight: 600;
    background: #0000ffff;
    opacity: 1;
}
 body {
 	body background="${pageContext.request.contextPath}/Config/bg-01.jpg"
        background: white }
    section {
       background-image: url(Config/bg-01.jpg); /* Путь к фоновому изображению */
        border-radius: 1em;
        padding: 1em;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%) }
</style>
<div class="a">
<div class ="font"><body background="${pageContext.request.contextPath}/Config/123.jpg"><section>

<h1>Калькулятор для рассчёта потребительского кредита</h1>
<div class="center">
<p class="form_auth_block_head_text">Авторизация</p>
</div>
	<div class ="form">
    <form action="${pageContext.request.contextPath}/JavaLogin" method="post">
    <div class="form-fields-group">
<label class="form-fields-group-label" for="login">Логин</label>
<input type="text" name="login" id="login" class="form-fields-input" placeholder="Введите логин" value="${login}" required><br><br>
  </div> 
   <div class="form-fields-group">
<label class="form-fields-group-label1" for="pass">Пароль</label>
<input type="password" name="pass" id="pass" class="form-fields-input" placeholder="Введите пароль" value="${pass}"required><br><br>
<input class="right" type="submit" name="sign" value="Войти">  
</section>
</div>
		</form>
	</div>
	</div>
</div>
</body>
</html>