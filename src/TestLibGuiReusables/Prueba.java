/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLibGuiReusables;

import LibGuiReusables.Comunicable;
import LibGuiReusables.Validable;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Javi
 */
public class Prueba extends LibGuiReusables.FormularioSimple implements ActionListener, ChangeListener,Validable, Comunicable {

    /**
     * Creates new form Prueba
     */
    public Prueba() {
        initComponents();
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
        jLabelCodigo = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabelPresion = new javax.swing.JLabel();
        jLabelTemperatura = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jSpinnerPresion = new javax.swing.JSpinner();
        jSpinnerTemperatura = new javax.swing.JSpinner();
        jSpinnerTiempo = new javax.swing.JSpinner();

        setTitle("Prueba");
        setSize(new java.awt.Dimension(400, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));

        jLabelNombre.setLabelFor(jTextNombre);
        jLabelNombre.setText("Nombre");

        jLabelCodigo.setLabelFor(jTextCodigo);
        jLabelCodigo.setText("Código");

        jLabelPresion.setLabelFor(jSpinnerPresion);
        jLabelPresion.setText("Presion");

        jLabelTemperatura.setLabelFor(jSpinnerTemperatura);
        jLabelTemperatura.setText("Temperatura");

        jLabelTiempo.setLabelFor(jSpinnerTiempo);
        jLabelTiempo.setText("Tiempo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCodigo)
                                .addComponent(jLabelNombre)
                                .addComponent(jLabelPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTemperatura)
                            .addComponent(jLabelTiempo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPresion)
                    .addComponent(jSpinnerPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura)
                    .addComponent(jSpinnerTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTiempo)
                    .addComponent(jSpinnerTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

     @Override
    public Boolean validarCampos() {
        System.out.println("Validar Campos " + this.getClass() + " " + this.getName());
        return (Boolean.TRUE);
    }

    @Override
    public void guardar() {
        System.out.println("guardar " + this.getClass() + " " + this.getName());

       

    }

    @Override
    public void limpiar() {
        System.out.println("limpiar " + this.getClass() + " " + this.getName());

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPresion;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerPresion;
    private javax.swing.JSpinner jSpinnerTemperatura;
    private javax.swing.JSpinner jSpinnerTiempo;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
