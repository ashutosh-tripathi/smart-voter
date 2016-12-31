<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<% 
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
				<img src="images/large.jpg" alt="Img" height="444" width="630">
				<div class="info">
				  <h1>Vote Online</h1>
				  <p>Smart Voters is an initiative of the Election Commision of INDIA to increase the participation of voters in election and to conduct fare and unbiased election. Smart Voters should increase the participation of voters in election by helping person who cant reach booth to cast vote from their home.Register soon to enjoy online voting in the coming elections of  24 sept 2014.</p>
				  <p>&nbsp;</p>
					<a href="aboutus.html" class="more">Click here for more</a>
				</div>
			</div>
			<!-- /#adbox -->
			<h1>Election awaits on 24 Sept Register Soon to enjoy online voting</h1>
			<h3 align="center">The Election Results are:</h3>
            <div class="section">
            <table width="1000">
              <tr>
                <td width="69"><h1>Sr. No.</h1>&nbsp;</td>
                <td width="289"><h1>Candidate's Name</h1>&nbsp;</td>
                <td width="184"><h1>Party Name</h1>&nbsp;</td>
                <td width="155"><h1>Symbol</h1>&nbsp;</td>
                <td width="279"><h1>Votes</h1>&nbsp;</td>
              </tr>
              <tr>
                <td>1.&nbsp;</td>
                <td>Rahul Gandhi&nbsp;</td>
                <td>INC&nbsp;</td>
                <td><img src="images/congress.jpg" width="151" height="150"  alt=""/></td>
                <td> <%=k%>&nbsp;</td>
              </tr>
              <tr>
                <td>2.&nbsp;</td>
                <td>Narendra Modi&nbsp;</td>
                <td>BJP&nbsp;</td>
                <td><img src="images/bjp.jpg" width="152" height="150"  alt=""/></td>
                <td><%=l%>&nbsp;</td>
              </tr>
              <tr>
                <td>3.&nbsp;</td>
                <td>Mulayam Singh Yadav&nbsp;</td>
                <td>SP&nbsp;</td>
                <td><img src="images/sp.jpg" width="150" height="110"  alt=""/></td>
                <td><%=m%>&nbsp;</td>
              </tr>
              <tr>
                <td>4.</td>
                <td>Mayawati</td>
                <td>BSP</td>
                <td><img src="images/bsp-logo.jpg" width="150" height="123"  alt=""/></td>
                <td><%=n%>&nbsp;</td>
              </tr>
              <tr>
                <td>5.</td>
                <td>Mamta Bannerjee</td>
                <td>TMC</td>
                <td><img src="images/trinamool.jpg" width="150" height="101"  alt=""/></td>
                <td><%=o%>&nbsp;</td>
              </tr>
              <tr>
                <td>6.</td>
                <td>Jaylalitha</td>
                <td>AIADMK</td>
                <td><img src="images/aiadmk.jpg" width="150" height="91"  alt=""/></td>
                <td><%=p%>&nbsp;</td>
              </tr>
              <tr>
                <td>7.</td>
                <td>Arvind Kejrival</td>
                <td>AAP</td>
                <td><img src="images/aap.jpg" width="150" height="91"  alt=""/></td>
                <td><%=q%>&nbsp;</td>
              </tr>
              <tr>
                <td>8.</td>
                <td>Lalu Prasad Yadav</td>
                <td>RJD</td>
                <td><img src="images/rjd.jpg" width="150" height="134"  alt=""/></td>
                <td><%=j%>&nbsp;</td>
              </tr>
            </table>
            <p id="para"><h3>No. of People's who did not vote:&nbsp;<%=i%></h3>
           
   
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