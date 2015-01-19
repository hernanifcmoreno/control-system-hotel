package br.com.csh.model.repository.impl;

import java.util.Collection;

import javax.persistence.TypedQuery;

import br.com.csh.model.bean.TipoEnderecoBean;
import br.com.csh.model.repository.TipoEnderecoRepository;

public class TipoEnderecoRepositoryImpl extends
		GenericRepositoryImpl<TipoEnderecoBean, Integer> implements
		TipoEnderecoRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<TipoEnderecoBean> buscarPorDescricao(String descricao) {
		return em
				.createNamedQuery("tipoEnderecoBean.buscarPorDescricao",
						TipoEnderecoBean.class)
				.setParameter("descricao", "%" + descricao.toUpperCase() + "%")
				.getResultList();
	}

}
