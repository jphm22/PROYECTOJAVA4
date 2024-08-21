/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Control.ControlBD;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANIBAL
 */
public class Huespedes extends javax.swing.JPanel {


    public Huespedes() {
        initComponents();
    }
    ControlBD  enlace  = new ControlBD();
    Connection conect = enlace.conectar();
    
public void ListarHuesped(){    
String sql= "Select * from huesped";
Statement st;


System.out.println(sql);

DefaultTableModel model = new DefaultTableModel();
model.addColumn("Identificación");
model.addColumn("Tipo de Identificación");
model.addColumn("Nombre");
model.addColumn("Apellido");
model.addColumn("Nacionalidad");
model.addColumn("Edad");
model.addColumn("Fecha de Ingreso");
model.addColumn("Fecha de Salida");
model.addColumn("Número de Acompañantes");
model.addColumn("Código de Habitación");

tablaHuespedes.setModel(model);

tablaHuespedes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

//String [] datos = new String[10];
try{
    st= (Statement) conect.createStatement();
    ResultSet rs= (ResultSet) st.executeQuery(sql);
    while(rs.next()){
    int idHuesped = rs.getInt("IdentificacionHuesped");
    String tipoIdentificacion = rs.getString("TipoIdentificacionA");
    String nombre = rs.getString("Nombre");
    String apellido = rs.getString("Apellido");
    String nacionalidad = rs.getString("Nacionalidad");
    int edad = rs.getInt("Edad");
    Date fechaIngreso = rs.getDate("FechaIngreso");
    Date fechaSalida = rs.getDate("FechaSalida");
    int numAcompanantes = rs.getInt("NumeroAcompanantes");
    int codHabitacion = rs.getInt("CodigoHabitacion");

    model.addRow(new Object[]{idHuesped, tipoIdentificacion, nombre, apellido, nacionalidad, edad, fechaIngreso, fechaSalida, numAcompanantes, codHabitacion});

    }
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"error"+e.toString());
        }

    }
public void ListarAcompanantes() {    
String sql = "Select * from acompanante";
Statement st;

DefaultTableModel model = new DefaultTableModel();
model.addColumn("Identificación");
model.addColumn("Tipo de Identificación");
model.addColumn("Identificación del Huésped");
model.addColumn("Nombre");
model.addColumn("Apellido");
model.addColumn("Edad");
model.addColumn("Nacionalidad");

tablaHuespedes.setModel(model);

// Ajuste automático del tamaño de las columnas
tablaHuespedes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

try {
    st= (Statement) conect.createStatement();
    ResultSet rs= (ResultSet) st.executeQuery(sql);

    while(rs.next()) {
    int idAcompanante = rs.getInt("IdentificacionAcompanante");
    String tipoIdentificacion = rs.getString("TipoIdentificacion");
    int idHuesped = rs.getInt("IdentificacionHuesped");
    String nombre = rs.getString("Nombre");
    String apellido = rs.getString("Apellido");
    int edad = rs.getInt("Edad");
    String nacionalidad = rs.getString("Nacionalidad");

    model.addRow(new Object[]{idAcompanante, tipoIdentificacion, idHuesped, nombre, apellido, edad, nacionalidad});
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.toString());
}
}
private void mostrarHuespedesPorDuracion() {
    String sql = "SELECT h.IdentificacionHuesped, h.FechaIngreso, h.FechaSalida, h.CodigoHabitacion FROM huesped h ORDER BY DATEDIFF(h.FechaSalida, h.FechaIngreso)";
    Statement st;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Identificación");
    model.addColumn("Fecha de Ingreso");
    model.addColumn("Fecha de Salida");
    model.addColumn("Código de Habitación");
        
    tablaHuespedes.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHuespedes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
        
    st= (Statement) conect.createStatement();
    ResultSet rs= (ResultSet) st.executeQuery(sql);
        while(rs.next()) {
            int idHuesped = rs.getInt("IdentificacionHuesped");
            Date fechaIngreso = rs.getDate("FechaIngreso");
            Date fechaSalida = rs.getDate("FechaSalida");
            int codHabitacion = rs.getInt("CodigoHabitacion");
            
            model.addRow(new Object[]{idHuesped, fechaIngreso, fechaSalida, codHabitacion});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
private void mostrarHuespedesYAcompanantesPorEdad() {
    String sql = "SELECT IdentificacionHuesped AS Identificacion, Nombre, Apellido, Edad FROM huesped "
                 + "UNION ALL "
                 + "SELECT IdentificacionAcompanante AS Identificacion, Nombre, Apellido, Edad FROM acompanante "
                 + "ORDER BY Edad ASC";
    Statement st;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Identificación");
    model.addColumn("Nombre");
    model.addColumn("Apellido");
    model.addColumn("Edad");
        
    tablaHuespedes.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHuespedes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
        st= (Statement) conect.createStatement();
        ResultSet rs= (ResultSet) st.executeQuery(sql);
        while(rs.next()) {
            int id = rs.getInt("Identificacion");
            String nombre = rs.getString("Nombre");
            String apellido = rs.getString("Apellido");
            int edad = rs.getInt("Edad");
            
            model.addRow(new Object[]{id, nombre, apellido, edad});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
private void eliminarFilaSeleccionada() {
    int filaSeleccionada = tablaHuespedes.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.");
        return;
    }
    
    DefaultTableModel model = (DefaultTableModel) tablaHuespedes.getModel();
    int idHuesped = (int) model.getValueAt(filaSeleccionada, 0); // Suponiendo que la columna 0 contiene la identificación del huésped
    
    if (JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM huesped WHERE IdentificacionHuesped = ?";
            PreparedStatement pst = (PreparedStatement) conect.prepareStatement(sql);
            pst.setInt(1, idHuesped);
            int filasEliminadas = pst.executeUpdate();
            if (filasEliminadas > 0) {
                model.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.toString());
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLH = new javax.swing.JButton();
        btnLA = new javax.swing.JButton();
        btnOD = new javax.swing.JButton();
        btnOE = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHuespedes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HUESPEDES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 270, 90));

        btnLH.setText("Listar Huespedes");
        btnLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLHActionPerformed(evt);
            }
        });
        add(btnLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        btnLA.setText("Listar Acompañanates");
        btnLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLAActionPerformed(evt);
            }
        });
        add(btnLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        btnOD.setText("Ordenar por dias");
        btnOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODActionPerformed(evt);
            }
        });
        add(btnOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        btnOE.setText("Ordenar por edad");
        btnOE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOEActionPerformed(evt);
            }
        });
        add(btnOE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        tablaHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaHuespedes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 860, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Machu-Picchu-No-Background.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 860, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLHActionPerformed
    ListarHuesped();
    }//GEN-LAST:event_btnLHActionPerformed

    private void btnLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLAActionPerformed
    ListarAcompanantes();
    }//GEN-LAST:event_btnLAActionPerformed

    private void btnODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODActionPerformed
    mostrarHuespedesPorDuracion();
    }//GEN-LAST:event_btnODActionPerformed

    private void btnOEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOEActionPerformed
    mostrarHuespedesYAcompanantesPorEdad();
    }//GEN-LAST:event_btnOEActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarFilaSeleccionada();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLA;
    private javax.swing.JButton btnLH;
    private javax.swing.JButton btnOD;
    private javax.swing.JButton btnOE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHuespedes;
    // End of variables declaration//GEN-END:variables
}
