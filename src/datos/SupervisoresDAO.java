/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidad.Supervisor;
import entidad.Administrador;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Aorus
 */
public class SupervisoresDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static SupervisoresDAO instancia;
    
    public static SupervisoresDAO getInstancia(){
        if(instancia == null)
            instancia = new SupervisoresDAO();
        return instancia;
    }
}
