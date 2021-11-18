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
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import entidad.Validaciones;


public class DialogProducto extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Categoria categoriaSelected = null;
    Validaciones x = new Validaciones();
    
    /**
     * Creates new form DialogProducto
     */
    public DialogProducto() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
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
        btnGenerarReporte.setEnabled(false);
    }
    
     
    private void desHabilitar(){
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnGenerarReporte.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 690));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1154, 716));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Productos 2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 450, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Productos.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 450, 370));

        jPanel2.setBackground(new java.awt.Color(0, 162, 230));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 10, 360));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("PRODUCTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, -1));

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

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("ID PRODUCTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("PRECIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 20));

        txtIdProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtIdProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdProducto.setForeground(new java.awt.Color(204, 204, 204));
        txtIdProducto.setText("Ingrese ID PRODUCTO");
        txtIdProducto.setBorder(null);
        txtIdProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdProductoMousePressed(evt);
            }
        });
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, 20));

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
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 20));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Ingrese PRECIO");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 290, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Producto - icono.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 80));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("CATEGORIA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 150, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1486506235-groceries-online-shopping-cart-e-commerce-shopping-cart_81445.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 110, 100));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("ID CATEGORIA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        txtIdCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCategoria.setForeground(new java.awt.Color(204, 204, 204));
        txtIdCategoria.setText("Ingrese ID CATEGORIA");
        txtIdCategoria.setBorder(null);
        txtIdCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdCategoriaMousePressed(evt);
            }
        });
        jPanel1.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 290, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 290, 20));

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("NOMBRE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 100, 30));

        txtNombreCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreCategoria.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCategoria.setText("Ingrese NOMBRE DE LA CATEGORIA");
        txtNombreCategoria.setBorder(null);
        txtNombreCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreCategoriaMousePressed(evt);
            }
        });
        txtNombreCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 290, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 290, 10));

        btnGuardar.setBackground(new java.awt.Color(0, 162, 230));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 40));

        btnConsultar.setBackground(new java.awt.Color(0, 162, 230));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(0, 162, 230));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(0, 162, 230));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 130, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 162, 230));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 40));

        btnSeleccionar.setBackground(new java.awt.Color(0, 162, 230));
        btnSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, 40));

        btnGenerarReporte.setBackground(new java.awt.Color(0, 162, 230));
        btnGenerarReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarReporte.setText("GENERAR REPORTE");
        btnGenerarReporte.setBorder(null);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 130, 40));

        jTable1.setBackground(new java.awt.Color(0, 162, 230));
        jTable1.setModel(modelo);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 720, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 720));

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

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

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
    }                                          

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {                                           
 
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        DialogBuscarCategoria d = new DialogBuscarCategoria();
        d.setVisible(true);
        categoriaSelected = d.categoriaSelec;
        txtIdCategoria.setText(categoriaSelected.getIdCategoria());
        txtNombreCategoria.setText(categoriaSelected.getNombre());

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
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
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtIdProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdProductoMousePressed
        if(txtIdProducto.getText().equals("Ingrese ID PRODUCTO")){
            txtIdProducto.setText("");
            txtIdProducto.setForeground(new Color(153,153,153));
        }    
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese NOMBRE");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if(txtPrecio.getText().isEmpty()){
            txtPrecio.setText("Ingrese PRECIO");
            txtPrecio.setForeground(new Color(204,204,204));
        }    
    }//GEN-LAST:event_txtIdProductoMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtIdProducto.getText().isEmpty()){
            txtIdProducto.setText("Ingrese ID PRODUCTO");
            txtIdProducto.setForeground(new Color(204,204,204));
        }
        if(txtNombre.getText().equals("Ingrese NOMBRE")){
            txtNombre.setText("");
            txtNombre.setForeground(new Color(153,153,153));
        }
        if(txtPrecio.getText().isEmpty()){
            txtPrecio.setText("Ingrese PRECIO");
            txtPrecio.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        if(txtIdProducto.getText().isEmpty()){
            txtIdProducto.setText("Ingrese ID PRODUCTO");
            txtIdProducto.setForeground(new Color(204,204,204));
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese NOMBRE");
            txtNombre.setForeground(new Color (204,204,204));
        }
        if(txtPrecio.getText().equals("Ingrese PRECIO")){
            txtPrecio.setText("");
            txtPrecio.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtIdCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdCategoriaMousePressed
        if(txtIdCategoria.getText().equals("Ingrese ID CATEGORIA")){
            txtIdCategoria.setText("");
            txtIdCategoria.setForeground(new Color(153,153,153));
        }    
        if(txtNombreCategoria.getText().isEmpty()){
            txtNombreCategoria.setText("Ingrese NOMBRE DE LA CATEGORIA");
            txtNombreCategoria.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtIdCategoriaMousePressed

    private void txtNombreCategoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCategoriaMousePressed
         if(txtIdCategoria.getText().isEmpty()){
            txtIdCategoria.setText("Ingrese ID CATEGORIA");
            txtIdCategoria.setForeground(new Color(204,204,204));
        }
        if(txtNombreCategoria.getText().equals("Ingrese NOMBRE DE LA CATEGORIA")){
            txtNombreCategoria.setText("");
            txtNombreCategoria.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreCategoriaMousePressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCategoriaKeyTyped
        x.validarLetras(evt);
    }//GEN-LAST:event_txtNombreCategoriaKeyTyped

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCategoria;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
