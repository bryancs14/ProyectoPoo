/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author Aorus
 */
public class Supervisor {
    private String idSupervisor;
    private String nombre;
    private String contraseña;

    public Supervisor() {
    }

    public Supervisor(String idSupervisor, String nombre, String contraseña) {
        this.idSupervisor = idSupervisor;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Supervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Supervisor(String idSupervisor, String contraseña) {
        this.idSupervisor = idSupervisor;
        this.contraseña = contraseña;
    }

    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idSupervisor);
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
        final Supervisor other = (Supervisor) obj;
        if (!Objects.equals(this.idSupervisor, other.idSupervisor)) {
            return false;
        }
        return true;
    }

}
