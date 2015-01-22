package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.FuncionarioBean;
import br.com.csh.model.repository.FuncionarioRepository;
import br.com.csh.service.FuncionarioService;

public class FuncionaroServiceImpl implements FuncionarioService {
	private static final long serialVersionUID = 1L;

	@Inject
	private FuncionarioRepository repository;
	
	@Override
	public void save(FuncionarioBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(FuncionarioBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(FuncionarioBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public FuncionarioBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<FuncionarioBean> findAll() {
		return repository.findAll();
	}

}