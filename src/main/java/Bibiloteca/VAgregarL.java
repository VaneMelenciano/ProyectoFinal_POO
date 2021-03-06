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
public class VAgregarL extends javax.swing.JFrame {
    
Biblioteca MiBiblioteca;

    public VAgregarL() throws IOException{
        super("Agregar Libro");
        this.MiBiblioteca = Biblioteca.getInstance();
        initComponents();
        Resultado.setVisible(false);
        BAceptar.setVisible(false);
        
    }

/**
     * Creates new form VAgregarL
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TEditorial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TAnio = new javax.swing.JTextField();
        TNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TPais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BGuardar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        BAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Autor");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Título");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 62, -1, -1));

        TTitulo.setBackground(new java.awt.Color(8, 65, 55));
        TTitulo.setForeground(new java.awt.Color(255, 255, 255));
        TTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 64, 169, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Autor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 95, -1, -1));

        TAutor.setBackground(new java.awt.Color(8, 65, 55));
        TAutor.setForeground(new java.awt.Color(255, 255, 255));
        TAutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 97, 169, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Editorial");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 128, -1, -1));

        TEditorial.setBackground(new java.awt.Color(8, 65, 55));
        TEditorial.setForeground(new java.awt.Color(255, 255, 255));
        TEditorial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 130, 169, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Año edición");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 161, -1, -1));

        TAnio.setBackground(new java.awt.Color(8, 65, 55));
        TAnio.setForeground(new java.awt.Color(255, 255, 255));
        TAnio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 163, 169, -1));

        TNum.setBackground(new java.awt.Color(8, 65, 55));
        TNum.setForeground(new java.awt.Color(255, 255, 255));
        TNum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 196, 169, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setText("Número de unidades");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 194, -1, -1));

        TPais.setBackground(new java.awt.Color(8, 65, 55));
        TPais.setForeground(new java.awt.Color(255, 255, 255));
        TPais.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(TPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 229, 169, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setText("País");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 227, -1, -1));

        BGuardar.setBackground(new java.awt.Color(169, 218, 210));
        BGuardar.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 267, 80, -1));

        BCancelar.setBackground(new java.awt.Color(169, 218, 210));
        BCancelar.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 267, 80, -1));

        Resultado.setText("jLabel9");
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 301, -1, -1));

        BAceptar.setBackground(new java.awt.Color(169, 218, 210));
        BAceptar.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 394, 80, -1));

        jPanel1.setBackground(new java.awt.Color(49, 164, 144));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
    if(evt.getSource()==BGuardar){
        int id=0;
        try{
            String Titulo = TTitulo.getText();
            String Autor = TAutor.getText();
            String Editorial = TEditorial.getText();
            int Anio= Integer.parseInt(TAnio.getText());
            int NumUni= Integer.parseInt(TNum.getText());
            String Pais = TPais.getText();
            //guardar datos en libros
            //Biblioteca MiBiblioteca = new Biblioteca();
            //  id = MiBiblioteca.AgregarLibro(Titulo, Autor, Editorial, Anio, NumUni, Pais);
            id = MiBiblioteca.AgregarLibro(Titulo, Autor, Editorial, Anio, NumUni, Pais);
                Resultado.setVisible(true);
                String datos = "Se ha guardado correctamnete.\n Su ID es: " + id; //+ la descripcion de los datos y su ID
                Resultado.setText(datos);
                BAceptar.setVisible(true);
            
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
            }
        
                
    }
   
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        dispose(); //se debe cerrar la ventana
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        dispose(); //se debe cerrar la ventana
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
            java.util.logging.Logger.getLogger(VAgregarL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAgregarL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAgregarL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAgregarL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VAgregarL().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VAgregarL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextField TAnio;
    private javax.swing.JTextField TAutor;
    private javax.swing.JTextField TEditorial;
    private javax.swing.JTextField TNum;
    private javax.swing.JTextField TPais;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
