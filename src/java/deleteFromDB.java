/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/deleteFromDB"})
public class deleteFromDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String pasnum = request.getParameter("pasnum");
        String results = "";

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            DB.delete(pasnum);
            results += DB.display();
            
            HttpSession session = request.getSession();
            session.setAttribute("result", results);
            response.sendRedirect("homepage.jsp");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getFromDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(deleteFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
