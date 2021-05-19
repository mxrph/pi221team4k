package team4;

import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF implements ActionListener {
	
	public static void create(String goals) throws IOException { 
		Document document = new Document(); 
		String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		
		int lengthpath = parsfilepath.length;
		String abspath=""; 
		for(int i=0;i<(lengthpath-1);i++) {
			abspath=abspath+parsfilepath[i]+"/";
		}
		filepath=abspath+"webapps/CalcTeam4/Config/result.pdf";
		String fontpath =abspath+"/webapps/CalcTeam4/fonts/times.ttf";
		try {	
			PdfWriter.getInstance(document, new FileOutputStream(filepath));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
			
		document.open(); 
		
		BaseFont times = null;
		try {
			times = BaseFont.createFont(fontpath, "cp1251", BaseFont.EMBEDDED);
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
		
		String ty = "Спасибо что воспользовались нашим калькулятором потребительского кредита!";
		Paragraph paragraph = new Paragraph();
	    paragraph.add(new Paragraph(ty, new Font(times,16, Font.BOLD)));
	    
	    String lower = "Ниже представлены итоговые вычисления на основе ваших введённых данных";
	    paragraph.add(new Paragraph(lower, new Font(times,14, Font.BOLD)));
	    
		String string_pdf = "Ваша процентная ставка: " + Uslovie.proc;
	    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
	    
	    String string_pdf2 = "Ежемесячный платеж составляет: " + Uslovie.mesyac;
	    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
	
	    String string_pdf3 = "Переплата по кредиту составит: " + Uslovie.pereplata;
	    paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
	    
	    String string_pdf4 = "Общая сумма кредита: " + Uslovie.itog;
	    paragraph.add(new Paragraph(string_pdf4, new Font(times,14)));
	    
	    try {
			document.add(paragraph);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		document.close(); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

