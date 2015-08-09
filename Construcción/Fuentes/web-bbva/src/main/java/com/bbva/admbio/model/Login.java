/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.model;

import java.io.Serializable;
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
    @NamedQuery(name = "Login.findByFhLogin", query = "SELECT l FROM Login l WHERE l.fhLogin = :fhLogin")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_LOGIN")
    private Integer cdLogin;
    @Basic(optional = false)
    @Column(name = "CD_OFICINA")
    private String cdOficina;
    @Basic(optional = false)
    @Column(name = "NB_SERVIDOR")
    private String nbServidor;
    @Basic(optional = false)
    @Column(name = "NU_PUESTO")
    private String nuPuesto;
    @Basic(optional = false)
    @Column(name = "CD_REGISTRO")
    private String cdRegistro;
    @Basic(optional = false)
    @Column(name = "CD_PERFIL")
    private String cdPerfil;
    @Basic(optional = false)
    @Column(name = "NB_USUARIO")
    private String nbUsuario;
    @Basic(optional = false)
    @Column(name = "FH_LOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhLogin;

    public Login() {
    }

    public Login(Integer cdLogin) {
        this.cdLogin = cdLogin;
    }

    public Login(Integer cdLogin, String cdOficina, String nbServidor, String nuPuesto, String cdRegistro, String cdPerfil, String nbUsuario, Date fhLogin) {
        this.cdLogin = cdLogin;
        this.cdOficina = cdOficina;
        this.nbServidor = nbServidor;
        this.nuPuesto = nuPuesto;
        this.cdRegistro = cdRegistro;
        this.cdPerfil = cdPerfil;
        this.nbUsuario = nbUsuario;
        this.fhLogin = fhLogin;
    }

    public Integer getCdLogin() {
        return cdLogin;
    }

    public void setCdLogin(Integer cdLogin) {
        this.cdLogin = cdLogin;
    }

    public String getCdOficina() {
        return cdOficina;
    }

    public void setCdOficina(String cdOficina) {
        this.cdOficina = cdOficina;
    }

    public String getNbServidor() {
        return nbServidor;
    }

    public void setNbServidor(String nbServidor) {
        this.nbServidor = nbServidor;
    }

    public String getNuPuesto() {
        return nuPuesto;
    }

    public void setNuPuesto(String nuPuesto) {
        this.nuPuesto = nuPuesto;
    }

    public String getCdRegistro() {
        return cdRegistro;
    }

    public void setCdRegistro(String cdRegistro) {
        this.cdRegistro = cdRegistro;
    }

    public String getCdPerfil() {
        return cdPerfil;
    }

    public void setCdPerfil(String cdPerfil) {
        this.cdPerfil = cdPerfil;
    }

    public String getNbUsuario() {
        return nbUsuario;
    }

    public void setNbUsuario(String nbUsuario) {
        this.nbUsuario = nbUsuario;
    }

    public Date getFhLogin() {
        return fhLogin;
    }

    public void setFhLogin(Date fhLogin) {
        this.fhLogin = fhLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdLogin != null ? cdLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.cdLogin == null && other.cdLogin != null) || (this.cdLogin != null && !this.cdLogin.equals(other.cdLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.Login[ cdLogin=" + cdLogin + " ]";
    }
    
}
