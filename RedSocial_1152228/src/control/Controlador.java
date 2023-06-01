/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.Registro;
import modelo.Estudiante;
import modelo.Usuario;
/**
 *
 * @author 1152228
 */
public final class Controlador implements ActionListener {

    private Registro formulario = null;
    private Estudiante estudiante;
    private ArrayList<Usuario> lista = null;

    public Controlador(Registro formulario, Estudiante estudiante, ArrayList<Usuario> lista) {
        this.estudiante = estudiante;
        this.formulario = formulario;
        this.lista = new ArrayList();

        ActionListener(this);

    }

    public void ActionListener(ActionListener controlador) {

        // Conectando los controles
        formulario.btnComentar.addActionListener(controlador);
        formulario.btnLimpiar.addActionListener(controlador);
        formulario.btnRegistrar.addActionListener(controlador);
        formulario.btnMostrar.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("Limpiar Datos")) {
           // System.out.println("Estoy funcionando en limpiar");
            // Obtener lo que hay en la variable dinero
            formulario.txtNombre.setText("");
            formulario.txtApellido.setText("");
            formulario.txtNick.setText("");
            formulario.txtEdad.setText("");
            formulario.txtContraseña.setText("");
            formulario.txtCorreo.setText("");

        } else if (evento.getActionCommand().contentEquals("Registrar Usuario")) {

            JOptionPane.showMessageDialog(null, "Registro exitoso!");
            // Obtenmos lo que hay en los text fields y lo asignamos a nuestra variable

            String nombre = formulario.txtNombre.getText();
            String apellido = formulario.txtApellido.getText();
            String nick = formulario.txtNick.getText();
            int edad = Integer.parseInt(formulario.txtEdad.getText());
            String clave = formulario.txtContraseña.getText();
            String correo = formulario.txtCorreo.getText();

            // Creamos un objeto llamado alumno y le pasamos nuestros parametros
            Estudiante usuarioNuevo = new Estudiante(nombre, apellido, nick, edad, clave, correo);
            // Agregamos al alumno
            lista.add(usuarioNuevo);

        } else if (evento.getActionCommand().contentEquals("Mostrar Datos")) {

           // System.out.println("Estoy funcionando en mostrar datos");
            String codigoBusqueda = formulario.txtContraseña.getText();

            Estudiante estudianteEncontrado;
            estudianteEncontrado = null;
            
            for (int i = 0; i < lista.size(); i++) {
               
                if (codigoBusqueda.equals(lista.get(i).getClaveAcceso())) {
                   
                    Estudiante estudianteBuscar = (Estudiante) lista.get(i);
                  
                    estudianteEncontrado = (Estudiante) estudianteBuscar.buscarUsuario(lista, codigoBusqueda);

                    String nombre = estudianteEncontrado.getNombre();
                    String apellido = estudianteEncontrado.getApellido();
                    String nickName = estudianteEncontrado.getNick();
                    int edad = estudianteEncontrado.getEdad();
                    String clave = estudianteEncontrado.getClaveAcceso();
                    String correo = estudianteEncontrado.getCorreoElectronico();

                    System.out.println(estudianteEncontrado.toString());

                }

            }
        }
    }
}