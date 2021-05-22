package team4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team4.DliaSotrudnikov;
import team4.DliaZaiomshikov;
import team4.Standart;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")


public class Main extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
		
		PDF pdf1 = new PDF();
		String goals = "";
		pdf1.create(goals);
		
	}
	private static class RequestCalc {
		
		public int a1;
		public int a2;
		private final String summa;
		private final String mesyac;
		private final String uslovie;
		private final String dosr;
		
		private float proc;
		private float mes;
		private float pereplata;
		private float itog;

						
		private RequestCalc (String summa, String mesyac, String uslovie, String dosr) {
			this.summa = summa;
			this.mesyac = mesyac;
			this.uslovie = uslovie;
			this.dosr = dosr;
			}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("summa"),
			request.getParameter("mesyac"),
			request.getParameter("uslovie"),
			request.getParameter("dosr"));
			} 
			
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) throws IOException {
			int summa_try;
			int mesyac_try;
			int uslovie_try;
			int dosr_try;
		
			try {
				String filepath = new File("").getCanonicalPath();
				String[] parsfilepath = filepath.split("/");
				
				int lengthpath = parsfilepath.length;
				String abspath=""; 
				for(int i=0;i<(lengthpath-1);i++) {
					abspath=abspath+parsfilepath[i]+"/";
				}
				filepath=abspath+"webapps/CalcTeam4/Config/koef.txt";
				BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
				a1 = Integer.parseInt(reader.readLine());
				a2 = Integer.parseInt(reader.readLine());
				reader.close();
				}
				catch (Exception ex) {
				ex.printStackTrace();
				}
			
		
			try {
			summa_try = Integer.parseInt(summa);
			mesyac_try = Integer.parseInt(mesyac);
			uslovie_try = Integer.parseInt(uslovie);
			dosr_try = Integer.parseInt(dosr);
			}
			catch (NumberFormatException e) {
				summa_try = 0;
				mesyac_try = 0;
				uslovie_try = 0;
				dosr_try = 0;
			}
			if (summa_try < a1 || summa_try > a2 || mesyac_try < 12|| mesyac_try > 60) {
				summa_try = 0;
				mesyac_try = 0;
				uslovie_try = 0;
				dosr_try = 0;
			}
			if (uslovie_try == 0) {
				Standart uslovie = new Standart();
				
				itog = uslovie.calculation(summa_try, mesyac_try, dosr_try);
				proc = uslovie.procc();
				mes = uslovie.mess();
				pereplata = uslovie.perepl();
				request.setAttribute("itog", itog);
				request.setAttribute("proc", proc);
				request.setAttribute("mes", mes);
				request.setAttribute("pereplata", pereplata);
			}
			else if (uslovie_try == 1) {
				DliaZaiomshikov uslovie = new DliaZaiomshikov();
				itog = uslovie.calculation(summa_try, mesyac_try, dosr_try);
				proc = uslovie.procc();
				mes = uslovie.mess();
				pereplata = uslovie.perepl();
				request.setAttribute("itog", itog);
				request.setAttribute("proc", proc);
				request.setAttribute("mes", mes);
				request.setAttribute("pereplata", pereplata);
			}
			else if (uslovie_try == 2) {
				DliaSotrudnikov uslovie = new DliaSotrudnikov();
				itog = uslovie.calculation(summa_try, mesyac_try, dosr_try);
				proc = uslovie.procc();
				mes = uslovie.mess();
				pereplata = uslovie.perepl();
				request.setAttribute("itog", itog);
				request.setAttribute("proc", proc);
				request.setAttribute("mes", mes);
				request.setAttribute("pereplata", pereplata);
			}
		}
	}
}
		
	