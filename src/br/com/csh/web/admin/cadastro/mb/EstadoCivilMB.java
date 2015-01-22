package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.EstadoCivilBean;
import br.com.csh.service.EstadoCivilService;


@Named
@RequestScoped
public class EstadoCivilMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private EstadoCivilBean estadoCivilSelecionada;
	
	@Inject
	private EstadoCivilService service;

	public EstadoCivilBean getEstadoCivilSelecionada() {
		return estadoCivilSelecionada;
	}

	public void setestadoCivilSelecionada(EstadoCivilBean estadoCivilSelecionada) {
		this.estadoCivilSelecionada = estadoCivilSelecionada;
	}
	
}