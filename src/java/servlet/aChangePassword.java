
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class aChangePassword extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
   response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String opsw=request.getParameter("opsw");
        String npsw=request.getParameter("npsw");
        
        HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("name"); 
        
        LoginDAO l = new LoginDAO();
        try {
           String result = l.changePassword(name, opsw, npsw);
           if(result.equals("data inserted successfully"))
           response.sendRedirect("adminDashboard.jsp");
           else
               response.sendRedirect("aChangePassword.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(aChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(aChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
