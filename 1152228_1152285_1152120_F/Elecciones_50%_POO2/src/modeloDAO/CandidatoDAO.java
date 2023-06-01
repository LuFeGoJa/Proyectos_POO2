/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package modeloDAO;

/**
 *
 * @author Administrador
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.Candidato;

public class CandidatoDAO {
    private Connection connection;

    public CandidatoDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertarCandidato(Candidato candidato) throws SQLException {
        String sql = "INSERT INTO candidato (id, documento, nombre, apellido, eleccion, numero) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, candidato.getId());
            statement.setString(2, candidato.getDocumento());
            statement.setString(3, candidato.getNombre());
            statement.setString(4, candidato.getApellido());
            statement.setInt(5, candidato.getEleccion());
            statement.setInt(6, candidato.getNumero());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public Candidato obtenerCandidatoPorId(int id) throws SQLException {
        String sql = "SELECT * FROM candidato WHERE id = ?";
        Candidato candidato = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                candidato = new Candidato();
                candidato.setId(resultSet.getInt("id"));
                candidato.setDocumento(resultSet.getString("documento"));
                candidato.setNombre(resultSet.getString("nombre"));
                candidato.setApellido(resultSet.getString("apellido"));
                candidato.setEleccion(resultSet.getInt("eleccion"));
                candidato.setNumero(resultSet.getInt("numero"));
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }

        return candidato;
    }

    public void actualizarCandidato(Candidato candidato) throws SQLException {
        String sql = "UPDATE candidato SET documento = ?, nombre = ?, apellido = ?, eleccion = ?, numero = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, candidato.getDocumento());
            statement.setString(2, candidato.getNombre());
            statement.setString(3, candidato.getApellido());
            statement.setInt(4, candidato.getEleccion());
            statement.setInt(5, candidato.getNumero());
            statement.setInt(6, candidato.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}

