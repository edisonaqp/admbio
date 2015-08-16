/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.dao;

import com.bbva.admbio.model.ServidorOficina;
import com.bbva.admbio.model.Terminal;
import java.util.List;

/**
 *
 * @author max
 */
public interface IServidorDAO extends IDAO<ServidorOficina> {

      public List<ServidorOficina> listarServidor();
}
