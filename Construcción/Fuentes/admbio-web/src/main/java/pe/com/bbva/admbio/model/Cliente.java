/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.model;

import java.io.Serializable;
import java.sql.Blob;
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
@Table(name = "IBTM_CLIENTES")
@org.hibernate.annotations.NamedNativeQuery(name = "findTotalClientesEliminar",
        query = "call SPS_CANTIDAD_DEPURAR_CLIENTE(?)",
        callable = true, resultClass = Cliente.class)
public class Cliente implements Serializable {

//    private static final String SQ_DEPURACION_CLI = "SQ_DEPURACION_CLI";
    private static final long serialVersionUID = 1L;
    @Id
//   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SQ_DEPURACION_CLI)
//   @SequenceGenerator(sequenceName = SQ_DEPURACION_CLI, name = SQ_DEPURACION_CLI, allocationSize = 0)
    @Column(name = "CO_TIPO_DOC_IDE")
    private String tipoDocumento;
    @Column(name = "NU_DOC_CLIENTE")
    private String numeroDocumento;
    @Column(name = "ID_DEDO_DER")
    private int dedoDerecho;
    @Column(name = "ID_DEDO_IZQ")
    private int dedoIzquierdo;
    @Column(name = "AP_PAT_CLIENTE")
    private String apellidoPaterno;
    @Column(name = "AP_MAT_CLIENTE")
    private String apellidoMaterno;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "BL_TEMPLATE_DER")
    private Blob templateDerecho;
    @Column(name = "BL_TEMPLATE_IZQ")
    private Blob templateIzquierdo;
    @Column(name = "BL_WSQ_DER")
    private Blob wsqDerecho;
    @Column(name = "BL_WSQ_IZQ")
    private Blob wsqIzquierdo;
    @Column(name = "IN_CALIDAD_DER")
    private int calidadDerecho;
    @Column(name = "IN_CALIDAD_IZQ")
    private int calidadIzquierdo;
    @Column(name = "FE_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "CO_USU_CREA")
    private String usuarioCreado;
    @Column(name = "FE_ACTUALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "CO_USU_ACT")
    private String usuarioActualizado;
    @Column(name = "NU_CLIENTE")
    private String numeroCliente;
    @Column(name = "ES_CLIENTE")
    private String esCliente;

    public Cliente() {
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

    public int getDedoDerecho() {
        return dedoDerecho;
    }

    public void setDedoDerecho(int dedoDerecho) {
        this.dedoDerecho = dedoDerecho;
    }

    public int getDedoIzquierdo() {
        return dedoIzquierdo;
    }

    public void setDedoIzquierdo(int dedoIzquierdo) {
        this.dedoIzquierdo = dedoIzquierdo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public Blob getTemplateDerecho() {
        return templateDerecho;
    }

    public void setTemplateDerecho(Blob templateDerecho) {
        this.templateDerecho = templateDerecho;
    }

    public Blob getTemplateIzquierdo() {
        return templateIzquierdo;
    }

    public void setTemplateIzquierdo(Blob templateIzquierdo) {
        this.templateIzquierdo = templateIzquierdo;
    }

    public Blob getWsqDerecho() {
        return wsqDerecho;
    }

    public void setWsqDerecho(Blob wsqDerecho) {
        this.wsqDerecho = wsqDerecho;
    }

    public Blob getWsqIzquierdo() {
        return wsqIzquierdo;
    }

    public void setWsqIzquierdo(Blob wsqIzquierdo) {
        this.wsqIzquierdo = wsqIzquierdo;
    }

    public int getCalidadDerecho() {
        return calidadDerecho;
    }

    public void setCalidadDerecho(int calidadDerecho) {
        this.calidadDerecho = calidadDerecho;
    }

    public int getCalidadIzquierdo() {
        return calidadIzquierdo;
    }

    public void setCalidadIzquierdo(int calidadIzquierdo) {
        this.calidadIzquierdo = calidadIzquierdo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreado() {
        return usuarioCreado;
    }

    public void setUsuarioCreado(String usuarioCreado) {
        this.usuarioCreado = usuarioCreado;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioActualizado() {
        return usuarioActualizado;
    }

    public void setUsuarioActualizado(String usuarioActualizado) {
        this.usuarioActualizado = usuarioActualizado;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getEsCliente() {
        return esCliente;
    }

    public void setEsCliente(String esCliente) {
        this.esCliente = esCliente;
    }

}
