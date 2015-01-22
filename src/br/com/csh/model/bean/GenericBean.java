package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.sun.istack.Nullable;

@MappedSuperclass
public abstract class GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIME)
	private Date dataCadastro;

	@Temporal(TemporalType.TIME)
	private Date dataAlteracao;

	@Temporal(TemporalType.TIME)
	private Date dataExclusao;

	private int usuarioCadastro;
	private @Nullable Integer usuarioAlteracao;
	private @Nullable Integer usuarioExlusao;

	@Transient
	private UsuarioBean usuarioBean;

	private boolean ativo;

	public int getId() {
		return id;
	}

	public GenericBean setId(int id) {
		this.id = id;
		return this;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public Date getDataExclusao() {
		return dataExclusao;
	}

	public int getUsuarioCadastro() {
		return usuarioCadastro;
	}

	public int getUsuarioAlteracao() {
		return usuarioAlteracao;
	}

	public int getUsuarioExlusao() {
		return usuarioExlusao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public UsuarioBean getUsuario() {
		return usuarioBean;
	}

	public void setUsuario(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	@PrePersist
	private void defaultPersist() {
		dataCadastro = new Date();
		ativo = true;
		usuarioCadastro = usuarioBean.getId();
	}

	@PreUpdate
	private void defaultUpdate() {
		if (ativo == false) {
			dataExclusao = new Date();
			usuarioExlusao = usuarioBean.getId();
		} else {
			dataAlteracao = new Date();
			//usuarioAlteracao = usuarioBean.getId();
		}
	}
}
