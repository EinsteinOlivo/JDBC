package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejadorEstudiante {

    private DBConnection db;

    public ManejadorEstudiante(DBConnection db) {
        this.db = db;
    }

    public void guardar(Estudiante e) {
        try {
            db.Connect();
            String sql = "INSERT INTO estudiantes(NOMBRE, APELLIDO, NOTA)"
                    + "VALUES ('" + e.getNombre()
                    + "', '" + e.getApellido() + "', "
                    + e.getNota() + ")";
            db.update(sql);
            db.disconnect();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public List<Estudiante> findAll() {
        String sql = "SELECT ID, NOMBRE, APELLIDO, NOTA "
                + "FROM estudiantes";
        
        ResultSet rs = null;
        ArrayList<Estudiante> estudiantes = 
                new ArrayList<>();
        
        try {
            db.Connect();
            rs = db.query(sql);
        
            while (rs.next()) {
                estudiantes.add(new Estudiante(rs.getString("NOMBRE"),
                        rs.getString("APELLIDO"),
                        rs.getInt("NOTA")
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            db.disconnect();
        }
        
        return estudiantes;
    }
}
