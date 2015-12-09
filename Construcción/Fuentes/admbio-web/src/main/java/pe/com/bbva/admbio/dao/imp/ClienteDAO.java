/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import java.io.Serializable;
import org.hibernate.Query;

import org.springframework.stereotype.Repository;
import pe.com.bbva.admbio.dao.IClienteDAO;
import pe.com.bbva.admbio.model.Cliente;

/**
 *
 * @author max
 */
@Repository
public class ClienteDAO extends DAO<Cliente> implements IClienteDAO, Serializable {

    public int totalClientes() {
        int result = 0;
        try {
            result = ((Long) getSession().createQuery("select count(*) from " + getEntityClass().getName() + " t").uniqueResult()).intValue();

            Object obj = getSession().getNamedQuery("findTotalClientesEliminar").setParameter(0, "CANT").uniqueResult();
            if (obj == null) {
                System.out.println("------ VACIOOOO ");
            } else {
                System.out.println("------ result " + obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int totalClientesEliminar() {
        int result = 0;
        try {
            Object obj = getSession().getNamedQuery("findTotalClientesEliminar").uniqueResult();
            if (obj == null) {
                System.out.println("------ VACIOOOO ");
            } else {
                System.out.println("------ result " + obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
