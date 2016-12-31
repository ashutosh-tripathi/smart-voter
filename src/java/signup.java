/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Signup"})
public class signup extends HttpServlet {

    
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id,pwd,name,address,age,email,url,sql;
        Connection con;
        PreparedStatement ps;
        id=request.getParameter("id");
        pwd=request.getParameter("pwd");
        name=request.getParameter("name");
        age=request.getParameter("age");
        address=request.getParameter("address");
        email=request.getParameter("email");
       if(id==""||pwd==""||name==""||age==""||email==""||address=="")
       {
           out.println("<h1><font=red>For Signing-Up all the perimeters must be provided</font></h1>");
       }
        
       else
       {
        try {
            
            url="jdbc:oracle:thin:@localhost:1521:xe";
             Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection(url,"voter","india");
             sql="insert into voter values (?,?,?,?,?,?)";
             ps=con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2, pwd);
             ps.setString(3, name);
             ps.setString(4, age);
             ps.setString(5,email);
             ps.setString(6,address);
             ps.executeUpdate();
             out.println("<h1><font=red>Thankyou you have been registered</font></h1>");
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
