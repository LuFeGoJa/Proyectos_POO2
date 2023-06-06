/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57320
 */
public class EventoDiaDelNiño {
    private List<Niño> listaNiños;
    private int numeroRegistro;

    public EventoDiaDelNiño() {
        listaNiños = new ArrayList<>();
        numeroRegistro = 1;
    }

    public void registrarNiño(String dni, String nombres, String apellidos, int edad, String telefonoPadre) {
        if (edad > 13) {
            System.out.println("El niño no cumple con la edad permitida para el evento.");
            return;
        }

        Niño niño = new Niño(dni, nombres, apellidos, edad, telefonoPadre);
        niño.setNumeroRegistro(numeroRegistro);
        listaNiños.add(niño);
        numeroRegistro++;

        System.out.println("Niño registrado correctamente.");

        seleccionarRefrigerio(niño);
    }

    private void seleccionarRefrigerio(Niño niño) {
        String[] opcionesRefrigerio = { "Perro Caliente", "Hamburguesa", "Papitas McDonald" };
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el refrigerio para el niño: " + niño.getNombres(),
                "Refrigerio", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesRefrigerio,
                opcionesRefrigerio[0]);

        switch (opcion) {
            case 0:
                niño.setRefrigerio("Perro Caliente");
                break;
            case 1:
                niño.setRefrigerio("Hamburguesa");
                break;
            case 2:
                niño.setRefrigerio("Papitas McDonald");
                break;
        }

        System.out.println("Refrigerio seleccionado: " + niño.getRefrigerio());
    }

    public void hacerSorteo() {
        int ganador = (int) (Math.random() * numeroRegistro);
        for (Niño niño : listaNiños) {
            if (niño.getNumeroRegistro() == ganador) {
                niño.setGanadorRifa(true);
                System.out.println("Ganador de la rifa: ");
                System.out.println("Número de Registro: " + niño.getNumeroRegistro());
                System.out.println("Nombres: " + niño.getNombres());
                System.out.println("Apellidos: " + niño.getApellidos());
                break;
            }
        }
    }
}