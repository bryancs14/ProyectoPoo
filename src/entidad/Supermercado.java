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
public class Supermercado {
    private String idSupermercado;
    private String nombre;
    private String direccion;

    public Supermercado() {
    }

    public Supermercado(String idSupermercado, String nombre, String direccion) {
        this.idSupermercado = idSupermercado;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Supermercado(String idSupermercado) {
        this.idSupermercado = idSupermercado;
    }

    public String getIdSupermercado() {
        return idSupermercado;
    }

    public void setIdSupermercado(String idSupermercado) {
        this.idSupermercado = idSupermercado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idSupermercado);
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
        final Supermercado other = (Supermercado) obj;
        if (!Objects.equals(this.idSupermercado, other.idSupermercado)) {
            return false;
        }
        return true;
    }
    
    
}
