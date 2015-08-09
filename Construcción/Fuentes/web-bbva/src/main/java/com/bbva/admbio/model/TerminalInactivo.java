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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TBI002_TERM_INACT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TerminalInactivo.findAll", query = "SELECT t FROM TerminalInactivo t"),
    @NamedQuery(name = "TerminalInactivo.findByCdTermInactivo", query = "SELECT t FROM TerminalInactivo t WHERE t.cdTermInactivo = :cdTermInactivo"),
    @NamedQuery(name = "TerminalInactivo.findByCdServidor", query = "SELECT t FROM TerminalInactivo t WHERE t.cdServidor = :cdServidor"),
    @NamedQuery(name = "TerminalInactivo.findByCdPuesto", query = "SELECT t FROM TerminalInactivo t WHERE t.cdPuesto = :cdPuesto"),
    @NamedQuery(name = "TerminalInactivo.findByFhFechaInicio", query = "SELECT t FROM TerminalInactivo t WHERE t.fhFechaInicio = :fhFechaInicio"),
    @NamedQuery(name = "TerminalInactivo.findByFhFechaFin", query = "SELECT t FROM TerminalInactivo t WHERE t.fhFechaFin = :fhFechaFin"),
    @NamedQuery(name = "TerminalInactivo.findByTxComentarios", query = "SELECT t FROM TerminalInactivo t WHERE t.txComentarios = :txComentarios"),
    @NamedQuery(name = "TerminalInactivo.findByStEstado", query = "SELECT t FROM TerminalInactivo t WHERE t.stEstado = :stEstado")})
public class TerminalInactivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_TERM_INACTIVO")
    private Integer cdTermInactivo;
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR")
    private String cdServidor;
    @Basic(optional = false)
    @Column(name = "CD_PUESTO")
    private String cdPuesto;
    @Basic(optional = false)
    @Column(name = "FH_FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhFechaInicio;
    @Basic(optional = false)
    @Column(name = "FH_FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhFechaFin;
    @Basic(optional = false)
    @Column(name = "TX_COMENTARIOS")
    private String txComentarios;
    @Basic(optional = false)
    @Column(name = "ST_ESTADO")
    private BigInteger stEstado;
    @JoinColumn(name = "CD_MOTIVO", referencedColumnName = "CD_MOTIVO")
    @ManyToOne
    private Motivo cdMotivo;

    public TerminalInactivo() {
    }

    public TerminalInactivo(Integer cdTermInactivo) {
        this.cdTermInactivo = cdTermInactivo;
    }

    public TerminalInactivo(Integer cdTermInactivo, String cdServidor, String cdPuesto, Date fhFechaInicio, Date fhFechaFin, String txComentarios, BigInteger stEstado) {
        this.cdTermInactivo = cdTermInactivo;
        this.cdServidor = cdServidor;
        this.cdPuesto = cdPuesto;
        this.fhFechaInicio = fhFechaInicio;
        this.fhFechaFin = fhFechaFin;
        this.txComentarios = txComentarios;
        this.stEstado = stEstado;
    }

    public Integer getCdTermInactivo() {
        return cdTermInactivo;
    }

    public void setCdTermInactivo(Integer cdTermInactivo) {
        this.cdTermInactivo = cdTermInactivo;
    }

    public String getCdServidor() {
        return cdServidor;
    }

    public void setCdServidor(String cdServidor) {
        this.cdServidor = cdServidor;
    }

    public String getCdPuesto() {
        return cdPuesto;
    }

    public void setCdPuesto(String cdPuesto) {
        this.cdPuesto = cdPuesto;
    }

    public Date getFhFechaInicio() {
        return fhFechaInicio;
    }

    public void setFhFechaInicio(Date fhFechaInicio) {
        this.fhFechaInicio = fhFechaInicio;
    }

    public Date getFhFechaFin() {
        return fhFechaFin;
    }

    public void setFhFechaFin(Date fhFechaFin) {
        this.fhFechaFin = fhFechaFin;
    }

    public String getTxComentarios() {
        return txComentarios;
    }

    public void setTxComentarios(String txComentarios) {
        this.txComentarios = txComentarios;
    }

    public BigInteger getStEstado() {
        return stEstado;
    }

    public void setStEstado(BigInteger stEstado) {
        this.stEstado = stEstado;
    }

    public Motivo getCdMotivo() {
        return cdMotivo;
    }

    public void setCdMotivo(Motivo cdMotivo) {
        this.cdMotivo = cdMotivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdTermInactivo != null ? cdTermInactivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerminalInactivo)) {
            return false;
        }
        TerminalInactivo other = (TerminalInactivo) object;
        if ((this.cdTermInactivo == null && other.cdTermInactivo != null) || (this.cdTermInactivo != null && !this.cdTermInactivo.equals(other.cdTermInactivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.TerminalInactivo[ cdTermInactivo=" + cdTermInactivo + " ]";
    }
    
}
