package com.electrika.tech.view;

import javax.swing.JOptionPane;

public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usurario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        Contra = new javax.swing.JLabel();
        btnaceptarinicio = new javax.swing.JButton();
        btncancelarinicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usurario.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Usurario.setForeground(new java.awt.Color(0, 0, 0));
        Usurario.setText("Usuario");
        jPanel1.add(Usurario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        usuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 200, -1));

        Contra.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Contra.setForeground(new java.awt.Color(0, 0, 0));
        Contra.setText("Contraseña");
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnaceptarinicio.setBackground(new java.awt.Color(140, 183, 255));
        btnaceptarinicio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnaceptarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btnaceptarinicio.setText("Aceptar");
        btnaceptarinicio.setFocusPainted(false);
        btnaceptarinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarinicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnaceptarinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        btncancelarinicio.setBackground(new java.awt.Color(140, 183, 255));
        btncancelarinicio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btncancelarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btncancelarinicio.setText("Cancelar");
        btncancelarinicio.setFocusPainted(false);
        btncancelarinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarinicioActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelarinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Todavía no tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        btnregistrar.setBackground(new java.awt.Color(140, 161, 255));
        btnregistrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrar.setText("Registrarse");
        btnregistrar.setFocusPainted(false);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jPanel4.setBackground(new java.awt.Color(140, 183, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jPanel5.setBackground(new java.awt.Color(140, 183, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 240));

        contra.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        contra.setText("jPasswordField1");
        contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraMouseClicked(evt);
            }
        });
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -120, 470, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }
    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void btnaceptarinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarinicioActionPerformed
        //BASE DE DATOS EVALUAR SI ESTA REGISTRADO O NO QUE SALGA UNA ADVERTENCIA SI NO LO ESTA Y SI SI, EVALUAR SI ES DE ADMI O USUARIO NORMAL

        if (usuario.getText().isEmpty() && contra.getPassword().length == 0 || usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar tus datos completos");
        } else if (usuario.getText().equals("admi") && contra.getText().equals("2023")) {

        } else {
            PrincipalView prin=new PrincipalView();
            prin.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnaceptarinicioActionPerformed

    private void btncancelarinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarinicioActionPerformed
        //para salir de la pantalla
        System.exit(0);
    }//GEN-LAST:event_btncancelarinicioActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        //crear objeto del JFrame registro, cuando se presione el boton podra ser visible el jframe de registro y el inicio de sesion desaparecera
       LoginView login= new LoginView();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraMouseClicked
        //cuando presione automaticamente se quitara el texto
        contra.setText("");
    }//GEN-LAST:event_contraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel Usurario;
    private javax.swing.JButton btnaceptarinicio;
    private javax.swing.JButton btncancelarinicio;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
