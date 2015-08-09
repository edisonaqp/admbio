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
    private String descripcion;
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
    @OneToMany(mappedBy = "motivo")
    private List<TerminalInactivo> terminalInactivoList;

    public Motivo() {
    }

    public Motivo(Integer cdMotivo) {
        this.id = cdMotivo;
    }

    public Motivo(Integer cdMotivo, String nbMnemo, String nbDescripcion, BigInteger stEstado) {
        this.id = cdMotivo;
        this.mnemonico = nbMnemo;
        this.descripcion = nbDescripcion;
        this.estado = stEstado;
    }

    public Integer getCdMotivo() {
        return id;
    }

    public void setCdMotivo(Integer cdMotivo) {
        this.id = cdMotivo;
    }

    public String getNbMnemo() {
        return mnemonico;
    }

    public void setNbMnemo(String nbMnemo) {
        this.mnemonico = nbMnemo;
    }

    public String getNbDescripcion() {
        return descripcion;
    }

    public void setNbDescripcion(String nbDescripcion) {
        this.descripcion = nbDescripcion;
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
