
package datos;

import entidad.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaProducto {
    private ArrayList<Producto> lista;
    
    public ListaProducto() {
        lista = new ArrayList();
    }
    
    public boolean add(Producto x) {
        return lista.add(x);
    }
    
    public Producto getElementoByIndex(int index) {
        return lista.get(index);
    }
    
    public Producto getElementoById(String id) {
        Producto x = new Producto(id);
        return lista.get(lista.indexOf(x));
    }
    
    public Producto delete(int index) {
        return lista.remove(index);
    }
    
    public int searchIndexById(String id) {
        Producto x = new Producto(id);
        return lista.indexOf(x);
    }
    
    public Producto update(int index, Producto x) {
        return lista.set(index, x);
    }
    
    public void show(DefaultTableModel modelo) {
        Object datos[][] = new Object[lista.size()][5];
        String titulos[] = {"ID PRODUCTO", "NOMBRE", "PRECIO COMPRA", "PRECIO VENTA", "STOCK"};
        for(int i=0; i<lista.size(); i++) {
            Producto x = lista.get(i);
            datos[i][0] = x.getIdProducto();
            datos[i][1] = x.getNombre();
            datos[i][2] = x.getPrecioCompra();
            datos[i][3] = x.getPrecioVenta();
            datos[i][4] = x.getStock();
        }
        modelo.setDataVector(datos, titulos);
    }
    
    public ListaProducto searchByName(String name) {
        ListaProducto res = new ListaProducto();
        for(Producto x: lista) {
            if(x.getNombre().startsWith(name))
                res.add(x);
        }
        return res;
    }
}
