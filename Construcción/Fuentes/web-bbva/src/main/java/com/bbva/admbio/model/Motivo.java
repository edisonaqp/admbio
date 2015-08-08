/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @NamedQuery(name = "Motivo.findByNbDescripcion", query = "SELECT m FROM Motivo m WHERE m.nbDescripcion = :nbDescripcion")})
public class Motivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_MOTIVO")
    private Integer cdMotivo;
    @Basic(optional = false)
    @Column(name = "NB_MNEMO")
    private String nbMnemo;
    @Basic(optional = false)
    @Column(name = "NB_DESCRIPCION")
    private String nbDescripcion;
    @OneToMany(mappedBy = "cdMotivo")
    private List<TerminalInactivo> terminalInactivoList;

    public Motivo() {
    }

    public Motivo(Integer cdMotivo) {
        this.cdMotivo = cdMotivo;
    }

    public Motivo(Integer cdMotivo, String nbMnemo, String nbDescripcion) {
        this.cdMotivo = cdMotivo;
        this.nbMnemo = nbMnemo;
        this.nbDescripcion = nbDescripcion;
    }

    public Integer getCdMotivo() {
        return cdMotivo;
    }

    public void setCdMotivo(Integer cdMotivo) {
        this.cdMotivo = cdMotivo;
    }

    public String getNbMnemo() {
        return nbMnemo;
    }

    public void setNbMnemo(String nbMnemo) {
        this.nbMnemo = nbMnemo;
    }

    public String getNbDescripcion() {
        return nbDescripcion;
    }

    public void setNbDescripcion(String nbDescripcion) {
        this.nbDescripcion = nbDescripcion;
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
        hash += (cdMotivo != null ? cdMotivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motivo)) {
            return false;
        }
        Motivo other = (Motivo) object;
        if ((this.cdMotivo == null && other.cdMotivo != null) || (this.cdMotivo != null && !this.cdMotivo.equals(other.cdMotivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.Motivo[ cdMotivo=" + cdMotivo + " ]";
    }
    
}
