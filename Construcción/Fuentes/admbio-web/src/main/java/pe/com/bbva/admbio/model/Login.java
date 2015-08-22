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
@Table(name = "TBI001_LOGIN")
public class Login implements Serializable {

    private static final String SQ_LOGIN = "SQ_LOGIN";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SQ_LOGIN)
    @SequenceGenerator(sequenceName = SQ_LOGIN, name = SQ_LOGIN, allocationSize = 0)
    @Column(name = "CD_LOGIN")
    private Integer id;
    @Column(name = "CD_CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "CD_TERMINAL")
    private String terminal;
    @Column(name = "NB_SERVIDOR")
    private String nombreServidor;
    @Column(name = "NU_PUESTO")
    private String numeroPuesto;
    @Column(name = "CD_REGISTRO")
    private String registro;
    @Column(name = "CD_PERFIL")
    private String perfil;
    @Column(name = "NB_USUARIO")
    private String nombreUsuario;
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
    @Column(name = "ST_ESTADO")
    private BigInteger estado;

    public Login() {
    }

    public Login(Integer id, String centroCosto, String nombreServidor, String numeroPuesto, String registro, String perfil, String nombreUsuario, Date fechaHoraLogin, BigInteger estado) {
        this.id = id;
        this.centroCosto = centroCosto;
        this.nombreServidor = nombreServidor;
        this.numeroPuesto = numeroPuesto;
        this.registro = registro;
        this.perfil = perfil;
        this.nombreUsuario = nombreUsuario;
        this.fechaHoraLogin = fechaHoraLogin;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
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
