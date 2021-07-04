package TestLibGuiReusables;

import LibGuiReusables.FormularioExtensible;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private static MenuPrincipal menuPrincipal;

    private static FormularioExtensible formularioPruebaBasica;

    private static FormularioExtensible formularioPruebaAmpliada;

    private static FormularioExtensible formularioLaboratorio;

    private static FormularioExtensible formularioExperimento;

    public MenuPrincipal() {
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
        botonSalir = new javax.swing.JButton();
        botonCrearPruebaAmpliada = new javax.swing.JButton();
        botonCrearPruebaBasica = new javax.swing.JButton();
        botonCrearLaboratorio = new javax.swing.JButton();
        botonCrearExperimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonCrearPruebaAmpliada.setText("Crear Prueba Ampliada");
        botonCrearPruebaAmpliada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPruebaAmpliadaActionPerformed(evt);
            }
        });

        botonCrearPruebaBasica.setText("Crear Prueba Basica");
        botonCrearPruebaBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPruebaBasicaActionPerformed(evt);
            }
        });

        botonCrearLaboratorio.setText("Crear Laboratorio");
        botonCrearLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearLaboratorioActionPerformed(evt);
            }
        });

        botonCrearExperimento.setText("Crear Experimento");
        botonCrearExperimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearExperimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCrearPruebaBasica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCrearLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(botonCrearPruebaAmpliada, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCrearExperimento, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonCrearPruebaBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrearPruebaAmpliada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrearLaboratorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrearExperimento)
                .addGap(68, 68, 68)
                .addComponent(botonSalir)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonCrearPruebaAmpliadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPruebaAmpliadaActionPerformed
        desactivarBotones();
        formularioPruebaAmpliada = CrearPruebaAmpliada.crearGUI(null);
        formularioPruebaAmpliada.setHayBotones(true); // con botones
        formularioPruebaAmpliada.configurarFormulario();
        formularioPruebaAmpliada.setVisible(true);

    }//GEN-LAST:event_botonCrearPruebaAmpliadaActionPerformed

    private void botonCrearPruebaBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPruebaBasicaActionPerformed
        desactivarBotones();
        formularioPruebaBasica = CrearPruebaBasica.crearGUI(null);
        formularioPruebaBasica.setHayBotones(true);  // con botones
        formularioPruebaBasica.configurarFormulario();
        formularioPruebaBasica.setVisible(true);
    }//GEN-LAST:event_botonCrearPruebaBasicaActionPerformed

    private void botonCrearLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearLaboratorioActionPerformed
        desactivarBotones();
        formularioLaboratorio = CrearLaboratorio.crearGUI(null);
        formularioLaboratorio.setHayBotones(true);  // con botones
        formularioLaboratorio.configurarFormulario();
        formularioLaboratorio.setVisible(true);
    }//GEN-LAST:event_botonCrearLaboratorioActionPerformed

    private void botonCrearExperimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearExperimentoActionPerformed
        desactivarBotones();

        formularioExperimento = CrearExperimento.crearGUI(null);
        formularioExperimento.setHayBotones(true);  // con botones
        formularioExperimento.configurarFormulario();
        formularioExperimento.setVisible(true);

    }//GEN-LAST:event_botonCrearExperimentoActionPerformed

    private void desactivarBotones() {
        /*
        menuPrincipal.botonCrearFactoriaSimple.setEnabled(false);
        menuPrincipal.botonCrearFactoriaSimpleLista.setEnabled(false);
        menuPrincipal.botonCrearFactoriaPorFichas.setEnabled(false);        
        menuPrincipal.botonCrearFactoriaPorFichasLista.setEnabled(false);
        menuPrincipal.botonCrearFactoriaArbol.setEnabled(false);
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearExperimento;
    private javax.swing.JButton botonCrearLaboratorio;
    private javax.swing.JButton botonCrearPruebaAmpliada;
    private javax.swing.JButton botonCrearPruebaBasica;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
