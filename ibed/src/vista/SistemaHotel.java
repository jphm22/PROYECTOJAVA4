
package vista;

import Control.ControlBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class SistemaHotel extends javax.swing.JFrame {
    ControlBD  enlace  = new ControlBD();
    Connection conect = enlace.conectar();

    Color DefaulColor,ClickedColor;
    public SistemaHotel() {
        initComponents();
        InitContent();
        probar_conexion();
        
        
       DefaulColor = new Color(102,255,102);
       ClickedColor = new Color(204,255,153);
        
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(DefaulColor);
    }
    private void InitContent(){
        NuevoRegistro nr = new NuevoRegistro();
        nr.setSize(920, 450);
        nr.setLocation(0,0);
        
        content.removeAll();
        content.add(nr,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    public void probar_conexion(){
        if(conect == null){
            JOptionPane.showMessageDialog(null, "No se logro la conexion a la base de datos");            
        }else{
            JOptionPane.showMessageDialog(null, "Conexion establecida a la base de datos");
        }
    }
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNR = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnHB = new javax.swing.JButton();
        btnDH = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel-bicentenario.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 80));

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNR.setBackground(new java.awt.Color(204, 255, 153));
        btnNR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNR.setText("Nuevo registro");
        btnNR.setPreferredSize(new java.awt.Dimension(130, 40));
        btnNR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNRMousePressed(evt);
            }
        });
        btnNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNRActionPerformed(evt);
            }
        });
        jPanel2.add(btnNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 100));

        btnH.setBackground(new java.awt.Color(204, 255, 153));
        btnH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnH.setText("Huespedes");
        btnH.setPreferredSize(new java.awt.Dimension(130, 40));
        btnH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHMousePressed(evt);
            }
        });
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        jPanel2.add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 100));

        btnHB.setBackground(new java.awt.Color(204, 255, 153));
        btnHB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHB.setText("Habitaciones");
        btnHB.setPreferredSize(new java.awt.Dimension(130, 40));
        btnHB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHBMousePressed(evt);
            }
        });
        btnHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHBActionPerformed(evt);
            }
        });
        jPanel2.add(btnHB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 100));

        btnDH.setBackground(new java.awt.Color(204, 255, 153));
        btnDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDH.setText("Datos de hotel");
        btnDH.setPreferredSize(new java.awt.Dimension(130, 40));
        btnDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDHMousePressed(evt);
            }
        });
        btnDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDHActionPerformed(evt);
            }
        });
        jPanel2.add(btnDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 100));

        btnS.setBackground(new java.awt.Color(204, 255, 153));
        btnS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnS.setText("Servicios");
        btnS.setPreferredSize(new java.awt.Dimension(130, 40));
        btnS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSMousePressed(evt);
            }
        });
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jPanel2.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 100));

        btnF.setBackground(new java.awt.Color(204, 255, 153));
        btnF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnF.setText("Facturas");
        btnF.setPreferredSize(new java.awt.Dimension(130, 40));
        btnF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFMousePressed(evt);
            }
        });
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        jPanel2.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 920, 100));

        content.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 920, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNRActionPerformed
        NuevoRegistro nr = new NuevoRegistro();
        nr.setSize(920, 450);
        nr.setLocation(0,0);
        
        content.removeAll();
        content.add(nr,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnNRActionPerformed

    private void btnHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHBActionPerformed
        Habitaciones hb = new Habitaciones();
        hb.setSize(920, 450);
        hb.setLocation(0,0);
        
        content.removeAll();
        content.add(hb,BorderLayout.CENTER);
        content.revalidate();
        content.repaint(); 
    }//GEN-LAST:event_btnHBActionPerformed

    private void btnDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDHActionPerformed

        DatosHotel dh = new DatosHotel();
        dh.setSize(920, 450);
        dh.setLocation(0,0);
        
        content.removeAll();
        content.add(dh,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnDHActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        Huespedes hds = new Huespedes();
        hds.setSize(920, 450);
        hds.setLocation(0,0);
        
        content.removeAll();
        content.add(hds,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        Servicios sv = new Servicios();
        sv.setSize(920, 450);
        sv.setLocation(0,0);
        
        content.removeAll();
        content.add(sv,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnSActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        Factura fc = new Factura();
        fc.setSize(920, 450);
        fc.setLocation(0,0);
        
        content.removeAll();
        content.add(fc,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnFActionPerformed

    private void btnNRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNRMousePressed
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(ClickedColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(DefaulColor);
    }//GEN-LAST:event_btnNRMousePressed

    private void btnHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHMousePressed
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(ClickedColor);
    }//GEN-LAST:event_btnHMousePressed

    private void btnHBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHBMousePressed
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(ClickedColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(DefaulColor);
    }//GEN-LAST:event_btnHBMousePressed

    private void btnDHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDHMousePressed
       btnDH.setBackground(ClickedColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(DefaulColor);
    }//GEN-LAST:event_btnDHMousePressed

    private void btnSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMousePressed
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(DefaulColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(ClickedColor);
       btnH.setBackground(DefaulColor);
    }//GEN-LAST:event_btnSMousePressed

    private void btnFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFMousePressed
       btnDH.setBackground(DefaulColor);
       btnF.setBackground(ClickedColor);
       btnHB.setBackground(DefaulColor);
       btnNR.setBackground(DefaulColor);
       btnS.setBackground(DefaulColor);
       btnH.setBackground(DefaulColor);
    }//GEN-LAST:event_btnFMousePressed

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
            java.util.logging.Logger.getLogger(SistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDH;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHB;
    private javax.swing.JButton btnNR;
    private javax.swing.JButton btnS;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
