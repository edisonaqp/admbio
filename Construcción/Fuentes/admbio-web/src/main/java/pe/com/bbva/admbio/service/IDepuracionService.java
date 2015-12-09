/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service;

import pe.com.bbva.admbio.model.DepuracionCliente;
import java.util.List;

/**
 *
 * @author max
 */
public interface IDepuracionService {

    public List<DepuracionCliente> listarTodos();

    public List<Integer> totalClientesEliminar();
    
    public List<Integer> depurarClientes();

}
