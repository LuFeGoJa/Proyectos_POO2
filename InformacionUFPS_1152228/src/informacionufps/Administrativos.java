
package informacionufps;

import java.util.Scanner;

public class Administrativos extends Persona {
    
    int anioIngreso;
    
    public Administrativos(){
        
    }
    
    public Administrativos (String nombre, String apellido, int codigo, int anioIngreso){
        super();
        this.anioIngreso=anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    

    
    public static void main(String[] args) {
        int anioActual, anioIngreso, antiguedad;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Ingrese anio actual:");
        anioActual=scanner.nextInt();
        
        System.out.println("\n Ingrese anio de ingreso:");
        anioIngreso=scanner.nextInt();
        
        antiguedad = anioActual-anioIngreso;
        System.out.println("\n Su antiguedad en la organizacion es de " + antiguedad + " anios");
        
    }
    
}
