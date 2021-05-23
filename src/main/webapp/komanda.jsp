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
  a.knopka {
  color: #fff; /* цвет текста */
text-decoration: none; /* убирать подчёркивание у ссылок */
user-select: none; /* убирать выделение текста */
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
border: none; /* убираем некрасивую тень */
 top: 50%;
        left: 50%;
        margin-right: +50%;
        transform: translate(+50%, +35%)
}
a.knopka:hover { background: rgb(0,96,255); } /* при наведении курсора мышки */
a.knopka:active { background: rgb(0,64,0); } /* при нажатии */
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
 <div class="a"><a href="User.jsp" role="button" class ="knopka">Вернуться к калькулятору</a></div></div>
</body>
</html>