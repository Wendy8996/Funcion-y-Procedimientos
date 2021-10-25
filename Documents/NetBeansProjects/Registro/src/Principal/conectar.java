/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wendy.martinez
 */
public class conectar {
    public conectar(){
        
    }
    public static Connection getConexion(){
        String conexion="jdbc:sqlserver://localhost:1433;"
                + "database:clientes;"
                + "user:sa;"
                + "password:1234;"
                + "";
        try{
            Connection con=DriverManager.getConnection(conexion);
            return con;
        }catch(SQLException e){
            System.out.println("NO se pudo conectar"+e);
            return null;
        }
    }
}
