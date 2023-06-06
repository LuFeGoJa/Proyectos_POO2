/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modeloVO.Propiedad;
import java.sql.SQLException;

/**
 *
 * @author 57320
 */
public class PropiedadDAO {
    
     public void guardar(Connection conexion, Propiedad propiedad) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = (PreparedStatement) conexion.prepareStatement("INSERT INTO propiedad (direccion, numHabitaciones, precioAlquiler, disponible) "
                    + "VALUES(?, ?, ?, ?, ?)");        
            consulta.setString(1, propiedad.getDireccion());
            consulta.setInt(2, propiedad.getNumHabitaciones());
            consulta.setDouble(3, propiedad.getPrecioAlquiler());
            consulta.setBoolean(4,propiedad.isDisponible());
            int executeUpdate = consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    } 
    
    
    
}
