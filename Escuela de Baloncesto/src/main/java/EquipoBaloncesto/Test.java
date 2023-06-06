
package EquipoBaloncesto;

/**
 *
 * @author 57320
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escuela escuela = new Escuela();

        escuela.contratarProfesor("123456789", "Juan", "Pérez", "Calle 123", "987654321", 35, 2000, "Masculino",
                "Entrenador", "01/01/1980");
        escuela.contratarAuxiliarContable("987654321", "María", "Gómez", "Avenida 456", "123456789", 30, 1500,
                "Femenino");
        escuela.renovarContratoAdministrador();
    }
}
