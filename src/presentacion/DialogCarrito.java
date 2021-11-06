/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.CarritoDAO;
import entidad.Caja;
import entidad.Carrito;
import entidad.Cliente;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class DialogCarrito extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form DialogCarrito1
     */
    public DialogCarrito() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setSize(690, 580);
        setLocationRelativeTo(null);
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
        txtIdCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPuntosAcumulados = new javax.swing.JTextField();
        txtIdCarrito = new javax.swing.JTextField();
        txtMedioDePago = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        txtPuntosGanados = new javax.swing.JTextField();
        txtFechaHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Cliente"));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 40));

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 180, 40));

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 260, 40));

        txtPuntosAcumulados.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntos Acumulados"));
        jPanel1.add(txtPuntosAcumulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 160));

        txtIdCarrito.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Carrito"));
        getContentPane().add(txtIdCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 50));

        txtMedioDePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Medio de Pago"));
        getContentPane().add(txtMedioDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 50));

        txtImporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Importe"));
        getContentPane().add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 160, 50));

        txtPuntosGanados.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntos Ganados"));
        getContentPane().add(txtPuntosGanados, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 180, 50));

        txtFechaHora.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha y Hora"));
        getContentPane().add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 180, 50));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 600, 110));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String idCarrito = txtIdCarrito.getText();
        String fechaHora = txtFechaHora.getText();
        String medioDePago = txtMedioDePago.getText();
        int puntosGanados = Integer.parseInt(txtPuntosGanados.getText());
        double importe = Double.parseDouble(txtImporte.getText());

        String idCliente = txtIdCliente.getText();
        String nombreCliente = txtNombreCliente.getText();
        String dni = txtDni.getText();
        String email = txtEmail.getText();

        Cliente cliente = new Cliente(idCliente, dni, nombreCliente, email);
        Caja caja = new Caja();

        Carrito carrito = new Carrito(idCarrito, importe, fechaHora, medioDePago, puntosGanados, cliente, caja);
        try{
            CarritoDAO.getInstancia().agregar(carrito);
            CarritoDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch(SQLException su){
            JOptionPane.showMessageDialog(null, su.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCarrito dialog = new DialogCarrito();
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIdCarrito;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtMedioDePago;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPuntosAcumulados;
    private javax.swing.JTextField txtPuntosGanados;
    // End of variables declaration//GEN-END:variables
}
