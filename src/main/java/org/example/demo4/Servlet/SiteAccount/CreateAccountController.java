package org.example.demo4.Servlet.SiteAccount;






import org.example.demo4.DataBase.PersonController;
import org.example.demo4.Person.Person;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAccountController extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
String name = null;
       try {
            name = req.getParameter("name");
           String username = req.getParameter("username");
            String password = req.getParameter("password");

            Person person = new Person(name, username, password);
         //  PersonController.createPersonInDB(person);
           
        }catch (Exception e){
           resp.sendRedirect("error.jsp");
        }
         req.setAttribute("name", name);
         RequestDispatcher requestDispatcher = req.getRequestDispatcher("done.jsp");
         requestDispatcher.forward(req, resp);
        


    }
}
