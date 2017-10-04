
import java.sql.*;

public class DB {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet recSet = null;

    private static String name = "me";
    private static String pwd = "123";

    public static void add(String fname, String lname, String email, String phone, String roomtype,
            String check, String checkout, String days, String passnum, String gnum) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/serenadb", name, pwd);

            stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO clientspe:  (fname, lname, email, phone, roomtype, checkin, checkout, days, passnum, gnum) VALUES (" + fname + "," + lname + "," + email + ","
                    + phone + "," + roomtype + "," + check + "," + checkout + "," + days + "," + passnum + "," + gnum + ")");

        } catch (SQLException ex) {
        } finally {
            if (recSet != null) {
                recSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static void delete(String id) throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/serenadb", name, pwd);
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM clients WHERE passnum=" + id);
            
        } catch (SQLException ex) {
        } finally {
            if (recSet != null) {
                recSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public static String display() throws SQLException {

        String result = "";

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/serenadb", name, pwd);
            stmt = con.createStatement();
            recSet = stmt.executeQuery("SELECT * FROM clients");

            while (recSet.next()) {
                result += "<tr>"
                        + "<td>" + recSet.getString("fname") + "</td>"
                        + "<td>" + recSet.getString("lname") + "</td>"
                        + "<td>" + recSet.getString("phone") + "</td>"
                        + "<td>" + recSet.getString("passportnum") + "</td>"
                        + "</tr>";
            }
        } catch (SQLException ex) {
        } finally {
            if (recSet != null) {
                recSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return result;
    }

}
