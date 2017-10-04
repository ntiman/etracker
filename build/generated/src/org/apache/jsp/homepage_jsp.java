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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./style/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <title>Home</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .img{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 200px;\n");
      out.write("                margin: 20px;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <img class=\"img\" src=\"img/gardenparty.png\">\n");
      out.write("        <img class=\"img\" src=\"img/drinks.png\">\n");
      out.write("        <img class=\"img\" src=\"img/diners.png\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("\n");
      out.write("            <form class=\"form-style\" action=\"getFromDB\">\n");
      out.write("                <input  type=\"submit\" value=\"Display clients\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>First Name</th>\n");
      out.write("                    <th>Last Name</th>\n");
      out.write("                    <th>Phone</th>\n");
      out.write("                    <th>Passport #</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <form class=\"form-style\" action=\"deleteFromDB\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\"><input type=\"text\" name=\"pasnum\" placeholder=\"Passpot #\" required=\"\"></div>\n");
      out.write("                    <div class=\"col-sm-6\"><input class=\"sub\" type=\"submit\" value=\"Delete client\"></div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <form action=\"rooms.jsp\">\n");
      out.write("                <div><input class=\"sub\" type=\"submit\" value=\"View available rooms\"></div>\n");
      out.write("                <br>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
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
