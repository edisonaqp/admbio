/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.controller;

import pe.com.bbva.admbio.model.Login;
import pe.com.bbva.admbio.service.ILoginService;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author max
 */
@Component("loginMB")
@Scope("session")
//@ManagedBean(name = "loginMB")
//@RequestScoped
public class LoginController implements Serializable {

    private static final Logger log = Logger.getLogger(LoginController.class);
    private static final long serialVersionUID = 1L;

//    @ManagedProperty(value = "#{LoginService}")
    @Autowired
    private ILoginService loginService;

    public String grabar() {
        Login login = new Login();
        login.setId(Integer.SIZE);
        login.setCentroCosto("lima");
        login.setPerfil("ope");
        login.setRegistro("LBTR");
        login.setNombreServidor("Demo");
        login.setNombreUsuario("adm");
        login.setNumeroPuesto("001");
        login.setUsuarioCreacion("adm");
        login.setFechaHoraLogin(new Date());
        login.setFechaHoraCreacion(new Date());
        login.setEstado(BigInteger.ZERO);
        try {
            loginService.guardar(login);
        } catch (Exception e) {
            log.error("Error al grabar " + e, e);
        }
        return "success";
    }

}
