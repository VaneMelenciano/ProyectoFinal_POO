/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class VAgregarPM extends javax.swing.JFrame {

    /**
     * Creates new form VAgregarPM
     */
    private int opcion; //si es muta o prestamo
    Biblioteca MiBiblioteca;
    public VAgregarPM() throws IOException {
        super("Agregar Multa o Prestamo");
        this.MiBiblioteca = Biblioteca.getInstance();
        initComponents();
        TOpc1.setVisible(false);
        TOpc2.setVisible(false);
        Opc1.setVisible(false);
        Opc2.setVisible(false);
        BAceptar.setVisible(false);
        Resultado.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TUsuario = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        TFecha = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        TLib1 = new java.awt.TextField();
        TLib2 = new java.awt.TextField();
        TOpc1 = new java.awt.TextField();
        BoxTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TLib3 = new java.awt.TextField();
        TOpc2 = new java.awt.TextField();
        BCancelar = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        Opc1 = new javax.swing.JLabel();
        Opc2 = new javax.swing.JLabel();
        BAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Agregar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel2.setText("ID de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 75, -1, -1));

        TUsuario.setBackground(new java.awt.Color(105, 111, 42));
        TUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 75, 174, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel3.setText("Fecha Actual");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 105, -1, -1));

        TFecha.setBackground(new java.awt.Color(105, 111, 42));
        TFecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 105, 174, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setText("ID de libros");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 135, -1, -1));

        TLib1.setBackground(new java.awt.Color(105, 111, 42));
        TLib1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TLib1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 135, 174, -1));

        TLib2.setBackground(new java.awt.Color(105, 111, 42));
        TLib2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TLib2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 165, 174, -1));

        TOpc1.setBackground(new java.awt.Color(105, 111, 42));
        TOpc1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TOpc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 274, 174, -1));

        BoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Multa", "Préstamo" }));
        BoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 236, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel5.setText("Tipo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 236, -1, -1));

        TLib3.setBackground(new java.awt.Color(105, 111, 42));
        TLib3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TLib3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 174, -1));

        TOpc2.setBackground(new java.awt.Color(105, 111, 42));
        TOpc2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TOpc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 304, 174, -1));

        BCancelar.setBackground(new java.awt.Color(238, 241, 204));
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 349, -1, -1));

        BGuardar.setBackground(new java.awt.Color(238, 241, 204));
        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 349, -1, -1));

        Resultado.setText("jLabel8");
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 390, -1, -1));

        Opc1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        Opc1.setText("Opc1");
        getContentPane().add(Opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Opc2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        Opc2.setText("Opc1");
        getContentPane().add(Opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        BAceptar.setBackground(new java.awt.Color(238, 241, 204));
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 508, -1, -1));

        jPanel2.setBackground(new java.awt.Color(189, 196, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
    opcion = BoxTipo.getSelectedIndex();
        if(opcion == 1){ //MULTA
            if(evt.getSource()==BGuardar){
                try{
                    int Usuario = Integer.parseInt(TUsuario.getText());
                    String Fecha = TFecha.getText();
                    int Lib1 = Integer.parseInt(TLib1.getText());
                    int Lib2 = Integer.parseInt(TLib2.getText());
                    int Lib3 = Integer.parseInt(TLib3.getText());
                    int dias = Integer.parseInt(TOpc1.getText());
                    String libros = Lib1 + ", " + Lib2 + ", " + Lib3;
                    int id = MiBiblioteca.AgregarMulta(Usuario, libros, Fecha, dias);
                        Resultado.setVisible(true);
                        String datos = "Se ha guardado correctamnete.\n + Su Id es: " + id; //+ la descripcion de los datos y su ID
                        Resultado.setText(datos);
                        BAceptar.setVisible(true);
                    }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
                   }

                        
            }
            
        }
        else if(opcion == 2){ //PRESTAMO
            if(evt.getSource()==BGuardar){
                try{
                    int Usuario = Integer.parseInt(TUsuario.getText());
                    String Fecha = TFecha.getText();
                    int Lib1 = Integer.parseInt(TLib1.getText());
                    int Lib2 = Integer.parseInt(TLib2.getText());
                    int Lib3 = Integer.parseInt(TLib3.getText());
                    int dias = Integer.parseInt(TOpc1.getText());
                    String libros = Lib1 + ", " + Lib2 + ", " + Lib3;
                    String plazoDev = TOpc1.getText();
                    String fechaDev = TOpc2.getText();
                    //guardar datos en PRESTAMO
                    //Biblioteca MiBiblioteca = new Biblioteca();
                    //int id = MiBiblioteca.
                    int id = MiBiblioteca.AgregarPrestamo(Usuario, libros, fechaDev, plazoDev, fechaDev);
                        Resultado.setVisible(true);
                        String datos = "Se ha guardado correctamnete.\n + Su Id es: " + id; //+ la descripcion de los datos y su ID
                        Resultado.setText(datos);
                        BAceptar.setVisible(true);
                    }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
                   }

                        
            }
            
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTipoActionPerformed
    opcion = BoxTipo.getSelectedIndex();
    if(opcion==1){ //multa
        TOpc1.setVisible(true);
        TOpc2.setVisible(false);
        Opc1.setVisible(true);
        Opc2.setVisible(false);
        Opc1.setText("Dias retrasos");
    }else if(opcion==2){
        TOpc1.setVisible(true);
        TOpc2.setVisible(true);
        Opc1.setVisible(true);
        Opc2.setVisible(true);
        Opc1.setText("Plazo devolución");
        Opc2.setText("Fecha devolución");
    }
    }//GEN-LAST:event_BoxTipoActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
       dispose();
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
            java.util.logging.Logger.getLogger(VAgregarPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAgregarPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAgregarPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAgregarPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VAgregarPM().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VAgregarPM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JComboBox<String> BoxTipo;
    private javax.swing.JLabel Opc1;
    private javax.swing.JLabel Opc2;
    private javax.swing.JLabel Resultado;
    private java.awt.TextField TFecha;
    private java.awt.TextField TLib1;
    private java.awt.TextField TLib2;
    private java.awt.TextField TLib3;
    private java.awt.TextField TOpc1;
    private java.awt.TextField TOpc2;
    private java.awt.TextField TUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
