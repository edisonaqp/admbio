/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author max
 */
@Entity
@Table(name = "TBI003_MOTIVO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motivo.findAll", query = "SELECT m FROM Motivo m"),
    @NamedQuery(name = "Motivo.findByCdMotivo", query = "SELECT m FROM Motivo m WHERE m.cdMotivo = :cdMotivo"),
    @NamedQuery(name = "Motivo.findByNbMnemo", query = "SELECT m FROM Motivo m WHERE m.nbMnemo = :nbMnemo"),
    @NamedQuery(name = "Motivo.findByNbDescripcion", query = "SELECT m FROM Motivo m WHERE m.nbDescripcion = :nbDescripcion"),
    @NamedQuery(name = "Motivo.findByFhCreacion", query = "SELECT m FROM Motivo m WHERE m.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "Motivo.findByFhModificacion", query = "SELECT m FROM Motivo m WHERE m.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "Motivo.findByCdUsuCrea", query = "SELECT m FROM Motivo m WHERE m.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "Motivo.findByCdUsuModi", query = "SELECT m FROM Motivo m WHERE m.cdUsuModi = :cdUsuModi"),
    @NamedQuery(name = "Motivo.findByStEstado", query = "SELECT m FROM Motivo m WHERE m.stEstado = :stEstado")})
public class Motivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_MOTIVO")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NB_MNEMO")
    private String mnemonico;
    @Basic(optional = false)
    @Column(name = "NB_DESCRIPCION")
    private String nombreDescripcion;
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
    @OneToMany(mappedBy = "cdMotivo")
    private List<TerminalInactivo> terminalInactivoList;

    public Motivo() {
    }

    public Motivo(Integer id, String mnemonico, String nombreDescripcion, BigInteger estado, List<TerminalInactivo> terminalInactivoList) {
        this.id = id;
        this.mnemonico = mnemonico;
        this.nombreDescripcion = nombreDescripcion;
        this.estado = estado;
        this.terminalInactivoList = terminalInactivoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMnemonico() {
        return mnemonico;
    }

    public void setMnemonico(String mnemonico) {
        this.mnemonico = mnemonico;
    }

    public String getNombreDescripcion() {
        return nombreDescripcion;
    }

    public void setNombreDescripcion(String nombreDescripcion) {
        this.nombreDescripcion = nombreDescripcion;
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

    
    
    @XmlTransient
    public List<TerminalInactivo> getTerminalInactivoList() {
        return terminalInactivoList;
    }

    public void setTerminalInactivoList(List<TerminalInactivo> terminalInactivoList) {
        this.terminalInactivoList = terminalInactivoList;
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
        if (!(object instanceof Motivo)) {
            return false;
        }
        Motivo other = (Motivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.Motivo[ cdMotivo=" + id + " ]";
    }
    
}
