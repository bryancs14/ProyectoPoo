/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.SupermercadoDAO;
import entidad.Supermercado;
import entidad.Validaciones;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class FrmRegistrarSupermercado extends javax.swing.JFrame {
    
    private Validaciones x = new Validaciones();

    /**
     * Creates new form FrmRegistrar
     */
    public FrmRegistrarSupermercado() {
        initComponents();
        setLocationRelativeTo(null);
        habilitar();
    }

    private void habilitar(){
        btnGuardar.setEnabled(true);
        btnSalir.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2Direccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2Direccion.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion.setText("DIRECCION");
        jPanel3.add(jLabel2Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su nombre de \"Supermercado\"");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 290, 30));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel4.setText("SUPERMERCADO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 240, 100));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/supermarket-icon-png-19.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 140));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 290, 10));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("Ingrese su direccion");
        txtDireccion.setBorder(null);
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 290, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/istockphoto-1157106624-612x612.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 540, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 290, 10));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 130, 40));

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
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));
        btnSalir.setBorderPainted(false);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
//        String nombre = txtNombre.getText();
//        String nombre2 = supermercado.getNombre();
//        String direccion = supermercado.getDireccion();

//        if(nombre.equalsIgnoreCase("Ingrese su nombre de \"Supermercado\"")){
//            txtNombre.setText("");
//            txtNombre.setForeground(Color.BLACK);
//        }
//        else if (nombre2.equalsIgnoreCase(supermercado.getNombre()) && direccion.equalsIgnoreCase(supermercado.getDireccion())){
//            txtNombre.setForeground(Color.BLACK);
//            txtDireccion.setForeground(Color.BLACK);
//            txtNombre.setEditable(false);
//            txtDireccion.setEditable(false);
//        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombre = txtNombre.getText();

        if(nombre.equalsIgnoreCase("Ingrese su nombre de \"Supermercado\"") || nombre.equals("")){
            txtNombre.setText("Ingrese su nombre de \"Supermercado\"");
            txtNombre.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        String direccion = txtDireccion.getText();

        if(direccion.equalsIgnoreCase("Ingrese su direccion")){
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        String direccion = txtDireccion.getText();

        if(direccion.equalsIgnoreCase("Ingrese su direccion") || direccion.equals("")){
            txtDireccion.setText("Ingrese su direccion");
            txtDireccion.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        try {
            Supermercado supermercado = new Supermercado("1",nombre, direccion);
            SupermercadoDAO.getInstancia().agregar(supermercado);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            dispose();
            FrmRegistrarAdministrador frmAdmin = new FrmRegistrarAdministrador();
            frmAdmin.setVisible(true);
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, s.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarSupermercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2Direccion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}