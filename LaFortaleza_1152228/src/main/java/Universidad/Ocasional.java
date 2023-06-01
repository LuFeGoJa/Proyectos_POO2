/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author 57320
 */
public class Ocasional extends Docente {
    double salarioBasico;

    public Ocasional() {
        
    }

    public Ocasional(double salarioBasico, String codigo, String nombre, String titulo, String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

}
