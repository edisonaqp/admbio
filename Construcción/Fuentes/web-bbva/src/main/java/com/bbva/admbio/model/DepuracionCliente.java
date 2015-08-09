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
    @NamedQuery(name = "DepuracionCliente.findByCtDepurados", query = "SELECT d FROM DepuracionCliente d WHERE d.ctDepurados = :ctDepurados")})
public class DepuracionCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_DEPURACION_CLIENTE")
    private Integer cdDepuracionCliente;
    @Basic(optional = false)
    @Column(name = "FH_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhEjecucion;
    @Basic(optional = false)
    @Column(name = "CT_INCIAL")
    private BigInteger ctIncial;
    @Basic(optional = false)
    @Column(name = "CT_FINAL")
    private BigInteger ctFinal;
    @Basic(optional = false)
    @Column(name = "CT_DEPURADOS")
    private BigInteger ctDepurados;

    public DepuracionCliente() {
    }

    public DepuracionCliente(Integer cdDepuracionCliente) {
        this.cdDepuracionCliente = cdDepuracionCliente;
    }

    public DepuracionCliente(Integer cdDepuracionCliente, Date fhEjecucion, BigInteger ctIncial, BigInteger ctFinal, BigInteger ctDepurados) {
        this.cdDepuracionCliente = cdDepuracionCliente;
        this.fhEjecucion = fhEjecucion;
        this.ctIncial = ctIncial;
        this.ctFinal = ctFinal;
        this.ctDepurados = ctDepurados;
    }

    public Integer getCdDepuracionCliente() {
        return cdDepuracionCliente;
    }

    public void setCdDepuracionCliente(Integer cdDepuracionCliente) {
        this.cdDepuracionCliente = cdDepuracionCliente;
    }

    public Date getFhEjecucion() {
        return fhEjecucion;
    }

    public void setFhEjecucion(Date fhEjecucion) {
        this.fhEjecucion = fhEjecucion;
    }

    public BigInteger getCtIncial() {
        return ctIncial;
    }

    public void setCtIncial(BigInteger ctIncial) {
        this.ctIncial = ctIncial;
    }

    public BigInteger getCtFinal() {
        return ctFinal;
    }

    public void setCtFinal(BigInteger ctFinal) {
        this.ctFinal = ctFinal;
    }

    public BigInteger getCtDepurados() {
        return ctDepurados;
    }

    public void setCtDepurados(BigInteger ctDepurados) {
        this.ctDepurados = ctDepurados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdDepuracionCliente != null ? cdDepuracionCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepuracionCliente)) {
            return false;
        }
        DepuracionCliente other = (DepuracionCliente) object;
        if ((this.cdDepuracionCliente == null && other.cdDepuracionCliente != null) || (this.cdDepuracionCliente != null && !this.cdDepuracionCliente.equals(other.cdDepuracionCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.DepuracionCliente[ cdDepuracionCliente=" + cdDepuracionCliente + " ]";
    }
    
}
