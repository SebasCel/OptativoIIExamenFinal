import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesGUI extends javax.swing.JFrame {

    private Connection conn;
    
    public ClientesGUI() {
        initComponents();
        conn = DatabaseConnection.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        labelingresocliente = new javax.swing.JLabel();
        labelcalificacioncliente = new javax.swing.JLabel();
        txtcalificacioncliente = new javax.swing.JTextField();
        labelestadocliente = new javax.swing.JLabel();
        txtestadocliente = new javax.swing.JTextField();
        txtfechacliente = new javax.swing.JTextField();
        botonborrarcliente = new javax.swing.JButton();
        botonactualizarcliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        personaslabel = new javax.swing.JLabel();
        personaslabel1 = new javax.swing.JLabel();
        personaslabel2 = new javax.swing.JLabel();
        clientelabel = new javax.swing.JLabel();
        botonguardarcliente = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelingresocliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelingresocliente.setText("Fecha de ingreso:");

        labelcalificacioncliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelcalificacioncliente.setText("Calificacion:");

        txtcalificacioncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalificacionclienteActionPerformed(evt);
            }
        });

        labelestadocliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelestadocliente.setText("Estado:");

        txtestadocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoclienteActionPerformed(evt);
            }
        });

        txtfechacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelcalificacioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcalificacioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestadocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelestadocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelingresocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechacliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelingresocliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfechacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcalificacioncliente)
                    .addComponent(labelestadocliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcalificacioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestadocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        botonborrarcliente.setBackground(new java.awt.Color(255, 51, 51));
        botonborrarcliente.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonborrarcliente.setText("Borrar");
        botonborrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarclienteActionPerformed(evt);
            }
        });

        botonactualizarcliente.setBackground(new java.awt.Color(255, 255, 153));
        botonactualizarcliente.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonactualizarcliente.setText("Actualizar");
        botonactualizarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarclienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        personaslabel.setBackground(new java.awt.Color(234, 234, 234));
        personaslabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personaslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personaslabel.setText("Personas:");

        personaslabel1.setBackground(new java.awt.Color(234, 234, 234));
        personaslabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personaslabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personaslabel1.setText("Personas:");

        personaslabel2.setBackground(new java.awt.Color(234, 234, 234));
        personaslabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personaslabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personaslabel2.setText("Personas:");

        clientelabel.setBackground(new java.awt.Color(234, 234, 234));
        clientelabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clientelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientelabel.setText("CLIENTE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personaslabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personaslabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personaslabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(personaslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonguardarcliente.setBackground(new java.awt.Color(102, 255, 102));
        botonguardarcliente.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonguardarcliente.setText("Guardar");
        botonguardarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonborrarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonguardarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonactualizarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonguardarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborrarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonactualizarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtcalificacionclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalificacionclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalificacionclienteActionPerformed

    private void txtestadoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoclienteActionPerformed

    private void botonborrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarclienteActionPerformed
        try {
            String fechaIngreso = txtfechacliente.getText();

            String sql = "DELETE FROM Clientes WHERE FechaIngreso = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, fechaIngreso);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con la fecha de ingreso especificada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }      
    }//GEN-LAST:event_botonborrarclienteActionPerformed

    private void botonactualizarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarclienteActionPerformed
        try {
            String fechaIngreso = txtfechacliente.getText();
            String calificacion = txtcalificacioncliente.getText();
            String estado = txtestadocliente.getText();

            String sql = "UPDATE Clientes SET Calificacion = ?, Estado = ? WHERE FechaIngreso = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, calificacion);
                pstmt.setString(2, estado);
                pstmt.setString(3, fechaIngreso);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con la fecha de ingreso especificada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_botonactualizarclienteActionPerformed

    private void botonguardarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarclienteActionPerformed
        try {
            String fechaIngreso = txtfechacliente.getText();
            String calificacion = txtcalificacioncliente.getText();
            String estado = txtestadocliente.getText();

            String sql = "INSERT INTO Clientes (FechaIngreso, Calificacion, Estado) VALUES (?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, fechaIngreso);
                pstmt.setString(2, calificacion);
                pstmt.setString(3, estado);

                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Cliente guardado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonguardarclienteActionPerformed

    private void txtfechaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaclienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizarcliente;
    private javax.swing.JButton botonborrarcliente;
    private javax.swing.JButton botonguardarcliente;
    private javax.swing.JLabel clientelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelcalificacioncliente;
    private javax.swing.JLabel labelestadocliente;
    private javax.swing.JLabel labelingresocliente;
    private javax.swing.JLabel personaslabel;
    private javax.swing.JLabel personaslabel1;
    private javax.swing.JLabel personaslabel2;
    private javax.swing.JTextField txtcalificacioncliente;
    private javax.swing.JTextField txtestadocliente;
    private javax.swing.JTextField txtfechacliente;
    // End of variables declaration//GEN-END:variables
}
