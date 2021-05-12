package project4;

import java.awt.Dimension;
import java.awt.Window;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


import project4.DliaSotrudnikov;
import project4.DliaZaiomshikov;
import project4.Standart;
import project4.info;
import project4.ListenerButton;


public class MainWindow {
	  private JPanel mainPanel = new JPanel();
	    private JDialog modalDialog;
	public MainWindow() {
		
	    
		JFrame main_GUI = new JFrame("calculator"); // создание графического окна
		main_GUI.setTitle ("Калькулятор потребительский кредит"); 
		main_GUI.setBounds(400,200,400,350);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null); 
		
		


		
		JButton openModalDialogBtn = new JButton("Войти");            
    	openModalDialogBtn.setBounds(150,235,105,30);
    openModalDialogBtn.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            openModalDialogBtnActionPerformed(e);

        }
        

    });
    main_panel.add(openModalDialogBtn);

		
		JButton button_exit = new JButton("Выход"); // добавление кнопки
    	button_exit.setBounds(250,235,105,30); // параметры кнопки
    	ActionListener actionListener = new ListenerButton(); //создаем слушатель
    	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
    	main_panel.add(button_exit); // Добавление кнопки на панель
    	

	label(main_panel); // Размещение надписей 
	main_GUI.add(main_panel); // Размещение на графическом окне панели
	menu(main_GUI); // Размещение JComboBox
	main_GUI.setVisible(true);

	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	}

	  
	void label(JPanel panel) {
			
			
			final JTextField log = new JTextField(); // создание текстового поля
    		log.setBounds(20,105,200,30); // параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
    		panel.add(log); // Добавление текстового поля на панель
			JLabel laba_log = new JLabel("Введите логин");
			laba_log.setBounds(20,80,300,30);
			panel.add(laba_log);
			
			JLabel laba_pass = new JLabel("Введите пароль");
			laba_pass.setBounds(20,130,300,30);
			panel.add(laba_pass);
			final JTextField pass = new JTextField();  // создание текстового поля
    		pass.setBounds(20,155,200,30); //  параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
    		panel.add(pass); // Добавление текстового поля на панель
			
		}
		void menu(JFrame frame1) {
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
			
			frame1.setJMenuBar(bar); // добавляем JMenuBar в графическое окно
		} 
			private void openModalDialogBtnActionPerformed(ActionEvent e) {
		        if (modalDialog == null) {
		            Window topWindow = SwingUtilities.getWindowAncestor(mainPanel);
		            modalDialog = new JDialog(topWindow, "авторизоваться");
		            modalDialog.setSize(400,400);
		            
		            modalDialog.setVisible(true);
		            modalDialog.dispose();
		            JPanel frame = new JPanel();
		            JButton aye = new JButton("e");
		            aye.setBounds(10,10,10,10);
		            
		            modalDialog.add(frame);
		        	frame.add(aye);
		        	String[] uslovia = {"Стандартные условия", "Держу зарплатный проект в данном банке", "Являюсь сотрудником компании-партнёров этого банка"};
		    		final JComboBox usl = new JComboBox(uslovia);
		    		usl.setBounds(20,45,340,30);
		    		frame.add(usl);
		    		
		    		final JTextField summ = new JTextField(); // создание текстового поля
		    		summ.setBounds(20,105,200,30); // параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
		    		frame.add(summ); // Добавление текстового поля на панель
		    		
		    		final JTextField srok = new JTextField();  // создание текстового поля
		    		srok.setBounds(20,155,200,30); //  параметры текстового поля ( его положение на панели относительно x,y;ширину, длину)
		    		frame.add(srok); // Добавление текстового поля на панель
		    		
		    		final JCheckBox dosr = new JCheckBox("Не планирую досрочно погашать кредит в первый год"); // создаем флажок
		    		dosr.setBounds(20,200,400,30); // размеры созданного флажка
		    		frame.add(dosr); // Добавление флажка на панель
		    		
		    		
		    		JLabel laba_usl = new JLabel("Условия кредита"); // 
					laba_usl.setBounds(20,20,200,30); 
					frame.add(laba_usl);
					
					JLabel laba_summ = new JLabel("Введите сумму кредита от 50 000 до 3 000 000 руб");
					laba_summ.setBounds(20,80,300,30);
					frame.add(laba_summ);
					
					JLabel laba_srok = new JLabel("Введите срок выплат от 12 до 60 месяцев");
					laba_srok.setBounds(20,130,300,30);
					frame.add(laba_srok);
		    		
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
		        	frame.add(button_obes); // Добавление кнопки на панель
		        } else {
		            modalDialog.setVisible(true);
		        }
		    }	
		  class DialogPanel {
			    private final Dimension DIALOG_SIZE = new Dimension(400, 50);
			    private JPanel dialogPanel = new JPanel();

			    public DialogPanel() {
			        dialogPanel.add(new JLabel("Hello from a dialog", SwingConstants.CENTER));
			        dialogPanel.setPreferredSize(DIALOG_SIZE);
			    }
		
		  public JPanel getMainPanel() {
		        return mainPanel;
		    }
		  }
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		new MainWindow();
	}

}
