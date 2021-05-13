<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат:</title>
</head>
<body>
<body bgcolor="E0FFFF">
<style>
div.a {
text-align:center;
}
 nav li {
                 display: inline-block;
               }
</style>
<body bgcolor="E0FFFF">
<div class="a">
<h1>Результат</h1>

<p><strong>Ваша процентная ставка: </strong> ${proc}%</p>
<p><strong>Ежемесячный платеж составляет: </strong> ${mes} руб.</p>
<p><strong>Переплата по кредиту составит: </strong> ${pereplata} руб.</p>
<p><strong>Общая сумма: </strong> ${itog} руб.</p><br>

<form action="${pageContext.request.contextPath}/User.jsp">
    <input type="submit" name="sign" value="Ввести новые данные"><br><br><br>
    <li><a href="../result.pdf" download>Скачать PDF файл</a></li>
    </form>

</body>
</html>