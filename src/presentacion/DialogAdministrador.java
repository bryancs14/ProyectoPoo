/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import datos.Conexion;
import datos.SupermercadoDAO;
import entidad.Supermercado;
import java.awt.Color;
import datos.AdministradorDAO;
import entidad.Administrador;
import java.sql.SQLException;
import java.sql.*;
import entidad.Validaciones;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class DialogAdministrador extends javax.swing.JDialog {

    private Supermercado supermercado;
    private Administrador administrador;
    Validaciones x = new Validaciones();
    
    public DialogAdministrador() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        traerAdmin();
        try {
            supermercado = SupermercadoDAO.getInstancia().obtenerPrimerSupermercado();
            if(supermercado != null) {
                
                txtNombreSupermercado.setText(supermercado.getNombre());
                txtDireccion.setText(supermercado.getDireccion());
            }
        } catch (SQLException sup) {
            JOptionPane.showMessageDialog(null,sup.getMessage());
        }
    }

    
    private void limpiarEntradas(){
       
        txtNombreAdministrador.setText("");
        txtContraseña.setText("");
        txtNombreSupermercado.setText("");
        txtDireccion.setText("");
        txtNombreAdministrador.requestFocus();
    }
    
    private void traerAdmin() {
        try {
            administrador = AdministradorDAO.getInstancia().obtenerPrimerAdmin();
            if(administrador != null) {
                
                txtNombreAdministrador.setText(administrador.getNombre());
                txtContraseña.setText(administrador.getContraseña());
            }
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
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
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAdministrador = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreSupermercado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 153, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/administrador.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 400, 560));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("ADMINISTRADOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono administrador.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, 90));

        txtNombreAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreAdministrador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreAdministrador.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreAdministrador.setText("Ingrese NOMBRE ADMINISTRADOR");
        txtNombreAdministrador.setBorder(null);
        txtNombreAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreAdministradorMousePressed(evt);
            }
        });
        txtNombreAdministrador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAdministradorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, 30));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 290, 20));

        jPanel2.setBackground(new java.awt.Color(144, 222, 170));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 380));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("SUPERMERCADO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("NOMBRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("DIRECCION");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/supermarket-icon-png-19.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -20, 190, 150));

        txtNombreSupermercado.setEditable(false);
        txtNombreSupermercado.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreSupermercado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreSupermercado.setText("Ingrese NOMBRE SUPERMERCADO");
        txtNombreSupermercado.setBorder(null);
        txtNombreSupermercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreSupermercadoMousePressed(evt);
            }
        });
        txtNombreSupermercado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSupermercadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreSupermercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 290, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 290, 20));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDireccion.setText("Ingrese DIRECCIÓN");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 290, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 290, 30));

        btnGuardar.setBackground(new java.awt.Color(144, 222, 170));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 130, 40));

        btnCancelar.setBackground(new java.awt.Color(144, 222, 170));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreAdministrador=txtNombreAdministrador.getText();
        String contraseña=txtContraseña.getText();
        
        try{
            if(administrador == null) {
                administrador= new Administrador("1", nombreAdministrador, contraseña, supermercado);
                AdministradorDAO.getInstancia().agregar(administrador);
            } else {
                
                administrador.setNombre(nombreAdministrador);
                administrador.setContraseña(contraseña);
                AdministradorDAO.getInstancia().actualizar(administrador);
            }
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            dispose();
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreAdministradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAdministradorKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreAdministradorKeyTyped

    private void txtNombreSupermercadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSupermercadoKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreSupermercadoKeyTyped

    private void txtNombreAdministradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreAdministradorMousePressed
        if(txtNombreAdministrador.getText().equals("Ingrese NOMBRE ADMINISTRADOR")){
            txtNombreAdministrador.setText("");
            txtNombreAdministrador.setForeground(new Color(102,102,102));
        }   
        if(txtContraseña.getText().isEmpty()){
            txtContraseña.setText("********");
            txtContraseña.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreAdministradorMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if(txtNombreAdministrador.getText().isEmpty()){
            txtNombreAdministrador.setText("Ingrese NOMBRE ADMINISTRADOR");
            txtNombreAdministrador.setForeground(new Color(204,204,204));
        }
        if(txtContraseña.getText().equals("********")){
            txtContraseña.setText("");
            txtContraseña.setForeground(new Color(102,102,102));
        }   
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtNombreSupermercadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreSupermercadoMousePressed
        if(txtNombreSupermercado.getText().equals("Ingrese NOMBRE SUPERMERCADO")){
            txtNombreSupermercado.setText("");
            txtNombreSupermercado.setForeground(new Color(102,102,102));
        }   
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Ingrese DIRECCION");
            txtDireccion.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreSupermercadoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
         if(txtNombreSupermercado.getText().isEmpty()){
            txtNombreSupermercado.setText("Ingrese NOMBRE SUPERMERCADO");
            txtNombreSupermercado.setForeground(new Color(204,204,204));
        }
        if(txtDireccion.getText().equals("Ingrese DIRECCION")){
            txtDireccion.setText("");
            txtDireccion.setForeground(new Color(102,102,102));
        }   
    }//GEN-LAST:event_txtDireccionMousePressed

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
            java.util.logging.Logger.getLogger(DialogAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogAdministrador dialog = new DialogAdministrador();
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreAdministrador;
    private javax.swing.JTextField txtNombreSupermercado;
    // End of variables declaration//GEN-END:variables
}
