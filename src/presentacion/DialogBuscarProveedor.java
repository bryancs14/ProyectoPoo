/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.ProveedorDAO;
import entidad.Proveedor;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogBuscarProveedor extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    public Proveedor proveedorSelec = new Proveedor();
    
    public DialogBuscarProveedor() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        try {
            ProveedorDAO.getInstancia().mostrar(modelo);
        } catch (SQLException pro) {
            JOptionPane.showMessageDialog(null,pro.getMessage());
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

        jPanel1Blanco = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Blanco.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1Blanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionar.setBackground(new java.awt.Color(0, 0, 0));
        btnSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(0, 204, 204));
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, 160, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 204, 204));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 170, 40));

        btnTodos.setBackground(new java.awt.Color(0, 0, 0));
        btnTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(0, 204, 204));
        btnTodos.setText("TODOS");
        btnTodos.setBorder(null);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1Blanco.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 730, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setText("BUSCADOR DE PROVEEDOR");
        jPanel1Blanco.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 380, 30));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setText("NOMBRE");
        jPanel1Blanco.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 100, 30));

        txtNombreProveedor.setBackground(new java.awt.Color(0, 204, 204));
        txtNombreProveedor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProveedor.setText("Ingrese su nombre del proveedor");
        txtNombreProveedor.setBorder(null);
        txtNombreProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyReleased(evt);
            }
        });
        jPanel1Blanco.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 230, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1Blanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 290, 10));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconDialogBuscar/CapturaProveedorBuscar2.jpg"))); // NOI18N
        jPanel1Blanco.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 470));

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
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
        jPanel1Blanco.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 470, 30, 30));
        btnSalir.setBorderPainted(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBackground(new java.awt.Color(255, 204, 153));
        Tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        Tabla.setModel(modelo);
        Tabla.setGridColor(new java.awt.Color(255, 153, 0));
        Tabla.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(Tabla);

        jPanel1Blanco.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 630, 270));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUSCADOR DE PROVEEDOR");
        jPanel1Blanco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 400, -1));

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconDialogBuscar/PROVEEDOR2.png"))); // NOI18N
        jPanel1Blanco.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 150, 130));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconDialogBuscar/PROVEEDOR.png"))); // NOI18N
        jPanel1Blanco.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 150, 130));

        getContentPane().add(jPanel1Blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int i = Tabla.getSelectedRow();
        if(i!=-1) {
            proveedorSelec.setIdProveedor(modelo.getValueAt(i, 0).toString());
            proveedorSelec.setNombre(modelo.getValueAt(i, 1).toString());
            proveedorSelec.setTelefono(modelo.getValueAt(i, 2).toString());
            this.dispose();
        } else
        JOptionPane.showMessageDialog(null, "Debes Seleccionar un elemento");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            ProveedorDAO.getInstancia().mostrar(modelo);
        } catch (SQLException pro) {
            JOptionPane.showMessageDialog(null,pro.getMessage());
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idProveedor=txtNombreProveedor.getText();
        try {
            ProveedorDAO.getInstancia().buscarProveedor(idProveedor);
        } catch (SQLException pro) {
            JOptionPane.showMessageDialog(null, pro.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed

    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyReleased
        // TODO add your handling code here:
        String nombre=txtNombreProveedor.getText();
        try {
            ProveedorDAO.getInstancia().mostrarPorId(modelo, nombre);
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
    }//GEN-LAST:event_txtNombreProveedorKeyReleased

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
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
            java.util.logging.Logger.getLogger(DialogBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogBuscarProveedor dialog = new DialogBuscarProveedor();
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
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1Blanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNombreProveedor;
    // End of variables declaration//GEN-END:variables
}
