package team4;

import java.awt.event.*;
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
	
	public static void create(String goals) { 
		Document document = new Document(); 
		try {
			PdfWriter.getInstance(document, new FileOutputStream("result.pdf"));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
			
		document.open(); 
		
		BaseFont times = null;
		try {
			times = BaseFont.createFont("", "UTF-8", BaseFont.EMBEDDED);
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
		
		String string_pdf = "Procent:" + Uslovie.proc;
		Paragraph paragraph = new Paragraph();
	    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
	    
	    String string_pdf2 = "Platez:" + Uslovie.mesyac;
	    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
	
	    String string_pdf3 = "Pereplata:" + Uslovie.pereplata;
	    paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
	    
	    String string_pdf4 = "Summa:" + Uslovie.itog;
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

