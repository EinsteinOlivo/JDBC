
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnection;
import model.Estudiante;
import model.ManejadorEstudiante;



public class Test {
    public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Class.forName("com.mysql.jdbc.Driver").newInstance();
        
//        String url = "jdbc:mysql://localhost/itla?user=root&password=";
//        
//        Connection con = null;
//        
//        try {
//            con = DriverManager.getConnection(url);
//            System.out.println("Conectado!!");
//            
//            String sql = "INSERT INTO estudiantes(NOMBRE, APELLIDO, NOTA)"
//                    + "VALUES ('Padilla', 'Javatar', '99')";
//            
//            String sql2 = "SELECT ID, NOMBRE, APELLIDO, NOTA "
//                    + "FROM estudiantes";
//            
//            String sql3 = "INSERT INTO estudiantes(NOMBRE, APELLIDO, NOTA)"
//                    + "VALUES (?, ?, ?)";
//            
//            PreparedStatement pstmnt =con.prepareStatement(sql3);
//            pstmnt.setString(1, "Luis");
//            pstmnt.setString(2, "Soto");
//            pstmnt.setInt(3, 50);
//            pstmnt.execute();
//            
//            Statement stmnt = con.createStatement();
//           // stmnt.executeUpdate(sql);
//            
//            ResultSet rs = stmnt.executeQuery(sql2);
//            
//            while(rs.next()) {
//                System.out.println(rs.getInt("ID") + "\t" +
//                        rs.getString("NOMBRE") + "\t" +
//                        rs.getString("APELLIDO") + "\t" +
//                        rs.getInt("NOTA"));
//                
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            if(con != null) {
//                try {
//                    con.close();
//                } catch (SQLException ex) {
//                }
//            }
//        }
    
        ManejadorEstudiante me = 
                new ManejadorEstudiante(new DBConnection());
        
        me.guardar(new Estudiante("Hector",
                "Plinio",
                100
        ));
        
        List<Estudiante> estudiantes = me.findAll();
        for(Estudiante e : estudiantes) {
            System.out.println(e.getNombre());
        }
        
    }
}
