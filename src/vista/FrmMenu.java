package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author asus
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;
    
    
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Reservas");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_editar_usuario = new javax.swing.JMenuItem();
        jMenuItem_eliminar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_registrar_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_ver_cliente = new javax.swing.JMenuItem();
        jMenuItem_editar_cliente = new javax.swing.JMenuItem();
        jMenuItem_eliminar_cliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nueva_reserva = new javax.swing.JMenuItem();
        jMenuItem_ver_mesa_disponible = new javax.swing.JMenuItem();
        jMenuItem1_ver_estado_mesa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_cambiar_reserva = new javax.swing.JMenuItem();
        jMenuItem1_eliminar_reserva = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_ver_historial_completo = new javax.swing.JMenuItem();
        jMenuItem_buscar_reserva = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_ver_facturacion_pendiente = new javax.swing.JMenuItem();
        jMenuItem_generar_factura = new javax.swing.JMenuItem();
        jMenuItem_ver_facturas_emitidas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_generar_reporte_ventas = new javax.swing.JMenuItem();
        jMenuItem_generar_reporte_reservas = new javax.swing.JMenuItem();
        jMenuItem_generar_reporte_general = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 5.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_editar_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_editar_usuario.setText("Editar Usuario");
        jMenuItem_editar_usuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_editar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_editar_usuario);

        jMenuItem_eliminar_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_eliminar_usuario.setText("Eliminar Usuario");
        jMenuItem_eliminar_usuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu1.add(jMenuItem_eliminar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 6.png"))); // NOI18N
        jMenu2.setText("Clientes");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_registrar_nuevo_cliente.setText("Registar nuevo cliente");
        jMenuItem_registrar_nuevo_cliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registrar_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_registrar_nuevo_cliente);

        jMenuItem_ver_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_cliente.setText("Ver lista de clientes");
        jMenuItem_ver_cliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem_ver_cliente);

        jMenuItem_editar_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_editar_cliente.setText("Editar cliente");
        jMenuItem_editar_cliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editar_clienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_editar_cliente);

        jMenuItem_eliminar_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_eliminar_cliente.setText("Eliminar cliente");
        jMenuItem_eliminar_cliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu2.add(jMenuItem_eliminar_cliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 10 (2).png"))); // NOI18N
        jMenu3.setText("Realizar R.");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_reserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_nueva_reserva.setText("Nueva reserva");
        jMenuItem_nueva_reserva.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_reservaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nueva_reserva);

        jMenuItem_ver_mesa_disponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_mesa_disponible.setText("Ver mesas disponibles");
        jMenuItem_ver_mesa_disponible.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu3.add(jMenuItem_ver_mesa_disponible);

        jMenuItem1_ver_estado_mesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1_ver_estado_mesa.setText("Ver estado de mesas");
        jMenuItem1_ver_estado_mesa.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem1_ver_estado_mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_ver_estado_mesaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1_ver_estado_mesa);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 8.png"))); // NOI18N
        jMenu4.setText("Modificar R.");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_cambiar_reserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_cambiar_reserva.setText("Cambiar reserva");
        jMenuItem_cambiar_reserva.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu4.add(jMenuItem_cambiar_reserva);

        jMenuItem1_eliminar_reserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1_eliminar_reserva.setText("Elminar reserva");
        jMenuItem1_eliminar_reserva.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu4.add(jMenuItem1_eliminar_reserva);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 9.png"))); // NOI18N
        jMenu5.setText("Historial R.");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial_completo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_historial_completo.setText("Ver historial completo");
        jMenuItem_ver_historial_completo.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem_ver_historial_completo);

        jMenuItem_buscar_reserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_buscar_reserva.setText("Buscar reserva");
        jMenuItem_buscar_reserva.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu5.add(jMenuItem_buscar_reserva);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 10.png"))); // NOI18N
        jMenu6.setText("Facturación R.");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_facturacion_pendiente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_facturacion_pendiente.setText("Ver facturación pendiente");
        jMenuItem_ver_facturacion_pendiente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_ver_facturacion_pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_facturacion_pendienteActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_ver_facturacion_pendiente);

        jMenuItem_generar_factura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_generar_factura.setText("Generar factura");
        jMenuItem_generar_factura.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_generar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_generar_facturaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_generar_factura);

        jMenuItem_ver_facturas_emitidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_ver_facturas_emitidas.setText("Ver facturas emitidas");
        jMenuItem_ver_facturas_emitidas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_ver_facturas_emitidas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 11.png"))); // NOI18N
        jMenu7.setText("Reportes");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setMinimumSize(new java.awt.Dimension(150, 50));
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_generar_reporte_ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_generar_reporte_ventas.setText("Generar reporte de ventas");
        jMenuItem_generar_reporte_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_generar_reporte_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_generar_reporte_ventasActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_generar_reporte_ventas);

        jMenuItem_generar_reporte_reservas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_generar_reporte_reservas.setText("Generar reporte de ventas");
        jMenuItem_generar_reporte_reservas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_generar_reporte_reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_generar_reporte_reservasActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_generar_reporte_reservas);

        jMenuItem_generar_reporte_general.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_generar_reporte_general.setText("Generer reporte general");
        jMenuItem_generar_reporte_general.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_generar_reporte_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_generar_reporte_generalActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_generar_reporte_general);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Recurso 12.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setMinimumSize(new java.awt.Dimension(200, 50));
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_cerrar_sesion.setText("Confirmar cierre de sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_registrar_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_nuevo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_registrar_nuevo_clienteActionPerformed

    private void jMenuItem_editar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editar_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_editar_usuarioActionPerformed

    private void jMenuItem_editar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editar_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_editar_clienteActionPerformed

    private void jMenuItem_nueva_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_reservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nueva_reservaActionPerformed

    private void jMenuItem_ver_facturacion_pendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_facturacion_pendienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ver_facturacion_pendienteActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem1_ver_estado_mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_ver_estado_mesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1_ver_estado_mesaActionPerformed

    private void jMenuItem_generar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_generar_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_generar_facturaActionPerformed

    private void jMenuItem_generar_reporte_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_generar_reporte_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_generar_reporte_ventasActionPerformed

    private void jMenuItem_generar_reporte_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_generar_reporte_generalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_generar_reporte_generalActionPerformed

    private void jMenuItem_generar_reporte_reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_generar_reporte_reservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_generar_reporte_reservasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_eliminar_reserva;
    private javax.swing.JMenuItem jMenuItem1_ver_estado_mesa;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_buscar_reserva;
    private javax.swing.JMenuItem jMenuItem_cambiar_reserva;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_editar_cliente;
    private javax.swing.JMenuItem jMenuItem_editar_usuario;
    private javax.swing.JMenuItem jMenuItem_eliminar_cliente;
    private javax.swing.JMenuItem jMenuItem_eliminar_usuario;
    private javax.swing.JMenuItem jMenuItem_generar_factura;
    private javax.swing.JMenuItem jMenuItem_generar_reporte_general;
    private javax.swing.JMenuItem jMenuItem_generar_reporte_reservas;
    private javax.swing.JMenuItem jMenuItem_generar_reporte_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_reserva;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_registrar_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_ver_cliente;
    private javax.swing.JMenuItem jMenuItem_ver_facturacion_pendiente;
    private javax.swing.JMenuItem jMenuItem_ver_facturas_emitidas;
    private javax.swing.JMenuItem jMenuItem_ver_historial_completo;
    private javax.swing.JMenuItem jMenuItem_ver_mesa_disponible;
    // End of variables declaration//GEN-END:variables
}
