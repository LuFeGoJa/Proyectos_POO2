
package modeloDAO;

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modeloVO.Eleccion;

public class EleccionDAO {
    
    public void guardar(Connection conexion, Eleccion eleccion) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO eleccion (id, nombre, cargo, fechaInicio, fechaFin) "
                    + "VALUES(?, ?, ?, ?, ?)");        
            consulta.setInt(1, eleccion.getId());
            consulta.setString(2, eleccion.getNombre());
            consulta.setString(3, eleccion.getCargo());
            consulta.setDate(4, new java.sql.Date(eleccion.getFechaInicio().getTime()));
            consulta.setDate(5, new java.sql.Date(eleccion.getFechaFin().getTime()));
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    } 
    
}


