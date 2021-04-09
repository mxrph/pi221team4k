package project4;

	public class DliaZaiomshikov extends Uslovie {

		@Override
		public void porcent() {
			double procMin;// Объявление переменной минимального процента
			double procMax;// Объявление переменной максимального процента
			double procRaznica;// Объявление переменной, которая рассчитывает разницу
			double procMes; // Объявление переменной месячного процента

			if(summ < 250001) { //Условие расчёта процента, который зависит от суммы
				procMin = 13.99;
				procMax = 23.49;
				procRaznica = procMax - procMin;// Расчёт разницы
			} else if (summ < 700001) {//Условие расчёта процента, которая зависит от суммы
				procMin = 12.99;
				procMax = 18.99;
				procRaznica = procMax - procMin;// Расчёт разницы
			} else {
				procMin = 11.99;
				procMax = 18.99;
				procRaznica = procMax - procMin;// Расчёт разницы
			}
			procMes = procRaznica/48;// Вычисление ежемесячного процента, для вычисления конечного процента
			proc = procMax - procMes*(mes - 12);
		}

	}
