/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Producto;
import entidad.Administrador;
import entidad.Categoria;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ProductoDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static ProductoDAO instancia;
    
    public static ProductoDAO getInstancia(){
        if(instancia == null)
            instancia = new ProductoDAO();
        return instancia;
    }
    
    
    public void agregar(Producto producto) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idProducto = producto.getIdProducto();
            String nombre = producto.getNombre();
            double precioVenta = producto.getPrecioVenta();
            int stock = producto.getStock();
            String idCategoria = producto.getCategoria().getIdCategoria();
            String sql = "insert into producto(idProducto, nombre, precioVenta, stock, idCategoria) values (?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProducto);
            ps.setString(2, nombre);
            ps.setDouble(3, precioVenta);
            ps.setInt(4, stock);
            ps.setString(5, idCategoria);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Producto buscarProducto(String idProducto) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Producto producto = null;
        try {
            String sql = "select * from producto where idProducto = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProducto);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                double precioVenta = rs.getDouble("precioVenta");
                int stock = rs.getInt("stock");
                String idCategoria = rs.getString("idCategoria");
                Categoria categoria = CategoriaDAO.getInstancia().buscarCategoria(idCategoria);
                producto = new Producto(idProducto, nombre, precioVenta, stock, categoria);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return producto;
    }
    
    public void actualizar(Producto producto) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps =  null;
        try {
            String idProducto = producto.getIdProducto();
            String nombre = producto.getNombre();
            double precioVenta = producto.getPrecioVenta();
            int stock = producto.getStock();
            String idCategoria = producto.getCategoria().getIdCategoria();
            String idAdministrador = producto.getAdministrador().getIdAdministrador();
            String sql = "update producto set nombre = ?, precioVenta = ?, stock = ?, idCategoria = ? where idProducto = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setDouble(2, precioVenta);
            ps.setInt(3, stock);
            ps.setString(4, idCategoria);
            ps.setString(5, idProducto);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idProducto) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from producto where idProducto = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idProducto);
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
        String titulos[] = {"ID PRODUCTO", "NOMBRE", "PRECIO VENTA", "STOCK", "ID CATEGORIA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from producto";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idProducto = rs.getString("idProducto");
                String nombre = rs.getString("nombre");
                String precioVenta = String.valueOf(rs.getDouble("precioventa"));
                String stock = String .valueOf(rs.getInt("stock"));
                String idCategoria = rs.getString("idCategoria");

                String fila[] = {idProducto, nombre, precioVenta, stock, idCategoria};
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
        String titulos[] = {"ID PRODUCTO", "NOMBRE", "PRECIO VENTA", "STOCK", "ID CATEGORIA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = " select * from producto where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idProducto = rs.getString("idProducto");
                String nombre = rs.getString("nombre");
                String precioVenta = String.valueOf(rs.getDouble("precioventa"));
                String stock = String .valueOf(rs.getInt("stock"));
                String idCategoria = rs.getString("idCategoria");

                String fila[] = {idProducto, nombre, precioVenta, stock, idCategoria};
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
