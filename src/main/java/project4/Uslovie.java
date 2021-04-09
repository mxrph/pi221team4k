package project4;

import javax.swing.JOptionPane;

public abstract class Uslovie {

  private String summStr;
  private String srokStr;

  protected double proc;

  protected int summ;
  protected int mes;

  private boolean dosr; // Если = true, то -n%

  public void raschet() {

     try {
      summ = Integer.parseInt(summStr); // Перевод вводимой суммы в число
      mes = Integer.parseInt(srokStr); // Перевод вводимого срока в число
     } catch (NumberFormatException e1) {
       JOptionPane.showMessageDialog(null,"Некорректный ввод суммы и срока","Ошибка",JOptionPane.ERROR_MESSAGE); // Окно вывода ошибки при неверно введённых данных
       return;
       }

     if (summ < 50000 || summ > 3000000 || mes < 12 || mes > 60 ) { // Установка ограничений
      JOptionPane.showMessageDialog(null, "Неверно введена сумма или срок"); // Проверка на ввод данных, соответстующих диапазонам
      return;
      }

     porcent(); // Вызов метода

       if (dosr) {
       proc -=2; // Если данный пункт выбран, то снижается процент ставки
       }

       proc = (int)(proc*100); // Округление процента в целое
       proc /= 100; // Перевод числа в десятичную форму для последующих вычислений

      double mproc = proc/1200; // Вычисление ежемесячного процента
      double mesyac = summ*(mproc+(mproc/(((Math.pow(1 + mproc, mes)))-1))); // Формула вычисления аннуитетного платежа
      double pereplata = mesyac * mes - summ; // Вычисление переплаты
      double itog = summ + pereplata; // Общая сумма кредита

     pereplata = (int)(pereplata*100); // Округление в целое
     pereplata /= 100; // Перевод в десятичное

     itog = (int)(itog*100);// Округление в целое
     itog /= 100;// Перевод в десятичное

     mesyac = (int)(mesyac*100);// Округление в целое
     mesyac = mesyac/100; // Перевод в десятичное

     JOptionPane.showMessageDialog(null,"Ваша процентная ставка " + proc + "%\nЕжемесячный платёж составит "+ mesyac +
     " руб.\nПереплата по кредиту составит " + pereplata + " руб.\nОбщая сумма " + itog + " руб.","Данные о кредите", -1); // Вывод всех расчётов в отдельном окне
     }

public void setSumm(String summStr) {
this.summStr = summStr; // Считывание пользовательского ввода
}

public void setSrok(String srokStr) { // Считывание пользовательского ввода
this.srokStr = srokStr;
}

public void setDosr(boolean dosr) { // Считывание пользовательского ввода
this.dosr = dosr;
}

public abstract void porcent(); // Создание абстрактного метода

}