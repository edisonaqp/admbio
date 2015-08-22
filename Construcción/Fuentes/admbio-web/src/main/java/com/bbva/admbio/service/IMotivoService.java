/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.service;

import com.bbva.admbio.model.Motivo;
import java.util.List;

/**
 *
 * @author max
 */
public interface IMotivoService {

    List<Motivo> listarTodos();
    
    Motivo buscarPorId(Integer id);
}
