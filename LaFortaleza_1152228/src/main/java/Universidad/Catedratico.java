/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author 57320
 */
public class Catedratico extends Docente {
    
    int numeroContratoSemestral, numeroHorasSemanal;
    double valorHora;
    
    public Catedratico(){
        
    }

    public Catedratico(int numeroContratoSemestral, int numeroHorasSemanal, double valorHora, String codigo, String nombre, String titulo, String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.numeroContratoSemestral = numeroContratoSemestral;
        this.numeroHorasSemanal = numeroHorasSemanal;
        this.valorHora = valorHora;
    }

    public int getNumeroContratoSemestral() {
        return numeroContratoSemestral;
    }

    public void setNumeroContratoSemestral(int numeroContratoSemestral) {
        this.numeroContratoSemestral = numeroContratoSemestral;
    }

    public int getNumeroHorasSemanal() {
        return numeroHorasSemanal;
    }

    public void setNumeroHorasSemanal(int numeroHorasSemanal) {
        this.numeroHorasSemanal = numeroHorasSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
