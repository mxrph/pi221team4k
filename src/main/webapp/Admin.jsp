<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Меню администратора</title>
</head>
<body>
<style>
	.box {
  border:0;
  padding:5px;
  border-radius:15px;
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
input[type=submit]:hover {background: rgb(0,96,255)); }
input[type=submit]:active { background: rgb(0,64,0); }
  a.knopka {
  color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
border: none; /* убираем некрасивую тень */
}
a.knopka:hover { background: rgb(0,96,255); } /* при наведении курсора мышки */
a.knopka:active { background: rgb(0,64,0); } /* при нажатии */
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
	.new-select-style-wpandyou select {
    border-radius: 0;
    background: #EAEAEE;
    height: 34px;
    padding: 5px;
    border: none;
    outline: none;
    font-size: 16px;
    line-height: 1;
    -webkit-appearance: none;
    width: 400px;
   }
	.select {
  width: 100%;
  padding:5px;
  border-radius:10px;
  }
  .font {
  font-family: "Times New Roman", Times,serif }
  	.a {
  	text-align :center;
  	}
</style>
<body background="${pageContext.request.contextPath}/Config/admin.jpg">
<div class = "font">
<h1>Меню администратора</h1>
    <form action="${pageContext.request.contextPath}/Admin" method="post">
         <div class="form-fields-group">
  <input type="text" id="name" class="form-fields-input" placeholder="Введите сумму" name="a1" required>
  <label class="form-fields-group-label" for="name">Введите новую минимальную сумму</label>
</div><br>
         <div class="form-fields-group">
  <input type="text" id="name" class="form-fields-input" placeholder="Введите сумму" name="a2" required>
  <label class="form-fields-group-label" for="name">Введите новую максимальную сумму</label>
</div><br>
<input type="submit" name="sign" value="Сохранить изменения">
<a href="Login.jsp" role="button" class = "knopka">Выйти</a>

        </div>
       </form> 
    </body>
</html>