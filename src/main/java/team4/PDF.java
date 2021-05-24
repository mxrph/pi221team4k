package team4;

import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
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
		String imagepath=abspath+"webapps/CalcTeam4/Config/123.jpg";
		
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
	    
		String string_pdf = "Ваша процентная ставка: " + Uslovie.proc + "%";
	    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
	    
	    String string_pdf2 = "Ежемесячный платеж составляет: " + Uslovie.mesyac + "руб.";
	    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
	
	    String string_pdf3 = "Переплата по кредиту составит: " + Uslovie.pereplata + "руб.";
	    paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
	    
	    String string_pdf4 = "Общая сумма кредита: " + Uslovie.itog + "руб.";
	    paragraph.add(new Paragraph(string_pdf4, new Font(times,14)));
	    Image img = null;
		try {
			img = Image.getInstance(imagepath);
			
			
		} catch (BadElementException e2) {
			
			e2.printStackTrace();
		} catch (MalformedURLException e2) {
			
			e2.printStackTrace();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		img.setAbsolutePosition(40, 10); //позиционирование изображения в PDF
		
		try {
				document.add(img);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
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

