package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Hospede")
public class HospedeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
	private int hospedeId;

	@Column(nullable = false, length = 150)
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@OneToOne
	@JoinColumn(name = "pessoaFisicaId")
	private PessoaFisicaBean cliente;

	@ManyToOne
	@JoinColumn(name = "reservaId")
	private ReservaBean reserva;

	public int getHospedeId() {
		return hospedeId;
	}

	public void setHospedeId(int hospedeId) {
		this.hospedeId = hospedeId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public PessoaFisicaBean getCliente() {
		return cliente;
	}

	public void setCliente(PessoaFisicaBean cliente) {
		this.cliente = cliente;
	}

	public ReservaBean getReserva() {
		return reserva;
	}

	public void setReserva(ReservaBean reserva) {
		this.reserva = reserva;
	}

}
