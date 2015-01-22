package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.QuartoBean;
import br.com.csh.model.repository.QuartoRepository;
import br.com.csh.service.QuartoService;

public class QuartoServiceImpl implements QuartoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private QuartoRepository repository;

	@Override
	public void save(QuartoBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(QuartoBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(QuartoBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public QuartoBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<QuartoBean> findAll() {
		return repository.findAll();
	}

}