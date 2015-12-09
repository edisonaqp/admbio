/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao;

import java.util.List;
import pe.com.bbva.admbio.model.DepuracionCliente;

/**
 *
 * @author max
 */
public interface IDepuracionDAO extends IDAO<DepuracionCliente> {

    public List<Integer> totalClientesEliminar();
    
    public List<Integer> depurarClientes();
}
