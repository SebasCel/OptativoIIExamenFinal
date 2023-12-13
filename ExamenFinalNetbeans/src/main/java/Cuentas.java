import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cuentas extends javax.swing.JFrame {

    private Connection conn;
    
    public Cuentas() {
        initComponents();
        conn = DatabaseConnection.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonguardarcuentas = new javax.swing.JButton();
        botonborrarcuentas = new javax.swing.JButton();
        botonactualizarcuentas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        personaslabel = new javax.swing.JLabel();
        personaslabel1 = new javax.swing.JLabel();
        personaslabel2 = new javax.swing.JLabel();
        cuentaslabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelnumcuentacuentas = new javax.swing.JLabel();
        txtnumerocuentacuentas = new javax.swing.JTextField();
        txtfechaaltacuentas = new javax.swing.JTextField();
        labelfechaaltacuentas = new javax.swing.JLabel();
        txttipocuentacuentas = new javax.swing.JLabel();
        txtestadocuentas = new javax.swing.JLabel();
        txtfechacliente3 = new javax.swing.JTextField();
        txtsaldocuentas = new javax.swing.JLabel();
        txtfechacliente4 = new javax.swing.JTextField();
        labelnumcontratocuentas = new javax.swing.JLabel();
        txtnumcontratocuentas = new javax.swing.JTextField();
        txtcostomantcuentas = new javax.swing.JLabel();
        txtcostomantenimientocuentas = new javax.swing.JTextField();
        labelpromcuentas = new javax.swing.JLabel();
        txtpromacredcuentas = new javax.swing.JTextField();
        labelmonedacuentas = new javax.swing.JLabel();
        boxtipocuentacuentas = new javax.swing.JComboBox<>();
        boxtmonedacuentas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonguardarcuentas.setBackground(new java.awt.Color(102, 255, 102));
        botonguardarcuentas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonguardarcuentas.setText("Guardar");
        botonguardarcuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarcuentasActionPerformed(evt);
            }
        });

        botonborrarcuentas.setBackground(new java.awt.Color(255, 51, 51));
        botonborrarcuentas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonborrarcuentas.setText("Borrar");
        botonborrarcuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarcuentasActionPerformed(evt);
            }
        });

        botonactualizarcuentas.setBackground(new java.awt.Color(255, 255, 153));
        botonactualizarcuentas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonactualizarcuentas.setText("Actualizar");
        botonactualizarcuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarcuentasActionPerformed(evt);
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

        cuentaslabel.setBackground(new java.awt.Color(234, 234, 234));
        cuentaslabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cuentaslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentaslabel.setText("CUENTAS:");

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
                    .addComponent(cuentaslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuentaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(personaslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(personaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelnumcuentacuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelnumcuentacuentas.setText("Numero de cuenta:");

        txtnumerocuentacuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerocuentacuentasActionPerformed(evt);
            }
        });

        txtfechaaltacuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaaltacuentasActionPerformed(evt);
            }
        });

        labelfechaaltacuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelfechaaltacuentas.setText("Fecha alta:");

        txttipocuentacuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txttipocuentacuentas.setText("Tipo de cuenta:");

        txtestadocuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtestadocuentas.setText("Estado:");

        txtfechacliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechacliente3ActionPerformed(evt);
            }
        });

        txtsaldocuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtsaldocuentas.setText("Saldo:");

        txtfechacliente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechacliente4ActionPerformed(evt);
            }
        });

        labelnumcontratocuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelnumcontratocuentas.setText("Numero de contrato:");

        txtnumcontratocuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumcontratocuentasActionPerformed(evt);
            }
        });

        txtcostomantcuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        txtcostomantcuentas.setText("Costo de mantenimiento:");

        txtcostomantenimientocuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostomantenimientocuentasActionPerformed(evt);
            }
        });

        labelpromcuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelpromcuentas.setText("Promedio de acreditación:");

        txtpromacredcuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromacredcuentasActionPerformed(evt);
            }
        });

        labelmonedacuentas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelmonedacuentas.setText("Moneda:");

        boxtipocuentacuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta corriente", "Cuenta con chequera", "Cuenta de ahorro", "Cuenta de nómina", "Cuenta en dólares" }));

        boxtmonedacuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guaranies", "Dolares", "Reales", "Pesos Argentinos", "Pesos Chilenos" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnumcuentacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumerocuentacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcostomantenimientocuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtcostomantcuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestadocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfechacliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnumcontratocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumcontratocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txttipocuentacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(boxtipocuentacuentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(193, 193, 193)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxtmonedacuentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelmonedacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsaldocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfechacliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelfechaaltacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfechaaltacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpromacredcuentas)
                            .addComponent(labelpromcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelnumcuentacuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumerocuentacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcostomantcuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcostomantenimientocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelfechaaltacuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfechaaltacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelpromcuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpromacredcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttipocuentacuentas)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelmonedacuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxtipocuentacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxtmonedacuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtestadocuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfechacliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelnumcontratocuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumcontratocuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsaldocuentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfechacliente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addComponent(botonborrarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonguardarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonactualizarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonguardarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborrarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonactualizarcuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguardarcuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarcuentasActionPerformed
    try {
        String numeroCuenta = txtnumerocuentacuentas.getText();
        String fechaAlta = txtfechaaltacuentas.getText();
        String tipoCuenta = boxtipocuentacuentas.getSelectedItem().toString();
        String estado = txtfechacliente3.getText();
        double saldo = Double.parseDouble(txtfechacliente4.getText());
        String numContrato = txtnumcontratocuentas.getText();
        double costoMantenimiento = Double.parseDouble(txtcostomantenimientocuentas.getText());
        double promedioAcreditacion = Double.parseDouble(txtpromacredcuentas.getText());
        String moneda = boxtmonedacuentas.getSelectedItem().toString();

        String sql = "INSERT INTO Cuentas (NroCuenta, FechaAlta, TipoCuenta, Estado, Saldo, NroContrato, CostoMantenimiento, PromedioAcreditacion, Moneda) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, numeroCuenta);
        statement.setString(2, fechaAlta);
        statement.setString(3, tipoCuenta);
        statement.setString(4, estado);
        statement.setDouble(5, saldo);
        statement.setString(6, numContrato);
        statement.setDouble(7, costoMantenimiento);
        statement.setDouble(8, promedioAcreditacion);
        statement.setString(9, moneda);

        statement.executeUpdate();

        JOptionPane.showMessageDialog(this, "Registro guardado correctamente.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el registro: " + e.getMessage());
    }        
    }//GEN-LAST:event_botonguardarcuentasActionPerformed

    private void botonborrarcuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarcuentasActionPerformed
    try {
        String numeroCuenta = txtnumerocuentacuentas.getText();

        String sql = "DELETE FROM Cuentas WHERE NroCuenta = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, numeroCuenta);

        int rowsDeleted = statement.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un registro con el número de cuenta proporcionado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + e.getMessage());
    }
    }//GEN-LAST:event_botonborrarcuentasActionPerformed

    private void botonactualizarcuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarcuentasActionPerformed
