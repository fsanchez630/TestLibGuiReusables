/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Javi
 */
public class CrearFactoriaArbol extends FormularioArbol implements ActionListener, ChangeListener {

    private static FormularioExtensible formularioExtensible;
    private static FactoriaFormularios factoriaFormularios;
    private static FormSimpleDis0 formularioSimpleD0;
    private static FormSimpleDis1 formularioSimpleD1;
    private static ListaObservadoresEventos listaObs;

    public FormularioExtensible CrearFactoriaArbol() {
        initComponents();

        factoriaFormularios = new FactoriaFormularios();

        FormularioExtensible retorno;
        retorno = factoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.ARBOL);
        return retorno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void crearGUI() {

        formularioExtensible = new CrearFactoriaArbol();
        
        formularioExtensible.setnombreContenedor("Factoria ARBOL");

        // crear lista observadores de eventos e incluir el formulario
        listaObs = new ListaObservadoresEventos();
        listaObs.nuevoActionListener(formularioExtensible);
        listaObs.nuevoChangeListener(formularioExtensible);

        formularioExtensible.setListaObservadores(listaObs);

        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setListaObservadores(listaObs);

        try {
            formularioExtensible.addHijoExtensible(formularioSimpleD0, "Formulario1");
            formularioExtensible.addHijoExtensible(formularioSimpleD1, "Formulario2");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensible, e.getMessage());
        }

        formularioExtensible.configurarFormulario();
        formularioExtensible.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    

   

    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Botón pulsado: " + evt.getActionCommand());
        if (evt.getActionCommand().equals("Aceptar")) {
            aceptar();
        } else if (evt.getActionCommand().equals("Cancelar")) {
            cancelar();
        }
    }

    @Override
    public void stateChanged(ChangeEvent evt) {
        JSpinner s = (JSpinner) evt.getSource();

        formularioSimpleD0.recuperarValorExterno("jSpinner1", s.getValue().toString());

    }

}
