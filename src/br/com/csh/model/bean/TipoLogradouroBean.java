package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoLogradouro")
public class TipoLogradouroBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String descricao;

	@OneToMany(mappedBy = "tipoLogradouro")
	private Collection<EnderecoBean> enderecos;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<EnderecoBean> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Collection<EnderecoBean> enderecos) {
		this.enderecos = enderecos;
	}

}
