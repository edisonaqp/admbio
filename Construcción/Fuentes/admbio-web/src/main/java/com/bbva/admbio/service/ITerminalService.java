/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.service;

import com.bbva.admbio.model.Terminal;
import java.util.List;

/**
 *
 * @author max
 */
public interface ITerminalService {

    public boolean guardar(Terminal terminal);

    public List<Terminal> listar();

}
