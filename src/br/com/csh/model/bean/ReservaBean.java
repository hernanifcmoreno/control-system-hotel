package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reserva")
public class ReservaBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(length = 150)
	private String codigoReservaJuridica;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date dataInicio;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date dataFim;

	@Temporal(TemporalType.TIME)
	private Date dataCheckIn;

	@Temporal(TemporalType.TIME)
	private Date dataCheckOut;

	@Temporal(TemporalType.TIME)
	private Date dataCancelamento;

	@Column(nullable = false, scale = 8, precision = 2)
	private double valorTotal;

	@ManyToOne
	@JoinColumn(name = "pessoaFisicaId")
	private PessoaFisicaBean cliente;

	@ManyToOne
	@JoinColumn(name = "quartoId")
	private QuartoBean quarto;

	@OneToMany(mappedBy="reserva")
	private Collection<HospedeBean> hospedes;
	
	public String getCodigoReservaJuridica() {
		return codigoReservaJuridica;
	}

	public void setCodigoReservaJuridica(String codigoReservaJuridica) {
		this.codigoReservaJuridica = codigoReservaJuridica;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Date getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(Date dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public Date getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(Date dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public PessoaFisicaBean getCliente() {
		return cliente;
	}

	public void setCliente(PessoaFisicaBean cliente) {
		this.cliente = cliente;
	}

	public QuartoBean getQuarto() {
		return quarto;
	}

	public void setQuarto(QuartoBean quarto) {
		this.quarto = quarto;
	}

}
