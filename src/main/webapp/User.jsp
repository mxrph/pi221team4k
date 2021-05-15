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
	.box {
  border:0;
  padding:5px;
  border-radius:15px;
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
<body bgcolor="FFFFFF">
<div class = "font">
<h1>Калькулятор потребительского кредита</h1>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <label for="summ">Введите сумму кредита от 50 000 до 3 000 000 рублей</label>
        <div class="box"><input type="text" name="summa" id="summa" placeholder="Сумма" value="${summa}"></div><br>
        <label for="second">Введите срок выплат от 12 до 60 месяцев </label>
         <div class="box"><input type="text" name="mesyac" id="mesyac" placeholder="Месяц" value="${mesyac}"></div><br>
        <label for="uslovie">Выберите условия кредита</label>
        <div class="select"><select id="uslovie" name="uslovie">
					<option value="0">Стандартные условия</option>
					<option value="1">Держу зарплатный проект в данном банке</option>
					<option value="2">Являюсь сотрудником компании партнёров этого банка</option>
				</select></div><br>
		<label for="god">Планируете досрочно погашать кредит в первый год?</label>
		<input type="radio" name="dosr" value="1">Да 
		<input checked type="radio" name="dosr" value="-1">Нет<br><br>
        <div class="a"><input type="submit" name="sign" value="Вычислить"></div>
        </div>
    </form> 
    </body>
</html>