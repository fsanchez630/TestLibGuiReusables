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
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Javi
 */
public class CrearFactoriaArbolLista extends FormularioArbol implements ActionListener, ChangeListener, TreeSelectionListener {

    private static FormularioExtensible formularioExtensibleArbol;
    private static FormSimpleDis0 formularioSimpleD0;
    private static FormSimpleDis1 formularioSimpleD1;
    private static FormSimpleDis2 formularioSimpleD2;
    private static FormSimpleDis3 formularioSimpleD3;
    private static FormSimpleDis4 formularioSimpleD4;
    private static FormSimpleDis5 formularioSimpleD5;
    private static ListaObservadoresEventos listaObs;

    private static ArrayList<FormularioExtensible> listaHijos;

    /**
     * Creates new form CrearFactoriaSimple
     *
     * @return
     */
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

        incializar();
        listaHijos = new ArrayList<FormularioExtensible>();
        formularioExtensibleArbol = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.ARBOL);
        formularioExtensibleArbol.setnombreContenedor("Factoria Arbol con Lista");
        // crear lista observadores de eventos e incluir el formulario
        listaObs = new ListaObservadoresEventos();
        listaObs.nuevoActionListener(formularioExtensibleArbol);
        listaObs.nuevoChangeListener(formularioExtensibleArbol);

        formularioExtensibleArbol.setListaObservadores(listaObs);

        //        agregarFormSimples();
        // agregarFormPorFichas();
        agregarFormPorFichas2();
        try {
            formularioExtensibleArbol.addListaHijosExtensibles(listaHijos, "Lista Hijos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensibleArbol, e.getMessage());
        }

        formularioExtensibleArbol.configurarFormulario();
        formularioExtensibleArbol.setVisible(true);

    }

    private static void incializar() {
        formularioExtensibleArbol = null;
        formularioSimpleD0 = null;
        formularioSimpleD1 = null;
        formularioSimpleD2 = null;
        formularioSimpleD3 = null;
        formularioSimpleD4 = null;
        formularioSimpleD5 = null;
        listaObs = null;;
        listaHijos = null;
    }

    private static void agregarFormSimples() {

        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setnombreContenedor("hijo 1");
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setnombreContenedor("hijo 2");
        formularioSimpleD1.setListaObservadores(listaObs);

        formularioSimpleD2 = new FormSimpleDis2();
        formularioSimpleD2.setnombreContenedor("hijo 3");
        formularioSimpleD2.setListaObservadores(listaObs);

        formularioSimpleD3 = new FormSimpleDis3();
        formularioSimpleD3.setnombreContenedor("hijo 4");
        formularioSimpleD3.setListaObservadores(listaObs);

        listaHijos.add(formularioSimpleD0);
        listaHijos.add(formularioSimpleD1);
        listaHijos.add(formularioSimpleD2);
        listaHijos.add(formularioSimpleD3);

    }

    private static void agregarFormPorFichas() {

//        CREAR FROMULARIO POR FICHAS 1
        FormularioExtensible formularioExtensiblePorFichas = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.PORFICHAS);
        formularioExtensiblePorFichas.setnombreContenedor("FORMULARIO POR FICHAS 1");
        formularioExtensiblePorFichas.setListaObservadores(listaObs);

        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setnombreContenedor("hijo 1");
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setnombreContenedor("hijo 2");
        formularioSimpleD1.setListaObservadores(listaObs);

        try {
            formularioExtensiblePorFichas.addHijoExtensible(formularioSimpleD0, formularioSimpleD0.getnombreContenedor());
            formularioExtensiblePorFichas.addHijoExtensible(formularioSimpleD1, formularioSimpleD1.getnombreContenedor());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensiblePorFichas, e.getMessage());
        }

