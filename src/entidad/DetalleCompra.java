/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Aorus
 */
public class DetalleCompra {
    private Producto producto;
    private int cantidadComprada;
    private double precioCompra;
    
    public DetalleCompra() {
    }

    public DetalleCompra(Producto producto, int cantidadComprada, double precioCompra) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.precioCompra = precioCompra;
    }

    public DetalleCompra(Producto producto) {
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

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
}
