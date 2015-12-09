/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao.imp;

import pe.com.bbva.admbio.dao.IDAO;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author max
 */

public class DAO<E> implements IDAO<E>, Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() throws HibernateException {
        return sessionFactory.getCurrentSession();
    }

    private Class<E> entityClass;

    @Override
    public Serializable guardar(E e) {
        Serializable s = getSession().save(e);
        return s;
    }

    @Override
    public void eliminar(Object id) {
        getSession().delete(id);
    }

    @Override
    public void actualizar(E e) {
        getSession().update(e);
    }

    @Override
    public E buscarPorId(Object id) {
        return (E) getSession().get(getEntityClass().getName(), (Serializable) id);
    }

    @Override
    public List<E> buscar() {
        return getSession().createQuery("from " + getEntityClass().getName()).list();
    }

    public Class<E> getEntityClass() {
        if (entityClass == null) {
            Type type = getClass().getGenericSuperclass();
            if (type instanceof ParameterizedType) {
                ParameterizedType paramType = (ParameterizedType) type;
                if (paramType.getActualTypeArguments().length == 2) {
                    setEntityClass(paramType);
                } else {
                    entityClass = (Class<E>) paramType.getActualTypeArguments()[0];
                }
            } else {
                throw new ClassCastException("No se puede obtener clase mediante reflection");
            }
        }
        return entityClass;
    }

    private void setEntityClass(ParameterizedType paramType) {
        if (paramType.getActualTypeArguments()[1] instanceof TypeVariable) {
            throw new IllegalArgumentException("No se puede obtener clase mediante reflection");
        } else {
            entityClass = (Class<E>) paramType.getActualTypeArguments()[1];
        }
    }

}
