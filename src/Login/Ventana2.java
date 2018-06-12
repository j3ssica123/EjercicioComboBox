package Login;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame { 

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();
        lblimagenes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("freVentana2"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOpcion.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        lblOpcion.setText("Selecciona Una Opción:");
        lblOpcion.setName(""); // NOI18N

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Imagen 1", "Imagen 2", "Imagen 3" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        lblimagenes.setText("Imagenes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblimagenes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblOpcion)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblimagenes)
                .addGap(54, 54, 54)
                .addComponent(lblOpcion)
                .addGap(18, 18, 18)
                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
            int op = jcbOpciones.getSelectedIndex();
        
        switch (op){
            case 0: JOptionPane.showMessageDialog(null, "No Hay Opción Seleccionada", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("No Hay Opción Seleccionada");
                lblimagenes.setText("No Hay Opción Seleccionada");
            break;
            case 1: JOptionPane.showMessageDialog(null, "Imagen 1", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona La Imagen 1");
                 lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
            
               
            break;
            case 2: JOptionPane.showMessageDialog(null, "Imagen 2", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE); 
                lblOpcion.setText("Selecciona La Imagen 2");
                lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen2.png")));
                
            break;
            case 3: JOptionPane.showMessageDialog(null, "Imagen 3", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona La Imagen 3");
                lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen3.png")));
            break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblimagenes;
    // End of variables declaration//GEN-END:variables
}
