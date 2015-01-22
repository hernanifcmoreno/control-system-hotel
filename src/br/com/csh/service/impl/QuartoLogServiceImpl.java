package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.QuartoLogBean;
import br.com.csh.model.repository.QuartoLogRepository;
import br.com.csh.service.QuartoLogService;

public class QuartoLogServiceImpl implements QuartoLogService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private QuartoLogRepository repository;

	@Override
	public void save(QuartoLogBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(QuartoLogBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(QuartoLogBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public QuartoLogBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<QuartoLogBean> findAll() {
		return repository.findAll();
	}

}