/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class PadreAlumno extends Persona {
    
    String cedula, email;
    
    public PadreAlumno(String cedula, String nombre, String apellidos, String direccion, String telefono, int edad,
            double salario, String genero, int contrato) {
        super(cedula, nombre, apellidos, direccion, telefono, edad, salario, genero);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
