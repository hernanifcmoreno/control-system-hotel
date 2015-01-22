package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.PaisBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.PaisService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class PaisMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acao;
	private PaisBean paisPesquisa;
	private PaisBean paisSelecionado;
	private Collection<PaisBean> paises;

	@Inject
	private PaisService paisService;

	public void pesquisar() {
		paises = paisService
				.buscarPorDescricao(paisPesquisa.getDescricao());
	}

	public void save() {

		if ("S".equals(acao)) {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			paisSelecionado.setUsuario(user);
			paisService.save(paisSelecionado);
			paisSelecionado = new PaisBean();
		}else{
			paisService.update(paisSelecionado);
		}
		acao = "P";
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		paisService.update(paisSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		paisService.update(paisSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		paisPesquisa = new PaisBean();
		acao = "P";
	}

	public void prepareNovo() {
		paisSelecionado = new PaisBean();
	}

	@PostConstruct
	private void init() {
		acao = "P";
		paisPesquisa = new PaisBean();
		paises = paisService.findAll();
	}

	public Collection<PaisBean> getPais() {
		return paises;
	}

	public void setPais(Collection<PaisBean> paises) {
		this.paises = paises;
	}

	public PaisBean getPaisPesquisa() {
		return paisPesquisa;
	}

	public void setPaisPesquisa(PaisBean paisPesquisa) {
		this.paisPesquisa = paisPesquisa;
	}

	public PaisBean getPaisSelecionado() {
		return paisSelecionado;
	}

	public void setPaisSelecionado(PaisBean paisSelecionado) {
		this.paisSelecionado = paisSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
