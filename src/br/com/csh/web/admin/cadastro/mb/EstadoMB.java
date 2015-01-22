package br.com.csh.web.admin.cadastro.mb;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.csh.model.bean.EstadoBean;
import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.service.EstadoService;
import br.com.csh.web.util.JsfUtil;

@Named
@SessionScoped
public class EstadoMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acao;
	private EstadoBean estadoPesquisa;
	private EstadoBean estadoSelecionado;
	private Collection<EstadoBean> estados;

	@Inject
	private EstadoService estadoService;

	public void pesquisar() {
		estados = estadoService
				.buscarPorDescricao(estadoPesquisa.getDescricao());
	}

	public void save() {

		if ("S".equals(acao)) {
			UsuarioBean user = new UsuarioBean();
			user.setId(1);
			estadoSelecionado.setUsuario(user);
			estadoService.save(estadoSelecionado);
			estadoSelecionado = new EstadoBean();
		}else{
			estadoService.update(estadoSelecionado);
		}
		acao = "P";
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void editar() {
		estadoService.update(estadoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void prepareEditar() {
		estadoService.update(estadoSelecionado);
		JsfUtil.mensagemOK("msg", "Operacao realizada com sucesso!");
	}

	public void cancelar() {
		estadoPesquisa = new EstadoBean();
		acao = "P";
	}

	public void prepareNovo() {
		estadoSelecionado = new EstadoBean();
	}

	@PostConstruct
	private void init() {
		acao = "P";
		estadoPesquisa = new EstadoBean();
		estados = estadoService.findAll();
	}

	public Collection<EstadoBean> getEstado() {
		return estados;
	}

	public void setEstado(Collection<EstadoBean> estados) {
		this.estados = estados;
	}

	public EstadoBean getEstadoPesquisa() {
		return estadoPesquisa;
	}

	public void setEstadoPesquisa(EstadoBean estadoPesquisa) {
		this.estadoPesquisa = estadoPesquisa;
	}

	public EstadoBean getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(
			EstadoBean estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
