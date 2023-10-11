
package com.electrika.tech.view;

import javax.swing.JOptionPane;


public class LoginView extends javax.swing.JFrame {

    
    public LoginView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newnombre = new javax.swing.JTextField();
        btnini = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newcontra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        newusuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrarse");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, 40));

        newnombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        newnombre.setText("Ingrese su nombre y apellido");
        newnombre.setAlignmentX(2.0F);
        newnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newnombreMouseClicked(evt);
            }
        });
        newnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newnombreKeyTyped(evt);
            }
        });
        jPanel1.add(newnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 210, 30));

        btnini.setBackground(new java.awt.Color(36, 2, 130));
        btnini.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnini.setForeground(new java.awt.Color(255, 255, 255));
        btnini.setText("Iniciar");
        btnini.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnini.setBorderPainted(false);
        btnini.setFocusPainted(false);
        btnini.setOpaque(true);
        btnini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniActionPerformed(evt);
            }
        });
        jPanel1.add(btnini, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 210, 35));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.jpeg"))); // NOI18N
        jLabel2.setText(" ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -460, 420, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contra.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 40, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 40, 50));

        newcontra.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        newcontra.setText("jPasswordField1");
        newcontra.setBorder(null);
        newcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newcontraMouseClicked(evt);
            }
        });
        jPanel1.add(newcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 210, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 160, 10));

        newusuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        newusuario.setText("Ingrese nombre de usuario");
        newusuario.setAlignmentX(2.0F);
        newusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newusuarioMouseClicked(evt);
            }
        });
        jPanel1.add(newusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 166, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 160, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newnombreMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newnombre.setText("");
    }//GEN-LAST:event_newnombreMouseClicked

    private void newnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newnombreKeyTyped
        int key = evt.getKeyChar(); // solo letras y numeros no puntos con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean letras = (key>=65 && key<=122)||key==32;

        if (!letras) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_newnombreKeyTyped

    private void btniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniActionPerformed

        boolean bool1=newusuario.getText().isEmpty()&&newcontra.getPassword().length==0&&newnombre.getText().isEmpty()||newcontra.getPassword().length==0||newusuario.getText().isEmpty()||newnombre.getText().isEmpty();
        boolean bool2=newusuario.getText().equals("Ingrese nombre de usuario")&&newcontra.getPassword().length==0&&newnombre.getText().equals("Ingrese su nombre y apellido")||newcontra.getPassword().length==0||newusuario.getText().equals("Ingrese nombre de usuario")||newnombre.getText().equals("Ingrese su nombre y apellido");
        if (bool1){
            JOptionPane.showMessageDialog(null, "Ingresa los datos requeridos para ingresar");
        }else if(bool2){
            JOptionPane.showMessageDialog(null, "Debes completar todos los datos");
        }else{
            //newUsuario.setNombreApellido(newnombre.getText());
            //newUsuario.setNombreUsuario(newusuario.getText());
            //newUsuario.setContra(newcontra.getText());
            //us.RegistrarUsuario(newUsuario);//llamado de metodo que agrega un usuario a la base de datos
            //JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
            PrincipalView prin= new PrincipalView();
            prin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btniniActionPerformed

    private void newcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcontraMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newcontra.setText("");
    }//GEN-LAST:event_newcontraMouseClicked

    private void newusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newusuarioMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newusuario.setText("");
    }//GEN-LAST:event_newusuarioMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField newcontra;
    private javax.swing.JTextField newnombre;
    private javax.swing.JTextField newusuario;
    // End of variables declaration//GEN-END:variables
}
