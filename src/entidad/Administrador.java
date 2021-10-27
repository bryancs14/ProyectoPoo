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
public class Administrador {
    private String idAdministrador;
    private String nombre;
    private String contraseña;
    private Supermercado supermercado;

    public Administrador() {
    }

    public Administrador(String idAdministrador, String nombre, String contraseña, Supermercado supermercado) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.supermercado = supermercado;
    }

    public Administrador(String idAdministrador, String nombre, String contraseña) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Administrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idAdministrador);
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.idAdministrador, other.idAdministrador)) {
            return false;
        }
        return true;
    }
    
    
}
