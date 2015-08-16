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

    public ServidorOficina(Integer id, String idOficina, String idServidor, BigInteger estado) {
        this.id = id;
        this.idOficina = idOficina;
        this.idServidor = idServidor;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(String idOficina) {
        this.idOficina = idOficina;
    }

    public String getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(String idServidor) {
        this.idServidor = idServidor;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    public void setFechaHoraModificacion(Date fechaHoraModificacion) {
        this.fechaHoraModificacion = fechaHoraModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
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
