/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class AuxiliarContable extends Empleado {
    int edad;
    String apellido;
    
    public AuxiliarContable(String cedula1, String nombre1, String apellidos, String direccion1, String telefono1, int edad1, double salario1, String genero1){
    
    }

    public AuxiliarContable(int edad, String apellido, String nombre, String cedula, String direccion, String telefono, String genero, double salario) {
        super(nombre, cedula, direccion, telefono, genero, salario);
        this.edad = edad;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
}
