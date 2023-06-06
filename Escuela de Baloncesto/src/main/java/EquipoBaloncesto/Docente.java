/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Docente extends Empleado {
    String especialidad, fechaNacimiento;

    public Docente(String cedula1, String nombre1, String apellidos, String direccion1, String telefono1, int edad, double salario1, String genero1, String especialidad1, String fechaNacimiento1) {
    }

    public Docente(String nombre, String cedula, String direccion, String telefono, String genero, double salario) {
        super(nombre, cedula, direccion, telefono, genero, salario);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
