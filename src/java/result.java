/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/result"})
public class result extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
 
         out.println("<html><body>");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "voter", "india");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from voter");
            
             out.println("select party,count(*) votes from voter group by party");
             
             con.close();
            }
             catch (Exception e) {
             out.println("error");
              }
             finally{            
            out.close();
        }
    }
}
    


   
