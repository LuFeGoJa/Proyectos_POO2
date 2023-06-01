/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.event.ActionListener;
import Vista.Formulario;
import Model.Operacion;
import java.awt.event.ActionEvent;

/**
 *
 * @author 57320
 */
public class Controlador implements ActionListener {

    private Formulario formulario = null;
    private Operacion operacion = null;

    public Controlador() {

    }

    public Controlador(Formulario formulario, Operacion operacion) {
        super();
        this.formulario = formulario;
        this.operacion = operacion;
        actionListener(this);
    }

    private void actionListener(ActionListener Controlador) {
        System.out.println("Hola");
        formulario.button1Dolar.addActionListener(Controlador);
        formulario.button2Pesos.addActionListener(Controlador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            System.out.println("ggg");
            if (e.getActionCommand().contentEquals("Convertir a Pesos")) {
                System.out.println("ggtttg");
                double dinero = Double.parseDouble(formulario.textField2.getText());
                operacion.setDinero(dinero);
                operacion.setMoneda(5000.0);
                operacion.convertirPesoDolar();
                formulario.textField1Resultado.setText(operacion.getResultado().toString());
            } else if (e.getActionCommand().contentEquals("Convertir a Dolar")) {
                System.out.println("aaa");
                double dinero = Double.parseDouble(formulario.textField2.getText());
                operacion.setDinero(dinero);
                operacion.setMoneda(0.005);
                operacion.convertirDolarPeso();
                formulario.textField1Resultado.setText(operacion.getResultado().toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();

            System.out.println("ggtttt");

        }
    }
}
