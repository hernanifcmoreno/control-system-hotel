package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import static javax.persistence.CascadeType.MERGE;

@Entity
@Table(name = "Fisica")
public class PessoaFisicaBean extends PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=150, nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length=12, nullable=false)
	private String cpf;
	
	@Column(length=30)
	private String rg;
	
	@Column(length=5)
	private char orgaoEmissor;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade= {MERGE, CascadeType.PERSIST, CascadeType.REMOVE,})
	@JoinColumn(name = "estadoCivilId")
	private EstadoCivilBean estadoCivil;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "profissaoId")
	private ProfissaoBean profissao;
	
	@ManyToMany(mappedBy="pessoasFisica")
	private Collection<PessoaJuridicaBean> pessoasJuridica;
	
	@ManyToOne
	@JoinColumn(name = "paisId")
	private PaisBean pais;

	@OneToOne(mappedBy="cliente")
	private HospedeBean hospede;
	
	public String getNome() {
		return nome;
	}

	public PessoaFisicaBean setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public PessoaFisicaBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public String getCpf() {
		return cpf;
	}

	public PessoaFisicaBean setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public String getRg() {
		return rg;
	}

	public PessoaFisicaBean setRg(String rg) {
		this.rg = rg;
		return this;
	}

	public char getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public PessoaFisicaBean setOrgaoEmissor(char orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
		return this;
	}

	public EstadoCivilBean getEstadoCivil() {
		if (estadoCivil == null) {
			estadoCivil = new EstadoCivilBean();
		}
		return estadoCivil;
	}

	public PessoaFisicaBean setEstadoCivil(EstadoCivilBean estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}

	public ProfissaoBean getProfissao() {
		return profissao;
	}

	public void setProfissao(ProfissaoBean profissao) {
		this.profissao = profissao;
	}

	public Collection<PessoaJuridicaBean> getPessoasJuridica() {
		return pessoasJuridica;
	}

	public void setPessoasJuridica(Collection<PessoaJuridicaBean> pessoasJuridica) {
		this.pessoasJuridica = pessoasJuridica;
	}

	public PaisBean getPais() {
		return pais;
	}

	public void setPais(PaisBean pais) {
		this.pais = pais;
	}

	public HospedeBean getHospede() {
		return hospede;
	}

	public void setHospede(HospedeBean hospede) {
		this.hospede = hospede;
	}
}
