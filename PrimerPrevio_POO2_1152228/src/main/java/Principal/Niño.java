/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class Niño {
    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String telefonoPadre;
    private String refrigerio;
    private int numeroRegistro;
    private boolean ganadorRifa;

    public Niño(String dni, String nombres, String apellidos, int edad, String telefonoPadre) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefonoPadre = telefonoPadre;
        this.ganadorRifa = false;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefonoPadre() {
        return telefonoPadre;
    }

    public String getRefrigerio() {
        return refrigerio;
    }

    public void setRefrigerio(String refrigerio) {
        this.refrigerio = refrigerio;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public boolean isGanadorRifa() {
        return ganadorRifa;
    }

    public void setGanadorRifa(boolean ganadorRifa) {
        this.ganadorRifa = ganadorRifa;
    }
}


   
    
