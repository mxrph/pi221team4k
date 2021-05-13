package team4;

import team4.Uslovie;

public class Standart extends Uslovie   {

         @Override
     		 public float calculation(int summa_try, int mesyac_try, int dosr_try) {
        	 float procMin; // Объявление переменной минимального процента
        	 float procMax; // Объявление переменной максимального процента
        	 float procRaznica; // Объявление переменной рассчитывающей разницу
        	 float procMes; // Объявление переменной месячного процента

        	 if(summa_try < 250001) { //Условие расчёта процента, который зависит от суммы
        		 procMin = (float) 16.99;
        		 procMax = (float) 23.49;
        		 procRaznica = procMax - procMin; // Расчёт разницы
        	 } else if (summa_try < 700001) { //Условие расчёта процента, которая зависит от суммы
        		 procMin = (float) 14.99;
        		 procMax = (float) 18.99;
        		 procRaznica = procMax - procMin; // Расчёт разницы
        	 } else {
        		 procMin = (float) 11.99;
        		 procMax = (float) 18.99;
        		 procRaznica = procMax - procMin; // Расчёт разницы
        	 }
        	 procMes = procRaznica/48; // Вычисление ежемесячного процента, для вычисления конечного процента
        	 proc = (float) (procMax - procMes*(mesyac_try - 12));
        	 dosr(dosr_try);
		       mproc = proc/1200; // Вычисление ежемесячного процента
		       mesyac = (float) (summa_try*(mproc+(mproc/(((Math.pow(1 + mproc, mesyac_try)))-1)))); // Формула вычисления аннуитетного платежа
		       pereplata = mesyac * mesyac_try - summa_try; // Вычисление переплаты
		       itog = summa_try + pereplata; // Общая сумма кредита
		       itog = (int)(itog*100);
		       itog = itog/100;
			return itog;
			
         }
      
}