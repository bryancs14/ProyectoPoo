/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.Conexion;
import entidad.Supermercado;
import entidad.Validaciones;
import datos.CajaDAO;
import datos.SupermercadoDAO;
import entidad.Caja;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


public class DialogCaja extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Supermercado supermercadoSelec = null;
    
    public DialogCaja() {
        super(FrmPrincipal.getInstancia(), false);
        initComponents();
        
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            supermercadoSelec = SupermercadoDAO.getInstancia().obtenerPrimerSupermercado();
            CajaDAO.getInstancia().mostrar(modelo);
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null, su.getMessage());
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
        txtIdCaja.setText("");
        txtNdeCaja.setText("");
        txtIdCaja.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Blanco = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIdCaja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2Direccion = new javax.swing.JLabel();
        txtNdeCaja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Blanco.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Blanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(102, 255, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(102, 255, 204));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, 40));

        btnConsultar.setBackground(new java.awt.Color(102, 255, 204));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(102, 255, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 130, 40));

        btnRestaurar.setBackground(new java.awt.Color(102, 255, 204));
        btnRestaurar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRestaurar.setText("RESTAURAR");
        btnRestaurar.setBorder(null);
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 130, 40));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel5.setText("ID CAJA");
        jPanel1Blanco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 20));

        txtIdCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCaja.setForeground(new java.awt.Color(204, 204, 204));
        txtIdCaja.setText("Ingrese ID CAJA");
        txtIdCaja.setBorder(null);
        txtIdCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdCajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdCajaFocusLost(evt);
            }
        });
        txtIdCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCajaActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 30));
        jPanel1Blanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 10));

        jLabel2Direccion.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion.setText("Nº DE CAJA");
        jPanel1Blanco.add(jLabel2Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 20));

        txtNdeCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNdeCaja.setForeground(new java.awt.Color(204, 204, 204));
        txtNdeCaja.setText("INGRESE EL NUMERO DE CAJA");
        txtNdeCaja.setBorder(null);
        txtNdeCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNdeCajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNdeCajaFocusLost(evt);
            }
        });
        txtNdeCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNdeCajaKeyTyped(evt);
            }
        });
        jPanel1Blanco.add(txtNdeCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 30));
        jPanel1Blanco.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 10));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/caja2.jpg"))); // NOI18N
        jPanel1Blanco.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 750, 690));

        jTable1.setBackground(new java.awt.Color(102, 255, 204));
        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1Blanco.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 480, 280));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cashier2_117800.png"))); // NOI18N
        jPanel1Blanco.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 120, 100));

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
        jPanel1Blanco.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        btnReporte.setBackground(new java.awt.Color(102, 255, 204));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setText("GENERAR REPORTE");
        btnReporte.setBorder(null);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 130, 40));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel8.setText("CAJA");
        jPanel1Blanco.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, 100));

        getContentPane().add(jPanel1Blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idCaja = txtIdCaja.getText();
        int nDeCaja = Integer.parseInt(txtNdeCaja.getText());
        
        Caja caja= new Caja(idCaja, nDeCaja, supermercadoSelec);
        try{
            CajaDAO.getInstancia().agregar(caja);
            CajaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
            }
        limpiarEntradas();
        desHabilitar();
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            String idcaja = txtIdCaja.getText();
            int ndeCaja = Integer.parseInt(txtNdeCaja.getText());
        
            Caja caja= new Caja(idcaja, ndeCaja, supermercadoSelec);
            
            CajaDAO.getInstancia().actualizar(caja);
            CajaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Modificado");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String idcaja = JOptionPane.showInputDialog("INGRESE UNA ID");
        if(idcaja.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CORRECTOS");
        else
        {
            try{
                Caja cajaBuscada = CajaDAO.getInstancia().buscarCaja(idcaja);
                if(cajaBuscada != null){
                    txtIdCaja.setText(cajaBuscada.getIdCaja());
                    txtNdeCaja.setText(String.valueOf(cajaBuscada.getNumeroDeCaja()));
                    supermercadoSelec = cajaBuscada.getSupermercado();
                    habilitar();
                }
                else
                     JOptionPane.showMessageDialog(null, "El ID Caja no existe");
            } catch(SQLException su) {
                JOptionPane.showMessageDialog(null,su.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            int res = JOptionPane.showConfirmDialog(this, "¿Proceso Eliminarlo? ", "Eliminar caja", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){
                String idCaja = txtIdCaja.getText();
                CajaDAO.getInstancia().eliminar(idCaja);
                CajaDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Caja eliminado");

            } else
            JOptionPane.showMessageDialog(null,"El Id Caja no existe");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // TODO add your handling code here:
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JasperReport reporte;
        Connection cn = Conexion.getInstancia().miConexion();
        try {
            reporte = JasperCompileManager.compileReport("src/reportes/reporteCaja.jrxml");
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(imprimir, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtIdCajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCajaFocusGained
        String idCaja = txtIdCaja.getText();
        
        if(idCaja.equalsIgnoreCase("Ingrese ID CAJA")){
            txtIdCaja.setText("");
            txtIdCaja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIdCajaFocusGained

    private void txtIdCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCajaFocusLost
        String idCaja = txtIdCaja.getText();
        
        if(idCaja.equalsIgnoreCase("INGRESE ID CAJA") || idCaja.equals("")){
            txtIdCaja.setText("INGRESE ID CAJA");
            txtIdCaja.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtIdCajaFocusLost

    private void txtNdeCajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNdeCajaFocusGained
        String NdeCaja = txtNdeCaja.getText();
        
        if(NdeCaja.equalsIgnoreCase("INGRESE EL NUMERO DE CAJA")){
            txtNdeCaja.setText("");
            txtNdeCaja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNdeCajaFocusGained

    private void txtNdeCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNdeCajaFocusLost
        String NdeCaja = txtNdeCaja.getText();
        
        if(NdeCaja.equalsIgnoreCase("INGRESE EL NUMERO DE CAJA") || NdeCaja.equals("")){
            txtNdeCaja.setText("INGRESE EL NUMERO DE CAJA");
            txtNdeCaja.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNdeCajaFocusLost

    private void txtNdeCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNdeCajaKeyTyped
        Validaciones x = new Validaciones();
        x.validarNumeros(evt);
    }//GEN-LAST:event_txtNdeCajaKeyTyped

    private void txtIdCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCajaActionPerformed

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
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCaja dialog = new DialogCaja();
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
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2Direccion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1Blanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCaja;
    private javax.swing.JTextField txtNdeCaja;
    // End of variables declaration//GEN-END:variables
}
