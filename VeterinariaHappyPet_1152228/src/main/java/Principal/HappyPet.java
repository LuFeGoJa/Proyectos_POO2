/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Vista.Veterinaria;
import Controler.Controlador;
import Model.Mascota;
import java.util.ArrayList;

/**
 *
 * @author 57320
 */
public class HappyPet {
    
public static void main(String[] args) {
    Veterinaria ver = new Veterinaria();
    ArrayList<Mascota> lista = new ArrayList();
    Controlador c = new Controlador(ver,lista);
}
}
