package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminresults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0;
    String url,sql;
    Connection con;
    Statement st;
    ResultSet rs;
    url="jdbc:oracle:thin:@localhost:1521:xe";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection(url,"voter","india");
    sql="select party from newvoter";
    st=con.createStatement();
    rs=st.executeQuery(sql);
    while(rs.next())
    {
    String prt=rs.getString("party");
    if(prt.equals("1"))
        i=i+1;
    if(prt.equals("RJD"))
        j=j+1;
	if(prt.equals("INC"))
        k=k+1;
	if(prt.equals("BJP"))
        l=l+1;
		if(prt.equals("SP"))
        m=m+1;
		if(prt.equals("BSP"))
        n=n+1;
		if(prt.equals("TMC"))
        o=o+1;
		if(prt.equals("AIADMK"))
        p=p+1;
		if(prt.equals("AAP"))
        q=q+1;
		
		
    }
  
    
    
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
      out.write("\t\t\t<h3 align=\"center\">The Election Results are:</h3>\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("            <table width=\"1000\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"69\"><h1>Sr. No.</h1>&nbsp;</td>\r\n");
      out.write("                <td width=\"289\"><h1>Candidate's Name</h1>&nbsp;</td>\r\n");
      out.write("                <td width=\"184\"><h1>Party Name</h1>&nbsp;</td>\r\n");
      out.write("                <td width=\"155\"><h1>Symbol</h1>&nbsp;</td>\r\n");
      out.write("                <td width=\"279\"><h1>Votes</h1>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>1.&nbsp;</td>\r\n");
      out.write("                <td>Rahul Gandhi&nbsp;</td>\r\n");
      out.write("                <td>INC&nbsp;</td>\r\n");
      out.write("                <td><img src=\"images/congress.jpg\" width=\"151\" height=\"150\"  alt=\"\"/></td>\r\n");
      out.write("                <td> ");
      out.print(k);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>2.&nbsp;</td>\r\n");
      out.write("                <td>Narendra Modi&nbsp;</td>\r\n");
      out.write("                <td>BJP&nbsp;</td>\r\n");
      out.write("                <td><img src=\"images/bjp.jpg\" width=\"152\" height=\"150\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(l);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>3.&nbsp;</td>\r\n");
      out.write("                <td>Mulayam Singh Yadav&nbsp;</td>\r\n");
      out.write("                <td>SP&nbsp;</td>\r\n");
      out.write("                <td><img src=\"images/sp.jpg\" width=\"150\" height=\"110\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(m);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>4.</td>\r\n");
      out.write("                <td>Mayawati</td>\r\n");
      out.write("                <td>BSP</td>\r\n");
      out.write("                <td><img src=\"images/bsp-logo.jpg\" width=\"150\" height=\"123\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(n);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>5.</td>\r\n");
      out.write("                <td>Mamta Bannerjee</td>\r\n");
      out.write("                <td>TMC</td>\r\n");
      out.write("                <td><img src=\"images/trinamool.jpg\" width=\"150\" height=\"101\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(o);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>6.</td>\r\n");
      out.write("                <td>Jaylalitha</td>\r\n");
      out.write("                <td>AIADMK</td>\r\n");
      out.write("                <td><img src=\"images/aiadmk.jpg\" width=\"150\" height=\"91\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(p);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>7.</td>\r\n");
      out.write("                <td>Arvind Kejrival</td>\r\n");
      out.write("                <td>AAP</td>\r\n");
      out.write("                <td><img src=\"images/aap.jpg\" width=\"150\" height=\"91\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(q);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>8.</td>\r\n");
      out.write("                <td>Lalu Prasad Yadav</td>\r\n");
      out.write("                <td>RJD</td>\r\n");
      out.write("                <td><img src=\"images/rjd.jpg\" width=\"150\" height=\"134\"  alt=\"\"/></td>\r\n");
      out.write("                <td>");
      out.print(j);
      out.write("&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <p id=\"para\"><h3>No. of People's who did not vote:&nbsp;");
      out.print(i);
      out.write("</h3>\r\n");
      out.write("            <form method=\"post\" action=\"details\">\r\n");
      out.write("                           <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\">\r\n");
      out.write("                           ");
      out.print(i);
      out.print(j);
      out.write("\r\n");
      out.write("\t\t\t  <h4> Vote Is Your Birth Right And You Should Practice It .For Signing up <a href=\"registration.jsp\">click here &gt;&gt;</a></h4>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- /#contents -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<ul id=\"links\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4>Heading placeholder</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4>Heading placeholder</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Title 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Title 3</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4>Heading placeholder</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">Link Extra Title 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
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
