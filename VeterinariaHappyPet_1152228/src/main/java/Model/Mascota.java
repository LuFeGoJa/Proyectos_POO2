/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 57320
 */
public class Mascota {
    private String codigo;
    private String nombre;
    private String raza;
    private Size tamanio;
    
    public Mascota(){
        
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public Mascota(String codigo, String nombre, String raza, Size tamanio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Size getTamanio() {
        return tamanio;
    }

    public void setTamanio(Size tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + '}';
    }
    public Mascota buscarMascota(ArrayList<Mascota> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Mascota mascota = lista.get(i);

            if (mascota.getCodigo().equals(codigo)) {
                return mascota;
            }

        }
        return null;
    }
    
}
