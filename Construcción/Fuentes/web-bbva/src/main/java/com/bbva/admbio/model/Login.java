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
@Table(name = "TBI001_LOGIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByCdLogin", query = "SELECT l FROM Login l WHERE l.cdLogin = :cdLogin"),
    @NamedQuery(name = "Login.findByCdOficina", query = "SELECT l FROM Login l WHERE l.cdOficina = :cdOficina"),
    @NamedQuery(name = "Login.findByNbServidor", query = "SELECT l FROM Login l WHERE l.nbServidor = :nbServidor"),
    @NamedQuery(name = "Login.findByNuPuesto", query = "SELECT l FROM Login l WHERE l.nuPuesto = :nuPuesto"),
    @NamedQuery(name = "Login.findByCdRegistro", query = "SELECT l FROM Login l WHERE l.cdRegistro = :cdRegistro"),
    @NamedQuery(name = "Login.findByCdPerfil", query = "SELECT l FROM Login l WHERE l.cdPerfil = :cdPerfil"),
    @NamedQuery(name = "Login.findByNbUsuario", query = "SELECT l FROM Login l WHERE l.nbUsuario = :nbUsuario"),
    @NamedQuery(name = "Login.findByFhLogin", query = "SELECT l FROM Login l WHERE l.fhLogin = :fhLogin"),
    @NamedQuery(name = "Login.findByFhCreacion", query = "SELECT l FROM Login l WHERE l.fhCreacion = :fhCreacion"),
    @NamedQuery(name = "Login.findByFhModificacion", query = "SELECT l FROM Login l WHERE l.fhModificacion = :fhModificacion"),
    @NamedQuery(name = "Login.findByCdUsuCrea", query = "SELECT l FROM Login l WHERE l.cdUsuCrea = :cdUsuCrea"),
    @NamedQuery(name = "Login.findByCdUsuModi", query = "SELECT l FROM Login l WHERE l.cdUsuModi = :cdUsuModi"),
    @NamedQuery(name = "Login.findByStEstado", query = "SELECT l FROM Login l WHERE l.stEstado = :stEstado")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_LOGIN")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CD_OFICINA")
    private String idOficina;
    @Basic(optional = false)
    @Column(name = "NB_SERVIDOR")
    private String nombreServidor;
    @Basic(optional = false)
    @Column(name = "NU_PUESTO")
    private String numeroPuesto;
    @Basic(optional = false)
    @Column(name = "CD_REGISTRO")
    private String idRegistro;
    @Basic(optional = false)
    @Column(name = "CD_PERFIL")
    private String idPerfil;
    @Basic(optional = false)
    @Column(name = "NB_USUARIO")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "FH_LOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraLogin;
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

    public Login() {
    }

    public Login(Integer cdLogin) {
        this.id = cdLogin;
    }

    public Login(Integer cdLogin, String cdOficina, String nbServidor, String nuPuesto, String cdRegistro, String cdPerfil, String nbUsuario, Date fhLogin, BigInteger stEstado) {
        this.id = cdLogin;
        this.idOficina = cdOficina;
        this.nombreServidor = nbServidor;
        this.numeroPuesto = nuPuesto;
        this.idRegistro = cdRegistro;
        this.idPerfil = cdPerfil;
        this.nombreUsuario = nbUsuario;
        this.fechaHoraLogin = fhLogin;
        this.estado = stEstado;
    }

    public Integer getCdLogin() {
        return id;
    }

    public void setCdLogin(Integer cdLogin) {
        this.id = cdLogin;
    }

    public String getCdOficina() {
        return idOficina;
    }

    public void setCdOficina(String cdOficina) {
        this.idOficina = cdOficina;
    }

    public String getNbServidor() {
        return nombreServidor;
    }

    public void setNbServidor(String nbServidor) {
        this.nombreServidor = nbServidor;
    }

    public String getNuPuesto() {
        return numeroPuesto;
    }

    public void setNuPuesto(String nuPuesto) {
        this.numeroPuesto = nuPuesto;
    }

    public String getCdRegistro() {
        return idRegistro;
    }

    public void setCdRegistro(String cdRegistro) {
        this.idRegistro = cdRegistro;
    }

    public String getCdPerfil() {
        return idPerfil;
    }

    public void setCdPerfil(String cdPerfil) {
        this.idPerfil = cdPerfil;
    }

    public String getNbUsuario() {
        return nombreUsuario;
    }

    public void setNbUsuario(String nbUsuario) {
        this.nombreUsuario = nbUsuario;
    }

    public Date getFhLogin() {
        return fechaHoraLogin;
    }

    public void setFhLogin(Date fhLogin) {
        this.fechaHoraLogin = fhLogin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.Login[ cdLogin=" + id + " ]";
    }
    
}
