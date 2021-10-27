/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidad.Caja;
import entidad.Supermercado;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CajaDAO {
    private Connection cn =null;
    private ResultSet rs = null;
    
    private static CajaDAO instancia;
    
    public static CajaDAO getInstancia(){
        if(instancia == null)
            instancia = new CajaDAO();
        return instancia;
    }
    
    public void agregar(Caja caja) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String idCaja = caja.getIdCaja();
            int numeroCaja = caja.getNumeroDeCaja();
            String idSupermercado = caja.getSupermercado().getIdSupermercado();
            String sql = "insert into caja(idCaja, numeroCaja, idSupermercado) values(?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCaja);
            ps.setInt(2, numeroCaja);
            ps.setString(3, idSupermercado);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public Caja buscarCaja(String idCaja) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Caja caja = null;
        try {
            String sql = "select * from caja where idCaja = ?;";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCaja);
            rs = ps.executeQuery();
            if(rs.next()){
                int numeroCaja = rs.getInt("numeroCaja");
                String idSupermercado = rs.getString("idSupermercado");
                Supermercado supermercado = SupermercadoDAO.getInstancia().buscarSupermercado(idSupermercado);
                caja = new Caja(idCaja, numeroCaja, supermercado);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
        return caja;
    }
    
    public void actualizar(Caja caja) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps =  null;
        try {
            String idCaja = caja.getIdCaja();
            int numeroCaja = caja.getNumeroDeCaja();
            String sql = "update caja set numeroCaja = ? where  idCaja = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, numeroCaja);
            ps.setString(2, idCaja);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
    
    public void eliminar(String idCaja) throws SQLException{
        cn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            String sql = "delete from caja where idCaja = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, idCaja);
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
        String titulos[] = {"ID CAJA", "NUMERO DE CAJA", "ID SUPERMERCADO"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            String sql = "select * from caja";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String idCaja = rs.getString("idCaja");
                int numeroCaja = rs.getInt("numeroCaja");
                String numero = String.valueOf(numeroCaja);
                String idSupermercado = rs.getString("idSupermercado");
                String filas[] = {idCaja, numero, idSupermercado};
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            cn.close();
            ps.close();
        }
    }
}
