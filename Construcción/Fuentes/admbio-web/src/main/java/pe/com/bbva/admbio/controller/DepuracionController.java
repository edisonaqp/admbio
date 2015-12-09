/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.controller;

import pe.com.bbva.admbio.model.DepuracionCliente;
import pe.com.bbva.admbio.service.IDepuracionService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.com.bbva.admbio.service.IClienteService;

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
    @Autowired
    private IClienteService clienteService;
    private List<DepuracionCliente> lcliente;
    private Date fechaInicio;
    private Date fechaFin;
    private int totalClientes;
    private int totalClientesEliminar;
    private int clientesIniciales;
    private int clientesFinales;
    private int clientesDepurados;
    private int clientesError;

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

    public void notificar() {
        List<Integer> list = depuracionService.totalClientesEliminar();
        if (list.size() > 0) {
            totalClientesEliminar = list.get(0);
            totalClientes = list.get(1);
            System.out.println("TotalClientes " + totalClientes);
            System.out.println("totalClientesEliminar " + totalClientesEliminar);
        }
    }

    public void depurar() {
        List<Integer> list = depuracionService.depurarClientes();
        if (list.size() > 0) {
            clientesIniciales = list.get(0);
            clientesFinales = list.get(1);
            clientesDepurados = list.get(2);
            System.out.println("INICIAL " + list.get(0));
            System.out.println("FINAL " + list.get(1));
            System.out.println("DEPURADOS " + list.get(2));
        }
        close();
    }

    public void close() {
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("dlgNotificar.hide()");
        request.update("form");
        request.reset("form:pnlNotificar");
    }

    public void closeResult() {
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("dlgResult.hide()");
        request.update("form");
        request.reset("form:pnlResult");
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

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public int getTotalClientesEliminar() {
        return totalClientesEliminar;
    }

    public void setTotalClientesEliminar(int totalClientesEliminar) {
        this.totalClientesEliminar = totalClientesEliminar;
    }

    public int getClientesIniciales() {
        return clientesIniciales;
    }

    public void setClientesIniciales(int clientesIniciales) {
        this.clientesIniciales = clientesIniciales;
    }

    public int getClientesFinales() {
        return clientesFinales;
    }

    public void setClientesFinales(int clientesFinales) {
        this.clientesFinales = clientesFinales;
    }

    public int getClientesDepurados() {
        return clientesDepurados;
    }

    public void setClientesDepurados(int clientesDepurados) {
        this.clientesDepurados = clientesDepurados;
    }

    public int getClientesError() {
        return clientesError;
    }

    public void setClientesError(int clientesError) {
        this.clientesError = clientesError;
    }
}
