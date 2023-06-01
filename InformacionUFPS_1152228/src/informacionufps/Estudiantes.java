
package informacionufps;

import java.util.Scanner;


public class Estudiantes extends Persona {
    
    String carrera;
    int semestre, creditos;
    
    public Estudiantes(){
        
    }
    
    public Estudiantes(String nombre, String apellido, int codigo, String carrera, int semestre, int creditos){
        super();
        this.carrera=carrera;
        this.creditos=creditos;
        this.semestre=semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingrese numero de creditos aprobados: ");
        int numero = teclado.nextInt();
        System.out.print("Ingrese numero total de creditos de la carrera: ");
        int creditos = teclado.nextInt();
        System.out.print("Porcentaje: ");
        int porcentaje = teclado.nextInt();
        System.out.print("            ");
        
        double resultado = (creditos * porcentaje/100);
        System.out.print("La cantidad corresponde a: " + resultado);
        
        if (numero>=resultado){
            System.out.println("\nEstudiante ya puedes matricular proyecto de grado");
        }else{
            System.out.println("\nEstudiante no puedes matricular proyecto de grado");
        }
    }
    
}
