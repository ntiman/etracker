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


    @WebServlet(urlPatterns = {"/addToDB"})
public class addToDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String roomtype = request.getParameter("roomtype");
        String check = request.getParameter("check");
        String checkout = request.getParameter("checkout");
        String days = request.getParameter("numdays");
        String passnum = request.getParameter("pasnum");
        String gnum = request.getParameter("gnum");

        try {
            String button = request.getParameter("add");
            Class.forName("com.mysql.jdbc.Driver");
            
            DB.add(fname, lname, email, phone, roomtype, check, checkout, days, passnum, gnum);
            response.sendRedirect("homepage.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getFromDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
