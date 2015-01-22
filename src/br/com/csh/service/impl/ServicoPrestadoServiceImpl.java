package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.ServicoPrestadoBean;
import br.com.csh.model.repository.ServicoPrestadoRepository;
import br.com.csh.service.ServicoPrestadoService;

public class ServicoPrestadoServiceImpl implements ServicoPrestadoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicoPrestadoRepository repository;

	@Override
	public void save(ServicoPrestadoBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();

	}

	@Override
	public void update(ServicoPrestadoBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();

	}

	@Override
	public void delete(ServicoPrestadoBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();

	}

	@Override
	public ServicoPrestadoBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<ServicoPrestadoBean> findAll() {
		return repository.findAll();
	}

}