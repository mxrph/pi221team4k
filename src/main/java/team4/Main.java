package team4;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")


public class Main extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}
	private static class RequestCalc {
		private final String summa;
		private final String mesyac;
		private final String uslovie;
		private final String dosr;
		

						
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
			
		
			
			summa_try = Integer.parseInt(summa);
			mesyac_try = Integer.parseInt(mesyac);
			uslovie_try = Integer.parseInt(uslovie);
			dosr_try = Integer.parseInt(dosr);
		}