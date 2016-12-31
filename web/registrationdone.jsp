<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%
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
   %>
   <%
    HttpSession session1=request.getSession(false);  
        String log=(String)session.getAttribute("tran"); 
        String pass2=(String)session.getAttribute("pass");
        String name2=(String)session.getAttribute("name1");
        String age2=(String)session.getAttribute("age1");
        String email2=(String)session.getAttribute("email1");
        String add1=(String)session.getAttribute("add");
        String party2=(String)session.getAttribute("party");
        String sex2=(String)session.getAttribute("sex1");
        String state2=(String)session.getAttribute("state1");
        String dis2=(String)session.getAttribute("dis");
        String date2=(String)session.getAttribute("date1");
        
        
   %>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<title>Smart Voters</title>
    <link rel="shortcut icon" href="images/favico.ico"  />
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div id="page">
		<div id="header">
			<div id="logo">
			  <div id="title"><img src="images/8.jpg" height="85" Width="195" alt="v">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <img src="images/smartvoter.jpg" height="85" width="750" alt="vote india"></div>
			</div>
			<ul id="navigation">
				<li class="selected">
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="aboutus.html">About</a>
				</li>
				<li>
					<a href="knowyourleader.html">&nbsp;Know Your Leader</a>
				</li>
				<li>
					<a href="login.jsp">&nbsp;&nbsp;Vote Here</a>
				</li>
				<li>
					<a href="registration.jsp">&nbsp;&nbsp;Register Here</a>
				</li>
                <li>
					<a href="results.jsp">&nbsp;&nbsp;Election Results</a>
				</li>
			</ul>
		</div>
		<!-- /#header -->
		<div id="contents">
			<div id="adbox">
				<img src="images/glider.jpg" alt="Img" height="444" width="630">
				<div class="info">
				  <h1>Vote Online</h1>
				  <p>Smart Voters is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Smart Voters should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>
				  <p>&nbsp;</p>
					<a href="aboutus.html" class="more">Click here for more</a>
				</div>
			</div>
			<!-- /#adbox -->
			<h1>Election awaits on 24 Sept Register Soon to enjoy online voting</h1>
			<h3 align="center">Your Voter ID Card Details Are:</h3>
            <div class="section">
			  <p id="para" align="center"><table width="1000">
  <tr>
    <td>Voter-ID:&nbsp;</td>
    <td><%=log%>&nbsp;</td>
  </tr>
  <tr>
    <td>Name&nbsp;</td>
    <td><%=name2%>&nbsp;</td>
  </tr>
  <tr>
    <td>Date Of Birth:&nbsp;</td>
    <td><%=date2%>&nbsp;</td>
  </tr>
  <tr>
    <td>Sex:&nbsp;</td>
    <td><%=sex2%>&nbsp;</td>
  </tr>
  <tr>
    <td>Email:&nbsp;</td>
    <td><%=email2%>&nbsp;</td>
  </tr>
  <tr>
    <td>Address&nbsp;</td>
    <td><%=add1%>,<%=dis2%>,<%=state2%>&nbsp;</td>
  </tr>
  
</table>
			  <h4> Vote Is Your Birth Right And You Should Practice It .For Signing up <a href="registration.jsp">click here &gt;&gt;</a></h4>
		  </div>
			
		<!-- /#contents -->
		<div id="footer">
			<div>
				<ul id="links">
					<li>
						<h4>Contact Address</h4>
						<ul>
							<li>
								<a href="#">Rungta College Campus,</a>
							</li>
							<li>
								<a href="#">Kohka-Kurud Road,</a>
							</li>
							<li>
								<a href="#">Bhilai,C.G.</a>
							</li>
						</ul>
					</li>
					<li>
						
					</li>
					<li>
						
					</li>
					<li>
						<h4>Social Links</h4>
						<ul id="connect">
							<li>
								<a href="http://freewebsitetemplates.com/go/twitter/" target="_blank" class="twitter">Twitter</a>
							</li>
							<li>
								<a href="http://freewebsitetemplates.com/go/facebook/" target="_blank" class="facebook">Facebook</a>
							</li>
							<li>
								<a href="http://freewebsitetemplates.com/go/googleplus/" target="_blank" class="googleplus">Google +</a>
							</li>
						</ul>
					</li>
				</ul>
				<!-- /#links -->
			  <p class="footnote">
					© Copyright 2023.Company name all rights reserved
				</p>
			</div>
		</div>
		<!-- /#footer -->
	</div>
	<!-- /#page -->
</body>
</html>