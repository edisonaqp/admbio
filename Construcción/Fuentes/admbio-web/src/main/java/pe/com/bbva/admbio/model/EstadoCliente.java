/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author max
 */
@Entity
@Table(name = "TBI004_ESTADO_CLI")
public class EstadoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CD_ESTADO_CLI")
    private Integer id;
    @Column(name = "CD_TIPO_DOC")
    private String tipoDocumento;
    @Column(name = "NU_NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "ST_INDICADOR_PDP")
    private String estadoIndicadorPdp;
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

    public EstadoCliente() {
    }

    public EstadoCliente(Integer id, String tipoDocumento, String numeroDocumento, String estadoIndicadorPdp) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.estadoIndicadorPdp = estadoIndicadorPdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEstadoIndicadorPdp() {
        return estadoIndicadorPdp;
    }

    public void setEstadoIndicadorPdp(String estadoIndicadorPdp) {
        this.estadoIndicadorPdp = estadoIndicadorPdp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCliente)) {
            return false;
        }
        EstadoCliente other = (EstadoCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bbva.admbio.model.EstadoCliente[ cdEstadoCli=" + id + " ]";
    }

}
