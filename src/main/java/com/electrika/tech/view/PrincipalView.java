
package com.electrika.tech.view;


public class PrincipalView extends javax.swing.JFrame {
    
    
    public PrincipalView() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        manageU = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        signOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1221, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jCheckBoxMenuItem7.setText("Registro Ingreso/Salida");
        jMenu1.add(jCheckBoxMenuItem7);

        manageU.setText("Gestionar Usuarios");
        manageU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUMouseClicked(evt);
            }
        });
        manageU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUActionPerformed(evt);
            }
        });
        jMenu1.add(manageU);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");
        jMenu2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jCheckBoxMenuItem2.setText("Nuevo Cliente");
        jMenu2.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setText("Gestionar Clientes");
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Categoría");
        jMenu3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jCheckBoxMenuItem4.setText("Nueva Categoria");
        jMenu3.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setText("Gestionar Categoria");
        jMenu3.add(jCheckBoxMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Productos");
        jMenu4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jCheckBoxMenuItem6.setText("Nuevo Producto");
        jMenu4.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem10.setText("Inventario ");
        jMenu4.add(jCheckBoxMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ventas");
        jMenu5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jCheckBoxMenuItem8.setText("Registrar Venta");
        jMenu5.add(jCheckBoxMenuItem8);

        jCheckBoxMenuItem9.setText("Historial Ventas");
        jMenu5.add(jCheckBoxMenuItem9);

        jMenuBar1.add(jMenu5);

        signOut.setText("Cerrar Sesión");
        signOut.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signOut.setPreferredSize(new java.awt.Dimension(150, 50));
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(signOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseClicked
        HomeView ini= new HomeView();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOutMouseClicked

    private void manageUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUMouseClicked
        
    }//GEN-LAST:event_manageUMouseClicked

    private void manageUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUActionPerformed
        ManageUserView manageUser= new ManageUserView();
        jDesktopPane.add(manageUser);
        manageUser.setVisible(true);
    }//GEN-LAST:event_manageUActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBoxMenuItem manageU;
    private javax.swing.JMenu signOut;
    // End of variables declaration//GEN-END:variables
}
