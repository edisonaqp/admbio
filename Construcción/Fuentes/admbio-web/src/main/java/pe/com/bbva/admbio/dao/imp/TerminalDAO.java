/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.ITerminalDAO;
import pe.com.bbva.admbio.model.Terminal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author max
 */
@Repository
public class TerminalDAO extends DAO<Terminal> implements ITerminalDAO, Serializable {

    public List<Terminal> listarTerminal() {
//        String hql = "from " + getEntityClass().getName() + " r " + "where r.codigoCentralCliente = :codigoCentral " + "order by r.idRating ";
//        List<Terminal> lista = new ArrayList<Terminal>();
        List list = null;
        String hql = "from " + getEntityClass().getName();
        try {
            list = getSession().createQuery("from pe.com.bbva.admbio.model.Terminal ").list();
//            lista = getSession().createQuery(hql).list();
            list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
