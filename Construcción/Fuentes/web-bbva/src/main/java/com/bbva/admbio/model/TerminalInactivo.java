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
    @NamedQuery(name = "TerminalInactivo.findByFhCreacion", query = "SELECT t FROM TerminalInactivo t WHERE t.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "TerminalInactivo.findByFhModificacion", query = "SELECT t FROM TerminalInactivo t WHERE t.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "TerminalInactivo.findByCdUsuCrea", query = "SELECT t FROM TerminalInactivo t WHERE t.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "TerminalInactivo.findByCdUsuModi", query = "SELECT t FROM TerminalInactivo t WHERE t.cdUsuModi = :cdUsuModi"),
    @NamedQuery(name = "TerminalInactivo.findByStEstado", query = "SELECT t FROM TerminalInactivo t WHERE t.stEstado = :stEstado")})
public class TerminalInactivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_TERM_INACTIVO")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CD_SERVIDOR")
    private String idServidor;
    @Basic(optional = false)
    @Column(name = "CD_PUESTO")
    private String idPuesto;
    @Basic(optional = false)
    @Column(name = "FH_FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicio;
    @Basic(optional = false)
    @Column(name = "FH_FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFin;
    @Basic(optional = false)
    @Column(name = "TX_COMENTARIOS")
    private String textoComentarios;
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
    @JoinColumn(name = "CD_MOTIVO", referencedColumnName = "CD_MOTIVO")
    @ManyToOne
    private Motivo motivo;

    public TerminalInactivo() {
    }

    public TerminalInactivo(Integer cdTermInactivo) {
        this.id = cdTermInactivo;
    }

    public TerminalInactivo(Integer cdTermInactivo, String cdServidor, String cdPuesto, Date fhFechaInicio, Date fhFechaFin, String txComentarios, BigInteger stEstado) {
        this.id = cdTermInactivo;
        this.idServidor = cdServidor;
        this.idPuesto = cdPuesto;
        this.fechaHoraInicio = fhFechaInicio;
        this.fechaHoraFin = fhFechaFin;
        this.textoComentarios = txComentarios;
        this.estado = stEstado;
    }

    public Integer getCdTermInactivo() {
        return id;
    }

    public void setCdTermInactivo(Integer cdTermInactivo) {
        this.id = cdTermInactivo;
    }

    public String getCdServidor() {
        return idServidor;
    }

    public void setCdServidor(String cdServidor) {
        this.idServidor = cdServidor;
    }

    public String getCdPuesto() {
        return idPuesto;
    }

    public void setCdPuesto(String cdPuesto) {
        this.idPuesto = cdPuesto;
    }

    public Date getFhFechaInicio() {
        return fechaHoraInicio;
    }

    public void setFhFechaInicio(Date fhFechaInicio) {
        this.fechaHoraInicio = fhFechaInicio;
    }

    public Date getFhFechaFin() {
        return fechaHoraFin;
    }

    public void setFhFechaFin(Date fhFechaFin) {
        this.fechaHoraFin = fhFechaFin;
    }

    public String getTxComentarios() {
        return textoComentarios;
    }

    public void setTxComentarios(String txComentarios) {
        this.textoComentarios = txComentarios;
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

    public Motivo getCdMotivo() {
        return motivo;
    }

    public void setCdMotivo(Motivo cdMotivo) {
        this.motivo = cdMotivo;
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
        if (!(object instanceof TerminalInactivo)) {
            return false;
        }
        TerminalInactivo other = (TerminalInactivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.TerminalInactivo[ cdTermInactivo=" + id + " ]";
    }
    
}
