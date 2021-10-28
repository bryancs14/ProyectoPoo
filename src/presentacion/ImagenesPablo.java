
package presentacion;

public class ImagenesPablo extends javax.swing.JDialog {

    public ImagenesPablo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 40));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, -1));

        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restaurar.png"))); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 90, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        /*String idSupermercado=txtIdSupermercado.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();

        Supermercado supermercado = new Supermercado(idSupermercado, nombre, direccion);
        try {
            SupermercadoDAO.getInstancia().agregar(supermercado);
            SupermercadoDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null, "Dato registrado");
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, s.getMessage());
        }
        limpiarEntradas();
        desHabilitar();*/
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        /*// TODO add your handling code here:
        String idSupermercado=txtIdSupermercado.getText();
        if(idSupermercado.equalsIgnoreCase(""))
        JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA ID SUPERMERCADO");
        else
        {
            try{
                Supermercado sup = SupermercadoDAO.getInstancia().buscarSupermercado(idSupermercado);
                if(sup!=null)
                {
                    txtIdSupermercado.setText(sup.getIdSupermercado());
                    txtNombre.setText(sup.getNombre());
                    txtDireccion.setText(sup.getDireccion());
                    habilitar();
                }
                else
                JOptionPane.showMessageDialog(null, "El ID SUPERMERCADO NO EXISTE");
            }catch(SQLException s){
                JOptionPane.showMessageDialog(null,s.getMessage());
            }
        }*/
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        /*try{
            String idSupermercado = txtIdSupermercado.getText();
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            Supermercado sup=new Supermercado(idSupermercado, nombre,direccion);

            SupermercadoDAO.getInstancia().actualizar(sup);
            SupermercadoDAO.getInstancia().mostrar(modelo);
            JOptionPane.showMessageDialog(null,"Actualizacion finalizada");
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null,s.getMessage());
        }
        limpiarEntradas();
        desHabilitar();*/
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        /*try{
            int res = JOptionPane.showConfirmDialog(this, "¿Procedo a Eliminarlo? ", "Eliminar Supermercado", JOptionPane.YES_NO_OPTION );

            if( res == JOptionPane.YES_OPTION ){

                String idSupermercado = txtIdSupermercado.getText();
                SupermercadoDAO.getInstancia().eliminar(idSupermercado);
                SupermercadoDAO.getInstancia().mostrar(modelo);
                JOptionPane.showMessageDialog(this,"Eliminacion exitosa");
            }
            else
            JOptionPane.showMessageDialog(null,"El id Supermercado no existe");
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null,s.getMessage());
        }
        limpiarEntradas();
        desHabilitar();
*/
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
