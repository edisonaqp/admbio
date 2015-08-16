/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.service.impl;

import com.bbva.admbio.dao.IServidorDAO;
import com.bbva.admbio.dao.ITerminalDAO;
import com.bbva.admbio.model.ServidorOficina;
import com.bbva.admbio.model.Terminal;
import com.bbva.admbio.service.IServidorService;
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
public class ServidorService implements Serializable, IServidorService {

    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(ServidorService.class);

    @Autowired
    private IServidorDAO servidorDao;

    public List<ServidorOficina> listar() {
        List<ServidorOficina> servidor = new ArrayList<ServidorOficina>();
        try {
            servidor = servidorDao.listarServidor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return servidor;
    }

    public List<ServidorOficina> listarTodos() {
        List<ServidorOficina> servidor = new ArrayList<ServidorOficina>();
        ServidorOficina so = new ServidorOficina();
        try {
            so = servidorDao.buscarPorId(1);
            servidor = servidorDao.buscar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return servidor;
    }
}
