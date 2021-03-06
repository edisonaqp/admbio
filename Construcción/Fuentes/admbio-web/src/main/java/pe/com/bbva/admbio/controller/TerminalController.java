/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.controller;

import pe.com.bbva.admbio.model.Login;
import pe.com.bbva.admbio.model.Motivo;
import pe.com.bbva.admbio.model.Terminal;
import pe.com.bbva.admbio.service.ILoginService;
import pe.com.bbva.admbio.service.IMotivoService;
import pe.com.bbva.admbio.service.ITerminalService;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author max
 */
@Component("terminalMB")
@Scope("request")
public class TerminalController implements Serializable {

    private static final Logger log = Logger.getLogger(TerminalController.class);
    private static final long serialVersionUID = 1L;

    @Autowired
    private ITerminalService terminalService;

    @Autowired
    private ILoginService loginService;

    @Autowired
    private IMotivoService motivoService;

    private List<Terminal> terminales;
    private List<Terminal> terminalesHistoricos;
    private List<Terminal> selectedTerminal;
    private List<Login> usuariosAutenticados;
    private List<Login> selectedLogin;
    private Date fechaDesde;
    private Date fechaHasta;
    private Date fechaActual;
    private Date fechaDeshabilitacion;
    private Motivo motivo;
    private List<Motivo> motivos;
    private String comentario;

    @PostConstruct
    public void init() {
        try {
            log.info("ConsultarTerminalController - init");
            fechaActual = new Date();
            terminales = terminalService.listar();
            motivos = motivoService.listarTodos();
            usuariosAutenticados = loginService.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.info(Constante.EXECPCION_ENCONTRADA + e.toString(), e);
        }
    }

    public void agregar() {
        if (selectedLogin != null) {
            for (Login login : selectedLogin) {
                Terminal terminal = new Terminal();
                terminal.setCentroCosto(login.getCentroCosto());
                terminal.setEstado(BigInteger.ZERO);
                terminal.setFechaHoraCreacion(new Date());
                terminal.setFechaHoraFin(fechaDeshabilitacion);
                terminal.setFechaHoraInicio(new Date());
                terminal.setFechaHoraModificacion(new Date());
                terminal.setMotivo(motivo);
                terminal.setPuesto(login.getNumeroPuesto());
                terminal.setServidor(login.getNombreServidor());
                terminal.setTerminal(login.getTerminal());
                terminal.setTextoComentarios(comentario);
                terminal.setUsuarioCreacion("max");
                terminal.setUsuarioModificacion("max");
                terminalService.guardar(terminal);
                login.setEstado(BigInteger.ZERO);
                loginService.actualizar(login);
            }
        }
        terminales = terminalService.listar();
        close();
    }

    public void eliminar() {
        if (selectedTerminal != null) {
            for (Terminal terminal : selectedTerminal) {
                terminal.setEstado(BigInteger.ONE);
                terminalService.actualizar(terminal);
                loginService.actualizarEstado(terminal.getTerminal());
            }
        }
        terminales = terminalService.listar();
    }

    public void listarTerminalBio() {
        usuariosAutenticados = loginService.listarActivos();
    }

    public void listarHistorial() {
        terminalesHistoricos=terminalService.listarHistorial(fechaDesde, fechaHasta);
    }

    public void close() {
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("dlgModificar.hide()");
        request.update("form");
        request.reset("form:pnlModificar");
    }

    public List<Terminal> getTerminales() {
        return terminales;
    }

    public List<Terminal> getTerminalesHistoricos() {
        return terminalesHistoricos;
    }

    public List<Login> getSelectedLogin() {
        return selectedLogin;
    }

    public List<Terminal> getSelectedTerminal() {
        return selectedTerminal;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public List<Motivo> getMotivos() {
        return motivos;
    }

    public List<Login> getUsuariosAutenticados() {
        return usuariosAutenticados;
    }

    public Date getFechaDeshabilitacion() {
        return fechaDeshabilitacion;
    }

    public void setFechaDeshabilitacion(Date fechaDeshabilitacion) {
        this.fechaDeshabilitacion = fechaDeshabilitacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setSelectedTerminal(List<Terminal> selectedTerminal) {
        this.selectedTerminal = selectedTerminal;
    }

    public void setSelectedLogin(List<Login> selectedLogin) {
        this.selectedLogin = selectedLogin;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

}
