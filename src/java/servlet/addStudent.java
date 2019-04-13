
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


public class addStudent extends HttpServlet {
    
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        String name1=request.getParameter("name1");
        String psw=request.getParameter("psw");
        String mobNo=request.getParameter("mobNo");
        String fName=request.getParameter("fName");
        String fMobNo=request.getParameter("fMobNo");
        String fineDue=request.getParameter("fineDue");
        String finePaid=request.getParameter("finePaid");
        
        HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("name"); 
        
        LoginDAO l = new LoginDAO();
        try {
           String result = l.addData(id, name1, psw, mobNo, fName, fMobNo, fineDue, finePaid, name);
           if(result.equals("data inserted successfully"))
           response.sendRedirect("adminDashboard.jsp");
           else
               response.sendRedirect("addStudent.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
