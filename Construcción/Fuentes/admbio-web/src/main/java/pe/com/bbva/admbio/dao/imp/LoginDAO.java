/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.ILoginDAO;
import pe.com.bbva.admbio.model.Login;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.bbva.admbio.util.Constantes;

/**
 *
 * @author max
 */
@Repository
public class LoginDAO extends DAO<Login> implements ILoginDAO, Serializable {

    public List<Login> listarActivos() {
        List list = null;
//        String hql = "from " + getEntityClass().getName();
        try {
            list = getSession().createQuery("from " + getEntityClass().getName() + " t where t.estado =:estado")
                    .setString("estado", Constantes.ESTADO_ACTIVO).list();
            list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void actualizarEstado(String terminal) {
        try {
            getSession().createQuery("update " + getEntityClass().getName()
                    + " t set t.estado =:estado where t.terminal =:terminal")
                    .setString("estado", Constantes.ESTADO_ACTIVO)
                    .setString("terminal", terminal).executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
