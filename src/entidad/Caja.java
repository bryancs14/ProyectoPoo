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
public class Caja {
    private String idCaja;
    private int numeroDeCaja;
    private Supermercado supermercado;

    public Caja() {
    }

    public Caja(String idCaja, int numeroDeCaja, Supermercado supermercado) {
        this.idCaja = idCaja;
        this.numeroDeCaja = numeroDeCaja;
        this.supermercado = supermercado;
    }

    public Caja(String idCaja) {
        this.idCaja = idCaja;
    }

    public String getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(String idCaja) {
        this.idCaja = idCaja;
    }

    public int getNumeroDeCaja() {
        return numeroDeCaja;
    }

    public void setNumeroDeCaja(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
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
        hash = 67 * hash + Objects.hashCode(this.idCaja);
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
        final Caja other = (Caja) obj;
        if (!Objects.equals(this.idCaja, other.idCaja)) {
            return false;
        }
        return true;
    }
    
    
}
