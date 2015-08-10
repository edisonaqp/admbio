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
@Table(name = "TBI006_DEPURACION_CLI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepuracionCliente.findAll", query = "SELECT d FROM DepuracionCliente d"),
    @NamedQuery(name = "DepuracionCliente.findByCdDepuracionCliente", query = "SELECT d FROM DepuracionCliente d WHERE d.cdDepuracionCliente = :cdDepuracionCliente"),
    @NamedQuery(name = "DepuracionCliente.findByFhEjecucion", query = "SELECT d FROM DepuracionCliente d WHERE d.fhEjecucion = :fhEjecucion"),
    @NamedQuery(name = "DepuracionCliente.findByCtIncial", query = "SELECT d FROM DepuracionCliente d WHERE d.ctIncial = :ctIncial"),
    @NamedQuery(name = "DepuracionCliente.findByCtFinal", query = "SELECT d FROM DepuracionCliente d WHERE d.ctFinal = :ctFinal"),
    @NamedQuery(name = "DepuracionCliente.findByCtDepurados", query = "SELECT d FROM DepuracionCliente d WHERE d.ctDepurados = :ctDepurados"),
    @NamedQuery(name = "DepuracionCliente.findByFhCreacion", query = "SELECT d FROM DepuracionCliente d WHERE d.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "DepuracionCliente.findByFhModificacion", query = "SELECT d FROM DepuracionCliente d WHERE d.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "DepuracionCliente.findByCdUsuCrea", query = "SELECT d FROM DepuracionCliente d WHERE d.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "DepuracionCliente.findByCdUsuModi", query = "SELECT d FROM DepuracionCliente d WHERE d.cdUsuModi = :cdUsuModi"),
    @NamedQuery(name = "DepuracionCliente.findByStEstado", query = "SELECT d FROM DepuracionCliente d WHERE d.stEstado = :stEstado")})
public class DepuracionCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_DEPURACION_CLIENTE")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FH_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraEjecucion;
    @Basic(optional = false)
    @Column(name = "CT_INCIAL")
    private BigInteger cantidadIncial;
    @Basic(optional = false)
    @Column(name = "CT_FINAL")
    private BigInteger cantidadFinal;
    @Basic(optional = false)
    @Column(name = "CT_DEPURADOS")
    private BigInteger cantidadDepurados;
    @Column(name = "FH_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacion;
    @Column(name = "FH_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraModificacion;
    @Column(name = "CD_USU_CREA")
    private String usuarioCreador;
    @Column(name = "CD_USU_MODI")
    private String usuarioModificador;
    @Basic(optional = false)
    @Column(name = "ST_ESTADO")
    private BigInteger estado;

    public DepuracionCliente() {
    }

    public DepuracionCliente(Integer id, Date fechaHoraEjecucion, BigInteger cantidadIncial, BigInteger cantidadFinal, BigInteger cantidadDepurados, Date fechaHoraCreacion, Date fechaHoraModificacion, String usuarioCreador, String usuarioModificador, BigInteger estado) {
        this.id = id;
        this.fechaHoraEjecucion = fechaHoraEjecucion;
        this.cantidadIncial = cantidadIncial;
        this.cantidadFinal = cantidadFinal;
        this.cantidadDepurados = cantidadDepurados;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraModificacion = fechaHoraModificacion;
        this.usuarioCreador = usuarioCreador;
        this.usuarioModificador = usuarioModificador;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaHoraEjecucion() {
        return fechaHoraEjecucion;
    }

    public void setFechaHoraEjecucion(Date fechaHoraEjecucion) {
        this.fechaHoraEjecucion = fechaHoraEjecucion;
    }

    public BigInteger getCantidadIncial() {
        return cantidadIncial;
    }

    public void setCantidadIncial(BigInteger cantidadIncial) {
        this.cantidadIncial = cantidadIncial;
    }

    public BigInteger getCantidadFinal() {
        return cantidadFinal;
    }

    public void setCantidadFinal(BigInteger cantidadFinal) {
        this.cantidadFinal = cantidadFinal;
    }

    public BigInteger getCantidadDepurados() {
        return cantidadDepurados;
    }

    public void setCantidadDepurados(BigInteger cantidadDepurados) {
        this.cantidadDepurados = cantidadDepurados;
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

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public String getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(String usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
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
        if (!(object instanceof DepuracionCliente)) {
            return false;
        }
        DepuracionCliente other = (DepuracionCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.DepuracionCliente[ cdDepuracionCliente=" + id + " ]";
    }
    
}
