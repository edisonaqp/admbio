/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.controller;

import pe.com.bbva.admbio.model.ServidorOficina;
import pe.com.bbva.admbio.service.IServidorService;
import java.io.Serializable;
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
@Component("servidorMB")
@Scope("session")
public class ServidorController implements Serializable {

    private static final Logger logger = Logger.getLogger(ServidorController.class);
    private static final long serialVersionUID = 1L;

    @Autowired
    private IServidorService servidorService;

    private List<ServidorOficina> servidores;
    private List<ServidorOficina> selectedServidor;
    private String filtroOficina;

    @PostConstruct
    public void init() {
        try {
            logger.info("ConsultarTerminalController -------> init");
            servidores = servidorService.listar();
        } catch (Exception e) {
            logger.error(e);
        }
    }
    
    public void buscarServidorOficina() {
        logger.info("buscarServidorOficina(cc=" + this.filtroOficina + ")");
        this.servidores = servidorService.buscarPorCentroCosto(this.filtroOficina);
    }

    public void listar() {
        servidores = servidorService.listar();
    }

    public List<ServidorOficina> getServidores() {
        return servidores;
    }

    public void setServidores(List<ServidorOficina> servidores) {
        this.servidores = servidores;
    }

    /**
     * @return the selectedServidor
     */
    public List<ServidorOficina> getSelectedServidor() {
        return selectedServidor;
    }

    /**
     * @param selectedServidor the selectedServidor to set
     */
    public void setSelectedServidor(List<ServidorOficina> selectedServidor) {
        this.selectedServidor = selectedServidor;
    }

    /**
     * @return the filtroOficina
     */
    public String getFiltroOficina() {
        return filtroOficina;
    }

    /**
     * @param filtroOficina the filtroOficina to set
     */
    public void setFiltroOficina(String filtroOficina) {
        this.filtroOficina = filtroOficina;
    }
    
    
}
