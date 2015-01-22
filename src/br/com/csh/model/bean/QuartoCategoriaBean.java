package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QuartoCategoria")
@NamedQueries({
@NamedQuery(name="QuartoCategoriaBean.buscarPorDescricao", query = "SELECT T FROM QuartoCategoriaBean T WHERE UPPER(T.descricao) like :descricao")
})
public class QuartoCategoriaBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100)
	private String descricao;

	@Column(nullable = false, scale = 8, precision = 2)
	private double valor;
	
	@OneToMany(mappedBy="categoria")
	private Collection<QuartoBean> quartos;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Collection<QuartoBean> getQuartos() {
		return quartos;
	}

	public void setQuartos(Collection<QuartoBean> quartos) {
		this.quartos = quartos;
	}

}
