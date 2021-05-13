<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор потребительского кредита</title>
</head>
<body>
<style>
div.a {
text-align:center;
}
</style>
<body bgcolor="E0FFFF">
<div class="a">
<h1>Калькулятор потребительского кредита</h1>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <label for="summ">Введите сумму кредита от 50 000 до 3 000 000 рублей</label>
        <input type="text" name="summa" id="summa" value="${summa}"><br>
        <label for="second">Введите срок выплат от 12 до 60 месяцев </label>
        <input type="text" name="mesyac" id="mesyac" value="${mesyac}"><br>
        <label for="uslovie">Выберите условия кредита</label>
        <select id="uslovie" name="uslovie">
					<option value="0">Стандартные условия</option>
					<option value="1">Держу зарплатный проект в данном банке</option>
					<option value="2">Являюсь сотрудником компании партнёров этого банка</option>
				</select><br>
		<label for="god">Планируете досрочно погашать кредит в первый год?</label>
		<input type="radio" name="dosr" value="1">Да
		<input checked type="radio" name="dosr" value="-1">Нет<br>
        <input type="submit" name="sign" value="Вычислить">
    </form> 
    </div>
    </body>
</html>