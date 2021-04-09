package Project4Test;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class infotest {

@Test
public void infotest() {

String s = "1.Самсонов Артём Андреевич. Номер ЗЧ -19130625\n2. Фахретдинова Кристина Олеговна. Номер ЗЧ - 19170028\n3. Шейфель Жанна Владимировна. Номер ЗЧ - 19130168\n4. Степанян Степан Арменович. Номер ЗЧ - 19130616";
JOptionPane.showMessageDialog( null,s , "Информация об участниках команды", -1);

assertNotNull(s);
}

}