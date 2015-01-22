package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.TipoTelefoneBean;
import br.com.csh.model.repository.TipoTelefoneRepository;
import br.com.csh.service.TipoTelefoneService;

public class TipoTelefoneServiceImpl implements TipoTelefoneService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private TipoTelefoneRepository repository;
	
	@Override
	public void save(TipoTelefoneBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();

	}

	@Override
	public void update(TipoTelefoneBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();

	}

	@Override
	public void delete(TipoTelefoneBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();

	}

	@Override
	public TipoTelefoneBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<TipoTelefoneBean> findAll() {
		return repository.findAll();
	}

}