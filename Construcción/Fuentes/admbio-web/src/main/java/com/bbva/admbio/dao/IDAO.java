/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author max
 */
public interface IDAO<E> {

  Serializable guardar(E e);

    void eliminar(Object id);

    void actualizar(E e);

    E buscarPorId(Object id);

    List<E> buscar();

}
