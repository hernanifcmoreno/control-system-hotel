package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.FornecedorBean;
import br.com.csh.model.repository.FornecedorRepository;
import br.com.csh.service.FornecedorService;

public class FornecedorServiceImpl implements FornecedorService {
	private static final long serialVersionUID = 1L;

	@Inject
	private FornecedorRepository repository;
	
	@Override
	public void save(FornecedorBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(FornecedorBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(FornecedorBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public FornecedorBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<FornecedorBean> findAll() {
		return repository.findAll();
	}

}