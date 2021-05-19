package team4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Login", urlPatterns="/JavaLogin")
public class Login extends HttpServlet {

    
    static boolean check1;
    static boolean check2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestLogin auth = RequestLogin.fromRequestParameters(request);
        auth.Check(request);

        if (check1) {
            request.getRequestDispatcher("/Admin.jsp").forward(request, response);
        } else if (check2) {
            request.getRequestDispatcher("/User.jsp").forward(request, response);
        } else {
        	request.getRequestDispatcher("/LoginFalse.jsp").forward(request, response);
        }
    }

    private static class RequestLogin {
        private final String login;
        private final String pass;

        private RequestLogin (String login, String pass) {
            this.login = login;
            this.pass = pass;
            }

        public static RequestLogin fromRequestParameters(HttpServletRequest request) {
            return new RequestLogin(
            request.getParameter("login"),
            request.getParameter("pass")
                    );
            }
        
        public void Check(HttpServletRequest request) throws IOException {

            String login_try;
            String pass_try;

            login_try = login;
            pass_try = pass;

            Check check = new Check();
            check1 = check.check1(login_try, pass_try);
            check2 = check.check2(login_try, pass_try);
        }
    }
}