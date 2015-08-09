/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "ServidorOficina.findByFhCreacion", query = "SELECT s FROM ServidorOficina s WHERE s.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "ServidorOficina.findByFhModificacion", query = "SELECT s FROM ServidorOficina s WHERE s.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "ServidorOficina.findByCdUsuCrea", query = "SELECT s FROM ServidorOficina s WHERE s.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "ServidorOficina.findByCdUsuModi", query = "SELECT s FROM ServidorOficina s WHERE s.cdUsuModi = :cdUsuModi"),
    @NamedQuery(name = "ServidorOficina.findByStEstado", query = "SELECT s FROM ServidorOficina s WHERE s.stEstado = :stEstado")})
public class ServidorOficina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR_OF")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CD_OFICINA")
    private String idOficina;
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR")
    private String idServidor;
    @Column(name = "FH_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacion;
    @Column(name = "FH_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraModificacion;
    @Column(name = "CD_USU_CREA")
    private String usuarioCreacion;
    @Column(name = "CD_USU_MODI")
    private String usuarioModificacion;
    @Basic(optional = false)
    @Column(name = "ST_ESTADO")
    private BigInteger estado;

    public ServidorOficina() {
    }

    public ServidorOficina(Integer cdServidorOf) {
        this.id = cdServidorOf;
    }

    public ServidorOficina(Integer cdServidorOf, String cdOficina, String cdServidor, BigInteger stEstado) {
        this.id = cdServidorOf;
        this.idOficina = cdOficina;
        this.idServidor = cdServidor;
        this.estado = stEstado;
    }

    public Integer getCdServidorOf() {
        return id;
    }

    public void setCdServidorOf(Integer cdServidorOf) {
        this.id = cdServidorOf;
    }

    public String getCdOficina() {
        return idOficina;
    }

    public void setCdOficina(String cdOficina) {
        this.idOficina = cdOficina;
    }

    public String getCdServidor() {
        return idServidor;
    }

    public void setCdServidor(String cdServidor) {
        this.idServidor = cdServidor;
    }

    public Date getFhCreacion() {
        return fechaHoraCreacion;
    }

    public void setFhCreacion(Date fhCreacion) {
        this.fechaHoraCreacion = fhCreacion;
    }

    public Date getFhModificacion() {
        return fechaHoraModificacion;
    }

    public void setFhModificacion(Date fhModificacion) {
        this.fechaHoraModificacion = fhModificacion;
    }

    public String getCdUsuCrea() {
        return usuarioCreacion;
    }

    public void setCdUsuCrea(String cdUsuCrea) {
        this.usuarioCreacion = cdUsuCrea;
    }

    public String getCdUsuModi() {
        return usuarioModificacion;
    }

    public void setCdUsuModi(String cdUsuModi) {
        this.usuarioModificacion = cdUsuModi;
    }

    public BigInteger getStEstado() {
        return estado;
    }

    public void setStEstado(BigInteger stEstado) {
        this.estado = stEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServidorOficina)) {
            return false;
        }
        ServidorOficina other = (ServidorOficina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.ServidorOficina[ cdServidorOf=" + id + " ]";
    }
    
}
