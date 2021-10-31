/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidad.DetalleCarrito;
import entidad.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ListaDetalleCarrito {
    private ArrayList<DetalleCarrito> lista;
    
    public ListaDetalleCarrito() {
        lista = new ArrayList();
    }
    
    public boolean add(DetalleCarrito x) {
        return lista.add(x);
    }
    
    public DetalleCarrito getElementoByProducto(Producto producto) {
        DetalleCarrito x = new DetalleCarrito(producto);
        return lista.get(lista.indexOf(x));
    }
    
    public DetalleCarrito delete(int index) {
        return lista.remove(index);
    }
    
    public int searchIndexByProducto(Producto producto) {
        DetalleCarrito x = new DetalleCarrito(producto);
        return lista.indexOf(x);
    }
    
    public DetalleCarrito update(int index, DetalleCarrito x) {
        return lista.set(index, x);
    }
    
    public int size() {
        return lista.size();
    }
    
    public void clear() {
        lista.clear();
    }
    
    public DetalleCarrito getElemento(int i){
        return lista.get(i);
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[lista.size()][4];
        String titulos[] = {"ID PRODUCTO", "NOMBRE", "PRECIO", "CANTIDAD"};
        for(int i=0; i<lista.size(); i++) {
            DetalleCarrito x = lista.get(i);
            datos[i][0] = x.getProducto().getIdProducto();
            datos[i][1] = x.getProducto().getNombre();
            datos[i][2] = x.getProducto().getPrecioVenta();
            datos[i][3] = x.getCantidadVendida();
        }
        modelo.setDataVector(datos, titulos);
    }
}
