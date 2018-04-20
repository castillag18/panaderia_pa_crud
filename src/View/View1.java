package View;

import Model.Panaderia;
import Controller.PanaderiaController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class View1 extends javax.swing.JFrame {

    public View1() {
        initComponents();
        setLocationRelativeTo(null);
        panemco.getLista_Panaderia();

        IconosPanel();
        cargar_datos();
        listarTabla();
    }
    PanaderiaController panemco = new PanaderiaController();
    int num;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_General = new javax.swing.JTabbedPane();
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
        btnBuscar = new javax.swing.JButton();
        txtBuscarNit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
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
        panad_reg_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(panad_reg_tbl);
        if (panad_reg_tbl.getColumnModel().getColumnCount() > 0) {
            panad_reg_tbl.getColumnModel().getColumn(0).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(1).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(2).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        txtNombreReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        txtNitReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitRegActionPerformed(evt);
            }
        });

        jLabel2.setText("NIT");

        jLabel3.setText("Direccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNomreUsua, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtContraUsu))
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecReg, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNitReg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirecReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNitReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomreUsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Panel_General.addTab("Registrar", jPanel1);

        jLabel7.setText("Nombre");

        txtNombreMod.setEnabled(false);
        txtNombreMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreModActionPerformed(evt);
            }
        });

        txtContacMod.setColumns(20);
        txtContacMod.setRows(5);
        txtContacMod.setEnabled(false);
        jScrollPane3.setViewportView(txtContacMod);

        jLabel8.setText("Contacto");

        txtDirecMod.setEnabled(false);

        jLabel9.setText("Direccion");

        txtNitMod.setEnabled(false);
        txtNitMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitModActionPerformed(evt);
            }
        });

        jLabel10.setText("NIT");

        btnGuardarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
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
        chbSelecMod.setEnabled(false);
        chbSelecMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbSelecModMouseClicked(evt);
            }
        });
        chbSelecMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSelecModActionPerformed(evt);
            }
        });

        btnEditarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnEditarMod.setText("Editar");
        btnEditarMod.setEnabled(false);
        btnEditarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarModActionPerformed(evt);
            }
        });

        btnEliminarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btnEliminarMod.setText("Eliminar");
        btnEliminarMod.setEnabled(false);
        btnEliminarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModActionPerformed(evt);
            }
        });

        btnCancelarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
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
        panad_reg_tbl1.getTableHeader().setReorderingAllowed(false);
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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscarNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContraUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtNommbUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDirecMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(txtNitMod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscarNit)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(chbSelecMod)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirecMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNitMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNommbUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraUsuMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(chbSelecMod))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_General.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_General)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void IconosPanel() {//ICONOS 

        // Titulo + Icono del programa
        setTitle("Panapa 2.0.0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Icons/bread.png")));

        //Productos
        Panel_General.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries.png")));
        //Proveedores
        Panel_General.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/packing.png")));

    }


    private void btnGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModActionPerformed
        if (Val_Panaderia(txtNombreMod.getText(), txtDirecMod.getText(), txtNitMod.getText(), txtContacMod.getText(), txtNommbUsuMod.getText(), txtContraUsuMod.getText())) {
            int OpcGuardPan = JOptionPane.showConfirmDialog(null, "¿Desea Guardar los cambios?");
            if (OpcGuardPan == 0) {
                if (txtNitMod.getText().length() > 10 || txtNitMod.getText().length() < 10) {
                    JOptionPane.showMessageDialog(null, "El NIT tiene que tener 10 digitos.\nEl NIT ingresado contiene " + txtNitMod.getText().length() + " digitos.", "ERROR", 0);
//            } else if (Integer.parseInt(txtNitReg.getText()) <= 0) {
//                JOptionPane.showMessageDialog(null, "El NIT no puede contener numeros negativos ", "ERROR", 0);
                    //hay que validar que los caracteres sean solo numeros
                } else if (txtNitReg.getText().length() == 10 /*&& Integer.parseInt(txtNitReg.getText()) >= 0*/) {
                    if (Val_Panaderia(txtNombreMod.getText(), txtDirecMod.getText(), txtNitMod.getText(), txtContacMod.getText(), txtNommbUsuMod.getText(), txtContraUsuMod.getText())) {
                        panemco.update(num, new Panaderia(txtNombreMod.getText(), txtDirecMod.getText(), txtNitMod.getText(), txtContacMod.getText(), txtNommbUsuMod.getText(), txtContraUsuMod.getText()), panad_reg_tbl1, panad_reg_tbl);
                        EditPanMod(false);
                        salvar_datos();
                        chbSelecMod.setSelected(false);
                        borrarTxtField();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGuardarModActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (Val_Panaderia(txtNombreReg.getText(), txtDirecReg.getText(), txtNitReg.getText(), txtContaReg.getText(), txtNombreReg.getText(), txtContraUsu.getText())) {
            if (txtNitReg.getText().length() > 10 || txtNitReg.getText().length() < 10) {
                JOptionPane.showMessageDialog(null, "El NIT tiene que tener 10 digitos.\nEl NIT ingresado contiene " + txtNitReg.getText().length() + " digitos.", "ERROR", 0);

            } else {

                if (Val_Nit(txtNitReg.getText()) && Val_user(txtNomreUsua.getText())) {
                    panemco.create(new Panaderia(txtNombreReg.getText(), txtDirecReg.getText(), txtNitReg.getText(), txtContaReg.getText(), txtNomreUsua.getText(), txtContraUsu.getText()));
                    listarTabla();
                    salvar_datos();
                    borrarTxtField();
                }

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void panad_reg_tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panad_reg_tbl1MouseClicked
        num = panad_reg_tbl1.getSelectedRow();
        DatosTxtField();
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
            JOptionPane.showMessageDialog(null, "No existe Panaderia para editar");
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
                borrarTxtField();
                salvar_datos();
            } else {
                EditPanMod(false);
                btnEditarMod.setEnabled(false);
                chbSelecMod.setSelected(false);
            }
        } catch (Exception e) {
            btnEditarMod.setEnabled(false);
            btnEliminarMod.setEnabled(false);
            chbSelecMod.setSelected(false);
            JOptionPane.showMessageDialog(null, "No existe Panaderia para eliminar");
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        panemco.Read(txtBuscarNit.getText());
        panemco.admintabla(panad_reg_tbl1, panemco.Read(txtBuscarNit.getText()));
    }//GEN-LAST:event_btnBuscarActionPerformed


    private void chbSelecModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbSelecModMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chbSelecModMouseClicked

    private void txtBuscarNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNitActionPerformed

    private void txtNitModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitModActionPerformed

    private void txtNitRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitRegActionPerformed

    private void txtNombreRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegActionPerformed

    private void txtNombreModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModActionPerformed

    private void txtNitRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitRegKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }

        if (k == 10) {
            txtNitReg.transferFocus();
        }
    }//GEN-LAST:event_txtNitRegKeyTyped

    private void txtNomreUsuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomreUsuaKeyTyped

        if (!Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        } 

    }//GEN-LAST:event_txtNomreUsuaKeyTyped
    //accion de salir
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int finlizar = new JOptionPane().YES_NO_OPTION;
    int end = JOptionPane.showConfirmDialog(null, "Desea Salir de la Ventana???" , "Exit" , finlizar);
        if (end == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private Boolean Val_Panaderia(String nombre, String direccion, String nit, String contacto, String nom_usuario, String pass_usuario) {
        boolean V = true;
        //condicion para saber si la entrada esta o no vacia
        try {
            if (nombre == null || nombre.equals("") || direccion == null || direccion.equals("") || nit == null || nit.equals("") || contacto == null || contacto.equals("") || nom_usuario == null || nom_usuario.equals("") || pass_usuario == null || pass_usuario.equals("")) {
                JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR", 0);
                V = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite solo valores númericos", "ERROR", 0);
            V = false;
        }
        return V;
    }

    public Boolean Val_Nit(String nit) {
        boolean valid = true;
        boolean valid1 = true;

        for (int i = 0; i < nit.length(); i++) {
            if (!Character.isDigit(nit.charAt(i))) {
                valid1 = false;
                valid = false;
                JOptionPane.showMessageDialog(null, "Caracter no valido: " + nit.charAt(i));
                break;
            }
        }
        if (valid1) {
            for (int i = 0; i < panemco.getLista_Panaderia().size(); i++) {
                if (nit.equals(panemco.getLista_Panaderia().get(i).getNit())) {
                    valid = false;
                    JOptionPane.showMessageDialog(null, "NIT Existente");
                    break;
                }
            }
        }
        return valid;
    }

    public boolean Val_user(String nombreuser) {
        boolean valid = true;
        boolean valid1 = true;
        for (int i = 0; i < nombreuser.length(); i++) {
            if (!Character.isLetterOrDigit(nombreuser.charAt(i))) {
                valid1 = false;
                valid = false;
                JOptionPane.showMessageDialog(null, "Caracter no valido: " + nombreuser.charAt(i));
                break;
            }
        }
        if (valid1) {
            for (int i = 0; i < panemco.getLista_Panaderia().size(); i++) {
                if (nombreuser.equals(panemco.getLista_Panaderia().get(i).getNom_usuario())) {
                   valid = false; 
                   JOptionPane.showMessageDialog(null, "NOMBRE DE USUARIO EXISTENTE");
                    break;
                }
            }
        }
        return valid;
        
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
        panemco.admintabla(panad_reg_tbl, panemco.getLista_Panaderia());
        panemco.admintabla(panad_reg_tbl1, panemco.getLista_Panaderia());
    }
    String nameFile = "..\\pa_crud_Data\\Panaderias_lista1.dat";

    public void cargar_datos() {
        File fichero = new File(nameFile);
        
        if (fichero.exists()) {
            JOptionPane.showMessageDialog(null, "encontrado "+fichero.getAbsolutePath());
            try {
                FileInputStream archivo = new FileInputStream(nameFile);
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                panemco.setLista_Panaderia((ArrayList<Panaderia>) obj_archivo.readObject());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"\nHa ocurrido un error con el archivo");
            }
        }

    }

    public void salvar_datos() {
        try {
            FileOutputStream archivo = new FileOutputStream(nameFile);
            ObjectOutputStream obj_archivo = new ObjectOutputStream(archivo);
            obj_archivo.writeObject(panemco.getLista_Panaderia());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nHa ocurrido un error con el archivo");
        }
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
        String s = "de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel";

        try {
            javax.swing.UIManager.setLookAndFeel(s);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(View1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(View1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(View1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Panel_General;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable panad_reg_tbl;
    private javax.swing.JTable panad_reg_tbl1;
    private javax.swing.JTextField txtBuscarNit;
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
