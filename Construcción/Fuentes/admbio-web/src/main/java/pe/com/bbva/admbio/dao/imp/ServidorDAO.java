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
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 *
 * @author max
 */
@Repository
public class ServidorDAO extends DAO<ServidorOficina> implements IServidorDAO, Serializable {
    
    private static final Logger logger = Logger.getLogger(ServidorDAO.class);

//    public List<ServidorOficina> listarServidor() {
//        String hql = "from " + getEntityClass().getName();
//        List list = null;
//        try {
//            list = getSession().createQuery("from pe.com.bbva.admbio.model.ServidorOficina ").list();
//            list.size();
//        } catch (Exception e) {
//            logger.error(e);
//        }
//        return list;
//    }
    
    @Override
    public List<ServidorOficina> buscarPorOficina(String centroCosto) {
        List<ServidorOficina> servidores;
        String hql; 
        
        hql = "from " + getEntityClass().getName() + " where centroCosto = :centroCosto";
        
        servidores = getSession().createQuery(hql).setParameter("centroCosto", centroCosto).list();
        
        return servidores;
    }
}
