/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

/**
 *
 * @author Vanessa
 */
public class VUsuario extends javax.swing.JFrame {
    //private Usuario usuario;

    /**
     * Creates new form VUsuario
     */
    public VUsuario() {
        super("Biblioteca/Usuario");
        //usuario = usu;
        initComponents();
        grupoOpciones.add(opcID);
        grupoOpciones.add(opcTitulo);
        grupoOpciones.add(opcAutor);
        grupoOpciones.add(opcEditorial);
        String nombre = "Bienvenido  " + "Vanessa"; //´+ usuario.getNombre();
        NomUsuario.setText(nombre);
        jLabel1.setVisible(false); //si no eligue ninguna opcion para buscar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpciones = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        NomUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        opcID = new javax.swing.JRadioButton();
        opcTitulo = new javax.swing.JRadioButton();
        opcAutor = new javax.swing.JRadioButton();
        opcEditorial = new javax.swing.JRadioButton();
        BuscarLibro = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        ButtonLibros = new javax.swing.JButton();
        ButtonDatos = new javax.swing.JButton();
        ButtonPrestamos = new javax.swing.JButton();
        ButtonMultas = new javax.swing.JButton();
        ButtonPedir = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Libro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 70, -1, -1));

        NomUsuario.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        NomUsuario.setText("jLabel4");
        getContentPane().add(NomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 29, -1, -1));

        jPanel1.setBackground(new java.awt.Color(178, 183, 187));

        jTextField1.setBackground(new java.awt.Color(68, 96, 114));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        opcID.setBackground(new java.awt.Color(178, 183, 187));
        opcID.setText("ID");
        opcID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcIDActionPerformed(evt);
            }
        });

        opcTitulo.setBackground(new java.awt.Color(178, 183, 187));
        opcTitulo.setText("Titulo");
        opcTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcTituloActionPerformed(evt);
            }
        });

        opcAutor.setBackground(new java.awt.Color(178, 183, 187));
        opcAutor.setText("Autor");
        opcAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAutorActionPerformed(evt);
            }
        });

        opcEditorial.setBackground(new java.awt.Color(178, 183, 187));
        opcEditorial.setText("Editorial");
        opcEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcEditorialActionPerformed(evt);
            }
        });

        BuscarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuscarLibro.setLabel("Buscar");
        BuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLibroActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Elegir una opción");

        ButtonLibros.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ButtonLibros.setText("Todos los libros");
        ButtonLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLibrosActionPerformed(evt);
            }
        });

        ButtonDatos.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ButtonDatos.setText("Mis datos");
        ButtonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDatosActionPerformed(evt);
            }
        });

        ButtonPrestamos.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ButtonPrestamos.setText("Mis prestamos");
        ButtonPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPrestamosActionPerformed(evt);
            }
        });

        ButtonMultas.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ButtonMultas.setText("Mis multas");
        ButtonMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultasActionPerformed(evt);
            }
        });

        ButtonPedir.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ButtonPedir.setText("Pedir Prestamo");
        ButtonPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPedirActionPerformed(evt);
            }
        });

        ButtonSalir.setText("Cerrar Sesión");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opcAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opcEditorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ButtonLibros)
                                .addComponent(ButtonPrestamos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ButtonPedir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ButtonDatos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ButtonMultas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(ButtonSalir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcID)
                    .addComponent(opcTitulo)
                    .addComponent(opcAutor)
                    .addComponent(opcEditorial)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(ButtonLibros)
                .addGap(18, 18, 18)
                .addComponent(ButtonDatos)
                .addGap(18, 18, 18)
                .addComponent(ButtonPrestamos)
                .addGap(18, 18, 18)
                .addComponent(ButtonMultas)
                .addGap(18, 18, 18)
                .addComponent(ButtonPedir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(ButtonSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPedirActionPerformed

    private void opcTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcTituloActionPerformed

    private void opcIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcIDActionPerformed

    private void opcAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcAutorActionPerformed

    private void opcEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcEditorialActionPerformed

    private void BuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLibroActionPerformed
        if(opcID.isSelected()){
            jLabel1.setVisible(false);
              //buscar por id
        }else if(opcTitulo.isSelected()){
            jLabel1.setVisible(false);

        }else if(opcAutor.isSelected()){
            jLabel1.setVisible(false);

        }else if(opcEditorial.isSelected()){
            jLabel1.setVisible(false);

        }else{
            jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_BuscarLibroActionPerformed

    private void ButtonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLibrosActionPerformed

    private void ButtonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDatosActionPerformed

    private void ButtonPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPrestamosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPrestamosActionPerformed

    private void ButtonMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMultasActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        if(evt.getSource()==ButtonSalir){           
            VentanaPricipal regresar = new VentanaPricipal();
            regresar.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_ButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BuscarLibro;
    private javax.swing.JButton ButtonDatos;
    private javax.swing.JButton ButtonLibros;
    private javax.swing.JButton ButtonMultas;
    private javax.swing.JButton ButtonPedir;
    private javax.swing.JButton ButtonPrestamos;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel NomUsuario;
    private javax.swing.ButtonGroup grupoOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton opcAutor;
    private javax.swing.JRadioButton opcEditorial;
    private javax.swing.JRadioButton opcID;
    private javax.swing.JRadioButton opcTitulo;
    // End of variables declaration//GEN-END:variables
}
