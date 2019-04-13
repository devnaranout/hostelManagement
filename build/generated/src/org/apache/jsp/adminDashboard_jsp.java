package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write("img {\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 23.33%;\n");
      out.write("  padding: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clearfix (clear floats) */\n");
      out.write(".row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("a:link, a:visited {\n");
      out.write("    background-color: #f44336;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("    a:hover, a:active {\n");
      out.write("    background-color:red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("<body background=\"480421.jpg\" link=\"white\" alink=\"green\" vlink=\"salmon\">\n");
      out.write("\n");
      out.write("    <font face=\"forte\" color=\"white\" size=\"7\">\n");
      out.write("    <center><u>Hostel Management</u></center></font>\n");
      out.write("    <nav style=\"text-align:right;\">\n");
      out.write("         |        <a href=\"homepage.jsp\"><font size=4 face=\"Comic Sans MS\">    Log out</font></a>\n");
      out.write("</nav>\n");
      out.write("    <hr> \n");
      out.write("    \n");
      out.write("    <font face=\"Comic Sans MS\" color=\"white\" size=\"5\">\n");
      out.write("    <p> Welcome ");
      out.print(request.getAttribute("name"));
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <br>\n");
      out.write("    ");
 String name=(String)request.getAttribute("name");
    session.setAttribute("name", name);
      out.write("\n");
      out.write("   <div class=\"row\">\n");
      out.write("  <div class=\"column\">\n");
      out.write("  <a href=\"myStudents.jsp\">\n");
      out.write("    <img src=\"56B60798-E63D-4842-9914-582A3566D987.jpg\" height=\"230\" width=\"270\"></a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("      <a href=\"aFines.jsp\">\n");
      out.write("          <img src=\"images (1).jpg\" height=\"230\" width=\"270\"></a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"87046706-complaint-rubber-stamp.jpg\" height=\"230\" width=\"270\">\n");
      out.write("  </div>\n");
      out.write("       \n");
      out.write("       <div class=\"column\">\n");
      out.write("           <a href=\"addStudent.jsp\">\n");
      out.write("               <img src=\"images.png\" height=\"230\" width=\"270\"></a>\n");
      out.write("  </div>\n");
      out.write("       \n");
      out.write("</div>  \n");
      out.write("    <pre><font face=\"forte\" color=\"white\" size=\"5\">            Students                                       Fines                                      Complaints                               Add Student\n");
      out.write("\n");
      out.write("    </pre>\n");
      out.write("    </font>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"column\">\n");
      out.write("           <a href=\"deleteStudent.jsp\">\n");
      out.write("               <img src=\"images (1).png\" height=\"230\" width=\"270\"></a>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("           <a href=\"aChangePassword.jsp\">\n");
      out.write("               <img src=\"images (2).png\" height=\"230\" width=\"270\"></a>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <pre><font face=\"forte\" color=\"white\" size=\"5\">            Delete Student                         Change Password   \n");
      out.write("\n");
      out.write("    </pre>\n");
      out.write("    </font>\n");
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
