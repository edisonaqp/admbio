/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.dao;

import java.util.Date;
import pe.com.bbva.admbio.model.Terminal;
import java.util.List;

/**
 *
 * @author max
 */
public interface ITerminalDAO extends IDAO<Terminal> {

    public List<Terminal> listarTerminal();

    public List<Terminal> listarHistorial(Date desde, Date hasta);
}
