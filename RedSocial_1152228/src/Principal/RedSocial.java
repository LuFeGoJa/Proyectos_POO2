/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import control.Controlador;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import vista.Registro;

/**
 *
 * @author 1152228
 */
public class RedSocial {
    private Usuario usuarioRegistro;

    public static void main(String[] args) {
        Registro ver = new Registro();
        Estudiante estudiante = new Estudiante();
        ArrayList<Usuario> lista = new ArrayList();
        
        Controlador c = new Controlador(ver, estudiante, lista);
    }
    
}
