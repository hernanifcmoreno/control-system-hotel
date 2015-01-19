package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Juridica")
public class PessoaJuridicaBean extends PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(length=60)
	private String razaoSocial;
	
	@Column(length=150)
	private String fantasia;
	
	@Column(length=20, unique=true)
	private String cnpj;
	
	@Column(length=15)
	private String inscricaoEstadual;
	
	@Column(length=15)
	private String inscricaoMunicipal;
	
	@Column(length=150, unique=true)
	private String codigoReserva;
	
	@ManyToMany
	@JoinTable(name="PessoasJuridicaXPessoasFisica",
			   joinColumns = @JoinColumn(name="pessoaJuridicaId"), 
			   inverseJoinColumns = @JoinColumn(name="pessoaFisicaId"))				
	private Collection<PessoaFisicaBean> pessoasFisica;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public PessoaJuridicaBean setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public String getFantasia() {
		return fantasia;
	}
	public PessoaJuridicaBean setFantasia(String fantasia) {
		this.fantasia = fantasia;
		return this;
	}
	public String getCnpj() {
		return cnpj;
	}
	public PessoaJuridicaBean setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public PessoaJuridicaBean setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
		return this;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public PessoaJuridicaBean setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
		return this;
	}
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public PessoaJuridicaBean setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
		return this;
	}
	
}
