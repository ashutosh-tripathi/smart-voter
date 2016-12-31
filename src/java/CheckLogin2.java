/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/CheckLogin2"})
public class CheckLogin2 extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id,pwd,sql,prty="1",sql1;
        ResultSet rs,rs1;
        PrintWriter out = response.getWriter();
        try {
          id=request.getParameter("vid");
           pwd=request.getParameter("pwd");
           if(id.equals("admin") && pwd.equals("vaccum"))
           {
           response.sendRedirect("adminresults.jsp");
           }
           else
           {
           sql="select * from newvoter where voter_id=? and pwd=?";
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","voter","india");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pwd);
             rs=ps.executeQuery();
          
            
             HttpSession session=request.getSession();  
        session.setAttribute("tran",id);
            
        if(!rs.next())
            {
                response.sendRedirect("errorlogin.jsp");
            }
                     else
        {sql1="select * from newvoter where voter_id=? and pwd=? and party=?";
         PreparedStatement ps1 = con.prepareStatement(sql1);
                  ps1.setString(1, id);
            ps1.setString(2, pwd);
            ps1.setString(3,prty);
            rs1=ps1.executeQuery();
            if(!rs1.next())
            {
            response.sendRedirect("errorvote.jsp");
            }
            response.sendRedirect("vote.jsp");
            
        }
            
           }
        }
              
            
        catch(Exception e)
        {
            out.println("error!!"+e);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
