/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class VRegistrarse extends javax.swing.JFrame {

    /**
     * Creates new form VRegistrarse
     */
    private int opcion; //guardar la opcion de ser usuario o empleado
    public VRegistrarse() {
        super("Nuevo usuario");
        initComponents();
        Registro.setVisible(false);
            TOpc1.setVisible(false);
            TOpc2.setVisible(false);
            LOpc1.setVisible(false);
            LOpc2.setVisible(false);
        BGuardar.setVisible(false);
        BAceptar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        TFechaNac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TEdad = new javax.swing.JTextField();
        TTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TDir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TCor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TCont = new javax.swing.JPasswordField();
        BoxTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        LOpc2 = new javax.swing.JLabel();
        LOpc1 = new javax.swing.JLabel();
        TOpc1 = new javax.swing.JTextField();
        TOpc2 = new javax.swing.JTextField();
        BGuardar = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel1.setText("Registrarse");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 91, -1, -1));
        getContentPane().add(TNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 93, 223, -1));
        getContentPane().add(TFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 133, 223, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Nacimiento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 131, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 171, -1, -1));
        getContentPane().add(TEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 173, 223, -1));
        getContentPane().add(TTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 213, 223, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 211, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 251, -1, -1));
        getContentPane().add(TDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 253, 223, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 291, -1, -1));
        getContentPane().add(TCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 293, 223, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 331, -1, -1));
        getContentPane().add(TCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 333, 223, -1));

        BoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Usuario", "Empleado" }));
        BoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 373, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Tipo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 371, -1, -1));

        LOpc2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LOpc2.setText("Opc2");
        getContentPane().add(LOpc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 451, -1, -1));

        LOpc1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LOpc1.setText("Opc1");
        getContentPane().add(LOpc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));
        getContentPane().add(TOpc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 210, -1));
        getContentPane().add(TOpc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 453, 223, -1));

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 491, -1, -1));

        Registro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Registro.setText("Resultado");
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 532, 296, 28));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        BAceptar.setBackground(new java.awt.Color(0, 0, 0));
        BAceptar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BAceptar.setText("Aceptar");
        BAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(BAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(650, Short.MAX_VALUE)
                .addComponent(BAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BAceptar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTipoActionPerformed
        opcion = BoxTipo.getSelectedIndex();
        if(opcion == 1){
            TOpc1.setVisible(true);
            TOpc2.setVisible(false);
            LOpc1.setVisible(true);
            LOpc2.setVisible(false);
            LOpc1.setText("Fecha Actual");
            BGuardar.setVisible(true);
        }else if(opcion == 2){
            TOpc1.setVisible(true);
            TOpc2.setVisible(true);
            LOpc1.setVisible(true);
            LOpc2.setVisible(true);
            LOpc1.setText("Puesto");
            LOpc2.setText("Sueldo");
            BGuardar.setVisible(true);
        }
    }//GEN-LAST:event_BoxTipoActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        //GUARDA DATOS RECIBIDOR:
        String Nombre = TNombre.getText();
        String FechaNac = TFechaNac.getText();
        String Edad = TEdad.getText();
        String Tel = TTel.getText();
        String Dir = TDir.getText();
        String Correo = TCor.getText();
        String Contrasenia = TCont.getText();
        
        if(opcion == 1){ //usuario
            if(evt.getSource()==BGuardar){
                try{
                    String FechaAct = TOpc1.getText();
                    //guardar datos en usuario
                   }catch (NumberFormatException ex){
                       JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
                   }
        
                Registro.setVisible(true);
                String datos = "Se ha registarado correctamnete.\n"; //+ la descripcion de los datos y su ID
                Registro.setText(datos);
                BAceptar.setVisible(true);
            }
        }else if(opcion == 2){ //empleado
            if(evt.getSource()==BGuardar){
                try{ 
                    String Puesto = TOpc1.getText();
                    String Sueldo = TOpc2.getText();
                    //guardar datos en empleados
                   }catch (NumberFormatException ex){
                       JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
                   }
            
                Registro.setVisible(true);
                String datos = "Se ha registarado correctamnete. Empleado\n"; //+ la descripcion de los datos y su ID
                Registro.setText(datos);
                BAceptar.setVisible(true);
            }
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        if(opcion == 1){//usuario
            VUsuario u = new VUsuario(); //se manda a Usuario, el usuario que inició
            u.setVisible(true);
            dispose();
        }else if(opcion == 2){//empleado
            VEmpleado e = new VEmpleado(); //se manda a Empleado, el empleado que inició
            e.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JComboBox<String> BoxTipo;
    private javax.swing.JLabel LOpc1;
    private javax.swing.JLabel LOpc2;
    private javax.swing.JLabel Registro;
    private javax.swing.JPasswordField TCont;
    private javax.swing.JTextField TCor;
    private javax.swing.JTextField TDir;
    private javax.swing.JTextField TEdad;
    private javax.swing.JTextField TFechaNac;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TOpc1;
    private javax.swing.JTextField TOpc2;
    private javax.swing.JTextField TTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
