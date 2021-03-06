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
import javax.swing.JSlider;

/**
 * formulario diseñado de tipo simple
 *
 * @author Francisco Javier Sánchez Lozano
 */
public class Experimento extends LibGuiReusables.FormularioSimple implements Observador, Validable, Comunicable {

    /**
     * Creates new form Experimento
     */
    public Experimento() {
        initComponents();
    }

    // metodos que se sobrescriben de la interfaz Validable
    @Override
    public Boolean validarCampos() {
        System.out.println("Validar Campos " + this.getClass() + " " + this.getName());

        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo Nombre Experimento no puede estar vacio");
            return (Boolean.FALSE);
        }

        if (jTextNombre1.getText().isEmpty()) {
            jTextNombre1.requestFocus();
            JOptionPane.showMessageDialog(this, "El campo Descripcion Experimento no puede estar vacio");
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

        if ("jSlider1Laboratorio".equals(nombreComponente)) {
            jSpinnerExperimento.setValue((Integer) valor);
        }
        System.out.println("recuperar valor");
    }

    // metodo que se sobrescribe de la interfaz Observador
    @Override
    public void procesarEventoCambiarValor(EventoCambiarValor evt) {

        if (evt.getOrigen() instanceof JSlider) {

            JSlider s = (JSlider) evt.getOrigen();

            if ("jSlider1Laboratorio".equals(s.getName())) {
                recuperarValorExterno("jSlider1Laboratorio", s.getValue());
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
        jLabelNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jTextNombre1 = new javax.swing.JTextField();
        jLabelNombre4 = new javax.swing.JLabel();
        jSpinnerExperimento = new javax.swing.JSpinner();
        jLabelNombre5 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();

        setTitle("Experimento");
        setSize(new java.awt.Dimension(400, 300));

        jLabelNombre.setText("Nombre");

        jLabelNombre1.setText("Descripcion");

        jLabelNombre4.setText("Personas en Experimento");

        jSpinnerExperimento.setName("jSpinnerExperimento"); // NOI18N
        jSpinnerExperimento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerExperimentoStateChanged(evt);
            }
        });

        jLabelNombre5.setText("Duracion");

        jCheckBox1.setText("Supervisor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jSpinnerExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre4)
                    .addComponent(jSpinnerExperimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre5)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerExperimentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerExperimentoStateChanged

        EventoCambiarValor evtCam = new EventoCambiarValor(jSpinnerExperimento);
        getGestorEventos().notificarEvento("CambiarValor", evtCam);
    }//GEN-LAST:event_jSpinnerExperimentoStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinnerExperimento;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    // End of variables declaration//GEN-END:variables

}
