/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modeloVO.Propiedad;

/**
 *
 * @author 57320
 */
public class Control {
    private List<Propiedad> propiedades;

    public Control() {
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(String direccion, int numHabitaciones, double precioAlquiler) {
        Propiedad propiedad = new Propiedad(direccion, numHabitaciones, precioAlquiler);
        propiedades.add(propiedad);
    }

    public List<Propiedad> obtenerPropiedadesDisponibles() {
        List<Propiedad> disponibles = new ArrayList<>();
        for (Propiedad propiedad : propiedades) {
            if (propiedad.isDisponible()) {
                disponibles.add(propiedad);
            }
        }
        return disponibles;
    }

    public void actualizarDisponibilidad(String direccion, boolean disponible) {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getDireccion().equals(direccion)) {
                propiedad.setDisponible(disponible);
                return;
            }
        }
        System.out.println("No se encontró ninguna propiedad con la dirección especificada.");
    }
}
