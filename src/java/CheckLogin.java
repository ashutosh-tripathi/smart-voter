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
import javax.servlet.http.HttpSession;
/**
 *
 * @author Pratyush
 */
@WebServlet(urlPatterns = {"/Login"})
public class CheckLogin extends HttpServlet {

    String uid,pwd,sql;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code.
             */
            
           uid=request.getParameter("id");
           pwd=request.getParameter("pwd");
           sql="select * from voter where id=? and pwd=?";
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@vaccum:1521:xe","voter","india");
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ResultSet rs=ps.executeQuery();
            
            if(!rs.next())
            {
             //   response.sendRedirect("ErrorPg");
            }
                     
        out.print("login successful");
        }
        catch(Exception e)
        {
            out.println("error!!"+e);
        }
        finally {            
            out.close();
        }
    }

}
