package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.csh.model.TipoConta;

@Entity
@Table(name = "Fornecedor")
public class FornecedorBean extends PessoaJuridicaBean {

	private static final long serialVersionUID = 1L;

	@Column(length = 5, nullable = false)
	private char codigoBanco;

	@Enumerated
	private TipoConta tipoConta;

	@Column(nullable = false, length = 10)
	private String agencia;

	@Column(nullable = false, length = 10)
	private String numeroConta;

	@Column(length = 5)
	private String codigoOperacao;
	
	
}
