package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.QuartoCategoriaBean;
import br.com.csh.model.repository.QuartoCategoriaRepository;

public class QuartoCategoriaRepositoryImpl extends
		GenericRepositoryImpl<QuartoCategoriaBean, Integer> implements
		QuartoCategoriaRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<QuartoCategoriaBean> buscarPorDescricao(String descricao) {
		return em
				.createNamedQuery("QuartoCategoriaBean.buscarPorDescricao",
						QuartoCategoriaBean.class)
				.setParameter("descricao", "%" + descricao.toUpperCase() + "%")
				.getResultList();
	}

}