
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


public class deleteStudent extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        
        
        LoginDAO l = new LoginDAO();
        try {
           String result = l.deleteData(id);
           if(result.equals("data deleted successfully"))
           response.sendRedirect("adminDashboard.jsp");
           else
               response.sendRedirect("deleteStudent.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(deleteStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(deleteStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
