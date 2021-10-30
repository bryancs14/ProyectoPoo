
package entidad;

import datos.ListaDetalleCompra;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
//import java.text.SimpleDateFormat;(para la fehca y hora)

public class Compra {
    private String idCompra;
    private double importe;
    private /*Fecha y hora tipo->SimpleDateFormat*/String fechaHora;
    private Proveedor proveedor;
    private Supervisor supervisor;
    private ListaDetalleCompra LDCO;

    public Compra() {
    }

    public Compra(String idCompra, double importe, String fechaHora, Proveedor proveedor, Supervisor supervisor) {
        this.idCompra = idCompra;
        this.importe = importe;
        this.fechaHora = fechaHora;
        this.proveedor = proveedor;
        this.supervisor = supervisor;
        LDCO = new ListaDetalleCompra();
    }

    public Compra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
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

    public void setFechaHora(String fehcaHora) {
        this.fechaHora = fehcaHora;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    public void registrarDetalle(DetalleCompra det){
       LDCO.add(det);
    }
    
    public void mostrarDetalle(DefaultTableModel modelo){
        LDCO.mostrar(modelo);
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public ListaDetalleCompra getLDCO() {
        return LDCO;
    }

    public void setLDCO(ListaDetalleCompra LDCO) {
        this.LDCO = LDCO;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idCompra);
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
        final Compra other = (Compra) obj;
        if (!Objects.equals(this.idCompra, other.idCompra)) {
            return false;
        }
        return true;
    }

}
