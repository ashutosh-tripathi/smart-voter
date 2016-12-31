/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author ashu
 */
@WebServlet(urlPatterns = {"/voting"})
public class voting extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String part,sql,url;
        Connection con;
        PreparedStatement ps;
        try {
          part=request.getParameter("radio");
            url="jdbc:oracle:thin:@localhost:1521:xe";
             Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection(url,"voter","india");
              HttpSession session=request.getSession(false);  
        String log=(String)session.getAttribute("tran"); 
           if(log!="")
           {   
             sql="UPDATE newvoter SET party=? WHERE voter_id =?";
             ps=con.prepareStatement(sql);
             ps.setString(1,part);
             ps.setString(2,log);
            ps.executeUpdate();
            response.sendRedirect("thanks.html");
           }
           else
                 response.sendRedirect("login.jsp");
                   
        }
        catch(Exception e)
        {
            out.println("error!!"+e);
        } finally {            
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
