/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.IDepuracionDAO;
import pe.com.bbva.admbio.model.DepuracionCliente;
import java.io.Serializable;
import org.springframework.stereotype.Repository;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author max
 */
@Repository
public class DepuracionDAO extends DAO<DepuracionCliente> implements IDepuracionDAO, Serializable {

    public List<Integer> totalClientesEliminar() {
        List<Integer> list = new ArrayList();
        Session session = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            callableStatement = session.connection().prepareCall("{call SPS_CANTIDAD_DEPURAR_CLIENTE(?,?)}");
            callableStatement.setString(1, "h");
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
            callableStatement.executeQuery();
            resultSet = (ResultSet) callableStatement.getObject(2);
            System.out.println("RESULSET " + resultSet);
            if (resultSet != null) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    list.add(resultSet.getInt(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return list;
    }

    public List<Integer> depurarClientes() {
        List<Integer> list = new ArrayList();
        Session session = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            callableStatement = session.connection().prepareCall("{call SPD_DEPURAR_CLIENTE(?,?)}");
            callableStatement.setString(1, "h");
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
            callableStatement.executeQuery();
            resultSet = (ResultSet) callableStatement.getObject(2);
            System.out.println("RESULSET " + resultSet);
            if (resultSet != null) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    list.add(resultSet.getInt(1));
                    list.add(resultSet.getInt(2));
                    list.add(resultSet.getInt(3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return list;
    }

}
