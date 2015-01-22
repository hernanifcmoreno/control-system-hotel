package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.QuartoCategoriaBean;
import br.com.csh.model.repository.QuartoCategoriaRepository;
import br.com.csh.service.QuartoCategoriaService;

public class QuartoCategoriaServiceImpl implements	QuartoCategoriaService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private QuartoCategoriaRepository quartoCategoriaRepository;

	@Override
	public void save(QuartoCategoriaBean element) {
		quartoCategoriaRepository.beginTransaction();
		quartoCategoriaRepository.save(element);
		quartoCategoriaRepository.commit();

	}

	@Override
	public void update(QuartoCategoriaBean element) {
		quartoCategoriaRepository.beginTransaction();
		quartoCategoriaRepository.update(element);
		quartoCategoriaRepository.commit();

	}

	@Override
	public void delete(QuartoCategoriaBean element) {
		quartoCategoriaRepository.beginTransaction();
		quartoCategoriaRepository.delete(element);
		quartoCategoriaRepository.commit();

	}

	@Override
	public QuartoCategoriaBean findById(Integer key) {
		return quartoCategoriaRepository.findById(key);
	}

	@Override
	public Collection<QuartoCategoriaBean> findAll() {
		return quartoCategoriaRepository.findAll();

	}

	@Override
	public Collection<QuartoCategoriaBean> buscarPorDescricao(String descricao) {
		return quartoCategoriaRepository.buscarPorDescricao(descricao);
	}

	

}