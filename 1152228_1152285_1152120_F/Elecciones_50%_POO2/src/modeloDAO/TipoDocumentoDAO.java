/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import modeloVO.TipoDocumento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author Administrador
 */
public class TipoDocumentoDAO {
    private Connection connection;

    public TipoDocumentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException {
        String sql = "INSERT INTO tipodocumento (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoDocumento.getId());
            statement.setString(2, tipoDocumento.getDescripcion());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public TipoDocumento obtenerTipoDocumentoPorId(int id) throws SQLException {
        String sql = "SELECT * FROM tipodocumento WHERE id = ?";
        TipoDocumento tipoDocumento = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                tipoDocumento = new TipoDocumento();
                tipoDocumento.setId(resultSet.getInt("id"));
                tipoDocumento.setDescripcion(resultSet.getString("descripcion"));
            }
        } catch (SQLException e) {
           throw new SQLException(e);
        }

        return tipoDocumento;
    }

    public void actualizarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException {
        String sql = "UPDATE tipodocumento SET descripcion = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoDocumento.getDescripcion());
            statement.setInt(2, tipoDocumento.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}



