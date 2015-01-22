package br.com.csh.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.com.csh.model.bean.EstadoBean;
import br.com.csh.service.EstadoService;

@FacesConverter(forClass = EstadoBean.class, value = "estadoConverter")
public class EstadoConverter implements Converter {

	@Inject
	private EstadoService service;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		if ("".equals(value) || value == null)
			return null;

		return service.findById(Integer.parseInt(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		EstadoBean estado = (EstadoBean) value;
		return estado.getId() + "";
	}

}