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
background: rgb(0,32,255); /* фон кнопки */
padding: .5em 1.2em; /* отступ от текста */
outline: none; /* убирать контур в Mozilla */
border-radius:15px;
border: none; /* убираем некрасивую тень */
}
input[type=submit]:hover {background: rgb(0,96,255)); }
input[type=submit]:active { background: rgb(0,64,255); }
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
    width: 400px;
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
  	 .custom-radio>input {
      position: absolute;
      z-index: -1;
      opacity: 0;
    }

    /* для элемента label связанного с .custom-radio */
    .custom-radio>span {
      display: inline-flex;
      align-items: center;
      user-select: none;
    }

    /* создание в label псевдоэлемента  before со следующими стилями */
    .custom-radio>span::before {
      content: '';
      display: inline-block;
      width: 1em;
      height: 1em;
      flex-shrink: 0;
      flex-grow: 0;
      border: 1px solid #adb5bd;
      border-radius: 50%;
      margin-right: 0.5em;
      background-repeat: no-repeat;
      background-position: center center;
      background-size: 50% 50%;
    }
    /* стили при наведении курсора на радио */
    .custom-radio>input:not(:disabled):not(:checked)+span:hover::before {
      border-color: #b3d7ff;
    }

    /* стили для активной радиокнопки (при нажатии на неё) */
    .custom-radio>input:not(:disabled):active+span::before {
      background-color: #b3d7ff;
      border-color: #b3d7ff;
    }

    /* стили для радиокнопки, находящейся в фокусе */
    .custom-radio>input:focus+span::before {
      box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
    }

    /* стили для радиокнопки, находящейся в фокусе и не находящейся в состоянии checked */
    .custom-radio>input:focus:not(:checked)+span::before {
      border-color: #80bdff;
    }

    /* стили для радиокнопки, находящейся в состоянии checked */
    .custom-radio>input:checked+span::before {
      border-color: #0b76ef;
      background-color: #0b76ef;
     
    }

    .custom-radio>input:disabled+span::before {
      background-color: #e9ecef;
    }

    body {
      padding: 20px 50px;
    }

    .radio {
      margin-bottom: 0.2em;
    }
    .topright {
    float:center;
    }
</style>
<body background="${pageContext.request.contextPath}/Config/123.jpg">
<div class = "font">
   <div class = "topright">
    <div class="a"><a href="komanda.jsp" role="button" class ="knopka">О нас</a><br><br><br>
     <a type="submit" href="/CalcTeam4/docs/ExplNote.pdf" class="knopka" >Пояснительная записка</a><br>
              </div></div>
<h1>Калькулятор потребительского кредита</h1>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
        <div class="form-fields-group">
        <label class=form-fields-group-label for="summ">Введите сумму кредита от ${a1} до ${a2}  рублей</label>
       <input class="form-fields-input" type="text" name="summa" id="summa" placeholder="Сумма" value="${summa}" required pattern="^[0-9]*$"></div><br>
       </div>
       <div class="form-fields-group">
        <label class=form-fields-group-label for="second">Введите срок выплат от 12 до 60 месяцев </label>
        <input  class="form-fields-input" type="text" name="mesyac" id="mesyac" placeholder="Месяц" value="${mesyac}" required pattern="^[0-9]*$"></div><br>
        </div>
        <label for="uslovie">Выберите условия кредита</label>
         <div class="new-select-style-wpandyou"><select id="uslovie" name="uslovie">
					<option value="0">Стандартные условия</option>
					<option value="1">Держу зарплатный проект в данном банке</option>
					<option value="2">Являюсь сотрудником компании партнёров этого банка</option>
				</select></div><br><br>
		<label for="name">Собираетесь ли вы досрочно погашать кредит?</label><br>
	
	<div class="radio">
    <label class="custom-radio">
      <input type="radio" name="dosr" value="1">
      <span>Да</span>
    </label>
  </div>
  <div class="radio">
    <label class="custom-radio">
      <input cheked type="radio" name="dosr" value="-1">
      <span>Нет</span>
    </label>
  </div>
  <input type="submit" name="sign" value="Вычислить"></div>
        </div>
    </form> 
    </body>
</html>