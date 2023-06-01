/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 1152228
 */
public class Usuario{

    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String claveAcceso;
    private String correoElectronico;
    private Comentario comentario;

    public Usuario() {

    }
    
    public Usuario(Comentario comentario){
        
        this.comentario = comentario;
    }

    public Usuario(String nombre, String apellido, String nick, int edad, String claveAcceso, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.claveAcceso = claveAcceso;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return """
               Usuario:
               Nombre: """ + nombre
                + "\nApellido: " + apellido
                + "\nNick: " + nick
                + "\nEdad: " + edad
                + "\nClave Acceso: " + claveAcceso
                + "\nCorreo Electronico: " + correoElectronico
                + "\nComentario: " + comentario;
    }

    public Usuario buscarUsuario(ArrayList<Usuario> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario usuario = lista.get(i);
            if (usuario.getClaveAcceso().equals(codigo)) {
                return usuario;
            }

        }
        return null;
    }
    
}
