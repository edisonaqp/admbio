/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.controller;

import pe.com.bbva.admbio.model.DepuracionCliente;
import pe.com.bbva.admbio.model.Login;
import pe.com.bbva.admbio.service.IDepuracionService;
import pe.com.bbva.admbio.service.ITerminalService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author max
 */
@Component("depuracionMB")
@Scope("session")
public class DepuracionController implements Serializable {

    private static final Logger log = Logger.getLogger(DepuracionController.class);
    private static final long serialVersionUID = 1L;

    @Autowired
    private IDepuracionService depuracionService;
    private List<DepuracionCliente> lcliente;
    private Date fechaInicio;
    private Date fechaFin;

    @PostConstruct
    public void init() {
        try {
            log.info("ConsultarTerminalController -------> init");
            lcliente = depuracionService.listarTodos();

        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.info(Constante.EXECPCION_ENCONTRADA + e.toString(), e);
        }
    }

    public void buscar() {
    }

    public List<DepuracionCliente> getLcliente() {
        return lcliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
