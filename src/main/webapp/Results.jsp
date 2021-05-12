<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат:</title>
</head>
<body>
<h1>Результат</h1>

<p><strong>Ваша процентная ставка: </strong></p> <br>
<p><strong>Ежемесячный платеж составляет: </strong></p> <br>
<p><strong>Переплата по кредиту составит: </strong></p> <br>
<p><strong>Общая сумма: </strong></p><br>

<form action="${pageContext.request.contextPath}/User.jsp">
    <input type="submit" name="sign" value="Ввести новые данные"><br><br><br>
    </form>

</body>
</html>