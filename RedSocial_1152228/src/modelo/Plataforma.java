/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 1152228
 */
public class Plataforma {
    public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    
    public void registrarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "USUARIO GUARDADO CON EXITO.");
    }
    
    
}
