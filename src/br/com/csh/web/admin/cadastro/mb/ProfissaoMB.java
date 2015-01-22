package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.ProfissaoBean;
import br.com.csh.service.ProfissaoService;

@Named
@RequestScoped
public class ProfissaoMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private ProfissaoBean ProfissaoSelecionada;
	
	@Inject
	private ProfissaoService service;

	public ProfissaoBean getProfissaoSelecionada() {
		return ProfissaoSelecionada;
	}

	public void setProfissaoSelecionada(ProfissaoBean ProfissaoSelecionada) {
		this.ProfissaoSelecionada = ProfissaoSelecionada;
	}
}