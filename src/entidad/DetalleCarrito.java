/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class DetalleCarrito {
    private Producto producto;
    private int cantidadComprada;

    public DetalleCarrito() {
    }

    public DetalleCarrito(Producto producto, int cantidadComprada) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
    }
    
    public DetalleCarrito(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.producto);
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
        final DetalleCarrito other = (DetalleCarrito) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
    
}
