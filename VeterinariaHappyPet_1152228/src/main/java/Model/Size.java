/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 57320
 */
public enum Size {
    
    PEQUEÑO (15000, 5000, 5000, 2000),
    MEDIANO (25000, 5000, 10000, 4000),
    GRANDE (30000, 5000, 15000, 6000);
    
    private int precioBañoCompleto;
    private int precioAplicacionVacunas;
    private int precioCortePelo;
    private int precioCorteUñas;

    Size(int precioBañoCompleto, int precioAplicacionVacunas, int precioCortePelo, int precioCorteUñas) {
        this.precioBañoCompleto = precioBañoCompleto;
        this.precioAplicacionVacunas = precioAplicacionVacunas;
        this.precioCortePelo = precioCortePelo;
        this.precioCorteUñas = precioCorteUñas;
    }

    public int getPrecioBañoCompleto() {
        return precioBañoCompleto;
    }

    public void setPrecioBañoCompleto(int precioBañoCompleto) {
        this.precioBañoCompleto = precioBañoCompleto;
    }

    public int getPrecioAplicacionVacunas() {
        return precioAplicacionVacunas;
    }

    public void setPrecioAplicacionVacunas(int precioAplicacionVacunas) {
        this.precioAplicacionVacunas = precioAplicacionVacunas;
    }

    public int getPrecioCortePelo() {
        return precioCortePelo;
    }

    public void setPrecioCortePelo(int precioCortePelo) {
        this.precioCortePelo = precioCortePelo;
    }

    public int getPrecioCorteUñas() {
        return precioCorteUñas;
    }

    public void setPrecioCorteUñas(int precioCorteUñas) {
        this.precioCorteUñas = precioCorteUñas;
    }
    
}
