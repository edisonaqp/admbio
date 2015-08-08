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
@Table(name = "TBI004_ESTADO_CLI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCliente.findAll", query = "SELECT e FROM EstadoCliente e"),
    @NamedQuery(name = "EstadoCliente.findByCdEstadoCli", query = "SELECT e FROM EstadoCliente e WHERE e.cdEstadoCli = :cdEstadoCli"),
    @NamedQuery(name = "EstadoCliente.findByCdTipoDoc", query = "SELECT e FROM EstadoCliente e WHERE e.cdTipoDoc = :cdTipoDoc"),
    @NamedQuery(name = "EstadoCliente.findByNuNumeroDocumento", query = "SELECT e FROM EstadoCliente e WHERE e.nuNumeroDocumento = :nuNumeroDocumento"),
    @NamedQuery(name = "EstadoCliente.findByStIndicadorPdp", query = "SELECT e FROM EstadoCliente e WHERE e.stIndicadorPdp = :stIndicadorPdp")})
public class EstadoCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_ESTADO_CLI")
    private Integer cdEstadoCli;
    @Basic(optional = false)
    @Column(name = "CD_TIPO_DOC")
    private String cdTipoDoc;
    @Basic(optional = false)
    @Column(name = "NU_NUMERO_DOCUMENTO")
    private String nuNumeroDocumento;
    @Basic(optional = false)
    @Column(name = "ST_INDICADOR_PDP")
    private BigInteger stIndicadorPdp;

    public EstadoCliente() {
    }

    public EstadoCliente(Integer cdEstadoCli) {
        this.cdEstadoCli = cdEstadoCli;
    }

    public EstadoCliente(Integer cdEstadoCli, String cdTipoDoc, String nuNumeroDocumento, BigInteger stIndicadorPdp) {
        this.cdEstadoCli = cdEstadoCli;
        this.cdTipoDoc = cdTipoDoc;
        this.nuNumeroDocumento = nuNumeroDocumento;
        this.stIndicadorPdp = stIndicadorPdp;
    }

    public Integer getCdEstadoCli() {
        return cdEstadoCli;
    }

    public void setCdEstadoCli(Integer cdEstadoCli) {
        this.cdEstadoCli = cdEstadoCli;
    }

    public String getCdTipoDoc() {
        return cdTipoDoc;
    }

    public void setCdTipoDoc(String cdTipoDoc) {
        this.cdTipoDoc = cdTipoDoc;
    }

    public String getNuNumeroDocumento() {
        return nuNumeroDocumento;
    }

    public void setNuNumeroDocumento(String nuNumeroDocumento) {
        this.nuNumeroDocumento = nuNumeroDocumento;
    }

    public BigInteger getStIndicadorPdp() {
        return stIndicadorPdp;
    }

    public void setStIndicadorPdp(BigInteger stIndicadorPdp) {
        this.stIndicadorPdp = stIndicadorPdp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdEstadoCli != null ? cdEstadoCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCliente)) {
            return false;
        }
        EstadoCliente other = (EstadoCliente) object;
        if ((this.cdEstadoCli == null && other.cdEstadoCli != null) || (this.cdEstadoCli != null && !this.cdEstadoCli.equals(other.cdEstadoCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.EstadoCliente[ cdEstadoCli=" + cdEstadoCli + " ]";
    }
    
}
