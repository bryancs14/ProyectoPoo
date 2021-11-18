/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import entidad.Supervisor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Usuario
 */
public class SupervisorDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static SupervisorDAO instancia;
    
    public static SupervisorDAO getInstancia(){
        if(instancia == null)
            instancia = new SupervisorDAO();
        return instancia;
    }
    public void agregar(Supervisor supervisor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        
        try {
            String idSupervisor = supervisor.getIdSupervisor();
            String nombre = supervisor.getNombre();
            String contraseña = supervisor.getContraseña();
            String sql = "insert into supervisor(idSupervisor, nombre, contraseña) values(?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupervisor);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Supervisor buscarSupervisor(String idSupervisor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Supervisor supervisor = null;
        try {
            String sql = "select * from supervisor where idSupervisor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupervisor);
            rs = ps.executeQuery();
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                supervisor = new Supervisor(idSupervisor, nombre, contraseña);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return supervisor;
    }
    
    public void actualizar(Supervisor supervisor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idSupervisor = supervisor.getIdSupervisor();
            String nombre = supervisor.getNombre();
            String contraseña = supervisor.getContraseña();
            String sql = "update supervisor set nombre = ?, contraseña = ? where idSupervisor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ps.setString(3, idSupervisor);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idSupervisor) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from supervisor where idSupervisor = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idSupervisor);
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
        String titulos[] = {"ID SUPERVISOR", "NOMBRE", "CONTRASEÑA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from supervisor";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idSupervisor = rs.getString("idSupervisor");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                String fila[] = {idSupervisor, nombre, contraseña};
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
        String titulos[] = {"ID SUPERVISOR", "NOMBRE", "CONTRASEÑA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from supervisor where nombre like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idSupervisor = rs.getString("idSupervisor");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                String fila[] = {idSupervisor, nombre, contraseña};
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
        String titulos[] = {"ID SUPERVISOR", "NOMBRE", "CONTRASEÑA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            String sql = "select * from supervisor where idSupervisor like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String idSupervisor = rs.getString("idSupervisor");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contraseña");
                String fila[] = {idSupervisor, nombre, contraseña};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Supervisor login(Supervisor supervisor) throws SQLException {
        Supervisor supervisorLogueado = null;
        Connection cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ResultSet rs;
        String idSupervisor = supervisor.getIdSupervisor();
        String contraseña = supervisor.getContraseña();
        String sql = "select * from supervisor where idSupervisor = ? and contraseña = ?";
        try {
            
            ps = cn.prepareStatement(sql);

            ps.setString(1, idSupervisor);
            ps.setString(2, contraseña);

            rs = ps.executeQuery();

            if(rs.next()){
                String nombre = rs.getString("nombre");
                supervisorLogueado = new Supervisor(idSupervisor, nombre, contraseña);
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
        return supervisorLogueado;
    }
}
    
