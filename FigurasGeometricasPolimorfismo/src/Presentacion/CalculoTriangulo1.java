/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Logica.*;

/**
 *
 * @author Karla
 */
public class CalculoTriangulo1 extends javax.swing.JFrame {

    /**
     * Creates new form CalculoRectangulo1
     */
    public CalculoTriangulo1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tRIANGULO = new javax.swing.JLabel();
        Calculot = new javax.swing.JLabel();
        datosT = new javax.swing.JLabel();
        BASET = new javax.swing.JLabel();
        aT = new javax.swing.JLabel();
        Areat = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        ST = new javax.swing.JButton();
        CalcularTrian = new javax.swing.JButton();
        AlturaTrian = new javax.swing.JTextField();
        RATrian = new javax.swing.JTextField();
        BaseTriangulo = new javax.swing.JTextField();
        RPTrian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tRIANGULO.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tRIANGULO.setText("Triángulo");

        Calculot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Calculot.setText("Calcular Área y Perímetro");

        datosT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datosT.setText("Ingrese los datos:");

        BASET.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BASET.setText("Base:");

        aT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aT.setText("Altura:");

        Areat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Areat.setText("Área:");

        P3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P3.setText("Perímetro:");

        ST.setText("Salir");
        ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STMouseClicked(evt);
            }
        });

        CalcularTrian.setText("Calcular");
        CalcularTrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularTrianActionPerformed(evt);
            }
        });

        RATrian.setEditable(false);
        RATrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RATrianActionPerformed(evt);
            }
        });

        RPTrian.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(tRIANGULO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Calculot))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datosT)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aT)
                                    .addComponent(BASET))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AlturaTrian, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(BaseTriangulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(CalcularTrian)
                                .addGap(8, 8, 8)))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ST)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Areat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RPTrian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RATrian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tRIANGULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calculot)
                .addGap(18, 18, 18)
                .addComponent(datosT)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BASET))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aT)
                            .addComponent(AlturaTrian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Areat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RATrian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RPTrian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(ST)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(CalcularTrian)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_STMouseClicked

    private void RATrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RATrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RATrianActionPerformed

    private void CalcularTrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularTrianActionPerformed
        // TODO add your handling code here:
        float auxbaseT=Float.parseFloat(BaseTriangulo.getText());
        float auxalturaT= Float.parseFloat(AlturaTrian.getText());
        
        Figuras Triangulo= new Triangulo(auxbaseT,auxalturaT);
        Pincipal.listaFiguras.add(Triangulo);
        {
        
        RATrian.setText(String.valueOf(Triangulo.CalcularArea()));
        RPTrian.setText(String.valueOf(Triangulo.CalcularPerimetro()));
        }
    }//GEN-LAST:event_CalcularTrianActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoTriangulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoTriangulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoTriangulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoTriangulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoTriangulo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaTrian;
    private javax.swing.JLabel Areat;
    private javax.swing.JLabel BASET;
    private javax.swing.JTextField BaseTriangulo;
    private javax.swing.JButton CalcularTrian;
    private javax.swing.JLabel Calculot;
    private javax.swing.JLabel P3;
    private javax.swing.JTextField RATrian;
    private javax.swing.JTextField RPTrian;
    private javax.swing.JButton ST;
    private javax.swing.JLabel aT;
    private javax.swing.JLabel datosT;
    private javax.swing.JLabel tRIANGULO;
    // End of variables declaration//GEN-END:variables
}
