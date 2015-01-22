package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.QuartoCategoriaBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.QuartoCategoriaService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class QuartoCategoriaMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acao;
	private QuartoCategoriaBean quartoCategoriaPesquisa;
	private QuartoCategoriaBean quartoCategoriaSelecionado;
	private Collection<QuartoCategoriaBean> quartosCategorias;

	@Inject
	private QuartoCategoriaService quartoCategoriaService;

	public void pesquisar() {
		quartosCategorias = quartoCategoriaService
				.buscarPorDescricao(quartoCategoriaPesquisa.getDescricao());
	}

	public void save() {

		if ("S".equals(acao)) {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			quartoCategoriaSelecionado.setUsuario(user);
			quartoCategoriaService.save(quartoCategoriaSelecionado);
			quartoCategoriaSelecionado = new QuartoCategoriaBean();
		}else{
			quartoCategoriaService.update(quartoCategoriaSelecionado);
		}
		acao = "P";
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		quartoCategoriaService.update(quartoCategoriaSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		quartoCategoriaService.update(quartoCategoriaSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		quartoCategoriaPesquisa = new QuartoCategoriaBean();
		acao = "P";
	}

	public void prepareNovo() {
		quartoCategoriaSelecionado = new QuartoCategoriaBean();
	}

	@PostConstruct
	private void init() {
		acao = "P";
		quartoCategoriaPesquisa = new QuartoCategoriaBean();
		quartosCategorias = quartoCategoriaService.findAll();
	}

	public Collection<QuartoCategoriaBean> getQuartoCategoria() {
		return quartosCategorias;
	}

	public void setQuartoCategoria(Collection<QuartoCategoriaBean> quartosCategorias) {
		this.quartosCategorias = quartosCategorias;
	}

	public QuartoCategoriaBean getQuartoCategoriaPesquisa() {
		return quartoCategoriaPesquisa;
	}

	public void setQuartoCategoriaPesquisa(QuartoCategoriaBean quartoCategoriaPesquisa) {
		this.quartoCategoriaPesquisa = quartoCategoriaPesquisa;
	}

	public QuartoCategoriaBean getQuartoCategoriaSelecionado() {
		return quartoCategoriaSelecionado;
	}

	public void setQuartoCategoriaSelecionado(
			QuartoCategoriaBean quartoCategoriaSelecionado) {
		this.quartoCategoriaSelecionado = quartoCategoriaSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
