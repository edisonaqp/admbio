/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.bbva.admbio.dao.IClienteDAO;
import pe.com.bbva.admbio.dao.ITerminalDAO;
import pe.com.bbva.admbio.model.Terminal;
import pe.com.bbva.admbio.service.IClienteService;

/**
 *
 * @author max
 */
@Service
@Transactional(readOnly = true)

public class ClienteService implements Serializable, IClienteService {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(ClienteService.class);

    @Autowired
    private IClienteDAO clienteDao;

    public int totalClientes() {
        int total = 0;
        try {
            total = clienteDao.totalClientes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
}
