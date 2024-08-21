/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Control.ControlBD;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ANIBAL
 */
public class NuevoRegistro extends javax.swing.JPanel {

    ControlBD  enlace  = new ControlBD();
    Connection conect = enlace.conectar();
    public NuevoRegistro() {
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

        txtapeh = new javax.swing.JTextField();
        txtedadh = new javax.swing.JTextField();
        txtideh = new javax.swing.JTextField();
        txtnomh = new javax.swing.JTextField();
        txtnacoh = new javax.swing.JTextField();
        txtnoma = new javax.swing.JTextField();
        txtidea = new javax.swing.JTextField();
        txtapea = new javax.swing.JTextField();
        fechaI = new com.toedter.calendar.JDateChooser();
        fechaS = new com.toedter.calendar.JDateChooser();
        txtedada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numHab = new javax.swing.JComboBox<>();
        ideA = new javax.swing.JComboBox<>();
        btnmodificar = new javax.swing.JButton();
        naca = new javax.swing.JComboBox<>();
        nach = new javax.swing.JComboBox<>();
        ideH = new javax.swing.JComboBox<>();
        btnRA = new javax.swing.JButton();
        btnRH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtapeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, -1));
        add(txtedadh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, -1));

        txtideh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidehActionPerformed(evt);
            }
        });
        add(txtideh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, -1));
        add(txtnomh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));
        add(txtnacoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 170, -1));
        add(txtnoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 170, -1));
        add(txtidea, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 170, -1));
        add(txtapea, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 170, -1));
        add(fechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, -1));
        add(fechaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 140, -1));
        add(txtedada, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Habitacion");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, -1));

        numHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "201", "202", "203", "204", "205", "301", "302", "303", "304", "305", "401", "402", "403", "404", "405", "501", "502", "503", "504", "505", "601", "602", "603", "604", "605" }));
        add(numHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        ideA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NACIONAL ", "EXTRANJERO " }));
        add(ideA, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 110, -1));

        btnmodificar.setText("Modificar");
        add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 130, 50));

        naca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brasil", "Canadá", "China", "Colombia", "España", "Estados Unidos", "Francia", "India", "Italia", "Japón", "México", "Alemania", "Australia", "Reino Unido", "Rusia", "Corea del Sur", "Sudáfrica", "Arabia Saudita", "Suiza" }));
        naca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacaActionPerformed(evt);
            }
        });
        add(naca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 170, -1));

        nach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brasil", "Canadá", "China", "Colombia", "España", "Estados Unidos", "Francia", "India", "Italia", "Japón", "México", "Alemania", "Australia", "Reino Unido", "Rusia", "Corea del Sur", "Sudáfrica", "Arabia Saudita", "Suiza" }));
        nach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachActionPerformed(evt);
            }
        });
        add(nach, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, -1));

        ideH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NACIONAL ", "EXTRANJERO " }));
        add(ideH, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 110, -1));

        btnRA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRA.setText("Registrar Acompañante");
        btnRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAActionPerformed(evt);
            }
        });
        add(btnRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 190, 40));

        btnRH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRH.setText("Registrar Huesped");
        btnRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHActionPerformed(evt);
            }
        });
        add(btnRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevoHuesped.PNG"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 480, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acompañante.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 470, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHActionPerformed
try {
            PreparedStatement guardar =  (PreparedStatement) conect.prepareStatement("INSERT INTO huesped (IdentificacionHuesped,TipoIdentificacionA,Nombre,Apellido,Nacionalidad,Edad,FechaIngreso,FechaSalida,NumeroAcompanantes,CodigoHabitacion) VALUE (?,?,?,?,?,?,?,?,?,?)");
            guardar.setInt(1, Integer.parseInt(txtideh.getText())); // IdentificaciónHuesped
            guardar.setString(2, ideH.getSelectedItem().toString()); // Tipo de identificación
            guardar.setString(3, txtnomh.getText()); // Nombre
            guardar.setString(4, txtapeh.getText()); // Apellido
            guardar.setString(5, nach.getSelectedItem().toString()); // Nacionalidad
            guardar.setInt(6, Integer.parseInt(txtedadh.getText())); // Edad
            
            // Obtener la fecha seleccionada del JDateChooser fechaI
            java.util.Date dateFechaI = fechaI.getDate();
            // Convertir la fecha de util.Date a sql.Date
            java.sql.Date sqlDateFechaI = new java.sql.Date(dateFechaI.getTime());
            guardar.setDate(7, sqlDateFechaI); // Fecha de Ingreso

            // Obtener la fecha seleccionada del JDateChooser fechaS
            java.util.Date dateFechaS = fechaS.getDate();
            // Convertir la fecha de util.Date a sql.Date
            java.sql.Date sqlDateFechaS = new java.sql.Date(dateFechaS.getTime());
            guardar.setDate(8, sqlDateFechaS); // Fecha de Salida
            
            guardar.setInt(9, Integer.parseInt(txtnacoh.getText())); // Número de acompañantes
            guardar.setInt(10, Integer.parseInt(numHab.getSelectedItem().toString())); // Código de Habitación
            
            JOptionPane.showMessageDialog(null, "Huesped registrado");
            
            // Ejecutar la actualización
            guardar.executeUpdate();

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Huésped registrado con éxito.");

            // Limpiar los campos después de registrar
            txtnomh.setText("");
            txtapeh.setText("");
            txtedadh.setText("");
            txtnacoh.setText("");
            // Restablecer valores por defecto de JComboBox, si necesario, por ejemplo:
            ideH.setSelectedIndex(0);
            nach.setSelectedIndex(0);
            fechaI.setDate(null);
            fechaS.setDate(null);
            numHab.setSelectedIndex(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " No se logro registrar el huesped");
        }
    }//GEN-LAST:event_btnRHActionPerformed

    private void btnRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAActionPerformed
