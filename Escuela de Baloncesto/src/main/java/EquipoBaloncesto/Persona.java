/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Persona {
    
    public String cedula;
    public String nombre;
    public String apellidos;
    public String direccion;
    public String telefono;
    public int edad;
    public double salario;
    public String genero;

    public Persona(String cedula, String nombre, String apellidos, String direccion, String telefono, int edad,
            double salario, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.salario = salario;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getGenero() {
        return genero;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}