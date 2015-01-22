package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.ReservaBean;
import br.com.csh.model.repository.ReservaRepository;
import br.com.csh.service.ReservaService;

public class ReservaServiceImpl implements ReservaService {
	private static final long serialVersionUID = 1L;

	@Inject
	private ReservaRepository repository;
	
	@Override
	public void save(ReservaBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(ReservaBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(ReservaBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public ReservaBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<ReservaBean> findAll() {
		return repository.findAll();
	}

}