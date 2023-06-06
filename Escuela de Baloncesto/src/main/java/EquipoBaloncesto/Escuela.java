/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Escuela {
    private Docente profesor;
    private AuxiliarContable auxiliarContable;
    private Administrador administrador;

    public void contratarProfesor(String cedula, String nombre, String apellidos, String direccion, String telefono,
            int edad, double salario, String genero, String especialidad, String fechaNacimiento) {
        profesor = new Docente(cedula, nombre, apellidos, direccion, telefono, edad, salario, genero, especialidad,
                fechaNacimiento);
        System.out.println("Profesor contratado correctamente.");
    }

    public void contratarAuxiliarContable(String cedula, String nombre, String apellidos, String direccion,
            String telefono, int edad, double salario, String genero) {
        if (edad >= 25 && edad <= 35 && genero.equals("Femenino")) {
            auxiliarContable = new AuxiliarContable(cedula, nombre, apellidos, direccion, telefono, edad, salario,
                    genero);
            System.out.println("Auxiliar contable contratada correctamente.");
        } else {
            System.out.println("La auxiliar contable no cumple con los requisitos, se contratará una administradora.");
            contratarAdministrador(cedula, nombre, apellidos, direccion, telefono, edad, salario, genero);
        }
    }

    public void contratarAdministrador(String cedula, String nombre, String apellidos, String direccion,
            String telefono, int edad, double salario, String genero) {
        administrador = new Administrador(cedula, nombre, apellidos, direccion, telefono, edad, salario, genero, 1);
        System.out.println("Administradora contratada correctamente.");
    }

    public void renovarContratoAdministrador() {
        if (administrador != null) {
            int nuevoContrato = administrador.getContrato() + 1;
            administrador.setContrato(nuevoContrato);
            System.out.println("Contrato de la administradora renovado correctamente. Nuevo contrato: " + nuevoContrato);
        } else {
            System.out.println("No hay administradora contratada.");
        }
    }
}
