/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
//import datos.SupermercadoDAO;
import entidad.Supermercado;
import datos.CajaDAO;
import datos.SupermercadoDAO;
import entidad.Caja;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DialogCaja extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Supermercado supermercadoSelec = null;
    
    public DialogCaja() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setSize(650, 700);
        setLocationRelativeTo(null);
        desHabilitar();
        try {
            CajaDAO.getInstancia().mostrar(modelo);
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
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
        txtIdCaja.setText("");
        txtNdeCaja.setText("");
        txtIdSupermercado.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtIdCaja.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdSupermercado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnSeleccionarSupermercado = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNdeCaja = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdCaja = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        jTable1.setModel(modelo);
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(255, 153, 0));
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 600, 230));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUPERMERCADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 2, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ID SUPERMERCADO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtIdSupermercado.setEditable(false);
        jPanel1.add(txtIdSupermercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        txtNombre.setEditable(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        btnSeleccionarSupermercado.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionarSupermercado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 11)); // NOI18N
        btnSeleccionarSupermercado.setText("Seleccionar");
        btnSeleccionarSupermercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarSupermercadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarSupermercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 130, 30));

        txtDireccion.setEditable(false);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        jLabel8.setText("DIRECCION");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 380, 230));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, 390));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAJA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 2, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nº DE CAJA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel3.add(txtNdeCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        jLabel1.setText("ID CAJA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel3.add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarSupermercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarSupermercadoActionPerformed
        // TODO add your handling code here:
        DialogBuscarSupermercado f = new DialogBuscarSupermercado();
        f.setVisible(true);
        supermercadoSelec = f.supermercadoSelec;
        
        txtIdSupermercado.setText(supermercadoSelec.getIdSupermercado());
        txtNombre.setText(supermercadoSelec.getNombre());
        txtDireccion.setText(supermercadoSelec.getDireccion());

    }//GEN-LAST:event_btnSeleccionarSupermercadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String idCaja = txtIdCaja.getText();
        int nDeCaja = Integer.parseInt(txtNdeCaja.getText());
       

        Caja caja= new Caja(idCaja, nDeCaja, supermercadoSelec);
        try{
            CajaDAO.getInstancia().agregar(caja);
            CajaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            String idcaja = txtIdCaja.getText();
            int ndeCaja = Integer.parseInt(txtNdeCaja.getText());
        
            Caja caja= new Caja(idcaja, ndeCaja, supermercadoSelec);
            
            CajaDAO.getInstancia().actualizar(caja);
            CajaDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Modificado");
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idcaja=txtIdCaja.getText();
        if(idcaja.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CORRECTOS");
        else
        {
            try{
                Caja cajaBuscada = CajaDAO.getInstancia().buscarCaja(idcaja);
                if(cajaBuscada != null)
                {
                    txtNdeCaja.setText(cajaBuscada.getSupermercado().getNombre());
                    
                    supermercadoSelec = cajaBuscada.getSupermercado();
                    
                    txtIdSupermercado.setText(cajaBuscada.getSupermercado().getIdSupermercado());
                    txtNombre.setText(cajaBuscada.getSupermercado().getNombre());
                    txtDireccion.setText(cajaBuscada.getSupermercado().getDireccion());
                    habilitar();
            }
            else
                    JOptionPane.showMessageDialog(null, "El ID Caja no existe");
            } catch(SQLException su) {
                JOptionPane.showMessageDialog(null,su.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try{

            int res = JOptionPane.showConfirmDialog(this, "¿Proceso Eliminarlo? ", "Eliminar caja", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){
                String idCaja = txtIdCaja.getText();
                CajaDAO.getInstancia().eliminar(idCaja);
                CajaDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Caja eliminado");

            } else
            JOptionPane.showMessageDialog(null,"El Id Caja no existe");
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
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCaja dialog = new DialogCaja();
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
    private javax.swing.JButton btnSeleccionarSupermercado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCaja;
    private javax.swing.JTextField txtIdSupermercado;
    private javax.swing.JTextField txtNdeCaja;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
