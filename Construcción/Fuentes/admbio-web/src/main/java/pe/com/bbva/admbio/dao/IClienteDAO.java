/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao;

import pe.com.bbva.admbio.model.Cliente;

/**
 *
 * @author max
 */
public interface IClienteDAO extends IDAO<Cliente> {

    public int totalClientes();

    
}
