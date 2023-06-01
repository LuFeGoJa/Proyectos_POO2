/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 1152228
 */
public class Comentario {
    String texto;
    Fecha fechaCreacion;

    public Comentario() {
    }

    public Comentario(String texto, Fecha fechaCreacion) {
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
