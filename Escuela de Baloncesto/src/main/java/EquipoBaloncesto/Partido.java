/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Partido {
    
    String marcador, nombreArbitro, hora, equipoContrincante;
    double valorArbitraje;
    
    public Partido(){
        
    }

    public Partido(String marcador, String nombreArbitro, String hora, String equipoContrincante, double valorArbitraje) {
        this.marcador = marcador;
        this.nombreArbitro = nombreArbitro;
        this.hora = hora;
        this.equipoContrincante = equipoContrincante;
        this.valorArbitraje = valorArbitraje;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEquipoContrincante() {
        return equipoContrincante;
    }

    public void setEquipoContrincante(String equipoContrincante) {
        this.equipoContrincante = equipoContrincante;
    }

    public double getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(double valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }

    void add(Partido partido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
