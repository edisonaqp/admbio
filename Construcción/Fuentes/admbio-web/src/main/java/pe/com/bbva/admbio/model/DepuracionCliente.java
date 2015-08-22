/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author max
 */
@Entity
@Table(name = "TBI006_DEPURACION_CLI")
public class DepuracionCliente implements Serializable {

    private static final String SQ_DEPURACION_CLI = "SQ_DEPURACION_CLI";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SQ_DEPURACION_CLI)
    @SequenceGenerator(sequenceName = SQ_DEPURACION_CLI, name = SQ_DEPURACION_CLI, allocationSize = 0)
    @Column(name = "CD_DEPURACION_CLIENTE")
    private Integer id;
    @Column(name = "FH_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraEjecucion;
    @Column(name = "CT_INCIAL")
    private BigInteger cantidadIncial;
    @Column(name = "CT_FINAL")
    private BigInteger cantidadFinal;
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
