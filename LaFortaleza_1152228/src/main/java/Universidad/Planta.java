/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.Scanner;

/**
 *
 * @author 57320
 */
public class Planta extends Docente{
    double puntosSalariales;
    String categoriaNombramiento, fechaNombramiento;
    int numeroNombramiento;

    public Planta() {
       
    }

    public Planta(double puntosSalariales, String categoriaNombramiento, 
            String fechaNombramiento, int numeroNombramiento, String codigo, String nombre, String titulo, 
            String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.puntosSalariales = puntosSalariales;
        this.categoriaNombramiento = categoriaNombramiento;
        this.fechaNombramiento = fechaNombramiento;
        this.numeroNombramiento = numeroNombramiento;
    }

    public double getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(double puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public String getCategoriaNombramiento() {
        return categoriaNombramiento;
    }

    public void setCategoriaNombramiento(String categoriaNombramiento) {
        this.categoriaNombramiento = categoriaNombramiento;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public int getNumeroNombramiento() {
        return numeroNombramiento;
    }

    public void setNumeroNombramiento(int numeroNombramiento) {
        this.numeroNombramiento = numeroNombramiento;
    }
    
    
    
}
