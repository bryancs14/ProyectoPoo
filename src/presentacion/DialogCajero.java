/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.Conexion;
import datos.CajaDAO;
import datos.CajeroDAO;
import entidad.Caja;
import entidad.Cajero;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class DialogCajero extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Caja cajaSelec = null;
    
    public DialogCajero() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            CajeroDAO.getInstancia().mostrar(modelo);
        } catch (SQLException ca) {
            JOptionPane.showMessageDialog(null,ca.getMessage());
        }
    }

    private void habilitar(){
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnConsultar.setEnabled(false);
    }
    
     
    private void desHabilitar(){
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnConsultar.setEnabled(true);
    }     
    
    private void limpiarEntradas(){
        txtIdCajero.setText("");
        txtNombre.setText("");
        cboTurno.setSelectedIndex(0);
        txtContraseña.setText("");
        txtIdCaja.setText("");
        txtNdeCaja.setText("");
        
        txtIdCajero.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4Blanco = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtIdCajero = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2Direccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel2Direccion1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2Direccion2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        cboTurno = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdCaja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtNdeCaja = new javax.swing.JTextField();
        jLabel2Direccion3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSeleccionarCaja = new javax.swing.JButton();
        btnRestaurar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4Blanco.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4Blanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(107, 227, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4Blanco.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 10, 480));

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setViewportView(jTable1);

        jPanel4Blanco.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 840, 220));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel7.setText("ID CAJERO");
        jPanel4Blanco.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 20));

        txtIdCajero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCajero.setForeground(new java.awt.Color(204, 204, 204));
        txtIdCajero.setText("Ingrese su nombre de \"Supermercado\"");
        txtIdCajero.setBorder(null);
        jPanel4Blanco.add(txtIdCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));
        jPanel4Blanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, 10));

        jLabel2Direccion.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion.setText("NOMBRE");
        jPanel4Blanco.add(jLabel2Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su direccion");
        txtNombre.setBorder(null);
        jPanel4Blanco.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 30));
        jPanel4Blanco.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 290, 10));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel8.setText("CAJERO");
        jPanel4Blanco.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 100));

        jLabel2Direccion1.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion1.setText("TURNO");
        jPanel4Blanco.add(jLabel2Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 20));
        jPanel4Blanco.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 290, 10));

        jLabel2Direccion2.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion2.setText("CONTRASEÑA");
        jPanel4Blanco.add(jLabel2Direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 20));
        jPanel4Blanco.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 290, 10));

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("jPasswordField1");
        jPanel4Blanco.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 441, 290, 30));

        cboTurno.setForeground(new java.awt.Color(153, 153, 153));
        cboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOGER", "MAÑANA", "TARDE", "NOCHE" }));
        jPanel4Blanco.add(cboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 290, 30));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel10.setText("CAJA");
        jPanel4Blanco.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 240, 100));

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel11.setText("ID CAJA");
        jPanel4Blanco.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 90, 20));

        txtIdCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCaja.setForeground(new java.awt.Color(204, 204, 204));
        txtIdCaja.setText("Ingrese Id Caja");
        txtIdCaja.setBorder(null);
        txtIdCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4Blanco.add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 240, 30));
        jPanel4Blanco.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 290, 10));
        jPanel4Blanco.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 290, 10));

        txtNdeCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNdeCaja.setForeground(new java.awt.Color(204, 204, 204));
        txtNdeCaja.setText("Ingrese numero de caja");
        txtNdeCaja.setBorder(null);
        jPanel4Blanco.add(txtNdeCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 240, 30));

        jLabel2Direccion3.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion3.setText("Nº DE CAJA");
        jPanel4Blanco.add(jLabel2Direccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 90, 20));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cajero4.png"))); // NOI18N
        jPanel4Blanco.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 120, 120));

        btnGuardar.setBackground(new java.awt.Color(107, 227, 249));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(107, 227, 249));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 140, 40));

        btnConsultar.setBackground(new java.awt.Color(107, 227, 249));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(107, 227, 249));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 140, 40));

        btnReporte.setBackground(new java.awt.Color(107, 227, 249));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setText("GENERAR REPORTE");
        btnReporte.setBorder(null);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 140, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnSalir.setText("X");
        btnSalir.setAutoscrolls(true);
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cajera002.jpg"))); // NOI18N
        jPanel4Blanco.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 610, 410));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cajero3.png"))); // NOI18N
        jPanel4Blanco.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 210, 140));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cajero.jpg"))); // NOI18N
        jPanel4Blanco.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 610, 400));

        btnSeleccionarCaja.setBackground(new java.awt.Color(107, 227, 249));
        btnSeleccionarCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeleccionarCaja.setText("SELECCIONAR");
        btnSeleccionarCaja.setBorder(null);
        btnSeleccionarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCajaActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnSeleccionarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 140, 40));

        btnRestaurar1.setBackground(new java.awt.Color(107, 227, 249));
        btnRestaurar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRestaurar1.setText("RESTAURAR");
        btnRestaurar1.setBorder(null);
        btnRestaurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurar1ActionPerformed(evt);
            }
        });
        jPanel4Blanco.add(btnRestaurar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 140, 40));

        getContentPane().add(jPanel4Blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String idCajero=txtIdCajero.getText();
        String nombre=txtNombre.getText();
        String turno=cboTurno.getSelectedItem().toString();
        String contraseña=txtContraseña.getText();

        Cajero cajero= new Cajero(idCajero,nombre,turno,contraseña,cajaSelec);
        try{
            CajeroDAO.getInstancia().agregar(cajero);
            CajeroDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            String idCajero=txtIdCajero.getText();
            String nombre=txtNombre.getText();
            String turno=cboTurno.getSelectedItem().toString();
            String contraseña = txtContraseña.getText();

            Cajero cajero= new Cajero(idCajero, nombre, turno, contraseña, cajaSelec);

            CajeroDAO.getInstancia().actualizar(cajero);
            CajeroDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Modificado");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idCajero=txtIdCajero.getText();
        
        if(idCajero.equalsIgnoreCase(""))
        JOptionPane.showMessageDialog(null, "INGRESE DATOS CORRECTOS");
        else
        {
            try{
                Cajero cajeroBuscado = CajeroDAO.getInstancia().buscarCajero(idCajero);
                if(cajeroBuscado!=null)
                {
                    txtIdCajero.setText(cajeroBuscado.getIdCajero());
                    txtNombre.setText(cajeroBuscado.getNombre());
                    
                    switch(cajeroBuscado.getTurno())
                    {
                        case "MAÑANA": cboTurno.setSelectedIndex(1); break;
                        case "TARDE": cboTurno.setSelectedIndex(2); break;
                        case "NOCHE": cboTurno.setSelectedIndex(3); break;
                    }
                    txtContraseña.setText(cajeroBuscado.getContraseña());
                    
                    cajaSelec = cajeroBuscado.getCaja();
                    
                    txtIdCaja.setText(cajeroBuscado.getCaja().getIdCaja());
                    txtNdeCaja.setText(String.valueOf(cajeroBuscado.getCaja().getNumeroDeCaja()));                 
                    habilitar();
                }
                else
                JOptionPane.showMessageDialog(null, "El ID Cajero no existe");
            } catch(SQLException su) {
                JOptionPane.showMessageDialog(null,su.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
       try{

            int res = JOptionPane.showConfirmDialog(this, "¿Proceso eliminarlo? ", "Eliminar Dato", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){
                String idCajero = txtIdCajero.getText();
                CajeroDAO.getInstancia().eliminar(idCajero);
                CajeroDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Cajero eliminado");

            } else
            JOptionPane.showMessageDialog(null,"El Id Cajero no existe");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JasperReport reporte;
        Connection cn;
        try {
            
            cn = Conexion.getInstancia().miConexion();
            reporte = JasperCompileManager.compileReport("src/reportes/reporteCajero.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer.viewReport(jp, true);
            
         }catch(JRException e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setBackground(Color.red);
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeleccionarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCajaActionPerformed
        // TODO add your handling code here:
        DialogBuscarCaja f = new DialogBuscarCaja();
        f.setVisible(true);
        cajaSelec = f.cajaSelec;

        txtIdCaja.setText(cajaSelec.getIdCaja());
        txtNdeCaja.setText(String.valueOf(cajaSelec.getNumeroDeCaja()));

    }//GEN-LAST:event_btnSeleccionarCajaActionPerformed

    private void btnRestaurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaurar1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCajero dialog = new DialogCajero();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnRestaurar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionarCaja;
    private javax.swing.JComboBox<String> cboTurno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2Direccion;
    private javax.swing.JLabel jLabel2Direccion1;
    private javax.swing.JLabel jLabel2Direccion2;
    private javax.swing.JLabel jLabel2Direccion3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4Blanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtIdCaja;
    private javax.swing.JTextField txtIdCajero;
    private javax.swing.JTextField txtNdeCaja;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
