package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class sComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Complaints</title>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 20px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 20%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write(".btn:hover {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body background=\"480421.jpg\" link=\"white\" alink=\"green\" vlink=\"salmon\">\n");
      out.write("\n");
      out.write("    <font face=\"forte\" color=\"white\" size=\"7\">\n");
      out.write("    <center><u>Hostel Management</u></center></font>\n");
      out.write("    <nav style=\"text-align:right;\">\n");
      out.write("         |        <a href=\"homepage.jsp\"><font size=4 face=\"Comic Sans MS\">    Log out</font></a>\n");
      out.write("</nav>\n");
      out.write("    <hr> \n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <font face=\"forte\" color=\"white\" size=\"6\">\n");
      out.write("        <p><img src=\"comp.jpg\" height=\"290\" width=\"500\" border=\"5\">\n");
      out.write("            Complaint :\n");
      out.write("    <form action=\"complaint\" method=\"post\" class=\"container\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <textarea rows=\"14\" cols=\"100\" name=\"comp\" placeholder=\"Write your complaint here......\" required></textarea>\n");
      out.write("       <br>\n");
      out.write("    <button type=\"submit\" class=\"btn\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        </font>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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