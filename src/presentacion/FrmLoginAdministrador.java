
package presentacion;

import presentacion.Globales.*;
import datos.AdministradorDAO;
import datos.CajeroDAO;
import java.sql.*;
import datos.Conexion;
import datos.SupervisorDAO;
import entidad.Administrador;
import entidad.Cajero;
import entidad.Supervisor;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FrmLoginAdministrador extends javax.swing.JFrame {

    public FrmLoginAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(390, 460);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        cboTipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/149071 (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 30, 30));

        btnLogin.setBackground(new java.awt.Color(57, 49, 74));
        btnLogin.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 190, 30));

        txtNombre.setBackground(new java.awt.Color(211, 213, 224));
        txtNombre.setForeground(new java.awt.Color(118, 123, 131));
        txtNombre.setText("NOMBRE");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 30));
        txtNombre.setEnabled(true);

        txtContraseña.setBackground(new java.awt.Color(211, 213, 224));
        txtContraseña.setForeground(new java.awt.Color(127, 132, 138));
        txtContraseña.setText("CONTRASEÑA");
        txtContraseña.setBorder(null);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 220, 30));
        txtContraseña.setEnabled(true);

        cboTipo.setBackground(new java.awt.Color(211, 213, 224));
        cboTipo.setForeground(new java.awt.Color(127, 132, 138));
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "SUPERVISOR", "CAJERO" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 260, 30));

        jPanel3.setBackground(new java.awt.Color(211, 213, 224));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 260, 30));

        jPanel2.setBackground(new java.awt.Color(211, 213, 224));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));

        jPanel1.setBackground(new java.awt.Color(211, 213, 224));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));
        jPanel1.setVisible(false);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HD-wallpaper-blue-pink-gradient-android-awesome-cool-decent-iphone-new-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String tipo = cboTipo.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        try {
            if(tipo.equals("ADMINISTRADOR")) {
                Administrador admin = new Administrador(nombre, contraseña);
                admin = AdministradorDAO.getInstancia().login(admin);
                if(admin != null){
                    Globales.adminGlobal = admin;
                    FrmPrincipal x = new FrmPrincipal();
                    x.setVisible(true);
                    dispose();
                }
            }
            if(tipo.equals("SUPERVISOR")) {
                Supervisor supervisor = new Supervisor(nombre, contraseña);
                supervisor = SupervisorDAO.getInstancia().login(supervisor);
                if(supervisor != null){
                    Globales.supervisorGlobal = supervisor;
                    FrmPrincipal x = new FrmPrincipal();
                    x.setVisible(true);
                    dispose();
                }
            }
            if(tipo.equals("CAJERO")) {
                Cajero cajero = new Cajero(nombre, contraseña);
                cajero = CajeroDAO.getInstancia().login(cajero);
                if(cajero != null){
                    Globales.cajeroGlobal = cajero;
                    FrmPrincipal x = new FrmPrincipal();
                    x.setVisible(true);
                    dispose();
                }
            }

        }catch(SQLException e) {
           JOptionPane.showMessageDialog(null, "ERROR DE CONEXION" + e.getMessage());
        }
        
        if(tipo.equals("SUPERVISOR")) {
            
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombre = txtNombre.getText();
        
        if(nombre.equals("")){
            String tipo = cboTipo.getSelectedItem().toString();
            if(tipo.equals("ADMINISTRADOR")) {
                txtNombre.setText("NOMBRE");
            }
            if(tipo.equals("SUPERVISOR")) {
                txtNombre.setText("ID SUPERVISOR");
            }
            if(tipo.equals("CAJERO")) {
                txtNombre.setText("ID CAJERO");
            }
        }
        txtNombre.setForeground(new Color(127,132,138));
            
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        String nombre = txtNombre.getText();
        
        if(nombre.equals("NOMBRE") || nombre.equals("ID SUPERVISOR") || nombre.equals("ID CAJERO")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        if(contraseña.equals("CONTRASEÑA")){
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        if(contraseña.equalsIgnoreCase("CONTRASEÑA") || contraseña.equals("")){
            txtContraseña.setText("CONTRASEÑA");
            txtContraseña.setForeground(new Color(127,132,138));
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
        String tipo = cboTipo.getSelectedItem().toString();
        if(tipo.equals("ADMINISTRADOR")) {
            txtNombre.setText("NOMBRE");
            
        }
        if(tipo.equals("SUPERVISOR")) {
            txtNombre.setText("ID SUPERVISOR");
        }
        if(tipo.equals("CAJERO")) {
            txtNombre.setText("ID CAJERO");
        }
    }//GEN-LAST:event_cboTipoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
