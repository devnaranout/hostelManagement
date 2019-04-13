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
import javax.servlet.http.*;  

public class sComplaint extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String comp=request.getParameter("comp");
        
        HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("name"); 
        
        LoginDAO l = new LoginDAO();
        try {
           String result = l.addData(comp,name);
           if(result.equals("data inserted successfully"))
           response.sendRedirect("studentDashboard.jsp");
           else
               response.sendRedirect("sComplaint.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(sComplaint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(sComplaint.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }