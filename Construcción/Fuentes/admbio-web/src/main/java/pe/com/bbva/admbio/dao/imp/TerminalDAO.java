/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.ITerminalDAO;
import pe.com.bbva.admbio.model.Terminal;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.bbva.admbio.util.Constantes;

/**
 *
 * @author max
 */
@Repository
public class TerminalDAO extends DAO<Terminal> implements ITerminalDAO, Serializable {

    public List<Terminal> listarTerminal() {
        List list = null;
        try {
            list = getSession().createQuery("from " + getEntityClass().getName() + " t where t.estado =:estado")
                    .setString("estado", Constantes.ESTADO_INACTIVO).list();
            list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Terminal> listarHistorial(Date desde, Date hasta) {
        List list = null;
        try {
            list = getSession().createQuery("from " + getEntityClass().getName()
                    + " t where t.fechaHoraInicio BETWEEN :desde AND :hasta")
                    .setDate("desde", desde).setDate("hasta", hasta).list();
            list.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
