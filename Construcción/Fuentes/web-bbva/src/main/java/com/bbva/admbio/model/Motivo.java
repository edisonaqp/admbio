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
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NB_MNEMO")
    private String mnemo;
    @Basic(optional = false)
    @Column(name = "NB_DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "cdMotivo")
    private List<TerminalInactivo> terminalInactivoList;

    public Motivo() {
    }

    public Motivo(Integer id) {
        this.id = id;
    }

    public Motivo(Integer id, String mnemo, String descripcion) {
        this.id = id;
        this.mnemo = mnemo;
        this.descripcion = descripcion;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the mnemo
     */
    public String getMnemo() {
        return mnemo;
    }

    /**
     * @param mnemo the mnemo to set
     */
    public void setMnemo(String mnemo) {
        this.mnemo = mnemo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "com.bbva.admbio.model.Motivo[ id=" + id + " ]";
    }
}
