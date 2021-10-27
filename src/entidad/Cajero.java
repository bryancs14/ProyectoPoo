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
public class Cajero {
    private String idCajero;
    private String nombre;
    private String turno;
    private String contraseña;
    private Caja caja;

    public Cajero() {
    }

    public Cajero(String idCajero, String nombre, String turno, String contraseña, Caja caja) {
        this.idCajero = idCajero;
        this.nombre = nombre;
        this.turno = turno;
        this.contraseña = contraseña;
        this.caja = caja;
    }

    public Cajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public String getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.idCajero);
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
        final Cajero other = (Cajero) obj;
        if (!Objects.equals(this.idCajero, other.idCajero)) {
            return false;
        }
        return true;
    }
    
    
}
