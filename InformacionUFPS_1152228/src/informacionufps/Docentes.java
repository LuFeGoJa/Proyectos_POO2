package informacionufps;

import java.util.Scanner;

public class Docentes extends Persona {
    
    String profesion;
    double salario, peso, estatura;
    
    public Docentes(){
        }
    
    public Docentes(String nombre, String apellido, int codigo, String profesion, double salario, double peso, double estatura){
        super();
        this.profesion=profesion;
        this.salario=salario;
        this.estatura=estatura;
        this.peso=peso;
    }

    public String getProfesion() {
        return profesion;
    }

    public double getSalario() {
        return salario;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        double peso,estatura,IMC;
       
        System.out.println("Cual es su peso ");
        peso= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        estatura= teclado.nextDouble();
       
        IMC = peso/(estatura*estatura);
        System.out.println("SU IMC ES: " + IMC);
         
        if (IMC<18.5) {
            System.out.println("Peso inferior al normal");
        } else if (IMC >=18.5 && IMC <=24.9) {
            System.out.println("Normal");
        } else if (IMC >=25 && IMC <=29.9) {
            System.out.println("Peso superior al normal");
        } else {
            System.out.println("Obesidad");
        }
    }
    
}
