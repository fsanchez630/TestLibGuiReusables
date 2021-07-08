package TestLibGuiReusables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import LibGuiReusables.*;
import LibGuiReusables.Observador;

import javax.swing.JOptionPane;

import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Javi
 */
public class CrearExperimento extends FormularioArbol implements Observador {

    private static FormularioExtensible formularioExtensibleArbol;

    private static Experimento formularioSimpleD0;

    private static FormularioExtensible formularioPruebaBasica;
    private static FormularioExtensible formularioPruebaAmpliada;
    private static FormularioExtensible formularioLaboratorio;

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
     * @return
     */
    public static FormularioExtensible crearGUI() {
        incializar();

        // CREAR FORMULARIO PRINCIPAL
        formularioExtensibleArbol = new CrearExperimento();

        formularioExtensibleArbol.setnombreContenedor("Experimento");

        formularioSimpleD0 = new Experimento();

        formularioPruebaBasica = CrearPruebaBasica.crearGUI();
        formularioPruebaBasica.setHayBotones(false); // sin botones
        formularioPruebaBasica.configurarFormulario();

        formularioPruebaAmpliada = CrearPruebaAmpliada.crearGUI();
        formularioPruebaAmpliada.setHayBotones(false); // sin botones
        formularioPruebaAmpliada.configurarFormulario();

        formularioLaboratorio = CrearLaboratorio.crearGUI();
        formularioLaboratorio.setHayBotones(false); // sin botones
        formularioLaboratorio.configurarFormulario();

        FormularioExtensible.getGestorEventos().addObservador("CambiarValor", formularioExtensibleArbol);
        FormularioExtensible.getGestorEventos().addObservador("CambiarValor", formularioSimpleD0);
        FormularioExtensible.getGestorEventos().addObservador("CambiarValor", formularioPruebaBasica);
        FormularioExtensible.getGestorEventos().addObservador("CambiarValor", formularioPruebaAmpliada);
        FormularioExtensible.getGestorEventos().addObservador("CambiarValor", formularioLaboratorio);
        
        FormularioExtensible.getGestorEventos().addObservador("SelNodo", formularioExtensibleArbol);

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

    }

    @Override
    public void guardar() {

        super.guardar();
        JOptionPane.showMessageDialog(this, "Se ha guardado el Experimento");

    }

}
