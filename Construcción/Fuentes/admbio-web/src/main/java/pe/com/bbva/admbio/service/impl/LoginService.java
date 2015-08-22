/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service.impl;

import pe.com.bbva.admbio.dao.ILoginDAO;
import pe.com.bbva.admbio.model.Login;
import pe.com.bbva.admbio.service.ILoginService;
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
public class LoginService implements Serializable, ILoginService {

    private static final long serialVersionUID = 1L;

    @Autowired
    private ILoginDAO loginDAO;

    private static final Logger LOGGER = Logger.getLogger(LoginService.class);

    @Transactional(readOnly = false)
    public boolean guardar(Login login) {
        try {
            loginDAO.guardar(login);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
//            LOGGER.error(Constante.EXECPCION_ENCONTRADA + getClass().getName() + ": " + e.toString(), e);
            return false;
        }
    }

    public List<Login> listarTodos() {
        List<Login> lista = new ArrayList<Login>();
        try {
            lista = loginDAO.buscar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
