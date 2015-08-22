/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bbva.admbio.converter;

import pe.com.bbva.admbio.model.Motivo;
import pe.com.bbva.admbio.service.IMotivoService;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author max
 */
@Component
@FacesConverter("motivoConverter")
public class MotivoConverter implements Converter {

    @Autowired
    private IMotivoService motivoService;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            try {
                return motivoService.buscarPorId(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        Integer id = (object instanceof Motivo) ? ((Motivo) object).getId() : null;

        if (id != null) {
            return String.valueOf(id);
        }

        return null;
    }

}
