/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import entidad.DetalleCompra;
import entidad.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aorus
 */
public class ListaDetalleCompra {
    private ArrayList<DetalleCompra> lista;
    
    public ListaDetalleCompra(){
        lista = new ArrayList();
    }
    
    public boolean add(DetalleCompra x) {
        return lista.add(x);
    }
    
    public DetalleCompra getElementoByProducto(Producto producto) {
        DetalleCompra x = new DetalleCompra(producto);
        return lista.get(lista.indexOf(x));
    }
    
    public DetalleCompra delete(int index) {
        return lista.remove(index);
    }
    
    public int searchIndexByProducto(Producto producto) {
        DetalleCompra x = new DetalleCompra(producto);
        return lista.indexOf(x);
    }
    
    public DetalleCompra update(int index, DetalleCompra x) {
        return lista.set(index, x);
    }
    
    public int size() {
        return lista.size();
    }
    
    public void clear() {
        lista.clear();
    }
    
    public DetalleCompra getElemento(int i){
        return lista.get(i);
    }
            
            
    public void mostrar(DefaultTableModel modelo)
    {
      Object datos[][]=new Object[lista.size()][5];
      String titulos[]={"ID PRODUCTO", "NOMBRE", "PRECIO", "STOCK", "CANTIDAD COMPRADA"};

      for(int i=0;i<lista.size();i++)
      {
        DetalleCompra x=lista.get(i);
        datos[i][0]=x.getProducto().getIdProducto();
        datos[i][1]=x.getProducto().getNombre();
        datos[i][2]=x.getProducto().getPrecioCompra();
        datos[i][3]=x.getProducto().getStock();
        datos[i][4]=x.getCantidadComprada();
      }
      modelo.setDataVector(datos, titulos);
    } 
    
}
