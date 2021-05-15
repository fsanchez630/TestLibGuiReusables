/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Javi
 */
public class CrearFactoriaPorFichasLista extends FormularioPorFichas implements ActionListener, ChangeListener {

    private static FormularioExtensible formularioExtensible;
    private static FormSimpleDis2 formularioSimpleD0;
    private static FormSimpleDis3 formularioSimpleD1;
    private static ListaObservadoresEventos listaObs;

    /**
     * Creates new form CrearFactoriaSimple
     *
     * @return
     */
    public FormularioExtensible CrearFactoriaPorFichasLista() {
        initComponents();
        
        FormularioExtensible retorno = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.PORFICHAS);
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

        formularioExtensible = new CrearFactoriaPorFichasLista();
        formularioExtensible.setnombreContenedor("Factoria por Fichas con Lista");
        // crear lista observadores de eventos e incluir el formulario
        listaObs = new ListaObservadoresEventos();
        listaObs.nuevoActionListener(formularioExtensible);
        listaObs.nuevoChangeListener(formularioExtensible);

        formularioExtensible.setListaObservadores(listaObs);

        formularioSimpleD0 = new FormSimpleDis2();
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis3();
        formularioSimpleD1.setListaObservadores(listaObs);

        ArrayList<FormularioExtensible> listaHijos;
        listaHijos = new ArrayList<FormularioExtensible>();

        listaHijos.add(formularioSimpleD0);
        listaHijos.add(formularioSimpleD1);

        try {
            formularioExtensible.addListaHijosExtensibles(listaHijos, "Formulario1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensible, e.getMessage());
        }

        formularioExtensible.configurarFormulario(true);
        formularioExtensible.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
   

    
    @Override
    public void stateChanged(ChangeEvent evt) {
        JSpinner s = (JSpinner) evt.getSource();

        formularioSimpleD0.recuperarValorExterno("jSpinner1", s.getValue().toString());

    }

}
