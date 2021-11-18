
package presentacion;
import java.awt.Color;
import javax.swing.JPanel;

public class FrmPrincipalCajero extends javax.swing.JFrame {

    private static FrmPrincipalCajero instancia;

    public static FrmPrincipalCajero getInstancia() {
        if(instancia == null){
            instancia = new FrmPrincipalCajero();
        }
        return instancia;
    }
    public FrmPrincipalCajero() {
        initComponents();
        setLocationRelativeTo(null);
        deshabilitar();
    }
    
    public void setColor(JPanel x){
        x.setBackground(new Color(255, 255, 100));
    }
    
    public void resetColor(JPanel x){
        x.setBackground(new Color(245, 253, 0));
    }
    
    public void deshabilitar() {
        if(Globales.adminGlobal != null) {
            
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

        jPanelOperaciones = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCliente = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jPanelCarrito = new javax.swing.JPanel();
        btnAgregarCarrito = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnBuscarCarrito = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOperaciones.setBackground(new java.awt.Color(230, 230, 0));
        jPanelOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("SUPERMARKET");
        jPanelOperaciones.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 190, -1));
        jPanelOperaciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 10));

        btnCliente.setBackground(new java.awt.Color(245, 253, 0));
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
        });
        btnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shop_cashier_man_icon_187602.png"))); // NOI18N
        btnCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cliente");
        btnCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanelOperaciones.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 60));

        btnCarrito.setBackground(new java.awt.Color(245, 253, 0));
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarritoMouseExited(evt);
            }
        });
        btnCarrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart_outline_icon_139049.png"))); // NOI18N
        btnCarrito.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Carrito");
        btnCarrito.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanelOperaciones.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 270, 60));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("X");
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
        jPanelOperaciones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 30));

        getContentPane().add(jPanelOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        jPanelCarrito.setBackground(new java.awt.Color(230, 230, 0));
        jPanelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCarritoMouseExited(evt);
            }
        });

        btnAgregarCarrito.setBackground(new java.awt.Color(245, 253, 0));
        btnAgregarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseExited(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("AGREGAR CARRITO");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-carrito.png"))); // NOI18N

        javax.swing.GroupLayout btnAgregarCarritoLayout = new javax.swing.GroupLayout(btnAgregarCarrito);
        btnAgregarCarrito.setLayout(btnAgregarCarritoLayout);
        btnAgregarCarritoLayout.setHorizontalGroup(
            btnAgregarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnAgregarCarritoLayout.setVerticalGroup(
            btnAgregarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBuscarCarrito.setBackground(new java.awt.Color(245, 253, 0));
        btnBuscarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCarritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCarritoMouseExited(evt);
            }
        });

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("BUSCAR CARRITO");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnBuscarCarritoLayout = new javax.swing.GroupLayout(btnBuscarCarrito);
        btnBuscarCarrito.setLayout(btnBuscarCarritoLayout);
        btnBuscarCarritoLayout.setHorizontalGroup(
            btnBuscarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        btnBuscarCarritoLayout.setVerticalGroup(
            btnBuscarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnBuscarCarritoLayout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCarritoLayout = new javax.swing.GroupLayout(jPanelCarrito);
        jPanelCarrito.setLayout(jPanelCarritoLayout);
        jPanelCarritoLayout.setHorizontalGroup(
            jPanelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarritoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelCarritoLayout.setVerticalGroup(
            jPanelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarritoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 260, 100));
        jPanelCarrito.setVisible(false);

        jPanelCliente.setBackground(new java.awt.Color(230, 230, 0));
        jPanelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelClienteMouseExited(evt);
            }
        });

        btnBuscarCliente.setBackground(new java.awt.Color(245, 253, 0));
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("BUSCAR CLIENTE");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarClienteLayout = new javax.swing.GroupLayout(btnBuscarCliente);
        btnBuscarCliente.setLayout(btnBuscarClienteLayout);
        btnBuscarClienteLayout.setHorizontalGroup(
            btnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnBuscarClienteLayout.setVerticalGroup(
            btnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 230, 60));
        jPanelCliente.setVisible(false);

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/238-2385310_super-market-atm-machine-simulator-shopping-mall.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 850, 770));

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarritoMouseEntered
        setColor(btnCarrito);
        jPanelCarrito.setVisible(true);
    }//GEN-LAST:event_btnCarritoMouseEntered

    private void btnCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarritoMouseExited
        resetColor(btnCarrito);
        jPanelCarrito.setVisible(false);
    }//GEN-LAST:event_btnCarritoMouseExited

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        setColor(btnCliente);
        jPanelCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        resetColor(btnCliente);
        jPanelCliente.setVisible(false);
        
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAgregarCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseClicked
        DialogCarrito2 f = new DialogCarrito2();
        f.setVisible(true);
    }//GEN-LAST:event_btnAgregarCarritoMouseClicked

    private void btnAgregarCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseEntered
        setColor(btnAgregarCarrito);
        jPanelCarrito.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarCarritoMouseEntered

    private void btnAgregarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseExited
        resetColor(btnAgregarCarrito);
    }//GEN-LAST:event_btnAgregarCarritoMouseExited

    private void btnBuscarCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCarritoMouseClicked
        DialogBuscarCategoria f = new DialogBuscarCategoria();
        f.setVisible(true);
    }//GEN-LAST:event_btnBuscarCarritoMouseClicked

    private void btnBuscarCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCarritoMouseEntered
        setColor(btnBuscarCarrito);
        jPanelCarrito.setVisible(true);
    }//GEN-LAST:event_btnBuscarCarritoMouseEntered

    private void btnBuscarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCarritoMouseExited
        resetColor(btnBuscarCarrito);
    }//GEN-LAST:event_btnBuscarCarritoMouseExited

    private void jPanelCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarritoMouseEntered
        jPanelCarrito.setVisible(true);
    }//GEN-LAST:event_jPanelCarritoMouseEntered

    private void jPanelCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarritoMouseExited
        jPanelCarrito.setVisible(false);
    }//GEN-LAST:event_jPanelCarritoMouseExited

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        DialogBuscarCliente1 f = new DialogBuscarCliente1();
        f.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        setColor(btnBuscarCliente);
        jPanelCliente.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        resetColor(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void jPanelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClienteMouseEntered
        jPanelCliente.setVisible(true);
    }//GEN-LAST:event_jPanelClienteMouseEntered

    private void jPanelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClienteMouseExited
        jPanelCliente.setVisible(false);
    }//GEN-LAST:event_jPanelClienteMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.white);
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    
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
            java.util.logging.Logger.getLogger(FrmPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel btnAgregarCarrito;
    private javax.swing.JPanel btnBuscarCarrito;
    private javax.swing.JPanel btnBuscarCliente;
    private javax.swing.JPanel btnCarrito;
    private javax.swing.JPanel btnCliente;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCarrito;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelOperaciones;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
