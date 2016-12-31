package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String url,sql;
    Connection con;
    Statement st;
    ResultSet rs;
    url="jdbc:oracle:thin:@localhost:1521:xe";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection(url,"voter","india");
    sql="select * from newvoter";
    st=con.createStatement();
    rs=st.executeQuery(sql);
   
      out.write("\r\n");
      out.write("   ");

    HttpSession session1=request.getSession(false);  
        String log=(String)session.getAttribute("tran"); 
   
      out.write("\r\n");
      out.write("﻿<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Smart Voters</title>\r\n");
      out.write("         <link rel=\"shortcut icon\" href=\"images/favico.ico\"  />\r\n");
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
      out.write("                <li>\r\n");
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
      out.write("\t\t\t\t<img src=\"images/vote-here-19154700.jpg\" alt=\"Img\" height=\"444\" width=\"630\">\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t  <h1>Vote Online</h1>\r\n");
      out.write("\t\t\t\t  <p>Vote INDIA is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Vote India should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>\r\n");
      out.write("\t\t\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"aboutus.html\" class=\"more\">Click here for more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("           \r\n");
      out.write("\t\t\t<!-- /#adbox -->\r\n");
      out.write("\t\t\t<h1>Welcome ");
      out.print(log);
      out.write(" vote here</h1>\r\n");
      out.write("\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t  <p id=\"para\"></p>\r\n");
      out.write("              <div id=\"table\">\r\n");
      out.write("              <form method=\"post\" action=\"voting\">\r\n");
      out.write("<table width=\"1000\" >\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td width=\"56\"><h1>Sr. no.</h1></td>\r\n");
      out.write("\t\t\t      <td width=\"330\"><h1>Contestant Name</h1></td>\r\n");
      out.write("\t\t\t      <td width=\"193\"><h1>Party</h1></td>\r\n");
      out.write("\t\t\t      <td width=\"193\"><h1>Symbol</h1></td>\r\n");
      out.write("\t\t\t      <td width=\"194\"><h1>Vote</h1></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>1.</td>\r\n");
      out.write("\t\t\t      <td>Rahul Gandhi</td>\r\n");
      out.write("\t\t\t      <td>INC</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/congress.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><p>\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"radio\" value=\"INC\">\r\n");
      out.write("\t\t\t      </p></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>2.</td>\r\n");
      out.write("\t\t\t      <td>Narendra Modi</td>\r\n");
      out.write("\t\t\t      <td>BJP</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/bjp.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\" value=\"BJP\" ></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>3.</td>\r\n");
      out.write("\t\t\t      <td>Mulayam Singh Yadav</td>\r\n");
      out.write("\t\t\t      <td>SP</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/sp.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\" value=\"SP\"></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>4.</td>\r\n");
      out.write("\t\t\t      <td>Mayavati</td>\r\n");
      out.write("\t\t\t      <td>BSP</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/bsp-logo.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\" value=\"BSP\" ></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>5.</td>\r\n");
      out.write("\t\t\t      <td>Mamta Bannerjee</td>\r\n");
      out.write("\t\t\t      <td>TMC</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/trinamool.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\"value=\"TMC\" ></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>6.</td>\r\n");
      out.write("\t\t\t      <td>Jaylalitha</td>\r\n");
      out.write("\t\t\t      <td>AIADMK</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/aiadmk.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\"value=\"AIADMK\" ></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>7.</td>\r\n");
      out.write("\t\t\t      <td>Arvind Kejrival</td>\r\n");
      out.write("\t\t\t      <td>AAP</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/aap.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\" value=\"AAP\"></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>8.</td>\r\n");
      out.write("\t\t\t      <td>Lalu Prasad Yadav</td>\r\n");
      out.write("\t\t\t      <td>RJD</td>\r\n");
      out.write("\t\t\t      <td><img src=\"images/rjd.jpg\" width=\"190\" height=\"100\"  alt=\"\"/></td>\r\n");
      out.write("\t\t\t      <td><input type=\"radio\" name=\"radio\" value=\"RJD\" ></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t      <td><input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\"></td>\r\n");
      out.write("\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t      </table>\r\n");
      out.write("              </form>\r\n");
      out.write("<h4> Vote Is Your Birth Right And You Should Practice It .For Signing up <a href=\"registration.jsp\">click here &gt;&gt;</a></h4>\r\n");
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
      out.write("\t\t\t  </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("</div>\r\n");
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