try {
            PreparedStatement guardar =  (PreparedStatement) conect.prepareStatement("INSERT INTO acompanante (IdentificacionAcompanante,TipoIdentificacion,IdentificacionHuesped,Nombre,Apellido,Edad,Nacionalidad) VALUE (?,?,?,?,?,?,?)");
            guardar.setInt(1, Integer.parseInt(txtidea.getText())); // IdentificaciónAcompañante
            guardar.setString(2, ideA.getSelectedItem().toString()); // Tipo de identificación
            guardar.setInt(3, Integer.parseInt(txtideh.getText())); // IdentificaciónHuesped
            guardar.setString(4, txtnoma.getText()); // Nombre
            guardar.setString(5, txtapea.getText()); // Apellido
            guardar.setInt(6, Integer.parseInt(txtedada.getText())); // Edad
            guardar.setString(7, naca.getSelectedItem().toString()); // Nacionalidad
            
            JOptionPane.showMessageDialog(null, "Acompañante registrado");
            
            // Ejecutar la actualización
            guardar.executeUpdate();

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "ACOMPAÑANTE registrado con éxito.");

            // Limpiar los campos después de registrar
            txtnoma.setText("");
            txtapea.setText("");
            txtidea.setText(""); 
            txtedada.setText("");
           
            // Restablecer valores por defecto de JComboBox, si necesario, por ejemplo:
            ideA.setSelectedIndex(0);
            naca.setSelectedIndex(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " No se logro registrar el acompañante");
        }
    }//GEN-LAST:event_btnRAActionPerformed

    private void txtidehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidehActionPerformed

    private void nachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachActionPerformed
                                   
    }//GEN-LAST:event_nachActionPerformed

    private void nacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRA;
    private javax.swing.JButton btnRH;
    private javax.swing.JButton btnmodificar;
    private com.toedter.calendar.JDateChooser fechaI;
    private com.toedter.calendar.JDateChooser fechaS;
    private javax.swing.JComboBox<String> ideA;
    private javax.swing.JComboBox<String> ideH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> naca;
    private javax.swing.JComboBox<String> nach;
    private javax.swing.JComboBox<String> numHab;
    private javax.swing.JTextField txtapea;
    private javax.swing.JTextField txtapeh;
    private javax.swing.JTextField txtedada;
    private javax.swing.JTextField txtedadh;
    private javax.swing.JTextField txtidea;
    private javax.swing.JTextField txtideh;
    private javax.swing.JTextField txtnacoh;
    private javax.swing.JTextField txtnoma;
    private javax.swing.JTextField txtnomh;
    // End of variables declaration//GEN-END:variables
}
