/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.controller;

import com.bbva.admbio.model.Login;
import com.bbva.admbio.model.Terminal;
import com.bbva.admbio.service.ILoginService;
import com.bbva.admbio.service.ITerminalService;
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
@Component("terminalMB")
@Scope("session")
public class TerminalController implements Serializable {

    private static final Logger log = Logger.getLogger(TerminalController.class);
    private static final long serialVersionUID = 1L;

    @Autowired
    private ITerminalService terminalService;
    @Autowired
    private ILoginService loginService;

    private List<Terminal> lTerminal;
    private List<Login> lLogin;

    @PostConstruct
    public void init() {
        try {
            log.info("ConsultarTerminalController -------> init");
            lTerminal = terminalService.listar();
        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.info(Constante.EXECPCION_ENCONTRADA + e.toString(), e);
        }
    }

    public void listarTerminal() {
        lTerminal = terminalService.listar();
    }

    public void listarTerminalBio() {
        lLogin = loginService.listarTodos();
    }
    public List<Terminal> getlTerminal() {
        return lTerminal;
    }

    public void setlTerminal(List<Terminal> lTerminal) {
        this.lTerminal = lTerminal;
    }

    public List<Login> getlLogin() {
        return lLogin;
    }
    public void setlLogin(List<Login> lLogin) {
        this.lLogin = lLogin;
    }
}
