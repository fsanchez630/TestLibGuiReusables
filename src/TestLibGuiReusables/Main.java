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
    private static FormSimpleDis0 formularioSimpleD2;
    private static FormSimpleDis1 formularioSimpleD3;

    
    private static LibFactoriaFormularios factoriaFormularios;

    private static LibFormularioExtensible formularioExtensible;

    public static void main(String args[]) {
        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD2 = new FormSimpleDis0();
        formularioSimpleD3 = new FormSimpleDis1();

        factoriaFormularios = new LibFactoriaFormularios();

        formularioExtensible = factoriaFormularios.crearFormulario(LibFormularioExtensible.TipoContenedor.SIMPLE);

        formularioExtensible.addHijoExtensible(formularioSimpleD0, formularioSimpleD0.getTitle());
        formularioExtensible.addHijoExtensible(formularioSimpleD1, "");
        formularioExtensible.addHijoExtensible(formularioSimpleD2, formularioSimpleD0.getTitle());
        formularioExtensible.addHijoExtensible(formularioSimpleD3, "");
        formularioExtensible.configurarFormulario();
        formularioExtensible.setVisible(true);
    }

}
