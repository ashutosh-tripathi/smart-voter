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
   %>
﻿<!DOCTYPE HTML>
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
				<img src="images/vote-here-19154700.jpg" alt="Img" height="444" width="630">
				<div class="info">
				  <h1>Vote Online</h1>
				  <p>Vote INDIA is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Vote India should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>
				  <p>&nbsp;</p>
					<a href="aboutus.html" class="more">Click here for more</a>
				</div>
			</div>
           
			<!-- /#adbox -->
			<h1>Welcome <%=log%> vote here</h1>
			<div class="section">
			  <p id="para"></p>
              <div id="table">
              <form method="post" action="voting">
<table width="1000" >
			    <tr>
			      <td width="56"><h1>Sr. no.</h1></td>
			      <td width="330"><h1>Contestant Name</h1></td>
			      <td width="193"><h1>Party</h1></td>
			      <td width="193"><h1>Symbol</h1></td>
			      <td width="194"><h1>Vote</h1></td>
		        </tr>
			    <tr>
			      <td>1.</td>
			      <td>Rahul Gandhi</td>
			      <td>INC</td>
			      <td><img src="images/congress.jpg" width="190" height="100"  alt=""/></td>
			      <td><p>
			        <input type="radio" name="radio" value="INC">
			      </p></td>
		        </tr>
			    <tr>
			      <td>2.</td>
			      <td>Narendra Modi</td>
			      <td>BJP</td>
			      <td><img src="images/bjp.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio" value="BJP" ></td>
		        </tr>
			    <tr>
			      <td>3.</td>
			      <td>Mulayam Singh Yadav</td>
			      <td>SP</td>
			      <td><img src="images/sp.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio" value="SP"></td>
		        </tr>
			    <tr>
			      <td>4.</td>
			      <td>Mayavati</td>
			      <td>BSP</td>
			      <td><img src="images/bsp-logo.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio" value="BSP" ></td>
		        </tr>
			    <tr>
			      <td>5.</td>
			      <td>Mamta Bannerjee</td>
			      <td>TMC</td>
			      <td><img src="images/trinamool.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio"value="TMC" ></td>
		        </tr>
			    <tr>
			      <td>6.</td>
			      <td>Jaylalitha</td>
			      <td>AIADMK</td>
			      <td><img src="images/aiadmk.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio"value="AIADMK" ></td>
		        </tr>
			    <tr>
			      <td>7.</td>
			      <td>Arvind Kejrival</td>
			      <td>AAP</td>
			      <td><img src="images/aap.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio" value="AAP"></td>
		        </tr>
			    <tr>
			      <td>8.</td>
			      <td>Lalu Prasad Yadav</td>
			      <td>RJD</td>
			      <td><img src="images/rjd.jpg" width="190" height="100"  alt=""/></td>
			      <td><input type="radio" name="radio" value="RJD" ></td>
		        </tr>
			    <tr>
			      <td>&nbsp;</td>
			      <td>&nbsp;</td>
			      <td><input type="submit" name="submit" id="submit" value="Submit"></td>
			      <td>&nbsp;</td>
			      <td>&nbsp;</td>
		        </tr>
		      </table>
              </form>
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
	</div>
                        </div>
</div>
</body>
</html>