package control;

import Modelo.EstadoFeligres;
import Modelo.Feligres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.Vista;

public final class Control implements ActionListener {

    private Vista vista;
    private Feligres feligres;
    private ArrayList<Feligres> lista; 

    public Control(Vista vista, Feligres feligres, ArrayList<Feligres> lista) {
        this.vista = vista;
        this.feligres = feligres;
        this.lista = new ArrayList<>();
        // Apunta hacia el metodo
        actionListener(this);
    }

    public void actionListener(ActionListener controlador) {
        System.out.println("Procesando...");
        vista.guardarBtn.addActionListener(controlador);
        vista.pagarBtn.addActionListener(controlador);
        vista.limpiarBtn.addActionListener(controlador);
        vista.limpiarRegDieBtn.addActionListener(controlador);
        vista.imprimirBtn.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().contentEquals("Limpiar")) {
            vista.cedulaFeligresTxt.setText("");
            vista.nombreTxt.setText("");
            vista.direccionTxt.setText("");
            vista.tlfTxt.setText("");
            vista.estaTxt.setText("");
            vista.estadoTxt.setText("");
            vista.resultadoTxtA.setText("");
        }
        else if (e.getActionCommand().contentEquals("Limpiar:")) {
            vista.cedulaTxt.setText("");
            vista.valorDiezmoTxt.setText("");
            vista.resultadoTxtA.setText("");
        }

        else if (e.getActionCommand().contentEquals("Guardar")) {
            JOptionPane.showMessageDialog(null, "Se guardo al feligres correctamente");
            String cedula = vista.cedulaFeligresTxt.getText();
            String nombre = vista.nombreTxt.getText();
            String direccion = vista.direccionTxt.getText();
            String telefono = vista.tlfTxt.getText();
            int estrato = Integer.parseInt(vista.estaTxt.getText());
            
            Feligres feligresNuevo = new Feligres(cedula, nombre, direccion, telefono, estrato, EstadoFeligres.DEUDOR);
            lista.add(feligresNuevo);

        } else if (e.getActionCommand().contentEquals("Mostrar Datos")) {
           String cedula = vista.cedulaFeligresTxt.getText();
            for (int i = 0; i < lista.size(); i++) {
                // Una vez recorrida, preguntamos si hay algun feligres con el numero de cedula que estemos buscando
                if (cedula.equals(lista.get(i).getCedula())) {
                    vista.nombreTxt.setText(lista.get(i).getNombre());
                    vista.direccionTxt.setText(lista.get(i).getDireccion());
                    vista.tlfTxt.setText(lista.get(i).getTelefono());
                    vista.estaTxt.setText(String.valueOf(lista.get(i).getEstrato()));
                    vista.estadoTxt.setText(String.valueOf(lista.get(i).getEstadoFeligres()));
                    vista.resultadoTxtA.setText(lista.get(i).toString());
                }
            }
        } else if (e.getActionCommand().contentEquals("Pagar Diezmo")) {
              String cedula = vista.cedulaFeligresTxt.getText();
              Feligres feligresBuscado = null;
              for (int i = 0; i < lista.size(); i++) {
                  if (cedula.equalsIgnoreCase(lista.get(i).getCedula())){
                      feligresBuscado = lista.get(i);

                }
            }
            feligresBuscado.pagarDiezmo();
        }
    }

}
