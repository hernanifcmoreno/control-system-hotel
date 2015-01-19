package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.TipoEnderecoBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.TipoEnderecoService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class TipoEnderecoMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acao = "P";
	private TipoEnderecoBean tipoEnderecoPesquisa;
	private TipoEnderecoBean tipoEnderecoSelecionado;
	private Collection<TipoEnderecoBean> tiposEndereco;

	@Inject
	private TipoEnderecoService tipoEnderecoService;

	public void pesquisar() {
		tiposEndereco = tipoEnderecoService
				.buscarPorDescricao(tipoEnderecoPesquisa.getDescricao());

	}

	public void save() {

		if (acao == "S") {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			tipoEnderecoSelecionado.setUsuario(user);
			tipoEnderecoService.save(tipoEnderecoSelecionado);
			tipoEnderecoSelecionado = new TipoEnderecoBean();
		}else{
			tipoEnderecoService.update(tipoEnderecoSelecionado);
		}
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		tipoEnderecoService.update(tipoEnderecoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		tipoEnderecoService.update(tipoEnderecoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		tipoEnderecoPesquisa = new TipoEnderecoBean();
		acao = "P";
	}

	public void prepareNovo() {
		tipoEnderecoSelecionado = new TipoEnderecoBean();
	}

	@PostConstruct
	private void init() {
		tipoEnderecoPesquisa = new TipoEnderecoBean();
		tiposEndereco = tipoEnderecoService.findAll();
	}

	public Collection<TipoEnderecoBean> getTiposEndereco() {
		return tiposEndereco;
	}

	public void setTiposEndereco(Collection<TipoEnderecoBean> tiposEndereco) {
		this.tiposEndereco = tiposEndereco;
	}

	public TipoEnderecoBean getTipoEnderecoPesquisa() {
		return tipoEnderecoPesquisa;
	}

	public void setTipoEnderecoPesquisa(TipoEnderecoBean tipoEnderecoPesquisa) {
		this.tipoEnderecoPesquisa = tipoEnderecoPesquisa;
	}

	public TipoEnderecoBean getTipoEnderecoSelecionado() {
		return tipoEnderecoSelecionado;
	}

	public void setTipoEnderecoSelecionado(
			TipoEnderecoBean tipoEnderecoSelecionado) {
		this.tipoEnderecoSelecionado = tipoEnderecoSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
