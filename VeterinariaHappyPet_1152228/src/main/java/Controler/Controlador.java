/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Mascota;
import Vista.Veterinaria;
import Model.Size;
import Model.Servicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 57320
 */
public final class Controlador implements ActionListener {
    
    private Servicio servicio;
    private Veterinaria formulario;
    private ArrayList<Mascota> lista;
    private Size tamanio;

    public Controlador(Veterinaria formulario,ArrayList<Mascota> lista) {
        this.servicio = new Servicio();
        this.formulario=formulario;
        this.lista=new ArrayList();
        
        actionListener(this);
    }
    
     public void actionListener(ActionListener controlador) {
        formulario.button2Guardar.addActionListener(controlador);
        formulario.button3Mostrar.addActionListener(controlador);
        formulario.button2Limpiar.addActionListener(controlador);
        formulario.button1Calcular.addActionListener(controlador);
        
        
    }
     
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().contentEquals("Limpiar")) {
            System.out.println("Estoy funcionando en limpiar");
            formulario.txtCodigo.setText("");
            formulario.txtNombre.setText("");
            formulario.txtRaza.setText("");
            formulario.txtTamanio.setText("");
            formulario.txtResultado.setText("");


        } else if (e.getActionCommand().contentEquals("Calcular Servicio")) {

            String codigoBusqueda = formulario.txtCodigo.getText();
            Mascota aux = new Mascota();
            Mascota aux2 = aux.buscarMascota(lista, codigoBusqueda);
            int total=0;
            if (formulario.jCheckBoxbaño.isSelected()){
                Servicio servicio1 = new Servicio ("Baño Completo", String.valueOf(aux2.getTamanio()));
                total += servicio1.calcularCosto();
            }
            if (formulario.jCheckBoxvacunas.isSelected()){
                Servicio servicio2 = new Servicio ("Aplicación Vacunas", String.valueOf(aux2.getTamanio()));
                total += servicio2.calcularCosto();
            }
          
            if (formulario.jCheckBoxpelo.isSelected()){
                Servicio servicio3 = new Servicio ("Corte pelo", String.valueOf(aux2.getTamanio()));
                total += servicio3.calcularCosto();
            }
            if (formulario.jCheckBoxuñas.isSelected()){
                Servicio servicio4 = new Servicio ("Corte Uñas", String.valueOf(aux2.getTamanio()));
                total += servicio4.calcularCosto();
            }
            
            formulario.txtResultado.setText("El valor total del servicio es: $" + total);

        } else if (e.getActionCommand().contentEquals("Mostrar Datos")) {
            String codigoBusqueda = JOptionPane.showInputDialog("Ingrese el codigo de la mascota");
            Mascota aux = new Mascota();
            Mascota aux2 = aux.buscarMascota(lista, codigoBusqueda);
            System.out.println("Estoy funcionando en mostrar datos");
            String rta = aux2.getNombre() + ",\n" + aux2.getRaza() + ",\n" + String.valueOf(aux2.getTamanio());
            formulario.txtResultado.setText(rta);
            
            
            
           //formulario.txtResultado.setText(lista.get(aux).toString());
            
        }else if (e.getActionCommand().contentEquals("Guardar")) {

            JOptionPane.showMessageDialog(null, "Se guardo a tu mascota correctamente");
                String codigo = formulario.txtCodigo.getText();
                String nombre = formulario.txtNombre.getText();
                String raza = formulario.txtRaza.getText();
                String tamanioTexto = formulario.txtTamanio.getText();
                servicio = new Servicio();
            
                if (tamanioTexto.equalsIgnoreCase("PEQUEÑO")) {
                tamanio = Size.PEQUEÑO;
            } else if (tamanioTexto.equalsIgnoreCase("MEDIANO")) {
                tamanio = Size.MEDIANO;
            } else if (tamanioTexto.equalsIgnoreCase("GRANDE")) {
                tamanio = Size.GRANDE;
            }
       
            Mascota mascotaNueva = new Mascota(codigo, nombre, raza, tamanio);
            lista.add(mascotaNueva);
         
        }
    }

    
}
