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
@Table(name = "TBI004_ESTADO_CLI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCliente.findAll", query = "SELECT e FROM EstadoCliente e"),
    @NamedQuery(name = "EstadoCliente.findByCdEstadoCli", query = "SELECT e FROM EstadoCliente e WHERE e.cdEstadoCli = :cdEstadoCli"),
    @NamedQuery(name = "EstadoCliente.findByCdTipoDoc", query = "SELECT e FROM EstadoCliente e WHERE e.cdTipoDoc = :cdTipoDoc"),
    @NamedQuery(name = "EstadoCliente.findByNuNumeroDocumento", query = "SELECT e FROM EstadoCliente e WHERE e.nuNumeroDocumento = :nuNumeroDocumento"),
    @NamedQuery(name = "EstadoCliente.findByStIndicadorPdp", query = "SELECT e FROM EstadoCliente e WHERE e.stIndicadorPdp = :stIndicadorPdp"),
    @NamedQuery(name = "EstadoCliente.findByFhCreacion", query = "SELECT e FROM EstadoCliente e WHERE e.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "EstadoCliente.findByFhModificacion", query = "SELECT e FROM EstadoCliente e WHERE e.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "EstadoCliente.findByCdUsuCrea", query = "SELECT e FROM EstadoCliente e WHERE e.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "EstadoCliente.findByCdUsuModi", query = "SELECT e FROM EstadoCliente e WHERE e.cdUsuModi = :cdUsuModi")})
public class EstadoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_ESTADO_CLI")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CD_TIPO_DOC")
    private String idTipoDocumento;
    @Basic(optional = false)
    @Column(name = "NU_NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Basic(optional = false)
    @Column(name = "ST_INDICADOR_PDP")
    private BigInteger estadoIndicadorPdp;
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

    public EstadoCliente() {
    }

    public EstadoCliente(Integer id, String idTipoDocumento, String numeroDocumento, BigInteger estadoIndicadorPdp) {
        this.id = id;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.estadoIndicadorPdp = estadoIndicadorPdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public BigInteger getEstadoIndicadorPdp() {
        return estadoIndicadorPdp;
    }

    public void setEstadoIndicadorPdp(BigInteger estadoIndicadorPdp) {
        this.estadoIndicadorPdp = estadoIndicadorPdp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCliente)) {
            return false;
        }
        EstadoCliente other = (EstadoCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.EstadoCliente[ cdEstadoCli=" + id + " ]";
    }

}
