package view;

import model.panaderia;
import controller.panaderiaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class view1 extends javax.swing.JFrame {

    public view1() {
        initComponents();
        setLocationRelativeTo(null);
        panemco.getLista_panaderia();
    }
    panaderiaController panemco = new panaderiaController();
    int num;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContaReg = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtNomreUsua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panad_reg_tbl = new javax.swing.JTable();
        txtNombreReg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNitReg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDirecReg = new javax.swing.JTextField();
        txtContraUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreMod = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtContacMod = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtDirecMod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNitMod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarMod = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNommbUsuMod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtContraUsuMod = new javax.swing.JTextField();
        chbSelecMod = new javax.swing.JCheckBox();
        btnEditarMod = new javax.swing.JButton();
        btnEliminarMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        panad_reg_tbl1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTablaBuscar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Contacto");

        txtContaReg.setColumns(20);
        txtContaReg.setRows(5);
        jScrollPane2.setViewportView(txtContaReg);

        jLabel5.setText("Nombre-Usuario");

        jLabel6.setText("Contraseña-Usuario");

        panad_reg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "NIT", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(panad_reg_tbl);
        if (panad_reg_tbl.getColumnModel().getColumnCount() > 0) {
            panad_reg_tbl.getColumnModel().getColumn(0).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(1).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(2).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Nombre");

        jLabel2.setText("NIT");

        jLabel3.setText("Direccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(txtContraUsu)
                                    .addComponent(txtNomreUsua, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(txtDirecReg, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtNitReg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(132, 132, 132)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomreUsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDirecReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNitReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(342, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registrar", jPanel1);

        jLabel7.setText("Nombre");

        txtNombreMod.setEnabled(false);

        txtContacMod.setColumns(20);
        txtContacMod.setRows(5);
        txtContacMod.setEnabled(false);
        jScrollPane3.setViewportView(txtContacMod);

        jLabel8.setText("Contacto");

        txtDirecMod.setEnabled(false);

        jLabel9.setText("Direccion");

        txtNitMod.setEnabled(false);

        jLabel10.setText("NIT");

        btnGuardarMod.setText("Guardar");
        btnGuardarMod.setEnabled(false);
        btnGuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre-Usuario");

        txtNommbUsuMod.setEnabled(false);

        jLabel12.setText("Contraseña-Usuario");

        txtContraUsuMod.setEnabled(false);

        chbSelecMod.setText("Seleccionado");
        chbSelecMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSelecModActionPerformed(evt);
            }
        });

        btnEditarMod.setText("Editar");
        btnEditarMod.setEnabled(false);
        btnEditarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarModActionPerformed(evt);
            }
        });

        btnEliminarMod.setText("Eliminar");
        btnEliminarMod.setEnabled(false);
        btnEliminarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModActionPerformed(evt);
            }
        });

        btnCancelarMod.setText("Cancelar");
        btnCancelarMod.setEnabled(false);
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        panad_reg_tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "NIT", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panad_reg_tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panad_reg_tbl1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(panad_reg_tbl1);
        if (panad_reg_tbl1.getColumnModel().getColumnCount() > 0) {
            panad_reg_tbl1.getColumnModel().getColumn(0).setResizable(false);
            panad_reg_tbl1.getColumnModel().getColumn(1).setResizable(false);
            panad_reg_tbl1.getColumnModel().getColumn(2).setResizable(false);
            panad_reg_tbl1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbSelecMod)
                            .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtDirecMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(txtNitMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(132, 132, 132))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane3)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(txtContraUsuMod)
                                .addComponent(txtNommbUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(140, 140, 140)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnGuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(chbSelecMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDirecMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNitMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNommbUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContraUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3))
                    .addContainerGap(232, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        jLabel13.setText("NIT:");

        btnBuscar.setText("Buscar");

        jTablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "NIT", "Contacto"
            }
        ));
        jScrollPane5.setViewportView(jTablaBuscar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnBuscar))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModActionPerformed
        int OpcGuardPan = JOptionPane.showConfirmDialog(null, "¿Desea Guardar los cambios?");
        if (OpcGuardPan == 0) {
            panemco.update(num, new panaderia(txtNombreMod.getText(), txtDirecMod.getText(), txtNitMod.getText(), txtContacMod.getText(), txtNommbUsuMod.getText(), txtContraUsuMod.getText()), panad_reg_tbl1, panad_reg_tbl);
            EditPanMod(false);
            chbSelecMod.setSelected(false);
            borrarTxtField();
        }

    }//GEN-LAST:event_btnGuardarModActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        panemco.create(new panaderia(txtNombreReg.getText(), txtDirecReg.getText(), txtNitReg.getText(), txtContaReg.getText(), txtNomreUsua.getText(), txtContraUsu.getText()));
        listarTabla();
        borrarTxtField();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void panad_reg_tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panad_reg_tbl1MouseClicked
        num = panad_reg_tbl1.getSelectedRow();

        btnEditarMod.setEnabled(true);
        btnEliminarMod.setEnabled(true);
        chbSelecMod.setSelected(true);
    }//GEN-LAST:event_panad_reg_tbl1MouseClicked

    private void btnEditarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarModActionPerformed
        int OpcEditPan = JOptionPane.showConfirmDialog(null, "¿Desea Modificar la Panaderia?");
        try {
            if (OpcEditPan == 0) {
                EditPanMod(true);
                btnEditarMod.setEnabled(false);
                DatosTxtField();
            } else {
                EditPanMod(false);
                btnEditarMod.setEnabled(false);
                chbSelecMod.setSelected(false);
                borrarTxtField();
            }
        } catch (Exception e) {
            btnEditarMod.setEnabled(false);
            btnCancelarMod.setEnabled(false);
            btnGuardarMod.setEnabled(false);
            chbSelecMod.setSelected(false);
            EditPanMod(false);
            JOptionPane.showMessageDialog(null, "No existe panaderia para editar");
        }

    }//GEN-LAST:event_btnEditarModActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        btnCancelarMod.setEnabled(false);
        chbSelecMod.setSelected(false);
        EditPanMod(false);
        borrarTxtField();
    }//GEN-LAST:event_btnCancelarModActionPerformed

    private void btnEliminarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModActionPerformed
        int OpcElmPan = JOptionPane.showConfirmDialog(null, "¿Desea ElIMINAR la Panaderia?");
        try {
            if (OpcElmPan == 0) {
                panemco.delete(num, panad_reg_tbl1, panad_reg_tbl);
                EditPanMod(false);
                btnEditarMod.setEnabled(false);
                chbSelecMod.setSelected(false);
            } else {
                EditPanMod(false);
                btnEditarMod.setEnabled(false);
                chbSelecMod.setSelected(false);
            }
        } catch (Exception e) {
            btnEditarMod.setEnabled(false);
            btnEliminarMod.setEnabled(false);
            chbSelecMod.setSelected(false);
            JOptionPane.showMessageDialog(null, "No existe panaderia para eliminar");
        }

    }//GEN-LAST:event_btnEliminarModActionPerformed

    private void chbSelecModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSelecModActionPerformed
        if (chbSelecMod.isSelected() == false) {
            EditPanMod(false);
            btnEditarMod.setEnabled(false);
            borrarTxtField();
        } else if (chbSelecMod.isSelected() == true) {
            btnEditarMod.setEnabled(true);
            btnEliminarMod.setEnabled(true);
        }
    }//GEN-LAST:event_chbSelecModActionPerformed

    public void EditPanMod(boolean V) {
        btnGuardarMod.setEnabled(V);
        btnCancelarMod.setEnabled(V);
        btnEliminarMod.setEnabled(false);
        txtContacMod.setEnabled(V);
        txtNommbUsuMod.setEnabled(V);
        txtContraUsuMod.setEnabled(V);
        txtNitMod.setEnabled(V);
        txtNombreMod.setEnabled(V);
        txtDirecMod.setEnabled(V);
    }

    public void borrarTxtField() {
        String t = "";
        txtContaReg.setText(t);
        txtContacMod.setText(t);
        txtContraUsu.setText(t);
        txtContraUsuMod.setText(t);
        txtDirecMod.setText(t);
        txtDirecReg.setText(t);
        txtNitMod.setText(t);
        txtNitReg.setText(t);
        txtNombreReg.setText(t);
        txtNombreMod.setText(t);
        txtNommbUsuMod.setText(t);
        txtNomreUsua.setText(t);
    }

    public void DatosTxtField() {
        txtContacMod.setText(panemco.read(num).getContacto());
        txtContraUsuMod.setText(panemco.read(num).getPass_usuario());
        txtDirecMod.setText(panemco.read(num).getDireccion());
        txtNitMod.setText(panemco.read(num).getNit());
        txtNombreMod.setText(panemco.read(num).getNombre());
        txtNommbUsuMod.setText(panemco.read(num).getNom_usuario());
    }

    public void listarTabla() {
        panemco.admintabla(panad_reg_tbl);
        panemco.admintabla(panad_reg_tbl1);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnEditarMod;
    private javax.swing.JButton btnEliminarMod;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarMod;
    private javax.swing.JCheckBox chbSelecMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaBuscar;
    private javax.swing.JTable panad_reg_tbl;
    private javax.swing.JTable panad_reg_tbl1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtContaReg;
    private javax.swing.JTextArea txtContacMod;
    private javax.swing.JTextField txtContraUsu;
    private javax.swing.JTextField txtContraUsuMod;
    private javax.swing.JTextField txtDirecMod;
    private javax.swing.JTextField txtDirecReg;
    private javax.swing.JTextField txtNitMod;
    private javax.swing.JTextField txtNitReg;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtNombreReg;
    private javax.swing.JTextField txtNommbUsuMod;
    private javax.swing.JTextField txtNomreUsua;
    // End of variables declaration//GEN-END:variables
}
