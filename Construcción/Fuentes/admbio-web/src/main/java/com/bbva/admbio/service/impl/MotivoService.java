/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.service.impl;

import com.bbva.admbio.dao.IMotivoDAO;
import com.bbva.admbio.model.Motivo;
import com.bbva.admbio.service.IMotivoService;
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
public class MotivoService implements Serializable, IMotivoService {

    private static final long serialVersionUID = 1L;

    @Autowired
    private IMotivoDAO motivoDAO;

    private static final Logger LOGGER = Logger.getLogger(MotivoService.class);

    public List<Motivo> listarTodos() {
        List<Motivo> lista = new ArrayList<Motivo>();
        try {
            lista = motivoDAO.buscar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
