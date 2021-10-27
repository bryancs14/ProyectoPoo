/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Supermercado;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;

public class SupermercadoDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static SupermercadoDAO instancia;
    
    public static SupermercadoDAO getInstancia(){
        if(instancia == null)
            instancia = new SupermercadoDAO();
        return instancia;
    }
    
    public void agregar(Supermercado supermercado) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idSupermercado = supermercado.getIdSupermercado();
            String nombre = supermercado.getNombre();
            String direccion = supermercado.getDireccion();
            String sql = "insert into supermercado(idSupermercado, nombre, direccion) values(?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupermercado);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Supermercado buscarSupermercado(String idSupermercado) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Supermercado supermercado = null;
        try {
            String sql = "select * from supermercado where idSupermercado = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupermercado);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                supermercado = new Supermercado(idSupermercado, nombre, direccion);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return supermercado;
    }
    
    public void actualizar(Supermercado supermercado) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idSupermercado = supermercado.getIdSupermercado();
            String nombre = supermercado.getNombre();
            String direccion = supermercado.getDireccion();
            String sql = "update supermercado set nombre = ?, direccion = ? where idSupermercado = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setString(3, idSupermercado);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idSupermercado) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from supermercado where idSupermercado = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupermercado);
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
        String titulos[] = {"ID SUPERMERCADO", "NOMBRE", "DESCRIPCION"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from supermercado";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idSupermercado = rs.getString("idSupermercado");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String fila[] = {idSupermercado, nombre, direccion};
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
        String titulos[] = {"ID SUPERMERCADO", "NOMBRE", "DESCRIPCION"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from supermercado where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idSupermercado = rs.getString("idSupermercado");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String fila[] = {idSupermercado, nombre, descripcion};
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
