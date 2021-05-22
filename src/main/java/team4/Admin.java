package team4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a1 = Integer.parseInt(request.getParameter("a1"));
		int a2 = Integer.parseInt(request.getParameter("a2"));

		try {
			String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			
			int lengthpath = parsfilepath.length;
			String abspath=""; 
			for(int i=0;i<(lengthpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"webapps/CalcTeam4/Config/koef.txt";
		FileWriter fileWriter = new FileWriter(filepath);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(a1);
		printWriter.print(a2);
		response.sendRedirect("Admin.jsp");
		printWriter.close();
		}
		catch(Exception ex) {
		ex.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
