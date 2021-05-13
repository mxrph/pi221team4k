<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор потребительского кредита</title>
</head>
<body>
<body bgcolor="E0FFFF">
<h1>Калькулятор потребительского кредита (администратор)</h1>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <label for="summ">Введите сумму кредита от 50 000 до 3 000 000 рублей</label><br>
        <input type="text" name="summ" id="summ" value="${summ}"><br>
        <label for="second">Введите срок выплат от 12 до 60 месяцев </label><br>
        <input type="text" name="mes" id="mes" value="${mes}"><br>
        <a>Выберите условия кредита</a><br>
        <select size="1">
        <option value="Standart">Стандартные условия</option>
        <option value="dliaZaiomshikov">Держу зарплатный проект в данном банке</option>
        <option value="DliaSotrunikov">Являюсь сотрудников компании партнёров этого банка</option>
        </select><br>
        <input type ="checkbox" name="dosr" value="dosr"> <label>Не планирую досрочно погашать кредит в первый год</label><br>
        <input type="submit" name="sign" value="Вычислить">
    </form>
    </body>
</html>