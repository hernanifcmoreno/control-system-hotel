package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.Sexo;
import br.com.csh.model.bean.PessoaBean;
import br.com.csh.model.bean.PessoaFisicaBean;
import br.com.csh.model.bean.PessoaJuridicaBean;
import br.com.csh.service.ClienteService;

@Named
@RequestScoped
public class ClienteMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private PessoaBean clienteSelecionado;
	private Collection<PessoaBean> clientes;
	private String tipoPessoa;

	@Inject
	private ClienteService service;

	public PessoaBean getClienteSelecionada() {
		return clienteSelecionado;
	}

	public void setClienteSelecionada(PessoaBean clienteSelecionada) {
		this.clienteSelecionado = clienteSelecionada;
	}

	public void gerarPessoa() {
		if (tipoPessoa == "PF")
			clienteSelecionado = new PessoaFisicaBean();
		else
			clienteSelecionado = new PessoaJuridicaBean();
	}

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	@PostConstruct
	private void init() {
		clientes = service.findAll();
	}

	public Boolean isPessoaFisica() {
		return clienteSelecionado instanceof PessoaFisicaBean;
	}

	public Boolean isPessoaJuridica() {
		return clienteSelecionado instanceof PessoaFisicaBean;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public PessoaBean getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(PessoaBean clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public Collection<PessoaBean> getClientes() {
		return clientes;
	}

	public void setClientes(Collection<PessoaBean> clientes) {
		this.clientes = clientes;
	}

}