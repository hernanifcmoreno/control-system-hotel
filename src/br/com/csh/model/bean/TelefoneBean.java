package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Telefone")
public class TelefoneBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=3)
	private char ddd;
	
	@Column(nullable= false, length=14)
	private String numero;
	
	@Column(length=150)
	private String contato;
	
	@ManyToOne
	@JoinColumn(name="tipoTelefoneId")
	private TipoTelefoneBean tipoTelefone;
	
	@ManyToOne
	@JoinColumn(name="paisId")
	private PaisBean pais;
	
	@ManyToOne
	@JoinColumn(name="pessoaId")
	private PessoaBean pessoaBean;

	public char getDdd() {
		return ddd;
	}

	public void setDdd(char ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public TipoTelefoneBean getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefoneBean tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public PaisBean getPais() {
		return pais;
	}

	public void setPais(PaisBean pais) {
		this.pais = pais;
	}

	public PessoaBean getPessoaBean() {
		return pessoaBean;
	}

	public void setPessoaBean(PessoaBean pessoaBean) {
		this.pessoaBean = pessoaBean;
	}
}
