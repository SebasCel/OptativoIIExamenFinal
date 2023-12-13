import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CiudadGUI extends javax.swing.JFrame {

    private Connection conn;
    public CiudadGUI() {
        initComponents();
        conn = DatabaseConnection.getConnection();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonborrarciudad = new javax.swing.JButton();
        botonactualizarciudad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        personaslabel = new javax.swing.JLabel();
        personaslabel1 = new javax.swing.JLabel();
        personaslabel2 = new javax.swing.JLabel();
        ciudadlabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labeltxtciudad = new javax.swing.JLabel();
        labeldepartamentociudad = new javax.swing.JLabel();
        txtdepartamentociudad = new javax.swing.JTextField();
        labelpostalciudad = new javax.swing.JLabel();
        txtcodigopostalciudad = new javax.swing.JTextField();
        boxciudad = new javax.swing.JComboBox<>();
        botonguardarciudad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonborrarciudad.setBackground(new java.awt.Color(255, 51, 51));
        botonborrarciudad.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonborrarciudad.setText("Borrar");
        botonborrarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarciudadActionPerformed(evt);
            }
        });

        botonactualizarciudad.setBackground(new java.awt.Color(255, 255, 153));
        botonactualizarciudad.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonactualizarciudad.setText("Actualizar");
        botonactualizarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarciudadActionPerformed(evt);
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

        ciudadlabel.setBackground(new java.awt.Color(234, 234, 234));
        ciudadlabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ciudadlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciudadlabel.setText("CIUDAD:");

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
                    .addComponent(ciudadlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ciudadlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(personaslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labeltxtciudad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labeltxtciudad.setText("Ciudad:");

        labeldepartamentociudad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labeldepartamentociudad.setText("Departamento:");

        txtdepartamentociudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartamentociudadActionPerformed(evt);
            }
        });

        labelpostalciudad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelpostalciudad.setText("Codigo Postal:");

        txtcodigopostalciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigopostalciudadActionPerformed(evt);
            }
        });

        boxciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asuncion", "Lambare", "Luque", "San Lorenzo", "Fernando de la Mora", "Ciudad del Este", "Caacupe" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(labeltxtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(boxciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(70, 70, 70)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeldepartamentociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdepartamentociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigopostalciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelpostalciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltxtciudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldepartamentociudad)
                    .addComponent(labelpostalciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdepartamentociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigopostalciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        botonguardarciudad.setBackground(new java.awt.Color(102, 255, 102));
        botonguardarciudad.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonguardarciudad.setText("Guardar");
        botonguardarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarciudadActionPerformed(evt);
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
                        .addComponent(botonborrarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonguardarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonactualizarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(botonguardarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborrarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonactualizarciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonborrarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarciudadActionPerformed
            try (Connection conn = DatabaseConnection.getConnection()) {
                String nombreCiudad = jComboBox1.getSelectedItem().toString();

                String sql = "DELETE FROM Ciudad WHERE Ciudad = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombreCiudad);                
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                   JOptionPane.showMessageDialog(this, "Ciudad eliminada correctamente.");
               } else {
                   JOptionPane.showMessageDialog(this, "No se encontró ninguna ciudad con ese nombre.");
              }
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }//GEN-LAST:event_botonborrarciudadActionPerformed

    private void botonactualizarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarciudadActionPerformed
            try (Connection conn = DatabaseConnection.getConnection()) {
           String nombreCiudad = boxciudad.getSelectedItem().toString();
           String nuevoDepartamento = txtdepartamentociudad.getText();
           String nuevoCodigoPostal = txtcodigopostalciudad.getText();
           
           String sql = "UPDATE Ciudad SET Departamento = ?, PostalCode = ? WHERE Nombre = ?";
           try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
               pstmt.setString(1, nuevoDepartamento);
               pstmt.setString(2, nuevoCodigoPostal);
               pstmt.setString(3, nombreCiudad);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Ciudad actualizada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ninguna ciudad con ese nombre.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    }//GEN-LAST:event_botonactualizarciudadActionPerformed

    private void txtdepartamentociudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartamentociudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartamentociudadActionPerformed

    private void txtcodigopostalciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigopostalciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigopostalciudadActionPerformed

    private void botonguardarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarciudadActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
            String nombreCiudad = boxciudad.getSelectedItem().toString();
            String departamento = txtdepartamentociudad.getText();
            String codigoPostal = txtcodigopostalciudad.getText();

            String sql = "INSERT INTO Ciudad (Nombre, Departamento, PostalCode) VALUES (?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombreCiudad);
                pstmt.setString(2, departamento);
                pstmt.setString(3, codigoPostal);

                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Ciudad guardada correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_botonguardarciudadActionPerformed

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
            java.util.logging.Logger.getLogger(CiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CiudadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CiudadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizarciudad;
    private javax.swing.JButton botonborrarciudad;
    private javax.swing.JButton botonguardarciudad;
    private javax.swing.JComboBox<String> boxciudad;
    private javax.swing.JLabel ciudadlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labeldepartamentociudad;
    private javax.swing.JLabel labelpostalciudad;
    private javax.swing.JLabel labeltxtciudad;
    private javax.swing.JLabel personaslabel;
    private javax.swing.JLabel personaslabel1;
    private javax.swing.JLabel personaslabel2;
    private javax.swing.JTextField txtcodigopostalciudad;
    private javax.swing.JTextField txtdepartamentociudad;
    // End of variables declaration//GEN-END:variables
}
