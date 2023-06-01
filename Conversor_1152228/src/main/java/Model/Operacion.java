/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 57320
 */
public class Operacion {
    private Double moneda;
    private Double dinero;
    private Double resultado;
    
    public Operacion(){
        
    }

    public Operacion(Double moneda, Double dinero, Double resultado) {
        this.moneda = moneda;
        this.dinero = dinero;
        this.resultado = resultado;
    }

    public Double getMoneda() {
        return moneda;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    
    public void convertirDolarPeso(){
        resultado=dinero*moneda;
    }
    
    public void convertirPesoDolar(){
        resultado=dinero*moneda;
    }
    
    
}
