package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rooms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <title>Rooms Available</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .image{\n");
      out.write("                margin: 20px;\n");
      out.write("                width: 500px; \n");
      out.write("                height: 300px;\n");
      out.write("                position: relative;\n");
      out.write("                left: 26%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text-div{\n");
      out.write("                width: 406px;\n");
      out.write("                text-align: center;\n");
      out.write("                position: relative;\n");
      out.write("                left: 25%;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-bottom: 54px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <img class=\"image\" src=\"img/singleliner.png\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"text-div\">\n");
      out.write("                    Spacious, bright and outward facing rooms measuring 19 m2 and totally refurbished. \n");
      out.write("                    The room comes with Dreamax bed (manufactured and designed exclusively by Flex for Meliá Hotels International), \n");
      out.write("                    a modern, fully equipped bathroom finished in top quality bronze coloured ceramics and an independent entrance. \n");
      out.write("                    It also has a home automation system which automatically regulates the temperature \n");
      out.write("                    of the room based on guest presence or absence from the room.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <img class=\"image\" src=\"img/singleaccessout.png\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"text-div\">\n");
      out.write("                    Spacious, bright and outward facing rooms measuring 27 m2 and with views of Plaza España and \n");
      out.write("                    Parque de Maria Luisa. Totally refurbished, the room comes with double bed or twin beds with\n");
      out.write("                    Dreamax mattress (manufactured and designed exclusively by Flex for Meliá Hotels International),\n");
      out.write("                    a modern, fully equipped bathroom finished in top quality bronze coloured ceramics and an independent\n");
      out.write("                    entrance. It also has a home automation system which automatically regulates the temperature of the \n");
      out.write("                    room based on guest presence or absence from the room.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <img class=\"image\" src=\"img/presidentialsuite.png\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"text-div\">\n");
      out.write("                    Superior category rooms measuring 33 m2 with the services and facilities of the Premium rooms. \n");
      out.write("                    Spacious, bright, outward facing rooms and totally refurbished, these rooms come with\n");
      out.write("                    double bed or twin beds with Dreamax mattress (manufactured and designed exclusively by Flex \n");
      out.write("                    for Meliá Hotels International), a modern, fully equipped bathroom, a lounge and a hallway-dressing \n");
      out.write("                    room independent of the room. It also has a home automation system which automatically regulates the\n");
      out.write("                    temperature of the room based on guest presence or absence from the room.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <img class=\"image\" src=\"img/executesuit.png\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"text-div\">\n");
      out.write("                    Located on the 9th floor and offering views of Plaza España and Parque de Maria Luisa, \n");
      out.write("                    these superior category suites measure 68 m2 (32 m2 of which is the lounge) and come with the\n");
      out.write("                    services and facilities of the Executive Junior Suite with the exclusive The Level service.\n");
      out.write("                    These rooms come with hallway, lounge with magnificent glass windows offering views of the \n");
      out.write("                    hotel pool area and Plaza España, guest bathroom, kitchen and terrace, bedroom with terrace, \n");
      out.write("                    dressing area off the bathroom and fully equipped bathroom with whirlpool bath. It also has \n");
      out.write("                    a home automation system which automatically regulates the temperature of the room based on \n");
      out.write("                    guest presence or absence from the room. \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
