/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Cliente;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection cn = null;
    private ResultSet rs = null;
    
    private static ClienteDAO instancia;
    
    public static ClienteDAO getInstancia(){
        if(instancia == null)
            instancia = new ClienteDAO();
        return instancia;
    }
    
    public void agregar(Cliente cliente) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCliente = cliente.getIdCliente();
            String dni = cliente.getDni();
            String nombre = cliente.getNombre();
            String email = cliente.getEmail();
            int puntosAcumulados = cliente.getPuntosAcumulados();
            String sql = "insert into cliente(idCliente, dni, nombre, email, puntosAcumulados) values(?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCliente);
            ps.setString(2, dni);
            ps.setString(3, nombre);
            ps.setString(4, email);
            ps.setInt(5, puntosAcumulados);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }          
    }
    
    public Cliente buscarCliente(String idCliente) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Cliente cliente = null;
        
        try {
            String sql = "select * from cliente where idCliente = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCliente);
            rs = ps.executeQuery();
            if(rs.next()){
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                int puntosAcumulados = rs.getInt("puntosAcumulados");
                cliente = new Cliente(idCliente, dni, nombre, email, puntosAcumulados);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return cliente;     
    }
    
    public void actualizar(Cliente cliente) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCliente = cliente.getIdCliente();
            String dni = cliente.getDni();
            String nombre = cliente.getNombre();
            String email = cliente.getEmail();
            int puntosAcumulados = cliente.getPuntosAcumulados();
            String sql = "pdate cliente set dni = ?, nombre = ?, email = ?, puntosAcumulados = ? where idCliente = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, email);
            ps.setInt(4, puntosAcumulados);
            ps.setString(5, idCliente);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idCliente) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from cliente where idCliente = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCliente);
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
        String titulos[] = {"ID CLIENTE", "DNI", "NOMBRE", "EMAIL", "PUNTOS ACUMULADOS"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from cliente";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCliente = rs.getString("nombre");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                int puntosAcumulado = rs.getInt("puntosAcumulados");
                String puntos = String.valueOf(puntosAcumulado);
                String fila[] = {idCliente, dni, nombre, email, puntos};
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
        String titulos[] = {"ID CLIENTE", "DNI", "NOMBRE", "EMAIL", "PUNTOS ACUMULADOS"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from cliente where nombre like ?";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCliente = rs.getString("idCliente");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                int puntosAcumulados = rs.getInt("puntosAcumulados");
                String puntos = String.valueOf(puntosAcumulados);
                String fila[] = {idCliente, dni, nombre, email, puntos};
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
