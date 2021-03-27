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
public class CrearFactoriaPorFichas extends LibFormularioPorFichas implements ActionListener, ChangeListener {

    private static LibFormularioExtensible formularioExtensible;
    private static LibFactoriaFormularios factoriaFormularios;
    private static FormSimpleDis0 formularioSimpleD0;
    private static FormSimpleDis1 formularioSimpleD1;
    private static LibListaObservadoresEventos listaObs;

    /**
     * Creates new form CrearFactoriaSimple
     *
     * @return
     */
    public LibFormularioExtensible CrearFactoriaPorFichas() {
        initComponents();

        factoriaFormularios = new LibFactoriaFormularios();

        LibFormularioExtensible retorno = factoriaFormularios.crearFormulario(LibFormularioExtensible.TipoContenedor.PORFICHAS, "Factoria Por Fichas");
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

        
        formularioExtensible = new CrearFactoriaPorFichas();

        // crear lista observadores de eventos e incluir el formulario
        listaObs = new LibListaObservadoresEventos();
        listaObs.nuevoActionListener(formularioExtensible);
        listaObs.nuevoChangeListener(formularioExtensible);

        formularioExtensible.setListaObservadores(listaObs);

        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setListaObservadores(listaObs);
        
        try{
        formularioExtensible.addHijoExtensible(formularioSimpleD0, "Formulario1");
        formularioExtensible.addHijoExtensible(formularioSimpleD1, "Formulario2");
        } catch (Exception e) {            
           JOptionPane.showMessageDialog(formularioExtensible,e.getMessage());                    
        }

        formularioExtensible.configurarFormulario();
        formularioExtensible.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void aceptar() {
        System.out.println("aceptar");
    }

    @Override
    public void cancelar() {
        System.out.println("cancelar");
    }

    @Override
    public void cambiarValor(String nombreComponente, Object valor) {
        System.out.println("cambiar valor");
    }

    @Override
    public void recuperarValorExterno(String nombreComponente, Object valor) {
        System.out.println("recuperar valor externo");
    }

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
