/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author 1152228
 */
public class Estudiante extends Usuario {
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String nick, int edad, String claveAcceso, String correoElectronico) {
        super(nombre, apellido, nick, edad, claveAcceso, correoElectronico);
    }
}
