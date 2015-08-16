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

    public TerminalInactivo(Integer id, String idServidor, String idPuesto, Date fechaHoraInicio, Date fechaHoraFin, String textoComentarios, BigInteger estado, Motivo motivo) {
        this.id = id;
        this.idServidor = idServidor;
        this.idPuesto = idPuesto;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.textoComentarios = textoComentarios;
        this.estado = estado;
        this.motivo = motivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(String idServidor) {
        this.idServidor = idServidor;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getTextoComentarios() {
        return textoComentarios;
    }

    public void setTextoComentarios(String textoComentarios) {
        this.textoComentarios = textoComentarios;
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

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
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
