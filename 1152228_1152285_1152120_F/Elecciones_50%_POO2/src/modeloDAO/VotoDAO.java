package modeloDAO;

import com.mysql.jdbc.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modeloVO.Voto;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class VotoDAO {

    public VotoDAO() {
    }
    
    public void guardar(Connection conexion, Voto voto) throws SQLException {
        
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO voto (id, fechacreacion, fechavoto, candidato, votante) VALUES (?, ?, ?, ?, ?)");

            consulta.setInt(1, voto.getId());
            consulta.setTimestamp(2, voto.getFechacreacion());
            consulta.setTimestamp(3, voto.getFechavoto());
            consulta.setInt(4, voto.getCandidato().getId());
            consulta.setInt(5, voto.getVotante().getId());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void mostrarVotos(Connection conexion, JTable tabla) throws SQLException {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("votante");
        model.addColumn("candidato");
        
        String consultasql = "SELECT * FROM voto";
        Statement st;

        try {
            st = (Statement) conexion.createStatement();
            ResultSet resultado = st.executeQuery(consultasql);
            while (resultado.next()) {

                Object[] lista = {resultado.getInt(1), resultado.getString(5), resultado.getString(4)};
                model.addRow(lista);
            }
            tabla.setModel(model);

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }

    }

    public  ArrayList<Integer> resultados(Connection conexion) throws SQLException {
        int c1, c2, blank;
        c1 = c2 = blank = 0;
        String consultasql = "SELECT * FROM voto";
        Statement st;

        try {
            st = (Statement) conexion.createStatement();
            ResultSet resultado = st.executeQuery(consultasql);
            while (resultado.next()) {

                int candidato = resultado.getInt("candidato");

                if (candidato == 1) {
                    c1++;
                }
                if (candidato == 2) {
                    c2++;
                }
                if (candidato == 3) {
                    blank++;

                }

            }
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(c1, c2, blank));
            return arr;

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }

    }

}
