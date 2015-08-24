/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.service;

import java.util.Date;
import pe.com.bbva.admbio.model.Terminal;
import java.util.List;

/**
 *
 * @author max
 */
public interface ITerminalService {

    public boolean guardar(Terminal terminal);

    public boolean actualizar(Terminal terminal);

    public List<Terminal> listar();

    public List<Terminal> listarHistorial(Date desde, Date hasta);
}
