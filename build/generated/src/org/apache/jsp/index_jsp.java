package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <title>Final Exam</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <img style=\"width:1000px;\n");
      out.write("                 height:565px;\n");
      out.write("                 margin-bottom:30px;\"\n");
      out.write("                 src=\"img/beachswim.png\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form action=\"addToDB\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">First name: <input type=\"text\" name=\"fname\" placeholder=\"First name\"></div>\n");
      out.write("                <div class=\"col-sm-6\">Checkin date: <input type=\"text\" name=\"check\" placeholder=\"ChekIn Date\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">Last name: <input type=\"text\" name=\"lname\" placeholder=\"Last name\"></div>\n");
      out.write("                <div class=\"col-sm-6\">Checkout date:<input type=\"text\" name=\"checkout\" placeholder=\"CheckOut Date\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">Email: <input type=\"text\" name=\"email\" placeholder=\"Email\"></div>\n");
      out.write("                <div class=\"col-sm-6\">Days booked: <input type=\"text\" name=\"numdays\" placeholder=\"# Days Booked\"></div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">Telephone #: <input type=\"text\" name=\"phone\" placeholder=\"Telephone #\" ></div>\n");
      out.write("                <div class=\"col-sm-6\">Passport #: <input type=\"text\" name=\"pasnum\" placeholder=\"Passport #\"></div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">Room type: <input type=\"text\" name=\"roomtype\" placeholder=\"Room Type\"></div>\n");
      out.write("                <div class=\"col-sm-6\">Guests: <input type=\"text\" name=\"gnum\" placeholder=\"# of guests\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div><input name=\"add\" type=\"submit\" value=\"Register\"></div>\n");
      out.write("\n");
      out.write("        </form>\n");
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
