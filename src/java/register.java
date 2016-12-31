

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

    
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id,pwd,name,address,sex,district,state,date,age,email,url,sql,prty="1",perm="no";
        Connection con;
        PreparedStatement ps;
        id=request.getParameter("id");
        pwd=request.getParameter("pwd");
        name=request.getParameter("name");
        age=request.getParameter("age");
        address=request.getParameter("address");
        email=request.getParameter("email");
         district=request.getParameter("district");
          sex=request.getParameter("radio");
           state=request.getParameter("slist");
           date=request.getParameter("date"); 
           String que=request.getParameter("question"); 
           String ans=request.getParameter("answer"); 
       if(id==""||pwd==""||name==""||age==""||email==""||address=="")
       {
           response.sendRedirect("emptyfields.jsp");
       }
       if(Integer.parseInt(age)<18)
       {
       response.sendRedirect("agelimit.html");
       }
        
       else
       {
        try {
            
            url="jdbc:oracle:thin:@localhost:1521:xe";
             Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection(url,"voter","india");
             sql="insert into newvoter values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
             ps=con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2, pwd);
             ps.setString(3, name);
             ps.setString(4, age);
             ps.setString(5, email);
             ps.setString(6, address);
             ps.setString(7, prty);
             ps.setString(8,sex);
             ps.setString(9,state);
              ps.setString(10,district);
               ps.setString(11,date);
               ps.setString(12,que);
               ps.setString(13,ans);
          
             ps.executeUpdate();
             HttpSession session=request.getSession();  
        session.setAttribute("tran",id);
        session.setAttribute("pass",pwd);
        session.setAttribute("name1",name);
        session.setAttribute("age1",age);
        session.setAttribute("email1",email);
        session.setAttribute("add",address);
        session.setAttribute("party",prty);
        session.setAttribute("sex1",sex);
        session.setAttribute("state1",state);
        session.setAttribute("dis",district);
        session.setAttribute("date1",date);
        
           response.sendRedirect("registrationdone.jsp");
             } 
        catch(SQLException e)
        {
            out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            out.println(e);
        }
        
        finally {            
            out.close();
        }
    }

    }
}


    
       