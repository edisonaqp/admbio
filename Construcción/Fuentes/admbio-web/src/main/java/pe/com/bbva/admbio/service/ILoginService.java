/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service;

import pe.com.bbva.admbio.model.Login;
import java.util.List;

/**
 *
 * @author max
 */
public interface ILoginService {

    public boolean guardar(Login login);

    public boolean actualizar(Login login);

    public boolean actualizarEstado(String terminal);

    public List<Login> listarTodos();

    public List<Login> listarActivos();

}
