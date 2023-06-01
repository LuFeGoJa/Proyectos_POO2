/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 57320
 */
public class Servicio {
    String tipo, tamanio;
    int costo=0;
    
    public Servicio(){
        
    }

    public Servicio(String tipo, String tamanio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int calcularCosto() {
    switch (tipo) {
        case "Baño Completo" -> {
            switch (tamanio) {
                case "PEQUEÑO" -> costo += 15000;
                case "MEDIANO" -> costo += 25000;
                case "GRANDE" -> costo += 30000;
            }
            }

        case "Aplicación Vacunas" -> costo += 5000;
        
        case "Corte Pelo" -> {
            switch (tamanio) {
                case "PEQUEÑO" -> costo += 5000;
                case "MEDIANO" -> costo += 10000;
                case "GRANDE" -> costo += 15000;
            }
            }

        case "Corte Uñas" -> {
            switch (tamanio) {
                case "PEQUEÑO" -> costo += 2000;
                case "MEDIANO" -> costo += 4000;
                case "GRANDE" -> costo += 6000;
            }
            }

    }
    return costo;
    }

}