private void botonactualizarcuentasActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        String numeroCuenta = txtnumerocuentacuentas.getText();
        String fechaAlta = txtfechaaltacuentas.getText();
        String tipoCuenta = boxtipocuentacuentas.getSelectedItem().toString();
        String estado = txtfechacliente3.getText();
        double saldo = Double.parseDouble(txtfechacliente4.getText());
        String numContrato = txtnumcontratocuentas.getText();
        double costoMantenimiento = Double.parseDouble(txtcostomantenimientocuentas.getText());
        double promedioAcreditacion = Double.parseDouble(txtpromacredcuentas.getText());
        String moneda = boxtmonedacuentas.getSelectedItem().toString();

        String sql = "UPDATE Cuentas SET FechaAlta=?, Tipocuenta=?, Estado=?, Saldo=?, NroContrato=?, CostoMantenimiento=?, PromedioAcreditacion=?, Moneda=? WHERE NroCuenta=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, fechaAlta);
        statement.setString(2, tipoCuenta);
        statement.setString(3, estado);
        statement.setDouble(4, saldo);
        statement.setString(5, numContrato);
        statement.setDouble(6, costoMantenimiento);
        statement.setDouble(7, promedioAcreditacion);
        statement.setString(8, moneda);
        statement.setString(9, numeroCuenta);

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un registro con el número de cuenta proporcionado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar el registro: " + e.getMessage());
    }
} 
    }//GEN-LAST:event_botonactualizarcuentasActionPerformed

    private void txtnumerocuentacuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerocuentacuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerocuentacuentasActionPerformed

    private void txtfechaaltacuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaaltacuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaaltacuentasActionPerformed

    private void txtfechacliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechacliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechacliente3ActionPerformed

    private void txtfechacliente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechacliente4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechacliente4ActionPerformed

    private void txtnumcontratocuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumcontratocuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumcontratocuentasActionPerformed

    private void txtcostomantenimientocuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostomantenimientocuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostomantenimientocuentasActionPerformed

    private void txtpromacredcuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromacredcuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpromacredcuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizarcuentas;
    private javax.swing.JButton botonborrarcuentas;
    private javax.swing.JButton botonguardarcuentas;
    private javax.swing.JComboBox<String> boxtipocuentacuentas;
    private javax.swing.JComboBox<String> boxtmonedacuentas;
    private javax.swing.JLabel cuentaslabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelfechaaltacuentas;
    private javax.swing.JLabel labelmonedacuentas;
    private javax.swing.JLabel labelnumcontratocuentas;
    private javax.swing.JLabel labelnumcuentacuentas;
    private javax.swing.JLabel labelpromcuentas;
    private javax.swing.JLabel personaslabel;
    private javax.swing.JLabel personaslabel1;
    private javax.swing.JLabel personaslabel2;
    private javax.swing.JLabel txtcostomantcuentas;
    private javax.swing.JTextField txtcostomantenimientocuentas;
    private javax.swing.JLabel txtestadocuentas;
    private javax.swing.JTextField txtfechaaltacuentas;
    private javax.swing.JTextField txtfechacliente3;
    private javax.swing.JTextField txtfechacliente4;
    private javax.swing.JTextField txtnumcontratocuentas;
    private javax.swing.JTextField txtnumerocuentacuentas;
    private javax.swing.JTextField txtpromacredcuentas;
    private javax.swing.JLabel txtsaldocuentas;
    private javax.swing.JLabel txttipocuentacuentas;
    // End of variables declaration//GEN-END:variables
}
