/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidad.Proveedor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Aorus
 */
public class ProveedorDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static ProveedorDAO instancia;
    
    public static ProveedorDAO getInstancia(){
        if(instancia == null)
            instancia = new ProveedorDAO();
        return instancia;
    }
    
    public void agregar(Proveedor proveedor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idProveedor = proveedor.getIdProveedor();
            String nombre = proveedor.getNombre();
            String telefono = proveedor.getTelefono();
            String sql = "insert into proveedor(idProveedor, nombre, telefono) values(?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProveedor);
            ps.setString(2, nombre);
            ps.setString(3, telefono);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Proveedor buscarProveedor(String idProveedor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Proveedor proveedor = null;
        try {
            String sql = "select * from proveedor where idProveedor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProveedor);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                proveedor = new Proveedor(idProveedor, nombre, telefono);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return proveedor;
    }
    
    public void actualizar(Proveedor proveedor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idProveedor = proveedor.getIdProveedor();
            String nombre = proveedor.getNombre();
            String telefono = proveedor.getTelefono();
            String sql = "update proveedor set nombre = ?, telefono = ? where idProveedor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, idProveedor);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idProveedor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from proveedor where idProveedor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProveedor);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void mostrar(DefaultTableModel modelo) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID PROVEEDOR", "NOMBRE", "TELEFONO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from proveedor";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idProveedor = rs.getString("idProveedor");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String fila[] = {idProveedor, nombre, telefono};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }   
    }
    
    public void mostrarPorNombre(DefaultTableModel modelo, String nom) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID PROVEEDOR", "NOMBRE", "TELEFONO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from proveedor where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idProveedor = rs.getString("idProveedor");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String fila[] = {idProveedor, nombre, telefono};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void mostrarPorId(DefaultTableModel modelo, String id) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID PROVEEDOR", "NOMBRE", "TELEFONO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from proveedor where idProveedor like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idProveedor = rs.getString("idProveedor");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String fila[] = {idProveedor, nombre, telefono};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
}
