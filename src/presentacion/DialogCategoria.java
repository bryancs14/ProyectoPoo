
package presentacion;


import datos.CategoriaDAO;
import datos.Conexion;
import entidad.Validaciones;
import entidad.Categoria;
import java.awt.Color;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class DialogCategoria extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    Validaciones x = new Validaciones();
    
    public DialogCategoria() {
        super(FrmPrincipal.getInstancia(), false);
        initComponents();
        setSize(990, 620);
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            CategoriaDAO.getInstancia().mostrar(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
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
        txtIdCategoria.setText("");
        txtNombre.setText("");
        txtIdCategoria.requestFocus();
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
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2Direccion = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1486506235-groceries-online-shopping-cart-e-commerce-shopping-cart_81445.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 100));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su nombre");
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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 51, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 10));

        jLabel2Direccion.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel2Direccion.setText("ID CATEGORIA");
        jPanel1.add(jLabel2Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 20));

        txtIdCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCategoria.setForeground(new java.awt.Color(204, 204, 204));
        txtIdCategoria.setText("Ingrese su ID Categoria");
        txtIdCategoria.setBorder(null);
        txtIdCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdCategoriaFocusLost(evt);
            }
        });
        jPanel1.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 51, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 290, 10));

        btnGuardar.setBackground(new java.awt.Color(255, 51, 102));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 40));

        btnConsultar.setBackground(new java.awt.Color(255, 51, 102));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(255, 51, 102));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 140, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 102));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, 40));

        jTable1.setBackground(new java.awt.Color(255, 102, 102));
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 480, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/categoria2.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 630, 720));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 20));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/mouse_pointer_icon_128799.png"))); // NOI18N
        jLabel7.setText("CATEGORIA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 50));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        btnReporte.setBackground(new java.awt.Color(255, 51, 102));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setText("GENERAR REPORTE");
        btnReporte.setBorder(null);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{

            int resp = JOptionPane.showConfirmDialog(this, "¿Deseas Eliminarlo?", "Eliminar Categoría", JOptionPane.YES_NO_OPTION );

            if( resp == JOptionPane.YES_OPTION ){
                String idCategoria = txtIdCategoria.getText();
                CategoriaDAO.getInstancia().eliminar(idCategoria);
                CategoriaDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Categoría eliminada");

            }
            else
            JOptionPane.showMessageDialog(null,"El ID no existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            String idCategoria = txtIdCategoria.getText();
            String nombre = txtNombre.getText();

            Categoria x = new Categoria(idCategoria, nombre);
            CategoriaDAO.getInstancia().actualizar(x);
            CategoriaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Dato modificado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String idCategoria = txtIdCategoria.getText();
        if(idCategoria.equalsIgnoreCase(""))
        JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE LA CATEGORIA");
        else
        {
            try {
                Categoria x = CategoriaDAO.getInstancia().buscarCategoria(idCategoria);
                if(x != null) {
                    txtIdCategoria.setText(x.getIdCategoria());
                    txtNombre.setText(x.getNombre());
                    habilitar();
                }
                else
                JOptionPane.showMessageDialog(null,"El ID no existe");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idCategoria = txtIdCategoria.getText();
        String nombre = txtNombre.getText();

        Categoria categoria = new Categoria(idCategoria, nombre);
        try {
            CategoriaDAO.getInstancia().agregar(categoria);
            CategoriaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Categoría Registrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        String nombre = txtNombre.getText();
        
        if(nombre.equalsIgnoreCase("Ingrese su nombre")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombre = txtNombre.getText();
        
        if(nombre.equalsIgnoreCase("Ingrese su nombre") || nombre.equals("")){
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtIdCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCategoriaFocusGained
        String id = txtIdCategoria.getText();
        
        if(id.equalsIgnoreCase("Ingrese su ID Categoria")){
            txtIdCategoria.setText("");
            txtIdCategoria.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIdCategoriaFocusGained

    private void txtIdCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCategoriaFocusLost
        String id = txtIdCategoria.getText();
        
        if(id.equalsIgnoreCase("Ingrese su ID Categoria") || id.equals("")){
            txtIdCategoria.setText("Ingrese su ID Categoria");
            txtIdCategoria.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtIdCategoriaFocusLost

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JasperReport reporte;
        Connection cn = Conexion.getInstancia().miConexion();
        try {
            /*reporte = JasperCompileManager.compileReport("src/reportes/reportCategoria.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer.viewReport(jp, true);*/
            reporte = JasperCompileManager.compileReport("src/reportes/reportCategoria.jrxml");
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(imprimir, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(DialogCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCategoria dialog = new DialogCategoria();
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
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2Direccion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
