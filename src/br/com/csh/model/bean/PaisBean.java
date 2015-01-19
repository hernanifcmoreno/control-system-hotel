package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pais")
public class PaisBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(length = 3, nullable = false)
	private char ddi;

	@Column(length = 60, unique = true, nullable = false)
	private String descricao;

	@OneToMany(mappedBy = "pais")
	private Collection<PessoaFisicaBean> pessoasFisica;

	@OneToMany(mappedBy = "pais")
	private Collection<EstadoBean> estados;

	public char getDdi() {
		return ddi;
	}

	public void setDdi(char ddi) {
		this.ddi = ddi;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<PessoaFisicaBean> getPessoasFisica() {
		if (pessoasFisica == null) {
			pessoasFisica = Collections.emptyList();
		}
		return pessoasFisica;
	}

	public void setPessoasFisica(Collection<PessoaFisicaBean> pessoasFisica) {
		this.pessoasFisica = pessoasFisica;
	}

	public Collection<EstadoBean> getEstados() {
		return estados;
	}

	public void setEstados(Collection<EstadoBean> estados) {
		this.estados = estados;
	}

}
