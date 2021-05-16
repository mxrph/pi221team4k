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
background: rgb(212,75,56); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border: none; /* убираем некрасивую тень */
border-radius:15px;
}
input[type=submit]:hover {background: rgb(232,95,76); }
input[type=submit]:active { background: rgb(152,15,0); }
  a.knopka {
color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(212,75,56); /* фон кнопки */
padding: .5em 1.3em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
}
a.knopka:hover { background: rgb(232,95,76); } /* при наведении курсора мышки */
a.knopka:active { background: rgb(152,15,0); } /* при нажатии */
</style>
<div class ="font">

<h1>Результат</h1>
    
<p><strong>Ваша процентная ставка: </strong> ${proc}%</p>
<p><strong>Ежемесячный платеж составляет: </strong> ${mes} руб.</p>
<p><strong>Переплата по кредиту составит: </strong> ${pereplata} руб.</p>
<p><strong>Общая сумма: </strong> ${itog} руб.</p><br>
	
	<div class ="center"><form action="${pageContext.request.contextPath}/User.jsp">
    <input type="submit" name="sign" value="Ввести новые данные"><br><br>
    </form>
    <a href="tmp/result.pdf" class="knopka" download>Скачать PDF файл</a></div>
</div>
</body>
</html>