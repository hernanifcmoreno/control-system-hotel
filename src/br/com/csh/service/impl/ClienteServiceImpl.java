package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.PessoaBean;
import br.com.csh.model.repository.ClienteRepository;
import br.com.csh.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClienteRepository repository;

	@Override
	public void save(PessoaBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(PessoaBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(PessoaBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public PessoaBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<PessoaBean> findAll() {
		return repository.findAll();
	}

}