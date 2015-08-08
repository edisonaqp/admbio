/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author max
 */
@Entity
@Table(name = "TBI005_SERVIDOR_OF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServidorOficina.findAll", query = "SELECT s FROM ServidorOficina s"),
    @NamedQuery(name = "ServidorOficina.findByCdServidorOf", query = "SELECT s FROM ServidorOficina s WHERE s.cdServidorOf = :cdServidorOf"),
    @NamedQuery(name = "ServidorOficina.findByCdOficina", query = "SELECT s FROM ServidorOficina s WHERE s.cdOficina = :cdOficina"),
    @NamedQuery(name = "ServidorOficina.findByCdServidor", query = "SELECT s FROM ServidorOficina s WHERE s.cdServidor = :cdServidor"),
    @NamedQuery(name = "ServidorOficina.findByStEstado", query = "SELECT s FROM ServidorOficina s WHERE s.stEstado = :stEstado")})
public class ServidorOficina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR_OF")
    private Integer cdServidorOf;
    @Basic(optional = false)
    @Column(name = "CD_OFICINA")
    private String cdOficina;
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR")
    private String cdServidor;
    @Basic(optional = false)
    @Column(name = "ST_ESTADO")
    private BigInteger stEstado;

    public ServidorOficina() {
    }

    public ServidorOficina(Integer cdServidorOf) {
        this.cdServidorOf = cdServidorOf;
    }

    public ServidorOficina(Integer cdServidorOf, String cdOficina, String cdServidor, BigInteger stEstado) {
        this.cdServidorOf = cdServidorOf;
        this.cdOficina = cdOficina;
        this.cdServidor = cdServidor;
        this.stEstado = stEstado;
    }

    public Integer getCdServidorOf() {
        return cdServidorOf;
    }

    public void setCdServidorOf(Integer cdServidorOf) {
        this.cdServidorOf = cdServidorOf;
    }

    public String getCdOficina() {
        return cdOficina;
    }

    public void setCdOficina(String cdOficina) {
        this.cdOficina = cdOficina;
    }

    public String getCdServidor() {
        return cdServidor;
    }

    public void setCdServidor(String cdServidor) {
        this.cdServidor = cdServidor;
    }

    public BigInteger getStEstado() {
        return stEstado;
    }

    public void setStEstado(BigInteger stEstado) {
        this.stEstado = stEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdServidorOf != null ? cdServidorOf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServidorOficina)) {
            return false;
        }
        ServidorOficina other = (ServidorOficina) object;
        if ((this.cdServidorOf == null && other.cdServidorOf != null) || (this.cdServidorOf != null && !this.cdServidorOf.equals(other.cdServidorOf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.ServidorOficina[ cdServidorOf=" + cdServidorOf + " ]";
    }
    
}
