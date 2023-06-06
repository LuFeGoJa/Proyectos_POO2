/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package inmobiliaria;

import controlador.Control;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modeloVO.Propiedad;

/**
 *
 * @author 57320
 */
public class Inmobiliaria{


    public static void main(String[] args) {
       Control inmobiliaria = new Control();

        JFrame frame = new JFrame("Inmobiliaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JButton agregarButton = new JButton("Agregar Propiedad");
        JButton mostrarButton = new JButton("Mostrar Propiedades Disponibles");
        JButton actualizarButton = new JButton("Actualizar Disponibilidad");

        agregarButton.addActionListener((ActionEvent e) -> {
            String direccion = JOptionPane.showInputDialog(frame, "Ingrese la dirección de la propiedad:");
            int numHabitaciones = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ingrese el número de habitaciones:"));
            double precioAlquiler = Double.parseDouble(JOptionPane.showInputDialog(frame, "Ingrese el precio mensual de alquiler:"));
            
            inmobiliaria.agregarPropiedad(direccion, numHabitaciones, precioAlquiler);
            JOptionPane.showMessageDialog(frame, "Propiedad agregada exitosamente.");
       });

        mostrarButton.addActionListener((ActionEvent e) -> {
            List<Propiedad> disponibles = inmobiliaria.obtenerPropiedadesDisponibles();
            if (disponibles.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No hay propiedades disponibles.");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Propiedad propiedad : disponibles) {
                    sb.append("Dirección: ").append(propiedad.getDireccion()).append("\n")
                            .append("Número de Habitaciones: ").append(propiedad.getNumHabitaciones()).append("\n")
                            .append("Precio Mensual de Alquiler: ").append(propiedad.getPrecioAlquiler()).append("\n\n");
                }
                JOptionPane.showMessageDialog(frame, sb.toString(), "Propiedades Disponibles", JOptionPane.INFORMATION_MESSAGE);
            }
       });

        actualizarButton.addActionListener((ActionEvent e) -> {
            String direccion = JOptionPane.showInputDialog(frame, "Ingrese la dirección de la propiedad:");
            String disponibilidad = JOptionPane.showInputDialog(frame, "¿Está disponible? (Sí/No):");
            
            boolean disponible = disponibilidad.equalsIgnoreCase("Sí") || disponibilidad.equalsIgnoreCase("Yes");
            inmobiliaria.actualizarDisponibilidad(direccion, disponible);
            JOptionPane.showMessageDialog(frame, "Disponibilidad actualizada exitosamente.");
       });

        frame.add(agregarButton);
        frame.add(mostrarButton);
        frame.add(actualizarButton);
        frame.setVisible(true);
    }
}
