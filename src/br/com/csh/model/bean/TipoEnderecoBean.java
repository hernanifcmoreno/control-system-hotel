package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoEndereco")
@NamedQueries({
@NamedQuery(name="tipoEnderecoBean.buscarPorDescricao", query = "SELECT T FROM TipoEnderecoBean T WHERE UPPER(T.descricao) like :descricao")
})
public class TipoEnderecoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	private String descricao;

	@OneToMany(mappedBy = "tipoEndereco")
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
