<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Информация о разработчиках</title>
</head>
<body>
<style>
.text {
margin: auto;
text-align: center;
vertical-align:center;
font-family: "Times New Roman", Times,serif
}
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
  	.a {
  	text-align :center;
  	}
.gradient-text {
  font-size: 14px;
  background: linear-gradient(45deg, #0B2349 33%, #0D61BC 66%, #8AA9D6);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  color: white;
  display: table;
  margin: 20px auto;
}
</style><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<div><body background="${pageContext.request.contextPath}/Config/efef.jpg"><br>
 <div class="a"><button type = "button" name="Back" onclick="history.back()" class="knopka1">Вернуться к калькулятору</button></div></div>
</body>
</html>