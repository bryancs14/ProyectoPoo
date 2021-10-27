/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Carrito;
import entidad.DetalleCarrito;
import entidad.Caja;
import entidad.Cliente;
import entidad.Producto;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CarritoDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static CarritoDAO instancia;
    
    public static CarritoDAO getInstancia(){
        if(instancia == null)
            instancia = new CarritoDAO();
        return instancia;
    }
    
    public void agregar(Carrito carrito) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCarrito = carrito.getIdCarrito();
            double importe = carrito.getImporte();
            String fechaHora = carrito.getFechaHora();
            int puntosGanados = carrito.getPuntosGanados();
            String idCliente = carrito.getCliente().getIdCliente();
            String idCaja = carrito.getCaja().getIdCaja();
            String sql = "insert into carrito(idCompra, importe, fechaHora, medioPago, puntosGanados, idCliente, idCaja) values(?, ?, ?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCarrito); // Otra forma ps.setString(1, carrito.getIdCarrito());
            ps.setDouble(2, importe);
            ps.setString(3, fechaHora);
            ps.setInt(4, puntosGanados);
            ps.setString(5, idCliente);
            ps.setString(6, idCaja);
            ps.executeUpdate();
            
            ListaDetalleCarrito LDC = carrito.getLDC();
            
            for(int i = 0; i < LDC.size(); i++){
                DetalleCarrito x = LDC.getElemento(i);
                sql = "insert into carritoProductos(idCompra, idProducto, cantidadComprada) values(?, ?, ?)";
                ps = cn.prepareStatement(sql);
                ps.setString(1, carrito.getIdCarrito());
                ps.setString(2, x.getProducto().getIdProducto());
                ps.setInt(3, x.getCantidadComprada());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Carrito buscarCarrito(String idCompra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Carrito carrito = null;
        try{
            String sql = "select * from carrito where idCompra = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCompra);
            rs = ps.executeQuery();
            if(rs.next()){
                double importe = rs.getDouble("importe");
                String fechaHora = rs.getString("fechaHora");
                String medioPago = rs.getString("medioPago");
                int puntoGanados = rs.getInt("puntosGanados");
                String idCliente = rs.getString("idCliente");
                String idCaja = rs.getString("idCaja");
                Cliente cliente = ClienteDAO.getInstancia().buscarCliente(idCliente);
                Caja caja = CajaDAO.getInstancia().buscarCaja(idCaja);
                carrito = new Carrito(idCompra, importe, fechaHora, medioPago, puntoGanados, cliente, caja);
                sql = "select * from carritoproductos where idCompra = ?";
                ps = cn.prepareStatement(sql);
                ps.setString(1, idCompra);
                rs = ps.executeQuery();
                while(rs.next()){
                    String idProducto = rs.getString("idProducto");
                    int cantidadComprada = rs.getInt("cantidadComprada");
                    Producto producto = ProductoDAO.getInstancia().buscarProducto(idProducto);
                    DetalleCarrito det = new DetalleCarrito(producto, cantidadComprada);
                    carrito.registrarDetalle(det);
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return carrito;
    }
    
    public void eliminar(String idCompra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from carrito where idCompra = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCompra);
            ps.executeUpdate();
            sql = "delete from carritoproductos where idCompra = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCompra);
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
        String titulos[] = {"ID COMPRA", "IMPORTE", "FECHA - HORA", "MEDIO DE PAGO", "PUNTOS GANADOS", "ID CLIETNE", "ID CAJA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from carrito";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCompra = rs.getString("idCompra");
                double importe = rs.getDouble("importe");
                String fechaHora = rs.getString("fechaHora");
                String medioPago = rs.getString("medioPago");
                int puntosGanados = rs.getInt("puntosGanados");
                String idCliente = rs.getString("idCliente");
                String idCaja = rs.getString("idCaja");
                String importes = String.valueOf(importe);
                String puntosGanadoss = String.valueOf(puntosGanados);
                String fila[] = {idCompra, importes, fechaHora, medioPago, puntosGanadoss, idCliente, idCaja};
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
