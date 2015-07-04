package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private Connection con;
    private Statement stmnt;
    private ResultSet rs;
    private String host;
    private String db;
    private String user;
    private String pass;
    
    public DBConnection() {
        host = "localhost";
        db = "itla";
        user = "root";
        pass = "";
    }

    public void Connect() throws SQLException {
        String url = "jdbc:mysql://" + host + "/" + db
                + "?user=" + user + "&password=" + pass;

        con = DriverManager.getConnection(url);
        stmnt = con.createStatement();
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (stmnt != null) {
            try {
                stmnt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public ResultSet query(String sql) throws SQLException {
        return stmnt.executeQuery(sql);
    }
    
    public void update(String sql) throws SQLException {
        stmnt.executeUpdate(sql);
    }
}
