package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.csh.model.Sexo;

@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(unique = true, length = 150)
	private String email;

	public String getEmail() {
		return this.email;
	}

	@Enumerated
	private Sexo sexo;

	public PessoaBean setEmail(String email) {
		this.email = email;
		return this;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
