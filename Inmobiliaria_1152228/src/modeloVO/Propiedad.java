/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVO;

/**
 *
 * @author 57320
 */
public class Propiedad {
    private String direccion;
    private int numHabitaciones;
    private double precioAlquiler;
    private boolean disponible;

    public Propiedad(String direccion, int numHabitaciones, double precioAlquiler) {
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.precioAlquiler = precioAlquiler;
        this.disponible = true;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}