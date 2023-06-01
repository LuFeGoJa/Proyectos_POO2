/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

public class Feligres {

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private int estrato;
    private EstadoFeligres estado;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, int estrato, EstadoFeligres estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public EstadoFeligres getEstadoFeligres() {
        return estado;
    }

    public void setEstado(EstadoFeligres estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feligres{");
        sb.append("cedula=").append(cedula);
        sb.append(", nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", estrato=").append(estrato);
        sb.append(", estado=").append(estado);
        sb.append('}');
        System.out.println();
        return sb.toString();
    }

     public void pagarDiezmo(){
        
        if(estrato == 1){
            JOptionPane.showMessageDialog(null, "Su pago por el valorde $250.000 se realizo con exito");
            setEstado(EstadoFeligres.CUMPLIDO);
        }
        if(estrato == 2 || estrato == 3){
          JOptionPane.showMessageDialog(null, "Su pago por el valor de $1.000.000 se realizo con exito");
            setEstado(EstadoFeligres.CUMPLIDO);
        }
        
    }
     
}
