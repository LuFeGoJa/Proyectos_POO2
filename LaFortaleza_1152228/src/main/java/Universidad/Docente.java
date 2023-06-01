/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.Scanner;

/**
 *
 * @author 57320
 */
public class Docente {
    String codigo, nombre, titulo, departamento;
    
    public Docente(){
        
    }

    public Docente(String codigo, String nombre, String titulo, String departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int tipoDocente;
       double salarioBasico;
       System.out.println("Ingrese tipo de docente: ");
       tipoDocente=entrada.nextInt();
       System.out.println("Ingrese salario basico: ");
       salarioBasico=entrada.nextInt();
       
        //tipo 1= ocasional;
        //tipo 2= planta;
        //tipo 3= catedratico;
        switch (tipoDocente) {
            case 1 -> {
                double salarioOcasional;
                salarioOcasional=salarioBasico;
                System.out.println("El salario del docente ocasional es: "+salarioOcasional);
                break;
            }
            case 2 -> {
                double salarioPlanta;
                int puntosSalariales;
                double valorPunto=16.441;
                System.out.println("Ingrese puntos salariales: ");
                puntosSalariales=entrada.nextInt();
                salarioPlanta=(puntosSalariales*valorPunto)+salarioBasico;
                System.out.println("El salario del docente de planta es: "+salarioPlanta);
                break;
            }
            default -> {
                float salarioCatedratico;
                int horasSemanal;
                int categoria;
                System.out.println("Ingrese categoria del docente catedratico: ");
                categoria=entrada.nextInt();
                System.out.println("Ingrese horas trabajadas en la semana: ");
                horasSemanal=entrada.nextInt();
                
           switch (categoria) {
               case 1 ->                    {
                       double valorHora=20.000;
                       salarioCatedratico=(float) (valorHora*horasSemanal);
                       System.out.println("El salario del docente catedratico es: "+salarioCatedratico);
                       break;
                   }
               case 2 ->                    {
                       double valorHora=30.000;
                       salarioCatedratico=(float) (valorHora*horasSemanal);
                       System.out.println("El salario del docente catedratico es: "+salarioCatedratico);
                       break;
                   }
               case 3 ->                    {
                       double valorHora=40.000;
                       salarioCatedratico=(float) (valorHora*horasSemanal);
                       System.out.println("El salario del docente catedratico es: "+salarioCatedratico);
                       break;
                   }
           }
                }
            }
        
    }
}
    
