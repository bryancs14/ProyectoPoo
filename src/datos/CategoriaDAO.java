/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Categoria;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CategoriaDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static CategoriaDAO instancia;
    
    public static CategoriaDAO getInstancia(){
        if(instancia == null)
            instancia = new CategoriaDAO();
        return instancia;
    }
    
    public void agregar(Categoria categoria) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCategoria = categoria.getIdCategoria();
            String nombre = categoria.getNombre();
            String sql = "insert into categoria(idCategoria, nombre) values(?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCategoria);
            ps.setString(2, nombre);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }   
    }
    
    public Categoria buscarCategoria(String idCategoria) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Categoria categoria = null;
        try {
            String sql = "select * from categoria where idCategoria = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCategoria);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                categoria = new Categoria(idCategoria, nombre);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return categoria;
    }
    
    public void actualizar(Categoria categoria) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCategoria = categoria.getIdCategoria();
            String nombre = categoria.getNombre();
            String sql = "update categoria set nombre = ? where idCategoria = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, idCategoria);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idCategoria) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from categoria where idCategoria = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCategoria);
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
        String titulos[] = {"ID CATEGORIA", "NOMBRE"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from categoria";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCategoria = rs.getString("idCategoria");
                String nombre = rs.getString("nombre");
                String fila[] = {idCategoria, nombre};
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
        String titulos[] = {"ID CATEGORIA", "NOMBRE"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = " select * from categoria where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idCategoria = rs.getString("idCategoria");
                String nombre = rs.getString("nombre");
                String fila[] = {idCategoria, nombre};
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
