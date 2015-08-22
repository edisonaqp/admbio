/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.IServidorDAO;
import pe.com.bbva.admbio.model.ServidorOficina;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author max
 */
@Repository
public class ServidorDAO extends DAO<ServidorOficina> implements IServidorDAO, Serializable {

    public List<ServidorOficina> listarServidor() {
        String hql = "from " + getEntityClass().getName();
        List list = null;
        try {
            list = getSession().createQuery("from pe.com.bbva.admbio.model.ServidorOficina ").list();
            list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
