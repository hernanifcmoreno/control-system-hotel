package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Profissao")
public class ProfissaoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(length = 60, unique = true, nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "profissao")
	private Collection<PessoaFisicaBean> pessoasFisica;

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

}
