package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloDAO.CandidatoDAO;
import modeloDAO.Conexion;
import modeloDAO.VotanteDAO;
import modeloDAO.VotoDAO;
import modeloVO.Candidato;
import modeloVO.Votante;
import modeloVO.Voto;
import vista.Formulario_1;

public class Control implements ActionListener {

    private Formulario_1 vista;
    private Conexion conexion;
    private VotanteDAO votante;
    private VotoDAO voto;
    private CandidatoDAO candidato;
    private DefaultTableModel registros;
    Votante aux;

    public Control(Formulario_1 vista) throws SQLException, ClassNotFoundException {
        this.vista = vista;
        ActionListener(this);
        conexion = new Conexion();
        votante = new VotanteDAO(Conexion.obtener());
        voto = new VotoDAO();
        candidato = new CandidatoDAO(Conexion.obtener());
        candidato.actualizarCandidato(actualizarCandidato());
    }

    private void ActionListener(ActionListener control) {
        vista.btnLimpiar.addActionListener(control);
        vista.btnVotar1.addActionListener(control);
        vista.btnResultados.addActionListener(control);
        vista.btnRegistrar.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("LIMPIAR")) {
            vista.txtid.setText("");
            vista.txtnombre.setText("");
            vista.txtemail.setText("");
            vista.txtdocumento.setText("");
            aux = new Votante();
            JOptionPane.showMessageDialog(null, "Se Limpió Todo");

        }

        if (evento.getActionCommand().contentEquals("REGISTRAR")) {
            if (vista.txtid.getText().equals("") || vista.txtnombre.getText().equals("") || vista.txtemail.getText().equals("")
                    || vista.txtdocumento.getText().equals("") || vista.cmbxtipodocumento.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar");
            } else {
                int id = Integer.parseInt(vista.txtid.getText());
                String nombre = vista.txtnombre.getText();
                String email = vista.txtemail.getText();
                String documento = vista.txtdocumento.getText();
                int tipoDocumento = vista.cmbxtipodocumento.getSelectedIndex() + 1;
                int seleccion = 1;
                aux = new Votante(id, nombre, email, documento, tipoDocumento, seleccion);
                try {
                    votante.insertarVotante(Conexion.obtener(), aux);
                    JOptionPane.showMessageDialog(vista, "El votante se registro con exito");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(vista, ex.getMessage());
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(vista, ex.getMessage());
                }
            }
            
        }

        if (evento.getActionCommand().contentEquals("VOTAR")) {
            if (vista.txtid.getText().equals("") || vista.txtnombre.getText().equals("") || vista.txtemail.getText().equals("")
                    || vista.txtdocumento.getText().equals("") || vista.cmbxtipodocumento.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar");
            } else {
                try {
                    int eleccionCandidato = getEleccion();
                    if (eleccionCandidato == -1) {
                        JOptionPane.showMessageDialog(vista, "Seleccione un candidato");
                    } else {
                        Timestamp timestamp2 = Timestamp.valueOf("2021-06-04 10:30:00");
                        Voto aux2 = new Voto(aux.getId(), timestamp2, timestamp2, candidato.obtenerCandidatoPorId(eleccionCandidato), votante.obtenerVotantePorId(aux.getId()));
                        voto.guardar(Conexion.obtener(), aux2);
                        JOptionPane.showMessageDialog(null, "Registro exitoso de los datos del Voto!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage() + Arrays.toString(ex.getStackTrace()));
                    JOptionPane.showMessageDialog(vista, ex.getMessage());
                }
            }

        }

        if (evento.getActionCommand().contentEquals("RESULTADOS")) {
            try {                
                voto.mostrarVotos(Conexion.obtener(),vista.jTable1Resultados);
                ArrayList <Integer> a = voto.resultados(Conexion.obtener());
                vista.txtRsultados.setText("Candidato 1" + "\t"+ "Candidato 2" + "\t"+ "Voto en Blanco" + "\n" 
                + a.get(0).toString() + "\t" + a.get(1).toString() + "\t" + a.get(2).toString());
            } catch (SQLException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getEleccion() throws Exception {
        if (vista.cboxCandidato1.isSelected() && vista.cboxCandidato2.isSelected()) {
            throw new Exception("Hay mas de un candidato seleccionado");
        }
        if (vista.cboxCandidato1.isSelected() && vista.cboxVotoEnBlanco.isSelected()) {
            throw new Exception("Hay mas de un candidato seleccionado");
        }
        if (vista.cboxCandidato2.isSelected() && vista.cboxVotoEnBlanco.isSelected()) {
            throw new Exception("Hay mas de un candidato seleccionado");
        }
        int rta = -1;
        if (vista.cboxVotoEnBlanco.isSelected()) {
            rta = 3;
        }
        if (vista.cboxCandidato1.isSelected()) {
            rta = 1;
        }
        if (vista.cboxCandidato2.isSelected()) {
            rta = 2;
        }
        return rta;
    }

    public Candidato actualizarCandidato() {
        Candidato a = new Candidato(1, "1", "Candidato", "1", 1, 1);
        return a;
    }
}
