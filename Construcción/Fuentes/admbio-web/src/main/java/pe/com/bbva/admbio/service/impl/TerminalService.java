/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service.impl;

import pe.com.bbva.admbio.dao.ITerminalDAO;
import pe.com.bbva.admbio.model.Login;
import pe.com.bbva.admbio.model.Terminal;
import pe.com.bbva.admbio.service.ITerminalService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author max
 */
@Service
@Transactional(readOnly = true)
public class TerminalService implements Serializable, ITerminalService {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(TerminalService.class);

    @Autowired
    private ITerminalDAO terminalDao;

    @Transactional(readOnly = false)
    public boolean guardar(Terminal terminal) {
        try {
            terminalDao.guardar(terminal);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.error(Constante.EXECPCION_ENCONTRADA + getClass().getName() + ": " + e.toString(), e);
            return false;
        }
    }

    public List<Terminal> listar() {
        List<Terminal> terminal = new ArrayList<Terminal>();
        try {
            terminal = terminalDao.listarTerminal();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return terminal;
    }
}
