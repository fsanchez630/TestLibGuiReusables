package TestLibGuiReusables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import LibGuiReusables.*;
import LibGuiReusables.Observador;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class CrearLaboratorio extends FormularioArbol implements Observador {

    private static FormularioExtensible formularioExtensibleArbol;

    private static Laboratorio formularioSimpleD0;
    private static Responsable formularioSimpleD1;

    public FormularioExtensible CrearLaboratorio() {
        initComponents();

        FormularioExtensible retorno;
        FactoriaFormularioExtensible fabricaFormulario = FactoriaFormularioExtensible.getInstancia();
        retorno = fabricaFormulario.crearFormulario(FormularioExtensible.TipoFormulario.ARBOL);
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

    public static FormularioExtensible crearGUI(GestorEventos gesEven) {
        incializar();
        GestorEventos gestorEventos;
        if (gesEven == null) {
            gestorEventos = new GestorEventos();
        } else {
            gestorEventos = gesEven;
        }

        // CREAR FORMULARIO PRINCIPAL
        formularioExtensibleArbol = new CrearLaboratorio();
        formularioExtensibleArbol.setGestorEventos(gestorEventos);
        formularioExtensibleArbol.setnombreContenedor("Laboratorio");
        // crear lista observadores de eventos e incluir el formulario

        formularioSimpleD0 = new Laboratorio();
        formularioSimpleD0.setGestorEventos(gestorEventos);
        formularioSimpleD1 = new Responsable();
        formularioSimpleD1.setGestorEventos(gestorEventos);
        
        formularioExtensibleArbol.getGestorEventos().addObservador("CambiarValor", formularioExtensibleArbol);
        formularioExtensibleArbol.getGestorEventos().addObservador("CambiarValor", formularioSimpleD0);
        formularioExtensibleArbol.getGestorEventos().addObservador("CambiarValor", formularioSimpleD1);

        formularioExtensibleArbol.getGestorEventos().addObservador("SelNodo", formularioExtensibleArbol);

        try {
            formularioExtensibleArbol.addHijoExtensible(formularioSimpleD0, "Laboratorio");
            formularioExtensibleArbol.addHijoExtensible(formularioSimpleD1, "Responsable");
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
        formularioSimpleD1 = null;

    }

    @Override
    public void recuperarValorExterno(String nombreComponente, Object valor) {

        if ("jSpinnerExperimento".equals(nombreComponente)) {
            formularioSimpleD0.recuperarValorExterno(nombreComponente, valor);
        }
        System.out.println("recuperar valor");
    }

    @Override
    public void guardar() {
        super.guardar();
        JOptionPane.showMessageDialog(this, "Se ha guardado el Laboratorio");

    }

}
