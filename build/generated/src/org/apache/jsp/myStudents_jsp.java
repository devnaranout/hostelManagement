package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class myStudents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String name= (String)session.getAttribute("name"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>My Students</title>\n");
      out.write("        <style>\n");
      out.write("            table, td, th {\n");
      out.write("  border: 4px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 65%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("  height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"480421.jpg\" link=\"white\" alink=\"green\" vlink=\"salmon\">\n");
      out.write("\n");
      out.write("    <font face=\"forte\" color=\"white\">\n");
      out.write("    <h1><u>Hostel Lyf</u></h1></font>\n");
      out.write("    <nav style=\"text-align:right;\">\n");
      out.write("         |        <a href=\"homepage.jsp\"><font size=4 face=\"Comic Sans MS\">    Log out</font></a>\n");
      out.write("</nav>\n");
      out.write("    <hr> \n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("    <table align=\"center\" cellpadding=\"4\" cellspacing=\"4\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"darkgrey\">\n");
      out.write("<td><b>Id</b></td>\n");
      out.write("<td><b>Name</b></td>\n");
      out.write("<td><b>Mobile no</b></td>\n");
      out.write("<td><b>Father name</b></td>\n");
      out.write("<td><b>Father's Contact</b></td>\n");
      out.write("</tr>\n");
      out.write("        \n");
      out.write("        ");

try {
Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
String query = "SELECT * FROM student where admin=?";

pr=con.prepareStatement(query);
            pr.setString(1,name);
            
            ResultSet rs;
            rs=pr.executeQuery();
while (rs.next()) {

      out.write("\n");
      out.write("<tr bgcolor=\"gainsboro\">\n");
      out.write("<td>");
      out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getInt("mobNo"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString("fName"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getInt("fMobNo"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");

}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("        ");
//=name 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
