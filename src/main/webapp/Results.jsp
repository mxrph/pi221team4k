<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат:</title>
</head>
<body>
<style>
.center{
text-align:center;
}
  .font {
  font-family: "Times New Roman", Times,serif }
  input[type=submit] {
  color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border: none; /* убираем некрасивую тень */
border-radius:15px;
}
input[type=submit]:hover {background: rgb(0,96,255); }
input[type=submit]:active { background: rgb(0,64,255); }
  a.knopka {
color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.3em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
}
a.knopka:hover { background: rgb(0,96,255); } /* при наведении курсора мышки */
a.knopka:active { background: rgb(0,64,255); } /* при нажатии */
  .knopka1 {
color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.3em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
}
.knopka1:hover { background: rgb(0,96,255); } /* при наведении курсора мышки */
.knopka1:active { background: rgb(0,64,255); } /* при нажатии */
</style>
<body background="${pageContext.request.contextPath}/Config/123.jpg">
<div class ="font">

<h1>Результат</h1>
    
<p><strong>Ваша процентная ставка: </strong> ${proc}%</p>
<p><strong>Ежемесячный платеж составляет: </strong> ${mes} руб.</p>
<p><strong>Переплата по кредиту составит: </strong> ${pereplata} руб.</p>
<p><strong>Общая сумма: </strong> ${itog} руб.</p><br>
	
	<div class ="center">
    <strong><button type = "button" name="Back" onclick="history.back()" class="knopka1">Вернуться в форму ввода данных</button></strong><br><br>
    <form action="pdf" method="post">
    <a type="submit" href="pdf" class="knopka">Открыть PDF файл</a><br><br>
    <a type="submit" href="pdf" class="knopka" download>Скачать PDF файл</a></div>
    </form>
</div>
</body>
</html>