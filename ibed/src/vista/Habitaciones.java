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
public class Habitaciones extends javax.swing.JPanel {
    ControlBD  enlace  = new ControlBD();
    Connection conect = enlace.conectar();
    public Habitaciones() {
        initComponents();
    }
    private void listarHabitaciones() {
    String sql = "SELECT CodigoHabitacion, TamanoHabitacion, PrecioPorDia, EstadoHabitacion FROM habitacion";
    Statement st;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Código de Habitación");
    model.addColumn("Tamaño");
    model.addColumn("Precio por Día");
    model.addColumn("Estado");
        
    tablaHabitaciones.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
       st= (Statement) conect.createStatement();
        ResultSet rs= (ResultSet) st.executeQuery(sql);
        while(rs.next()) {
            int codigo = rs.getInt("CodigoHabitacion");
            String tamano = rs.getString("TamanoHabitacion");
            double precio = rs.getDouble("PrecioPorDia");
            String estado = rs.getString("EstadoHabitacion");
            
            model.addRow(new Object[]{codigo, tamano, precio, estado});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    private void mostrarInformacionHuespedesYHabitaciones() {
    String sql = "SELECT h.Nombre AS NombreHuesped, h.Apellido AS ApellidoHuesped, h.FechaSalida, hb.CodigoHabitacion, hb.TamanoHabitacion, hb.PrecioPorDia "
               + "FROM huesped h "
               + "INNER JOIN habitacion hb ON h.CodigoHabitacion = hb.CodigoHabitacion";
    Statement st;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Nombre Huesped");
    model.addColumn("Apellido Huesped");
    model.addColumn("Fecha de Salida");
    model.addColumn("Código de Habitación");
    model.addColumn("Tamaño de Habitación");
    model.addColumn("Precio por Día");
        
    tablaHabitaciones.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
         st= (Statement) conect.createStatement();
        ResultSet rs= (ResultSet) st.executeQuery(sql);
        while(rs.next()) {
            String nombreHuesped = rs.getString("NombreHuesped");
            String apellidoHuesped = rs.getString("ApellidoHuesped");
            Date fechaSalida = rs.getDate("FechaSalida");
            int codigoHabitacion = rs.getInt("CodigoHabitacion");
            String tamanoHabitacion = rs.getString("TamanoHabitacion");
            double precioPorDia = rs.getDouble("PrecioPorDia");
            
            model.addRow(new Object[]{nombreHuesped, apellidoHuesped, fechaSalida, codigoHabitacion, tamanoHabitacion, precioPorDia});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
    
}
    private void mostrarHabitacionesPorEstado(String estado) {
    String sql = "SELECT CodigoHabitacion, TamanoHabitacion, PrecioPorDia FROM habitacion WHERE EstadoHabitacion = ?";
    PreparedStatement pst;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Código de Habitación");
    model.addColumn("Tamaño");
    model.addColumn("Precio por Día");
        
    tablaHabitaciones.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
        pst = (PreparedStatement) conect.prepareStatement(sql);
        pst.setString(1, estado);
        ResultSet rs = (ResultSet) pst.executeQuery();
        while(rs.next()) {
            int codigo = rs.getInt("CodigoHabitacion");
            String tamano = rs.getString("TamanoHabitacion");
            double precio = rs.getDouble("PrecioPorDia");
            
            model.addRow(new Object[]{codigo, tamano, precio});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    private void ordenarHabitacionesDisponibles(String criterio) {
    String sql = "SELECT CodigoHabitacion, TamanoHabitacion, PrecioPorDia FROM habitacion WHERE EstadoHabitacion = 'DISPONIBLE' ORDER BY " + criterio;
    Statement st;
        
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Código de Habitación");
    model.addColumn("Tamaño");
    model.addColumn("Precio por Día");
        
    tablaHabitaciones.setModel(model);
    
    // Ajuste automático del tamaño de las columnas
    tablaHabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
    try {
        st = (Statement) conect.createStatement();
        ResultSet rs = (ResultSet) st.executeQuery(sql);
        while(rs.next()) {
            int codigo = rs.getInt("CodigoHabitacion");
            String tamano = rs.getString("TamanoHabitacion");
            double precio = rs.getDouble("PrecioPorDia");
            
            model.addRow(new Object[]{codigo, tamano, precio});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnTH = new javax.swing.JButton();
        btnDisponible = new javax.swing.JButton();
        btnReservada = new javax.swing.JButton();
        btnManten = new javax.swing.JButton();
        btnMO = new javax.swing.JButton();
        btnOcupado = new javax.swing.JButton();
        btnEspacio = new javax.swing.JButton();
        estado = new javax.swing.JComboBox<>();
        btnPRECIO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HABITACIONES");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -10, 380, -1));

        btnTH.setText("Todas las habitaciones");
        btnTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHActionPerformed(evt);
            }
        });
        add(btnTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        btnDisponible.setText("DISPONIBLES");
        btnDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibleActionPerformed(evt);
            }
        });
        add(btnDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 130, -1));

        btnReservada.setText("RESERVADAS");
        btnReservada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservadaActionPerformed(evt);
            }
        });
        add(btnReservada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 140, -1));

        btnManten.setText("MANTENIMIENTO");
        btnManten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenActionPerformed(evt);
            }
        });
        add(btnManten, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 140, -1));

        btnMO.setText("MODIFICAR ESTADO");
        btnMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMOActionPerformed(evt);
            }
        });
        add(btnMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 150, -1));

        btnOcupado.setText("OCUPADAS");
        btnOcupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcupadoActionPerformed(evt);
            }
        });
        add(btnOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, -1));

        btnEspacio.setText("ESPACIO");
        btnEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacioActionPerformed(evt);
            }
        });
        add(btnEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 110, -1));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OCUPADO", "DISPONIBLE ", "MANTENIMIENTO ", "RESERVADO" }));
        add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 150, -1));

        btnPRECIO.setText("PRECIO");
        btnPRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRECIOActionPerformed(evt);
            }
        });
        add(btnPRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 110, -1));

        tablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaHabitaciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 590, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacion.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 490, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacion.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRECIOActionPerformed
       ordenarHabitacionesDisponibles("PrecioPorDia");
    }//GEN-LAST:event_btnPRECIOActionPerformed

    private void btnEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacioActionPerformed
        ordenarHabitacionesDisponibles("TamanoHabitacion");
    }//GEN-LAST:event_btnEspacioActionPerformed

    private void btnTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHActionPerformed
    listarHabitaciones();
    }//GEN-LAST:event_btnTHActionPerformed

    private void btnOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcupadoActionPerformed
     mostrarInformacionHuespedesYHabitaciones();
    }//GEN-LAST:event_btnOcupadoActionPerformed

    private void btnDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibleActionPerformed
    mostrarHabitacionesPorEstado("DISPONIBLE");
    }//GEN-LAST:event_btnDisponibleActionPerformed

    private void btnMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMOActionPerformed
     // Obtener el estado seleccionado del JComboBox
    String nuevoEstado = estado.getSelectedItem().toString();
    
    // Obtener el código de la habitación seleccionada en la tabla
    int filaSeleccionada = tablaHabitaciones.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una habitación para actualizar su estado.");
        return;
    }
    int codigoHabitacion = (int) tablaHabitaciones.getValueAt(filaSeleccionada, 0); // Suponiendo que la columna 0 contiene el código de la habitación
    
    // Actualizar el estado de la habitación en la base de datos
    try {
        String sql = "UPDATE habitacion SET EstadoHabitacion = ? WHERE CodigoHabitacion = ?";
        PreparedStatement pst = (PreparedStatement) conect.prepareStatement(sql);
        pst.setString(1, nuevoEstado);
        pst.setInt(2, codigoHabitacion);
        int filasActualizadas = pst.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "Estado de la habitación actualizado correctamente.");
            // Actualizar la tabla de habitaciones para reflejar los cambios
            btnDisponibleActionPerformed(evt); // Llamar al método para mostrar las habitaciones disponibles
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado de la habitación.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la habitación: " + e.toString());
    }

    }//GEN-LAST:event_btnMOActionPerformed

    private void btnReservadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservadaActionPerformed
        mostrarHabitacionesPorEstado("RESERVADO");
    }//GEN-LAST:event_btnReservadaActionPerformed

    private void btnMantenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenActionPerformed
       mostrarHabitacionesPorEstado("MANTENIMIENTO ");
    }//GEN-LAST:event_btnMantenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisponible;
    private javax.swing.JButton btnEspacio;
    private javax.swing.JButton btnMO;
    private javax.swing.JButton btnManten;
    private javax.swing.JButton btnOcupado;
    private javax.swing.JButton btnPRECIO;
    private javax.swing.JButton btnReservada;
    private javax.swing.JButton btnTH;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabitaciones;
    // End of variables declaration//GEN-END:variables
}
