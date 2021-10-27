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
public class Cliente {
    private String idCliente;
    private String dni;
    private String nombre;
    private String email;
    private int puntosAcumulados;

    public Cliente() {
    }

    public Cliente(String idCliente, String dni, String nombre, String email) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.puntosAcumulados = 0;
    }

    public Cliente(String idCliente, String dni, String nombre, String email, int puntosAcumulados) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.puntosAcumulados = puntosAcumulados;
    }
    
    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.idCliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }
    
    
}
