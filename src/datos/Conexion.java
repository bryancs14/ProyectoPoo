/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.*;


public class Conexion {
    private  static Conexion instancia;
    
    public static Conexion getInstancia(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
    
    private Conexion(){
        
    }
    
    public Connection miConexion(){
        Connection cn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR NO SE PUEDE CARGAR EL DRIVER: " + e.getMessage());
        }
        
        try{
            String url = "jdbc:mysql://localhost:3306/dbSupermercado?useSSL=false";
            String user = "root";
            String password = "";
            cn = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException ex) {
            System.out.println("ERROR NO SE PUEDE ESTABLECER LA CONEXION: " + ex.getMessage());
        }
        
        return cn;
    }
    
}
