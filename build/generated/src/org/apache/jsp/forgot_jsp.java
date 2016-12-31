package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("    <!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Smart Voters</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favico.ico\"  />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t  <div id=\"title\"><img src=\"images/8.jpg\" height=\"85\" Width=\"195\" alt=\"v\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <img src=\"images/smartvoter.jpg\" height=\"85\" width=\"750\" alt=\"vote india\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul id=\"navigation\">\r\n");
      out.write("\t\t\t\t<li class=\"selected\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\">Home</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"aboutus.html\">About</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"knowyourleader.html\">&nbsp;Know Your Leader</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"login.jsp\">&nbsp;&nbsp;Vote Here</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"registration.jsp\">&nbsp;&nbsp;Register Here</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("                <li>\r\n");
      out.write("\t\t\t\t\t<a href=\"results.jsp\">&nbsp;&nbsp;Election Results</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#header -->\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div id=\"adbox\">\r\n");
      out.write("\t\t\t\t<img src=\"images/large.jpg\" alt=\"Img\" height=\"444\" width=\"630\">\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t  <h1>Vote Online</h1>\r\n");
      out.write("\t\t\t\t  <p>Smart Voters is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Smart Voters should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>\r\n");
      out.write("\t\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"aboutus.html\" class=\"more\">Click here for more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#adbox -->\r\n");
      out.write("\t\t\t<h1>Election awaits on 24 Sept Register Soon to enjoy online voting</h1>\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <form method=\"post\" action=\"forgot\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr><td><label for=\"t1\">VOTER-ID</label></td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"vid\" id=\"t1\">&nbsp;</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("    <td><label for=\"12\">Security Question :&nbsp;</label></td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <select name=\"question\" id=\"12\">\r\n");
      out.write("        <option value=\"None\">Select Question</option>\r\n");
      out.write("<option value=\" nick name\">What is your nick name?</option>\r\n");
      out.write("<option value=\"sign \">What is your zodiac sign? </option>\r\n");
      out.write("<option value=\"number\">What is your phone number?</option>\r\n");
      out.write("<option value=\"pet\">What is your pet name?</option>\r\n");
      out.write("<option value=\"value\">What value to you the most?</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td><label for=\"t\">Answer:&nbsp;</label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"answer\" id=\"t\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;<input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t  <h4> Vote Is Your Birth Right And You Should Practice It .For Signing up <a href=\"registration.jsp\">click here &gt;&gt;</a></h4>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- /#contents -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<ul id=\"links\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4>Contact Address</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Rungta College Campus,</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Kohka-Kurud Road,</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Bhilai,C.G.</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4>Social Links</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/twitter/\" target=\"_blank\" class=\"twitter\">Twitter</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/facebook/\" target=\"_blank\" class=\"facebook\">Facebook</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/googleplus/\" target=\"_blank\" class=\"googleplus\">Google +</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- /#links -->\r\n");
      out.write("\t\t\t  <p class=\"footnote\">\r\n");
      out.write("\t\t\t\t\t© Copyright 2023.Company name all rights reserved\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#footer -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /#page -->\r\n");
      out.write("</body>\r\n");
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
