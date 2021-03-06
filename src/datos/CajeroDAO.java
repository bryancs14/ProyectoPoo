/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Cajero;
import entidad.Caja;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CajeroDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static CajeroDAO instancia;
    
    public static CajeroDAO getInstancia(){
        if(instancia == null)
            instancia = new CajeroDAO();
        return instancia;
    }
    
    public void agregar(Cajero cajero) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idCajero = cajero.getIdCajero();
            String nombre = cajero.getNombre();
            String turno = cajero.getTurno();
            String contraseña = cajero.getContraseña();
            String idCaja = cajero.getCaja().getIdCaja();
            String sql = "insert into cajero(idCajero, nombre, turno, contraseña, idCaja) values(?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCajero);
            ps.setString(2, nombre);
            ps.setString(3, turno);
            ps.setString(4, contraseña);
            ps.setString(5, idCaja);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Cajero buscarCajero(String idCajero) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Cajero cajero = null;
        try {
            String sql = "select * from cajero where idCajero = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCajero);
            rs = ps.executeQuery();
            while(rs.next()){
                String nombre = rs.getString("nombre");
                String turno = rs.getString("turno");
                String contraseña = rs.getString("contraseña");
                String idCaja = rs.getString("idCaja");
                Caja caja = CajaDAO.getInstancia().buscarCaja(idCaja);
                cajero = new Cajero(idCajero, nombre, turno, contraseña, caja);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cajero;
    }
    
    public void actualizar(Cajero cajero) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCajero = cajero.getIdCajero();
            String nombre = cajero.getNombre();
            String turno = cajero.getTurno();
            String contraseña = cajero.getContraseña();
            String sql = "update cajero set nombre = ?, turno = ?, contraseña = ?  where idCajero = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, turno);
            ps.setString(3, contraseña);
            ps.setString(4, idCajero);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idCajero)throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from cajero where idCajero = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCajero);
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
        String titulos[] = {"ID CAJERO", "NOMBRE", "TURNO", "N° CAJA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from cajero";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            rs = ps.executeQuery();
            while(rs.next()){
                String idCajero = rs.getString("idCajero");
                String nombre = rs.getString("nombre");
                String turno = rs.getString("turno");
                String idCaja = rs.getString("idCaja");
                Caja caja = CajaDAO.getInstancia().buscarCaja(idCaja);
                int nCaja = caja.getNumeroDeCaja();
                
                Object fila[] = {idCajero, nombre, turno, nCaja};
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
        String titulos[] = {"ID CAJERO", "NOMBRE", "TURNO", "N° CAJA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from cajero where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idCajero = rs.getString("idCajero");
                String nombre = rs.getString("nombre");
                String turno = rs.getString("turno");
                String idCaja = rs.getString("idCaja");
                Caja caja = CajaDAO.getInstancia().buscarCaja(idCaja);
                int nCaja = caja.getNumeroDeCaja();
                
                Object fila[] = {idCajero, nombre, turno, nCaja};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        } 
    }
    
    public Cajero login(Cajero cajero) throws SQLException {
        Cajero cajeroLogueado = null;
        Connection cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ResultSet rs;
        String idCajero = cajero.getIdCajero();
        String contraseña = cajero.getContraseña();
        String sql = "select * from cajero where idCajero = ? and contraseña = ?";
        try {
            
            ps = cn.prepareStatement(sql);  

            ps.setString(1, idCajero);
            ps.setString(2, contraseña);

            rs = ps.executeQuery();

            if(rs.next()){
                String nombre = rs.getString("nombre");
                String turno = rs.getString("turno");
                String idCaja = rs.getString("idCaja");
                Caja caja = CajaDAO.getInstancia().buscarCaja(idCaja);
                cajeroLogueado = new Cajero(idCajero, nombre, turno, contraseña, caja);
            }
            else{
                JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
            }

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION" + e.getMessage());
        } finally{
            cn.close();
            ps.close();
        }
        return cajeroLogueado;
    }
}
