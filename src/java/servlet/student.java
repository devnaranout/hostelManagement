package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class student extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        String psw=request.getParameter("psw");
        
       
        LoginDAO l = new LoginDAO();
        try {
           String result = l.checkInfo1(id, psw);
           if(result.equals("you are logged in"))
           {
               
               Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
            
           
            String query="select * from student where id=?";
            pr=con.prepareStatement(query);
            pr.setString(1,id);
            
            ResultSet rs;
            rs=pr.executeQuery();
            String name=" ";
            if(rs.next())
            {
                name=rs.getString("name");
            }
            HttpSession session=request.getSession();  
        session.setAttribute("name",name); 
        
               request.setAttribute("name", name);
               request.getRequestDispatcher("studentDashboard.jsp").forward(request, response);
           }
           else
           {
               response.sendRedirect("student.jsp");
           }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}