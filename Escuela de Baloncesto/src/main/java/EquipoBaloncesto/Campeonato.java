/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Campeonato {
    
    int numeroCampeonato;
    String fecha, horaInicio, horaFin, lugar;
    
    public Campeonato(){
        
    }

    public Campeonato(int numeroCampeonato, String fecha, String horaInicio, String horaFin, String lugar) {
        this.numeroCampeonato = numeroCampeonato;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
    }

    public int getNumeroCampeonato() {
        return numeroCampeonato;
    }

    public void setNumeroCampeonato(int numeroCampeonato) {
        this.numeroCampeonato = numeroCampeonato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public void agregarPartido(Partido partido) {
        partido.add(partido);
    }
    
}
