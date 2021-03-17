/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.*;

/**
 *
 * @author Javi
 */
public class Main {

    private static FormSimpleDis0 formularioSimpleD0;
    private static FormSimpleDis1 formularioSimpleD1;

    private static LibFactoriaFormularios factoriaFormularios;

    private static LibFormularioExtensible formularioExtensible;

    public static void crearFormularioSimple() {
        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD1 = new FormSimpleDis1();

        factoriaFormularios = new LibFactoriaFormularios();

        formularioExtensible = factoriaFormularios.crearFormulario(LibFormularioExtensible.TipoContenedor.SIMPLE);

        formularioExtensible.addHijoExtensible(formularioSimpleD0, "Formulario1");
        formularioExtensible.addHijoExtensible(formularioSimpleD1, "");
        formularioExtensible.configurarFormulario();
        formularioExtensible.setVisible(true);

        

    }

    public static void probarComunicacion() {
        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setVisible(true);
        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setVisible(true);

        formularioSimpleD0.recuperarValorExterno("jSpinner1", "hola");
        formularioSimpleD0.cambiarValor("jCheckBox4", true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearFormularioSimple();

            }
        });
    }

}
