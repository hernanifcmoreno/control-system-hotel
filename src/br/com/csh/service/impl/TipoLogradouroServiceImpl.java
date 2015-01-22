package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.TipoLogradouroBean;
import br.com.csh.model.repository.TipoLogradouroRepository;
import br.com.csh.service.TipoLogradouroService;

public class TipoLogradouroServiceImpl implements TipoLogradouroService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private TipoLogradouroRepository repository;
	
	@Override
	public void save(TipoLogradouroBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();

	}

	@Override
	public void update(TipoLogradouroBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();

	}

	@Override
	public void delete(TipoLogradouroBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();

	}

	@Override
	public TipoLogradouroBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<TipoLogradouroBean> findAll() {
		return repository.findAll();
	}

}