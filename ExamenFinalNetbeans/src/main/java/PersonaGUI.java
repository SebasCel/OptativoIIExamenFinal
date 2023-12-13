import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaGUI extends javax.swing.JFrame {

    
    private Connection conn;    
    public PersonaGUI() {
        initComponents();
        conn = DatabaseConnection.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        personaslabel = new javax.swing.JLabel();
        personaslabel1 = new javax.swing.JLabel();
        personaslabel2 = new javax.swing.JLabel();
        personaslabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombrepersonas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapepersonas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumdocpersonas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxdocumentopersonas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtdireccionpersonas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcelularpersonas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtemailpersonas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boxestadopersonas = new javax.swing.JComboBox<>();
        botonguardarpersonas = new javax.swing.JButton();
        botonborrarpersonas = new javax.swing.JButton();
        botonactualizarpersonas = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

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

        personaslabel3.setBackground(new java.awt.Color(234, 234, 234));
        personaslabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personaslabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personaslabel3.setText("PERSONAS:");

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
                    .addComponent(personaslabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personaslabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(personaslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        txtnombrepersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrepersonasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Apellido:");

        txtapepersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapepersonasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Nro de documento:");

        txtnumdocpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdocpersonasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de documento:");

        boxdocumentopersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CI", "RUC" }));
        boxdocumentopersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdocumentopersonasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Dirección:");

        txtdireccionpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionpersonasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Celular:");

        txtcelularpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularpersonasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Email:");

        txtemailpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailpersonasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        boxestadopersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Soltero" }));
        boxestadopersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxestadopersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombrepersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(boxdocumentopersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumdocpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapepersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccionpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelularpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxestadopersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapepersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumdocpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombrepersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcelularpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxdocumentopersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccionpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemailpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxestadopersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        botonguardarpersonas.setBackground(new java.awt.Color(102, 255, 102));
        botonguardarpersonas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonguardarpersonas.setText("Guardar");
        botonguardarpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarpersonasActionPerformed(evt);
            }
        });

        botonborrarpersonas.setBackground(new java.awt.Color(255, 51, 51));
        botonborrarpersonas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonborrarpersonas.setText("Borrar");
        botonborrarpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarpersonasActionPerformed(evt);
            }
        });

        botonactualizarpersonas.setBackground(new java.awt.Color(255, 255, 153));
        botonactualizarpersonas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonactualizarpersonas.setText("Actualizar");
        botonactualizarpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarpersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonborrarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonguardarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(botonactualizarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonguardarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborrarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonactualizarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombrepersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrepersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrepersonasActionPerformed

    private void txtapepersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapepersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapepersonasActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtnumdocpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdocpersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdocpersonasActionPerformed

    private void boxdocumentopersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdocumentopersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxdocumentopersonasActionPerformed

    private void txtdireccionpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionpersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionpersonasActionPerformed

    private void txtcelularpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularpersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularpersonasActionPerformed

    private void txtemailpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailpersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailpersonasActionPerformed

    private void boxestadopersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxestadopersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxestadopersonasActionPerformed

    private void botonguardarpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarpersonasActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
            String nombre = txtnombrepersonas.getText();
            String apellido = txtapepersonas.getText();
            String tipoDocumento = boxdocumentopersonas.getSelectedItem().toString();
            String numDocumento = txtnumdocpersonas.getText();
            String direccion = txtdireccionpersonas.getText();
            String celular = txtcelularpersonas.getText();
            String email = txtemailpersonas.getText();
            String estado = boxestadopersonas.getSelectedItem().toString();

            String sql = "INSERT INTO Personas (Nombre, Apellido, TipoDocumento, NroDocumento, Direccion, Celular, Email, Estado) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, apellido);
                pstmt.setString(3, tipoDocumento);
                pstmt.setString(4, numDocumento);
                pstmt.setString(5, direccion);
                pstmt.setString(6, celular);
                pstmt.setString(7, email);
                pstmt.setString(8, estado);

                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_botonguardarpersonasActionPerformed

    private void botonborrarpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarpersonasActionPerformed
    try (Connection conn = DatabaseConnection.getConnection()) {
        String numDocumento = txtnumdocpersonas.getText();

        String sql = "DELETE FROM Persona WHERE NroDocumento = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, numDocumento);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con ese número de documento.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_botonborrarpersonasActionPerformed

    private void botonactualizarpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarpersonasActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
        String nombre = txtnombrepersonas.getText();
        String apellido = txtapepersonas.getText();
        String tipoDocumento = boxdocumentopersonas.getSelectedItem().toString();
        String numDocumento = txtnumdocpersonas.getText();
        String direccion = txtdireccionpersonas.getText();
        String celular = txtcelularpersonas.getText();
        String email = txtemailpersonas.getText();
        String estado = boxestadopersonas.getSelectedItem().toString();

        String sql = "UPDATE Persona SET Nombre = ?, Apellido = ?, TipoDocumento = ?, Direccion = ?, Celular = ?, Email = ?, Estado = ? WHERE NroDocumento = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, tipoDocumento);
            pstmt.setString(4, direccion);
            pstmt.setString(5, celular);
            pstmt.setString(6, email);
            pstmt.setString(7, estado);
            pstmt.setString(8, numDocumento);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con ese número de documento.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_botonactualizarpersonasActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizarpersonas;
    private javax.swing.JButton botonborrarpersonas;
    private javax.swing.JButton botonguardarpersonas;
    private javax.swing.JComboBox<String> boxdocumentopersonas;
    private javax.swing.JComboBox<String> boxestadopersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel personaslabel;
    private javax.swing.JLabel personaslabel1;
    private javax.swing.JLabel personaslabel2;
    private javax.swing.JLabel personaslabel3;
    private javax.swing.JTextField txtapepersonas;
    private javax.swing.JTextField txtcelularpersonas;
    private javax.swing.JTextField txtdireccionpersonas;
    private javax.swing.JTextField txtemailpersonas;
    private javax.swing.JTextField txtnombrepersonas;
    private javax.swing.JTextField txtnumdocpersonas;
    // End of variables declaration//GEN-END:variables
}
