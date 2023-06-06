/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Ambulancia {
    
    String numeroContacto, entidadServicio;
    
    public Ambulancia(){
        
    }

    public Ambulancia(String numeroContacto, String entidadServicio) {
        this.numeroContacto = numeroContacto;
        this.entidadServicio = entidadServicio;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getEntidadServicio() {
        return entidadServicio;
    }

    public void setEntidadServicio(String entidadServicio) {
        this.entidadServicio = entidadServicio;
    }
    
    
    
}
