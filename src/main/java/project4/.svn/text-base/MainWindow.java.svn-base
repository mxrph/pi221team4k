package project4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project4.DliaSotrudnikov;
import project4.DliaZaiomshikov;
import project4.Standart;
import project4.info;
import project4.ListenerButton;

public class MainWindow {

	public MainWindow() {
		JFrame main_GUI = new JFrame("calculator"); // создание графического окна
		main_GUI.setTitle ("Калькулятор потребительский кредит"); 
		main_GUI.setBounds(400,200,400,350);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null); 
		
		String[] uslovia = {"Стандартные условия", "Держу зарплатный проект в данном банке", "Являюсь сотрудником компании-партнёров этого банка"};
		final JComboBox usl = new JComboBox(uslovia);
		usl.setBounds(20,45,340,30);
		main_panel.add(usl);
		
		final JTextField summ = new JTextField(); // создание текстового поля
		summ.setBounds(20,105,200,30); // параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
		main_panel.add(summ); // Добавление текстового поля на панель
		
		final JTextField srok = new JTextField();  // создание текстового поля
		srok.setBounds(20,155,200,30); //  параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
		main_panel.add(srok); // Добавление текстового поля на панель
		
		final JCheckBox dosr = new JCheckBox("Не планирую досрочно погашать кредит в первый год"); // создаем флажок
		dosr.setBounds(20,200,400,30); // размеры созданного флажка
		main_panel.add(dosr); // Добавление флажка на панель
	
		JButton button_exit = new JButton("Выход"); // добавление кнопки
    	button_exit.setBounds(250,235,105,30); // параметры кнопки
    	ActionListener actionListener = new ListenerButton(); //создаем слушатель
    	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
    	main_panel.add(button_exit); // Добавление кнопки на панель
    	JButton button_obes = new JButton("Расчитать"); // добавление кнопки
    	button_obes.setBounds(20,235,105,30); // задаем параметры
    	button_obes.addActionListener(new ListenerButton() // слушатель
    	{
    		
			@Override
            public void actionPerformed(ActionEvent e) {
            	if (usl.getSelectedIndex() == 0) { // если выбрано стандартное условие
            		Standart uslovie = new Standart(); // Создание переменной для работы со стандартным условием
            		uslovie.setSumm(summ.getText()); // считывание суммы 
            		uslovie.setSrok(srok.getText());// считывание срока
            		uslovie.setDosr(dosr.isSelected()); //Проверка на досрочное погашение  
            		uslovie.raschet();
            		
            	} else if (usl.getSelectedIndex() == 1) { // если выбрано условие для заемщиков в рамках зарплатного проекта  
            		DliaZaiomshikov uslovie = new DliaZaiomshikov();// Создание переменной для работы с условием для заемщиков в рамках зарплатного проекта
            		uslovie.setSumm(summ.getText()); // считывание суммы 
            		uslovie.setSrok(srok.getText());// считывание срока
            		uslovie.setDosr(dosr.isSelected());//Проверка на досрочное погашение 
            		uslovie.raschet();
            		
            	} else if (usl.getSelectedIndex() == 2) { // если выбрано условие для сотрудников компании-партнеров 
            		DliaSotrudnikov uslovie = new DliaSotrudnikov(); // Создание переменной для работы с условием для сотрудников компании-партнеров 
            		uslovie.setSumm(summ.getText());// считывание суммы 
            		uslovie.setSrok(srok.getText());// считывание срока
            		uslovie.setDosr(dosr.isSelected());//Проверка на досрочное погашение 
            		uslovie.raschet();
            	}
         }
			
    	});
    	main_panel.add(button_obes); // Добавление кнопки на панель

	label(main_panel); // Размещение надписей 
	main_GUI.add(main_panel); // Размещение на графическом окне панели
	menu(main_GUI); // Размещение JComboBox
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}

		void label(JPanel panel) {
			
			JLabel laba_usl = new JLabel("Условия кредита"); // 
			laba_usl.setBounds(20,20,200,30); 
			panel.add(laba_usl);
			
			JLabel laba_summ = new JLabel("Введите сумму кредита от 50 000 до 3 000 000 руб");
			laba_summ.setBounds(20,80,300,30);
			panel.add(laba_summ);
			
			JLabel laba_srok = new JLabel("Введите срок выплат от 12 до 60 месяцев");
			laba_srok.setBounds(20,130,300,30);
			panel.add(laba_srok);
			
		}
		void menu(JFrame frame) {
			JMenuBar bar = new JMenuBar(); // создаем JMenuBar
			
			JMenu menu = new JMenu("Меню"); // создаем кнопку "Меню"
			
			//JMenuBar home = new JMenuBar(); // создаем JMenuBar
			JMenuItem menuItem_info  = new JMenuItem("Информация");//создание кнопки "Информация" в меню
			ActionListener actionListener1 = new info(); //создаем слушатель
			menuItem_info.addActionListener(actionListener1); // добавляем слушатель к кнопке
			JMenuItem menuItem_exit = new JMenuItem("Выход"); // создание кнопки "Выход" в меню
			ActionListener actionListener = new ListenerButton(); //создание слушателя
			menuItem_exit.addActionListener(actionListener); // добавление слушателя к кнопке
			
			menu.add(menuItem_info);
			menu.addSeparator();
			menu.add(menuItem_exit);
			
			bar.add(menu);
			
			frame.setJMenuBar(bar); // добавляем JMenuBar в графическое окно
			
		}
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		new MainWindow();
	}

}