//        CREAR FROMULARIO POR FICHAS 2        
        FormularioExtensible formularioExtensiblePorFichas2 = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.PORFICHAS);
        formularioExtensiblePorFichas2.setnombreContenedor("FORMULARIO POR FICHAS 2");
        formularioExtensiblePorFichas2.setListaObservadores(listaObs);

        formularioSimpleD2 = new FormSimpleDis2();
        formularioSimpleD2.setnombreContenedor("hijo 3");
        formularioSimpleD2.setListaObservadores(listaObs);

        formularioSimpleD3 = new FormSimpleDis3();
        formularioSimpleD3.setnombreContenedor("hijo 4");
        formularioSimpleD3.setListaObservadores(listaObs);

        try {
            formularioExtensiblePorFichas2.addHijoExtensible(formularioSimpleD2, formularioSimpleD2.getnombreContenedor());
            formularioExtensiblePorFichas2.addHijoExtensible(formularioSimpleD3, formularioSimpleD3.getnombreContenedor());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensiblePorFichas2, e.getMessage());
        }

// AGREGAR FORMULARIOS        
        listaHijos.add(formularioExtensiblePorFichas);
        listaHijos.add(formularioExtensiblePorFichas2);

    }

    private static void agregarFormPorFichas2() {
        //   CREAR FROMULARIO simple 1
        FormularioExtensible formularioExtensibleSimple = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.SIMPLE);
        formularioExtensibleSimple.setnombreContenedor("FORMULARIO SIMPLE");
        formularioExtensibleSimple.setListaObservadores(listaObs);

        formularioSimpleD4 = new FormSimpleDis4();
        formularioSimpleD4.setnombreContenedor("hijo 5");
        formularioSimpleD4.setListaObservadores(listaObs);

        formularioSimpleD5 = new FormSimpleDis5();
        formularioSimpleD5.setnombreContenedor("hijo 6");
        formularioSimpleD5.setListaObservadores(listaObs);

        try {
            formularioExtensibleSimple.addHijoExtensible(formularioSimpleD4, formularioSimpleD4.getnombreContenedor());
            formularioExtensibleSimple.addHijoExtensible(formularioSimpleD5, formularioSimpleD5.getnombreContenedor());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensibleSimple, e.getMessage());
        }

//        CREAR FROMULARIO POR FICHAS 1
        FormularioExtensible formularioExtensiblePorFichas = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.PORFICHAS);
        formularioExtensiblePorFichas.setnombreContenedor("FORMULARIO POR FICHAS 2");
        formularioExtensiblePorFichas.setListaObservadores(listaObs);

        formularioSimpleD0 = new FormSimpleDis0();
        formularioSimpleD0.setnombreContenedor("hijo 1");
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioSimpleD1 = new FormSimpleDis1();
        formularioSimpleD1.setnombreContenedor("hijo 2");
        formularioSimpleD1.setListaObservadores(listaObs);

        try {
            formularioExtensiblePorFichas.addHijoExtensible(formularioSimpleD0, formularioSimpleD0.getnombreContenedor());
            formularioExtensiblePorFichas.addHijoExtensible(formularioSimpleD1, formularioSimpleD1.getnombreContenedor());
            formularioExtensiblePorFichas.addHijoExtensible(formularioExtensibleSimple, formularioExtensibleSimple.getnombreContenedor());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensiblePorFichas, e.getMessage());
        }

//        CREAR FROMULARIO simple       
        FormularioExtensible formularioExtensiblePorFichas2 = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.PORFICHAS);
        formularioExtensiblePorFichas2.setnombreContenedor("FORMULARIO POR FICHAS 1");
        formularioExtensiblePorFichas2.setListaObservadores(listaObs);

        formularioSimpleD2 = new FormSimpleDis2();
        formularioSimpleD2.setnombreContenedor("hijo 3");
        formularioSimpleD2.setListaObservadores(listaObs);

        formularioSimpleD3 = new FormSimpleDis3();
        formularioSimpleD3.setnombreContenedor("hijo 4");
        formularioSimpleD3.setListaObservadores(listaObs);

        try {
            formularioExtensiblePorFichas2.addHijoExtensible(formularioSimpleD2, formularioSimpleD2.getnombreContenedor());
            formularioExtensiblePorFichas2.addHijoExtensible(formularioSimpleD3, formularioSimpleD3.getnombreContenedor());
            formularioExtensiblePorFichas2.addHijoExtensible(formularioExtensiblePorFichas, formularioExtensiblePorFichas.getnombreContenedor());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensiblePorFichas2, e.getMessage());
        }

// AGREGAR FORMULARIOS                
        listaHijos.add(formularioExtensiblePorFichas2);

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
