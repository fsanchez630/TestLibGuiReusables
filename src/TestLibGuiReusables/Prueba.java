/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.LibFactoriaFormularios;
import LibGuiReusables.LibFormularioExtensible;
import LibGuiReusables.LibListaObservadoresEventos;

/**
 *
 * @author Javi
 */
public class Prueba {

    private static LibFormularioExtensible formularioExtensible;
    private static LibFactoriaFormularios factoriaFormularios;
    private static FormSimpleDis0 formularioSimpleD0;
    private static FormSimpleDis1 formularioSimpleD1;
    private static LibListaObservadoresEventos observadorEventos;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        factoriaFormularios = new LibFactoriaFormularios();

        formularioExtensible = factoriaFormularios.crearFormulario(LibFormularioExtensible.TipoContenedor.PORFICHAS,"Factoria por Fichas");

        observadorEventos = new LibListaObservadoresEventos();
        observadorEventos.nuevoActionListener(formularioExtensible);
        observadorEventos.nuevoChangeListener(formularioExtensible);

        formularioSimpleD0 = new FormSimpleDis0(observadorEventos);
        formularioSimpleD1 = new FormSimpleDis1(observadorEventos);

        formularioExtensible.addHijoExtensible(formularioSimpleD0, "Formulario0");
        formularioExtensible.addHijoExtensible(formularioSimpleD1, "Formulario1");

        formularioExtensible.configurarFormulario();
        formularioExtensible.setVisible(true);

    }

}
