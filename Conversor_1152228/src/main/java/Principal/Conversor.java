package Principal;


import Control.Controlador;
import Model.Operacion;
import Vista.Formulario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 57320
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Formulario formulario = new Formulario();
        Operacion operacion = new Operacion();
        Controlador controlador = new Controlador(formulario, operacion);
       
    }
    
}
