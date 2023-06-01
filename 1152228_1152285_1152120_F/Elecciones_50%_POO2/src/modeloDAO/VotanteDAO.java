
package modeloDAO;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.Votante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 57320
 */
public class VotanteDAO {
    private Connection connection;

    public VotanteDAO(Connection connection) {
        this.connection = connection;
    }

    public VotanteDAO() {
        
    }

    public void insertarVotante(Connection obtener, Votante votante) throws SQLException {
        String sql = "INSERT INTO votante (id, nombre, email, documento, tipodocumento, eleccion) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, votante.getId());
            statement.setString(2, votante.getNombre());
            statement.setString(3, votante.getEmail());
            statement.setString(4, votante.getDocumento());
            statement.setInt(5, votante.getTipoDocumento());
            statement.setInt(6, votante.getEleccion());

            statement.executeUpdate();
        } 
        catch (SQLException e) {
            throw new SQLException(e);
        }
    } 

    public Votante obtenerVotantePorId(int id) throws SQLException {
        String sql = "SELECT * FROM votante WHERE id = ?";
        Votante votante = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                votante = new Votante();
                votante.setId(resultSet.getInt("id"));
                votante.setNombre(resultSet.getString("nombre"));
                votante.setEmail(resultSet.getString("email"));
                votante.setDocumento(resultSet.getString("documento"));
                votante.setTipoDocumento(resultSet.getInt("tipodocumento"));
                votante.setEleccion(resultSet.getInt("eleccion"));
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }

        return votante;
    }

    public void actualizarVotante(Votante votante) throws SQLException {
        String sql = "UPDATE votante SET nombre = ?, email = ?, documento = ?, tipodocumento = ?, eleccion = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, votante.getNombre());
            statement.setString(2, votante.getEmail());
            statement.setString(3, votante.getDocumento());
            statement.setInt(4, votante.getTipoDocumento());
            statement.setInt(5, votante.getEleccion());
            statement.setInt(6, votante.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
    public boolean existeVotante(Connection conexion, String cedula) {
    boolean existe = false;
    try {
        String consulta = "SELECT COUNT(*) FROM visitante WHERE documento = ?";
        PreparedStatement pstmt = conexion.prepareStatement(consulta);
        pstmt.setString(1, cedula);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1); 
            existe = (count > 0);
        }
 
        rs.close();
        pstmt.close();
    } catch (SQLException e) {
      
    }
    return existe;
}
    public void mostrarVotantes(Connection conexion, JTable tabla) throws SQLException {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Email");
        model.addColumn("Documento");
        model.addColumn("Tipo Documento");
        model.addColumn("Eleccion");
        String consultasql = "SELECT * FROM votante";
        Statement st;

        try {
            st = (Statement) conexion.createStatement();
            ResultSet resultado = st.executeQuery(consultasql);
            while (resultado.next()) {

                Object[] lista = {resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getObject(4),
                    resultado.getString(5), resultado.getString(6), resultado.getInt(7)};
                model.addRow(lista);
            }
            tabla.setModel(model);

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }

    }

}
