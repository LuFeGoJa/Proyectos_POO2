/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 1152228
 */
public class Grupo {
    String nombre,descripcion,tipoGrupo;
    Noticia noticia;
    Usuario Propietario;

    public Grupo() {
    }

    public Grupo(String nombre, String descripcion, String tipoGrupo, Noticia noticia, Usuario Propietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoGrupo = tipoGrupo;
        this.noticia = noticia;
        this.Propietario = Propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoGrupo() {
        return tipoGrupo;
    }

    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public Usuario getPropietario() {
        return Propietario;
    }

    public void setPropietario(Usuario Propietario) {
        this.Propietario = Propietario;
    }
    
}
