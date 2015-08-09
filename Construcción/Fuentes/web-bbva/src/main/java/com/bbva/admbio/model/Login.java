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

    public Login(Integer id, String idOficina, String nombreServidor, String numeroPuesto, String idRegistro, String idPerfil, String nombreUsuario, Date fechaHoraLogin) {
        this.id = id;
        this.idOficina = idOficina;
        this.nombreServidor = nombreServidor;
        this.numeroPuesto = numeroPuesto;
        this.idRegistro = idRegistro;
        this.idPerfil = idPerfil;
        this.nombreUsuario = nombreUsuario;
        this.fechaHoraLogin = fechaHoraLogin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(String idOficina) {
        this.idOficina = idOficina;
    }

    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public String getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(String numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaHoraLogin() {
        return fechaHoraLogin;
    }

    public void setFechaHoraLogin(Date fechaHoraLogin) {
        this.fechaHoraLogin = fechaHoraLogin;
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
