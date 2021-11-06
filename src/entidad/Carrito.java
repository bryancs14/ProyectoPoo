
package entidad;

import datos.ListaDetalleCarrito;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class Carrito {
    private String idCarrito;
    private double importe;
    private String fechaHora;
    private String medioDePago;
    private int puntosGanados;
    private Cliente cliente;
    private Caja caja;
    private ListaDetalleCarrito LDC;

    public Carrito() {
    }
    
    public Carrito(String idCarrito, double importe, String fechaHora, String medioDePago, int puntosGanados, Cliente cliente, Caja caja, ListaDetalleCarrito LDC) {
        this.idCarrito = idCarrito;
        this.importe = importe;
        this.fechaHora = fechaHora;
        this.medioDePago = medioDePago;
        this.puntosGanados = puntosGanados;
        this.cliente = cliente;
        this.caja = caja;
        this.LDC = LDC;
    }
    
    public Carrito(String idCarrito, double importe, String fechaHora, String medioDePago, int puntosGanados, Cliente cliente, Caja caja) {
        this.idCarrito = idCarrito;
        this.importe = importe;
        this.fechaHora = fechaHora;
        this.medioDePago = medioDePago;
        this.puntosGanados = puntosGanados;
        this.cliente = cliente;
        this.caja = caja;
        LDC = new ListaDetalleCarrito();
    }

    public String getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public void setPuntosGanados(int puntosGanados) {
        this.puntosGanados = puntosGanados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public void registrarDetalle(DetalleCarrito det){
       LDC.add(det);
    }
    
    public void mostrarDetalle(DefaultTableModel modelo){
        LDC.mostrar(modelo);
    }
    
    public ListaDetalleCarrito getLDC() {
        return LDC;
    }

    public void setLDC(ListaDetalleCarrito LDC) {
        this.LDC = LDC;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idCarrito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        if (!Objects.equals(this.idCarrito, other.idCarrito)) {
            return false;
        }
        return true;
    }
    
}
