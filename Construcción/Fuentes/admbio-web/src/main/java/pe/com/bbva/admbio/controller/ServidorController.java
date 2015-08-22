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

    private static final Logger log = Logger.getLogger(ServidorController.class);
    private static final long serialVersionUID = 1L;

    @Autowired
    private IServidorService servidorService;

    private List<ServidorOficina> lServidor;

    @PostConstruct
    public void init() {
        try {
            log.info("ConsultarTerminalController -------> init");
            lServidor = servidorService.listar();
        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.info(Constante.EXECPCION_ENCONTRADA + e.toString(), e);
        }
    }

    public void lista() {
        lServidor = servidorService.listarTodos();
    }

    public List<ServidorOficina> getlServidor() {
        return lServidor;
    }

    public void setlServidor(List<ServidorOficina> lServidor) {
        this.lServidor = lServidor;
    }
    
    
}
