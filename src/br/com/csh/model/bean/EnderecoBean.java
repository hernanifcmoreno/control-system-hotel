package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class EnderecoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200)
	private String logradouro;

	@Column(nullable = false, length = 5)
	private int numero;

	@Column(nullable = false, length = 8)
	private String cep;

	@Column(nullable = false, length = 150)
	private String bairro;

	@Column(length = 100)
	private String complemento;

	@Column(length = 100)
	private String referencia;

	@ManyToOne
	@JoinColumn(name = "pessoaId")
	private PessoaBean pessoa;

	@ManyToOne
	@JoinColumn(name = "tipoEnderecoId")
	private TipoEnderecoBean tipoEndereco;

	@ManyToOne
	@JoinColumn(name = "cidadeId")
	private CidadeBean cidade;

	@ManyToOne
	@JoinColumn(name = "tipoLogradouroId")
	private TipoLogradouroBean tipoLogradouro;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
	}

	public TipoEnderecoBean getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEnderecoBean tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public CidadeBean getCidade() {
		return cidade;
	}

	public void setCidade(CidadeBean cidade) {
		this.cidade = cidade;
	}

	public TipoLogradouroBean getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouroBean tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

}
