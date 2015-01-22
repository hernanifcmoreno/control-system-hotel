package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.CidadeBean;
import br.com.csh.model.repository.CidadeRepository;

public class CidadeRepositoryImpl extends
		GenericRepositoryImpl<CidadeBean, Integer> implements
		CidadeRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<CidadeBean> buscarPorDescricao(String descricao) {
		return em
				.createNamedQuery("CidadeBean.buscarPorDescricao",
						CidadeBean.class)
				.setParameter("descricao", "%" + descricao.toUpperCase() + "%")
				.getResultList();
	}

}