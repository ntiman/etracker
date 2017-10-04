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

@WebServlet(urlPatterns = {"/getFromDB"})
public class getFromDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        try {
            String results = "";
            Class.forName("com.mysql.jdbc.Driver");
            results += DB.display();
            
            HttpSession session = request.getSession();
            session.setAttribute("result", results);
            response.sendRedirect("homepage.jsp");
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(getFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

