/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.CajaDAO;
import datos.Conexion;
import datos.ProductoDAO;
import entidad.Categoria;
import entidad.Producto;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


public class DialogProducto extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Categoria categoriaSelected = null;
    
    /**
     * Creates new form DialogProducto
     */
    public DialogProducto() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setSize(710, 630);
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            ProductoDAO.getInstancia().mostrar(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    private void habilitar(){
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnReporte.setEnabled(false);
    }
    
     
    private void desHabilitar(){
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnReporte.setEnabled(true);
    }     
    
    private void limpiarEntradas(){
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtIdCategoria.setText("");
        txtNombreCategoria.setText("");
        txtIdProducto.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtIdCategoria = new javax.swing.JTextField();
        txtNombreCategoria = new javax.swing.JTextField();
        btnSeleccionarCategoria = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 650, 290));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, -1));

        btnReporte.setText("GENERAR REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 150, -1));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 100, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 100, -1));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, -1));

        btnRestaurar.setText("RESTAURAR");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTO"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PRODUCTO"));
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 150, -1));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("PRECIO"));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 140));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CATEGORIA"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdCategoria.setEditable(false);
        txtIdCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("ID CATEGORIA"));
        jPanel2.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        txtNombreCategoria.setEditable(false);
        txtNombreCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE CATEGORIA"));
        jPanel2.add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        btnSeleccionarCategoria.setText("SELECCIONAR");
        btnSeleccionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 300, 140));

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(categoriaSelected != null) {
            String idProducto = txtIdProducto.getText();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());;

            Producto producto = new Producto(idProducto, nombre, precio, 0, categoriaSelected);

            try{
                ProductoDAO.getInstancia().agregar(producto);
                ProductoDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(null, "Dato registrado");
            } catch(SQLException su){
                JOptionPane.showMessageDialog(null, su.getMessage());
            }
            limpiarEntradas();
            desHabilitar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JasperReport reporte;
        Connection cn;
        try {
            cn = Conexion.getInstancia().miConexion();
            reporte = JasperCompileManager.compileReport("src/reportes/reporteProductos.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer.viewReport(jp, true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        } 
        
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            String idProducto = txtIdProducto.getText();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());

            Producto producto = new Producto(idProducto, nombre, precio, 0, categoriaSelected);
            
            ProductoDAO.getInstancia().actualizar(producto);
            ProductoDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Modificado");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try{

            int res = JOptionPane.showConfirmDialog(this, "¿Proceso Eliminarlo? ", "Eliminar caja", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){
                String idCaja = txtIdProducto.getText();
                CajaDAO.getInstancia().eliminar(idCaja);
                CajaDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Producto eliminado");

            } else
            JOptionPane.showMessageDialog(null,"El Id Producto no existe");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnSeleccionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCategoriaActionPerformed
        DialogBuscarCategoria d = new DialogBuscarCategoria();
        d.setVisible(true);
        categoriaSelected = d.categoriaSelec;
        txtIdCategoria.setText(categoriaSelected.getIdCategoria());
        txtNombreCategoria.setText(categoriaSelected.getNombre());
    }//GEN-LAST:event_btnSeleccionarCategoriaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String idProducto = txtIdProducto.getText();
        if(idProducto.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CORRECTOS");
        else
        {
            try{
                Producto productoBuscado = ProductoDAO.getInstancia().buscarProducto(idProducto);
                if(productoBuscado != null)
                {
                    txtNombre.setText(productoBuscado.getNombre());
                    txtPrecio.setText(String.valueOf(productoBuscado.getPrecioVenta()));
                    categoriaSelected = productoBuscado.getCategoria();
                    txtIdCategoria.setText(categoriaSelected.getIdCategoria());
                    txtNombreCategoria.setText(categoriaSelected.getNombre());
                    
                    habilitar();
            }
                else
                    JOptionPane.showMessageDialog(null, "El ID Producto no existe");
            } catch(SQLException su) {
                JOptionPane.showMessageDialog(null,su.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogProducto dialog = new DialogProducto();
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
    private javax.swing.JButton btnSeleccionarCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCategoria;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
