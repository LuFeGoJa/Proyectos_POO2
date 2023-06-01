package Principal;

import controlador.Control;
import java.sql.SQLException;
import vista.Formulario_1;

public class Consulta {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Formulario_1 vista = new Formulario_1();
        
        Control control = new Control(vista);

        /*SwingUtilities.invokeLater(() -> {
            Voto votos = new Voto();
        });*/
    }
}
