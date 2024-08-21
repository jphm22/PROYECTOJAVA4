/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ANIBAL
 */
public class ControlBD {
    
    
    Connection enlazar = null ;
    
    public Connection conectar(){  
        

        try 
        {
            // establecemos quien es el driver del motor de BD
           Class.forName("com.mysql.jdbc.Driver");
           enlazar = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
        } catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "No se conecto");
        }
        return enlazar;
    }
}
