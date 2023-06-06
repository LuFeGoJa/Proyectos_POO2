/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author 57320
 */
public class Test {

    public static void main(String[] args) {
        EventoDiaDelNiño evento = new EventoDiaDelNiño();

        evento.registrarNiño("12345678", "Juan", "Pérez", 10, "987654321");
        evento.registrarNiño("87654321", "María", "Gómez", 15, "123456789");
        evento.registrarNiño("115228", "Sammy", "Gómez", 9, "32099594673");
        evento.registrarNiño("235228", "Luisa", "Gómez", 5, "320995673");
        evento.hacerSorteo();
    }
}