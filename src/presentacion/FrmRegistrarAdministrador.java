
package presentacion;
import datos.AdministradorDAO;
import datos.Conexion;
import datos.SupermercadoDAO;
import entidad.Administrador;
import entidad.Supermercado;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class FrmRegistrarAdministrador extends javax.swing.JFrame {
    private static Supermercado supermercado;

    public FrmRegistrarAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(370, 500);
        txtNombre.setBorder(new LineBorder(Color.LIGHT_GRAY));
        txtContraseña.setBorder(new LineBorder(Color.LIGHT_GRAY));
        traerSuper();
    }
    
    private static void traerSuper() {
        try {
            supermercado = SupermercadoDAO.getInstancia().obtenerPrimerSupermercado();
            
        } catch (SQLException sup) {
            JOptionPane.showMessageDialog(null,sup.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(116, 98, 98));
        jLabel1.setText("REGISTRARSE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        Fondo.setBackground(new java.awt.Color(243, 243, 246));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 30, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado_1.png"))); // NOI18N
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 30, 40));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setText("NOMBRE");
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(213, 212, 212));
        txtNombre.setSelectionColor(new java.awt.Color(213, 212, 212));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        Fondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 40));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContraseña.setText("CONTRASEÑA");
        txtContraseña.setToolTipText("CONTRASEÑA");
        txtContraseña.setBorder(null);
        txtContraseña.setCaretColor(new java.awt.Color(213, 212, 212));
        txtContraseña.setSelectionColor(new java.awt.Color(213, 212, 212));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        Fondo.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, 40));

        btnRegistrar.setBackground(new java.awt.Color(89, 180, 89));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 254, 255));
        jLabel2.setText("REGISTRAR");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        String nombre = txtNombre.getText();
        
        if(nombre.equals("NOMBRE")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombre = txtNombre.getText();
        
        if(nombre.equals("NOMBRE") || nombre.equals("")){
            txtNombre.setText("NOMBRE");
            txtNombre.setForeground(new Color(127,132,138));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        String contraseña = String.valueOf(txtContraseña.getPassword());
        if(contraseña.equals("CONTRASEÑA")){
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        if(contraseña.equals("CONTRASEÑA") || contraseña.equals("")){
            txtContraseña.setText("CONTRASEÑA");
            txtContraseña.setForeground(new Color(127,132,138));
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String nombreAdministrador=txtNombre.getText();
        String contraseña=String.valueOf(txtContraseña.getPassword());
        
        try {
            Administrador administrador= new Administrador("1", nombreAdministrador, contraseña, supermercado);
            AdministradorDAO.getInstancia().agregar(administrador);

            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            dispose();
            FrmPrincipal frmPrincipal = new FrmPrincipal();
            frmPrincipal.setVisible(true);
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    
    public void setColor(JPanel h){
        h.setBackground(new Color(68, 155, 68));
    }
    
    public void resetColor(JPanel h){
        h.setBackground(new Color(89, 180, 89));
    }
    
    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        setColor(btnRegistrar);
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        resetColor(btnRegistrar);
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        
    }//GEN-LAST:event_txtContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
