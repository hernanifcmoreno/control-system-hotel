package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Funcionario")
public class FuncionarioBean extends PessoaFisicaBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 20)
	private String pis;

	@Column(nullable = false, scale = 8, precision = 2)
	private double salario;

	@Temporal(TemporalType.TIME)
	private Date dataAdimissao;

	@Temporal(TemporalType.TIME)
	private Date dataDemissao;

	@OneToMany(mappedBy="funcionario")
	private Collection<FuncionarioDependenteBean> funcionariosDependente;
	
	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(Date dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Collection<FuncionarioDependenteBean> getFuncionariosDependente() {
		return funcionariosDependente;
	}

	public void setFuncionariosDependente(
			Collection<FuncionarioDependenteBean> funcionariosDependente) {
		this.funcionariosDependente = funcionariosDependente;
	}

	
	
}
