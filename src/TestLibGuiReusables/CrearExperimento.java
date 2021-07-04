package TestLibGuiReusables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import LibGuiReusables.*;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Javi
 */
public class CrearExperimento extends FormularioArbol implements ActionListener, ChangeListener, TreeSelectionListener {

    private static FormularioExtensible formularioExtensibleArbol;

    private static Experimento formularioSimpleD0;

    private static FormularioExtensible formularioPruebaBasica;
    private static FormularioExtensible formularioPruebaAmpliada;
    private static FormularioExtensible formularioLaboratorio;

    private static ListaObservadoresEventos listaObs;

    public FormularioExtensible CrearExperimento() {
        initComponents();

        FormularioExtensible retorno;
        retorno = FactoriaFormularios.crearFormulario(FormularioExtensible.TipoContenedor.ARBOL);
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

    /**
     *
     * @param lisObserv
     * @return
     */
    public static FormularioExtensible crearGUI(ListaObservadoresEventos lisObserv) {
        incializar();

        // CREAR FORMULARIO PRINCIPAL
        formularioExtensibleArbol = new CrearExperimento();

        formularioExtensibleArbol.setnombreContenedor("Experimento");
        // crear lista observadores de eventos e incluir el formulario
        if (lisObserv != null) {
            listaObs = lisObserv;
        } else {
            listaObs = new ListaObservadoresEventos();
            listaObs.nuevoActionListener(formularioExtensibleArbol);
            listaObs.nuevoChangeListener(formularioExtensibleArbol);
        }

        formularioExtensibleArbol.setListaObservadores(listaObs);

        formularioSimpleD0 = new Experimento();
        formularioSimpleD0.setListaObservadores(listaObs);

        formularioPruebaBasica = CrearPruebaBasica.crearGUI(listaObs);
        //formularioPruebaBasica.setListaObservadores(listaObs);
        formularioPruebaBasica.setHayBotones(false); // sin botones
        formularioPruebaBasica.configurarFormulario();

        formularioPruebaAmpliada = CrearPruebaAmpliada.crearGUI(listaObs);
        // formularioPruebaAmpliada.setListaObservadores(listaObs);
        formularioPruebaAmpliada.setHayBotones(false); // sin botones
        formularioPruebaAmpliada.configurarFormulario();

        formularioLaboratorio = CrearLaboratorio.crearGUI(listaObs);
        //formularioLaboratorio.setListaObservadores(listaObs);
        formularioLaboratorio.setHayBotones(false); // sin botones
        formularioLaboratorio.configurarFormulario();

        try {
            formularioExtensibleArbol.addHijoExtensible(formularioSimpleD0, "Experimento");
            formularioExtensibleArbol.addHijoExtensible(formularioPruebaBasica, "Prueba Basica");
            formularioExtensibleArbol.addHijoExtensible(formularioPruebaAmpliada, "Prueba Ampliada");
            formularioExtensibleArbol.addHijoExtensible(formularioLaboratorio, "Laboratorio");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(formularioExtensibleArbol, e.getMessage());
        }

        return (formularioExtensibleArbol);
        //formularioExtensibleArbol.configurarFormulario(true);
        //formularioExtensibleArbol.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private static void incializar() {

        formularioExtensibleArbol = null;

        formularioSimpleD0 = null;

        listaObs = null;

    }

    @Override
    public void stateChanged(ChangeEvent evt) {

        if (evt.getSource() instanceof JSpinner) {
            JSpinner s = (JSpinner) evt.getSource();

            if ("jSpinnerExperimento".equals(s.getName())) {
                formularioLaboratorio.recuperarValorExterno("jSpinnerExperimento", s.getValue());
            }

        }

        if (evt.getSource() instanceof JSlider) {

            JSlider s = (JSlider) evt.getSource();

            if ("jSlider1Laboratorio".equals(s.getName())) {
                formularioSimpleD0.recuperarValorExterno("jSlider1Laboratorio", s.getValue());
            }
        }

    }

    @Override
    public void guardar() {

        super.guardar();
        JOptionPane.showMessageDialog(this, "Se ha guardado el Experimento");

    }

}
