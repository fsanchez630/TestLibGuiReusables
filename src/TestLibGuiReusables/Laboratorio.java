/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.interfaces.Comunicable;
import LibGuiReusables.interfaces.Validable;
import LibGuiReusables.EventoCambiarValor;
import LibGuiReusables.interfaces.Observador;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 * formulario diseñado de tipo simple
 *
 * @author Francisco Javier Sánchez Lozano
 */
public class Laboratorio extends LibGuiReusables.FormularioSimple implements Observador, Validable, Comunicable {

    /**
     * Creates new form Experimento
     */
    public Laboratorio() {
        initComponents();
    }

    // metodos que se sobrescriben de la interfaz Validable
    @Override
    public Boolean validarCampos() {
        System.out.println("Validar Campos " + this.getClass() + " " + this.getName());

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo Nombre Laboratorio no puede estar vacio");
            return (Boolean.FALSE);
        }

        if (jTextNombre1.getText().isEmpty()) {
            jTextNombre1.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo Descripcion Laboratorio no puede estar vacio");
            return (Boolean.FALSE);
        }

        return (Boolean.TRUE);
    }

    @Override
    public void guardarFormulario() {

    }

    @Override
    public void limpiarFormulario() {
        this.dispose();
    }
    
    // metodo que se sobrescribe de la interfaz Comunicable
    @Override
    public void recuperarValorExterno(String nombreComponente, Object valor) {

        if ("jSpinnerExperimento".equals(nombreComponente)) {
            jSlider1Laboratorio.setValue((Integer) valor);
        }
        System.out.println("recuperar valor");
    }

    // metodo que se sobrescribe de la interfaz Observador
    @Override
    public void procesarEventoCambiarValor(EventoCambiarValor evt) {

        if (evt.getOrigen() instanceof JSpinner) {
            JSpinner s = (JSpinner) evt.getOrigen();

            if ("jSpinnerExperimento".equals(s.getName())) {
                recuperarValorExterno("jSpinnerExperimento", s.getValue());
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jTextNombre1 = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextNombre2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jSlider1Laboratorio = new javax.swing.JSlider();
        jLabelPersonas = new javax.swing.JLabel();

        setTitle("Laboratorio");
        setSize(new java.awt.Dimension(450, 250));

        jPanel1.setRequestFocusEnabled(false);

        jLabelNombre.setText("Nombre");

        jLabelNombre1.setText("Descripcion");

        jLabelNombre2.setText("Ubicacion");

        jLabelNombre3.setText("Capacidad");

        jLabelNombre4.setText("Personas en Laboratorio");

        jSlider1Laboratorio.setMaximum(200);
        jSlider1Laboratorio.setValue(0);
        jSlider1Laboratorio.setName("jSlider1Laboratorio"); // NOI18N
        jSlider1Laboratorio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1LaboratorioStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSlider1Laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre2)
                    .addComponent(jTextNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre3))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombre4)
                    .addComponent(jSlider1Laboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1LaboratorioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1LaboratorioStateChanged
        // TODO add your handling code here:
        jLabelPersonas.setText(((Integer) jSlider1Laboratorio.getValue()).toString());
        EventoCambiarValor evtCam = new EventoCambiarValor(jSlider1Laboratorio);
        getGestorEventos().notificarEvento("CambiarValor", evtCam);

    }//GEN-LAST:event_jSlider1LaboratorioStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelPersonas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1Laboratorio;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTextNombre2;
    // End of variables declaration//GEN-END:variables

    

}
