package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Smart Voters</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favico.ico\"  />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("<!--The following script tag downloads a font from the Adobe Edge Web Fonts server for use within the web page. We recommend that you do not modify it.-->\r\n");
      out.write("<script>var __adobewebfontsappname__=\"dreamweaver\"</script>\r\n");
      out.write("<script src=\"http://use.edgefonts.net/alex-brush:n4:default.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t<img src=\"images/20925C00-LLYUH.jpg\" alt=\"Img\" height=\"444\" width=\"630\">\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t  <h1>Vote Online</h1>\r\n");
      out.write("\t\t\t\t  <p>Smart Voters is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Smart Voters should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>\r\n");
      out.write("\t\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"aboutus.html\" class=\"more\">Click here for more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /#adbox -->\r\n");
      out.write("\t\t\t<h1>Election awaits on 24 Sept Register Soon to enjoy online voting\r\n");
      out.write("\t\t\t  </h1><div class=\"section\">\r\n");
      out.write("\t\t\t  <div id=form>\r\n");
      out.write("\t\t\t    <h1 align=\"center\">Registration Form</h1>\r\n");
      out.write("              <form id=\"form1\" name=\"form1\" method=\"post\" action=\"register\">\r\n");
      out.write("                  <table width=\"1000\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"textfield\"> Voter-ID No:&nbsp;</label>\r\n");
      out.write("\t        </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"id\" id=\"textfield\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"password\">Password:&nbsp; </label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><input type=\"password\" name=\"pwd\" id=\"password\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"textfield2\">Name:&nbsp;</label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"name\" id=\"textfield2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> <label for=\"textfield3\">Age:&nbsp;</label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"age\" id=\"textfield3\">&nbsp;</td>\r\n");
      out.write("  </tr> \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Sex:&nbsp;</td>\r\n");
      out.write("    <td><input type=\"radio\" name=\"radio\"  value=\"male\">\r\n");
      out.write("      Male   \r\n");
      out.write("      <input type=\"radio\" name=\"radio\"  value=\"female\">\r\n");
      out.write("      Female\r\n");
      out.write("      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"date\">Date of Birth:</label></td>\r\n");
      out.write("     <td><input type=\"date\" name=\"date\" id=\"date\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"email\">Email:&nbsp;</label>\r\n");
      out.write("\t        </td>\r\n");
      out.write("    <td><input type=\"email\" name=\"email\" id=\"email\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"123\">State:&nbsp;</label></td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <select name=\"slist\" id=\"123\">\r\n");
      out.write("        <option value=\"None\">Select State</option>\r\n");
      out.write("<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\r\n");
      out.write("<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("<option value=\"Assam\">Assam</option>\r\n");
      out.write("<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("<option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option>\r\n");
      out.write("<option value=\"Daman and Diu\">Daman and Diu</option>\r\n");
      out.write("<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("<option value=\"Goa\">Goa</option>\r\n");
      out.write("<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\r\n");
      out.write("<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("<option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("<option value=\"Orissa\">Orissa</option>\r\n");
      out.write("<option value=\"Pondicherry\">Pondicherry</option>\r\n");
      out.write("<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("<option value=\"Uttaranchal\">Uttaranchal</option>\r\n");
      out.write("<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("</select>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"text\">District:&nbsp;</label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"district\" id=\"textfield2\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><label for=\"textarea\">Address:&nbsp;</label>\r\n");
      out.write("            </td>\r\n");
      out.write("    <td><textarea name=\"address\" id=\"textarea\"></textarea>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
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
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t  <h4>&nbsp; </h4>\r\n");
      out.write("\t\t\t  <h4>&nbsp;</h4>\r\n");
      out.write("\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t  <h4>Vote Is Your Birth Right And You Should Practice It .For Signing up <a href=\"registration.jsp\">click here &gt;&gt;</a></h4>\r\n");
      out.write("\t\t      </div>\r\n");
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