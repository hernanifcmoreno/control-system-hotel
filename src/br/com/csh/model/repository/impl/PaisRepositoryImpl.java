package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.PaisBean;
import br.com.csh.model.repository.PaisRepository;

public class PaisRepositoryImpl extends
		GenericRepositoryImpl<PaisBean, Integer> implements
		PaisRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<PaisBean> buscarPorDescricao(String descricao) {
		return em
				.createNamedQuery("paisBean.buscarPorDescricao",
						PaisBean.class)
				.setParameter("descricao", "%" + descricao.toUpperCase() + "%")
				.getResultList();
	}

}