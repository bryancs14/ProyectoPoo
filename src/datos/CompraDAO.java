/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import entidad.Compra;
import entidad.Proveedor;
import entidad.Supervisor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Usuario
 */
public class CompraDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static CompraDAO instancia;
    
    public static CompraDAO getInstancia(){
        if(instancia == null)
            instancia = new CompraDAO();
        return instancia;
    }
    public void agregar(Compra compra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idCompra = compra.getIdCompra();
            double importe = compra.getImporte();
            String fechaHora = compra.getFechaHora();
            String idProveedor = compra.getProveedor().getNombre();
            String idSupervisor = compra.getSupervisor().getIdSupervisor();
            String sql = "insert into supermercado(idCompra, importe, fechaHora, idProveedor, idSupervisor) values(?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCompra);
            ps.setDouble(2, importe);
            ps.setString(3, fechaHora);
            ps.setString(4, idProveedor);
            ps.setString(5, idSupervisor);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Compra buscarCompra(String idCompra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Compra compra = null;
        try {
            String sql = "select * from compra where idCompra = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCompra);
            rs = ps.executeQuery();
            if(rs.next()){
                double importe = rs.getDouble("importe");
                String fechaHora = rs.getString("fechaHora");
                Proveedor proveedor = ProveedorDAO.getInstancia().buscarProveedor(rs.getString("idProveedor"));
                Supervisor supervisor = SupervisorDAO.getInstancia().buscarSupervisor(rs.getString("idSupervisor"));
                compra = new Compra(idCompra, importe, fechaHora, proveedor, supervisor);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return compra;
    }
    
    public void actualizar(Compra compra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCompra = compra.getIdCompra();
            double importe = compra.getImporte();
            String fechaHora = compra.getFechaHora();
            String idProveedor = compra.getProveedor().getNombre();
            String idSupervisor = compra.getSupervisor().getIdSupervisor();
            String sql = "update compra set importe = ?, fechaHora = ?, idProveedor = ?, idSupervisor = ? where idCompra = ?";
            ps = cn.prepareStatement(sql);
            ps.setDouble(1, importe);
            ps.setString(2, fechaHora);
            ps.setString(3, idProveedor);
            ps.setString(4, idSupervisor);
            ps.setString(5, idCompra);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idCompra) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from compra where idCompra = ?";
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
        String titulos[] = {"ID COMPRA", "IMPORTE", "FECHA - HORA", "ID PROVEEDOR", "ID SUPERVISOR"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from compra";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCompra = rs.getString("idCompra");
                String importe = String.valueOf(rs.getDouble("importe"));
                String fechaHora = rs.getString("fechaHora");
                String idProveedor = rs.getString("idProveedor");
                String idSupervisor = rs.getString("idSupervisor");
                String fila[] = {idCompra, importe, fechaHora, idProveedor, idSupervisor};
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
        String titulos[] = {"ID COMPRA", "IMPORTE", "FECHA - HORA", "ID PROVEEDOR", "ID SUPERVISOR"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from compra where idCompra like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idCompra = rs.getString("idCompra");
                String importe = String.valueOf(rs.getDouble("importe"));
                String fechaHora = rs.getString("fechaHora");
                String idProveedor = rs.getString("idProveedor");
                String idSupervisor = rs.getString("idSupervisor");
                String fila[] = {idCompra, importe, fechaHora, idProveedor, idSupervisor};
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
