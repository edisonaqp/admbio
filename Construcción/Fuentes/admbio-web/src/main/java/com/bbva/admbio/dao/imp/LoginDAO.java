/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.admbio.dao.imp;

import com.bbva.admbio.dao.ILoginDAO;
import com.bbva.admbio.model.Login;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author max
 */
@Repository
public class LoginDAO extends DAO<Login> implements ILoginDAO, Serializable {
        

}
