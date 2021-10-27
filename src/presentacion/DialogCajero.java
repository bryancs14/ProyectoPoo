/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.CajaDAO;
import datos.CajeroDAO;
import entidad.Caja;
import entidad.Cajero;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogCajero extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Caja cajaSelec = null;
    
    public DialogCajero() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setSize(800, 800);
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            CajeroDAO.getInstancia().mostrar(modelo);
        } catch (SQLException ca) {
            JOptionPane.showMessageDialog(null,ca.getMessage());
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
        txtIdCajero.setText("");
        txtNombre.setText("");
        txtTurno.setText("");
        txtContraseña.setText("");
        txtIdCaja.setText("");
        txtNdeCaja.setText("");
        
        txtIdCajero.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSeleccionarCategoria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNdeCaja = new javax.swing.JTextField();
        txtIdCaja = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdCajero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        jTable1.setModel(modelo);
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(255, 153, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 600, 220));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAJA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 2, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionarCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionarCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnSeleccionarCategoria.setText("Seleccionar");
        btnSeleccionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, 30));

        jLabel3.setText("ID CAJA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setText("Nº DE CAJA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNdeCaja.setEditable(false);
        jPanel1.add(txtNdeCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, -1));

        txtIdCaja.setEditable(false);
        jPanel1.add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 380, 170));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 30));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 30));

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        btnRestaurar.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 210, 400));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAJERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 2, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        jLabel1.setText("ID CAJERO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel3.add(txtIdCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, -1));

        jLabel4.setText("CONTRASEÑA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setText("TURNO");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel3.add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, -1));
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCategoriaActionPerformed
        // TODO add your handling code here:
        DialogBuscarCaja f = new DialogBuscarCaja();
        f.setVisible(true);
        cajaSelec = f.cajaSelec;
        txtIdCaja.setText(cajaSelec.getIdCaja());
        txtNdeCaja.setText(String.valueOf(cajaSelec.getNumeroDeCaja()));  
    }//GEN-LAST:event_btnSeleccionarCategoriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String idCajero=txtIdCajero.getText();
        String nombre=txtNombre.getText();
        String turno=txtTurno.getText();
        String contraseña=txtContraseña.getText();

        Cajero cajero= new Cajero(idCajero,nombre,turno,contraseña,cajaSelec);
        try{
            CajeroDAO.getInstancia().agregar(cajero);
            CajeroDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            String idCajero=txtIdCajero.getText();
            String nombre=txtNombre.getText();
            String turno=txtTurno.getText();
            String contraseña=txtContraseña.getText();

            Cajero cajero= new Cajero(idCajero, nombre, turno, contraseña, cajaSelec);

            CajeroDAO.getInstancia().actualizar(cajero);
            CajeroDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Modificado");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idCajero=txtIdCajero.getText();
        
        if(idCajero.equalsIgnoreCase(""))
        JOptionPane.showMessageDialog(null, "INGRESE DATOS CORRECTOS");
        else
        {
            try{
                Cajero cajeroBuscado = CajeroDAO.getInstancia().buscarCajero(idCajero);
                if(cajeroBuscado!=null)
                {
                    txtIdCajero.setText(cajeroBuscado.getIdCajero());
                    txtNombre.setText(cajeroBuscado.getNombre());
                    txtTurno.setText(cajeroBuscado.getTurno());
                    txtContraseña.setText(cajeroBuscado.getContraseña());
                    
                    cajaSelec = cajeroBuscado.getCaja();
                    
                    txtIdCaja.setText(cajeroBuscado.getCaja().getIdCaja());
                    txtNdeCaja.setText(String.valueOf(cajeroBuscado.getCaja().getNumeroDeCaja()));                 
                    habilitar();
                }
                else
                JOptionPane.showMessageDialog(null, "El ID Cajero no existe");
            } catch(SQLException su) {
                JOptionPane.showMessageDialog(null,su.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
       try{

            int res = JOptionPane.showConfirmDialog(this, "¿Proceso eliminarlo? ", "Eliminar Dato", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){
                String idCajero = txtIdCajero.getText();
                CajeroDAO.getInstancia().eliminar(idCajero);
                CajeroDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Cajero eliminado");

            } else
            JOptionPane.showMessageDialog(null,"El Id Cajero no existe");
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
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCajero dialog = new DialogCajero();
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
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSeleccionarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtIdCaja;
    private javax.swing.JTextField txtIdCajero;
    private javax.swing.JTextField txtNdeCaja;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
