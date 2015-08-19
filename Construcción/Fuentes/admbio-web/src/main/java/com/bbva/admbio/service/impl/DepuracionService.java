/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.service.impl;

import com.bbva.admbio.dao.IDepuracionDAO;
import com.bbva.admbio.dao.ILoginDAO;
import com.bbva.admbio.model.DepuracionCliente;
import com.bbva.admbio.model.Login;
import com.bbva.admbio.service.IDepuracionService;
import com.bbva.admbio.service.ILoginService;
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
public class DepuracionService implements Serializable, IDepuracionService {
    
    private static final long serialVersionUID = 1L;

    @Autowired
    private IDepuracionDAO depuracionDAO;

    private static final Logger LOGGER = Logger.getLogger(DepuracionService.class);

     public List<DepuracionCliente> listarTodos() {
        List<DepuracionCliente> lista = new ArrayList<DepuracionCliente>();
        try {
            lista = depuracionDAO.buscar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
