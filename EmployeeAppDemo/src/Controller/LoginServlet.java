package Controller;

import Model.QueryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String password = request.getParameter("password");
            String correctPassword = "1234";
            QueryModel q = new QueryModel();
            if(password.equals(correctPassword)){
                HttpSession session= request.getSession();
                session.setAttribute("firstname",firstname);
                session.setAttribute("lastname",lastname);
                out.println("Welcome khun: "+session.getAttribute("firstname")+"\t"+
                        session.getAttribute("lastname"));
                getServletContext().getRequestDispatcher("/SearchEmployeeServlet").forward(request,response);
            }else{
                out.println("Problem with your password...Please Check it");
                request.getRequestDispatcher("/index.jsp").include(request,response);
            }
        }
    }
}
