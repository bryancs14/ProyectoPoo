/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Administrador;
import entidad.Supermercado;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;


public class AdministradorDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static AdministradorDAO instancia;
    
    public static AdministradorDAO getInstancia(){
        if(instancia == null)
            instancia = new AdministradorDAO();
        return instancia;
    }
    
    public void agregar(Administrador administrador)throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idAdministrador = administrador.getIdAdministrador();
            String nombre = administrador.getNombre();
            String contraseña = administrador.getContraseña();
            String idSupermercado = administrador.getSupermercado().getIdSupermercado();
            String sql = "insert into administrador(idAdministrador, nombre, contraseña, idSupermercado) values(?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idAdministrador);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);
            ps.setString(4, idSupermercado);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Administrador buscarAdministrador(String idAdministrador)throws  SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Administrador administrador = null;
        try {
            String sql = "select * from administrador where idAdministrador = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idAdministrador);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                String idSupermercado = rs.getString("idSupermercado");
                Supermercado supermercado = SupermercadoDAO.getInstancia().buscarSupermercado(idSupermercado);
                administrador = new Administrador(idAdministrador, nombre, contraseña, supermercado);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return administrador;
    }
    
    public void actualizar(Administrador administrador) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idAdministrador = administrador.getIdAdministrador();
            String nombre = administrador.getNombre();
            String contraseña = administrador.getContraseña();
            String idSupermercado = administrador.getSupermercado().getIdSupermercado();
            String sql = "update administrador set nombre = ?, contraseña = ?, idSupermercado = ? where idAdministrador = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ps.setString(3, idSupermercado);
            ps.setString(4, idAdministrador);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idAdministrador) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from administrador where idAdministrador = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idAdministrador);
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
        String titulos[] = {"ID ADMINISTRADOR", "NOMBRE", "ID SUPERMERCADO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from administrador";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idAdministrador = rs.getString("idAdministrador");
                String nombre = rs.getString("nombre");
                String idSupermercado = rs.getString("idSupermercado");
                String fila[] = {idAdministrador, nombre, idSupermercado};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void mostrarPorNombre(DefaultTableModel modelo, String nom) throws  SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID ADMINISTRADOR", "NOMBRE", "ID SUPERMERCADO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = " select * from administrador where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idAdministrador = rs.getString("idAdministrador");
                String nombre = rs.getString("nombre");
                String idSupermercado = rs.getString("idSupermercado");
                String fila[] = {idAdministrador, nombre, idSupermercado};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Administrador obtenerPrimerAdmin() throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Administrador administrador = null;
        try {
            String sql = "select * from administrador";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                String idAdministrador = rs.getString("idAdministrador");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                String idSupermercado = rs.getString("idSupermercado");
                Supermercado supermercado = SupermercadoDAO.getInstancia().buscarSupermercado(idSupermercado);
                administrador = new Administrador(idAdministrador, nombre, contraseña, supermercado);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRORaaa", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return administrador;
    }
}
