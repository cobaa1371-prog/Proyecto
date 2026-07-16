/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginproyecto;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection conectar = null;
    
    public Connection conectar (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/administrador", "root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }return conectar;
    }
}
