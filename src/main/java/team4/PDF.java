package team4;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class PDF
 */
@WebServlet("/pdf")
public class PDF extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String filepath;
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		response.setContentType("application/pdf");
	        //Get the output stream for writing PDF object        
		OutputStream out = response.getOutputStream();
		
		
		ClassLoader cl = PDF.class.getClassLoader();
		
    	File file1 = new File(cl.getResource("Config/result.pdf").getFile());
    	File file2 = new File(cl.getResource("fonts/times.ttf").getFile());
    	File file3 = new File(cl.getResource("Config/123.jpg").getFile());
    	
    	filepath = file1.getPath();
		String fontpath = file2.getPath();
		String imagepath= file3.getPath();
		
		try {
		Document document = new Document(); 

		PdfWriter.getInstance(document, out);
	
		
			
		
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
		} catch (DocumentException exc){
             throw new IOException(exc.getMessage());
             }
		finally {            
            out.close();
        }
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
