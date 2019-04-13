package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hostel Management</title>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  background-size:cover;\n");
      out.write("}\n");
      out.write(".center {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("img {\n");
      out.write("  float: right;\n");
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
      out.write("a.button {\n");
      out.write("    background-color: #4CAF50; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    -webkit-transition-duration: 0.4s; /* Safari */\n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("a.button1 {\n");
      out.write("    background-color: white; \n");
      out.write("    color: black; \n");
      out.write("    border: 2px solid #4CAF50;\n");
      out.write("    border-radius: 12px;\n");
      out.write("}\n");
      out.write("a.button1:hover {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"480421.jpg\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"center\">\n");
      out.write("        <font face=\"forte\" color=\"white\" size=\"8\">\n");
      out.write("        <p><i><b>\" WELCOME TO HOSTEL WORLD \"</b></i></p>\n");
      out.write("        \n");
      out.write("        </font>\n");
      out.write("        <a href=\"admin.jsp\" class=\"button button1\">ADMIN</a>\n");
      out.write("        <a href=\"student.jsp\" class=\"button button1\">STUDENT</a>\n");
      out.write("        </div>\n");
      out.write("    <br><br>\n");
      out.write("        <font face=\"forte\" color=\"white\" size=\"6\">\n");
      out.write("        <p><img src=\"Hostel_Dormitory.jpg\" height=\"290\" width=\"500\" border=\"5\">\n");
      out.write("        <ul>\n");
      out.write("            <li>Fully Wi-Fi Hostel</li>\n");
      out.write("            <li>Our Hostel have separate facilities for boys and girls, caring wardens and tight security arrangements</li>\n");
      out.write("            <li>We have tie-ups with renowned hospitals to take care of any kind of emergency</li>\n");
      out.write("            <li>Our Cafeterias menus are designed by professional dieticians, and offer nutritious and wholesome food</li>\n");
      out.write("        </ul> \n");
      out.write("        </p>\n");
      out.write("        </font>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
