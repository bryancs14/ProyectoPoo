/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.SupervisorDAO;
import entidad.Supervisor;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidad.Validaciones;


public class DialogSupervisor extends javax.swing.JDialog {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    Validaciones x = new Validaciones();
    /**
     * Creates new form DialogSupervisor
     */
    public DialogSupervisor() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            SupervisorDAO.getInstancia().mostrar(modelo);
        } catch (SQLException sup) {
            JOptionPane.showMessageDialog(null,sup.getMessage());
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
        txtIdSupervisor.setText("");
        txtNombre.setText("");
        txtContraseña.setText("");
        txtIdSupervisor.requestFocus();
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
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdSupervisor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Supervisor 2.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 550, 780));

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
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("SUPERVISOR");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID SUPERVISOR");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("NOMBRE");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CONTRASEÑA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtIdSupervisor.setBackground(new java.awt.Color(255, 255, 255));
        txtIdSupervisor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdSupervisor.setForeground(new java.awt.Color(204, 204, 204));
        txtIdSupervisor.setText("Ingrese ID SUPERVISOR");
        txtIdSupervisor.setBorder(null);
        txtIdSupervisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdSupervisorMousePressed(evt);
            }
        });
        jPanel3.add(txtIdSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 10));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese NOMBRE");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 290, 20));

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
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 290, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 290, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono supervisor.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 110, 100));

        btnGuardar.setBackground(new java.awt.Color(244, 124, 29));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, 40));

        btnConsultar.setBackground(new java.awt.Color(244, 124, 29));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(244, 124, 29));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 130, 40));

        btnCancelar.setBackground(new java.awt.Color(244, 124, 29));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(244, 124, 29));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 130, 40));

        jTable1.setBackground(new java.awt.Color(244, 124, 29));
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 500, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 760));

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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdSupervisorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdSupervisorMousePressed
       if(txtIdSupervisor.getText().equals("Ingrese ID SUPERVISOR")){
            txtIdSupervisor.setText("");
            txtIdSupervisor.setForeground(new Color(51,51,51));
        }    
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese NOMBRE");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if(txtContraseña.getText().isEmpty()){
            txtContraseña.setText("********");
            txtContraseña.setForeground(new Color(204,204,204));
        }    
    }//GEN-LAST:event_txtIdSupervisorMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtIdSupervisor.getText().isEmpty()){
            txtIdSupervisor.setText("Ingrese ID SUPERVISOR");
            txtIdSupervisor.setForeground(new Color(204,204,204));
        }
        if(txtNombre.getText().equals("Ingrese NOMBRE")){
            txtNombre.setText("");
            txtNombre.setForeground(new Color(51,51,51));
        }
        if(txtContraseña.getText().isEmpty()){
            txtContraseña.setText("********");
            txtContraseña.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if(txtIdSupervisor.getText().isEmpty()){
            txtIdSupervisor.setText("Ingrese ID SUPERVISOR");
            txtIdSupervisor.setForeground(new Color(204,204,204));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese NOMBRE");
            txtNombre.setForeground(new Color (204,204,204));
        }
        if(txtContraseña.getText().equals("********")){
            txtContraseña.setText("");
            txtContraseña.setForeground(new Color (51,51,51));
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idSupervisor = txtIdSupervisor.getText();
        String nombre = txtNombre.getText();
        String contraseña = txtContraseña.getText();

        Supervisor supervisor = new Supervisor(idSupervisor, nombre,contraseña);
        try {
            SupervisorDAO.getInstancia().agregar(supervisor);
            SupervisorDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Supervisor Registrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String idSupervisor = txtIdSupervisor.getText();
        if(idSupervisor.equalsIgnoreCase(""))
        JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DEL SUPERVISOR");
        else
        {
            try {
                Supervisor x = SupervisorDAO.getInstancia().buscarSupervisor(idSupervisor);
                if(x != null) {
                    txtIdSupervisor.setText(x.getIdSupervisor());
                    txtNombre.setText(x.getNombre());
                    txtContraseña.setText(x.getContraseña());
                    habilitar();
                }
                else
                JOptionPane.showMessageDialog(null,"El ID no existe");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarEntradas();
        desHabilitar();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try{
            int resp = JOptionPane.showConfirmDialog(this, "¿Deseas Eliminarlo?", "Eliminar Supervisor", JOptionPane.YES_NO_OPTION );
            if( resp == JOptionPane.YES_OPTION ){
                String idSupervisor = txtIdSupervisor.getText();
                SupervisorDAO.getInstancia().eliminar(idSupervisor);
                SupervisorDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Supervisor eliminado");
            }
            else
            JOptionPane.showMessageDialog(null,"El ID no existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            String idSupervisor = txtIdSupervisor.getText();
            String nombre = txtNombre.getText();
            String contraseña = txtContraseña.getText();

            Supervisor x = new Supervisor(idSupervisor, nombre,contraseña);
            SupervisorDAO.getInstancia().actualizar(x);
            SupervisorDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Dato modificado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

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
            java.util.logging.Logger.getLogger(DialogSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogSupervisor dialog = new DialogSupervisor();
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtIdSupervisor;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
