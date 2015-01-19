package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QuartoOpcional")
public class QuartoOpcionalBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100)
	private String descricao;

	@Column(nullable = false, scale = 8, precision = 2)
	private double valor;

	@Column(nullable = false, length = 3)
	private int estoque;

	@ManyToMany(mappedBy = "quartoOpcionais")
	private Collection<QuartoBean> quarto;

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

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Collection<QuartoBean> getQuarto() {
		return quarto;
	}

	public void setQuarto(Collection<QuartoBean> quarto) {
		this.quarto = quarto;
	}
	
	

}
