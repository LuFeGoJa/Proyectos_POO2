/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import control.Control;
import vista.Vista;
import Modelo.Feligres;
import java.util.ArrayList;


public class Principal {

    private Vista vista;

    public static void main(String[] args) {
        Vista vista = new Vista();
        Feligres feligres = new Feligres();
        ArrayList<Feligres> lista = new ArrayList<>();
        Control cl = new Control(vista, feligres, lista);
    }
}
