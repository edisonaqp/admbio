/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service.impl;

import pe.com.bbva.admbio.dao.IServidorDAO;
import pe.com.bbva.admbio.dao.ITerminalDAO;
import pe.com.bbva.admbio.model.ServidorOficina;
import pe.com.bbva.admbio.model.Terminal;
import pe.com.bbva.admbio.service.IServidorService;
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
    private static final Logger logger = Logger.getLogger(ServidorService.class);

    @Autowired
    private IServidorDAO servidorDao;

    public List<ServidorOficina> listar() {
        List<ServidorOficina> servidores = new ArrayList<ServidorOficina>();
        try {
            servidores = servidorDao.buscar();
        } catch (Exception e) {
            logger.error(e);
        }

        return servidores;
    }

    @Override
    public ServidorOficina buscarPorId(Integer id) {
        ServidorOficina servidor = new ServidorOficina();
        try {
            servidor = servidorDao.buscarPorId(id);
        } catch (Exception e) {
            logger.error(e);
        }
        return servidor;
    }
    
    public List<ServidorOficina> buscarPorCentroCosto(String centroCosto) {
        return servidorDao.buscarPorOficina(centroCosto);        
    }
}
