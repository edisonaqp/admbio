/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao;

import pe.com.bbva.admbio.model.ServidorOficina;
import java.util.List;

/**
 *
 * @author max
 */
public interface IServidorDAO extends IDAO<ServidorOficina> {

//      public List<ServidorOficina> listarServidor();
    
    List<ServidorOficina> buscarPorOficina(String centroCosto); 
}
