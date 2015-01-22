package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.ProfissaoBean;
import br.com.csh.model.repository.ProfissaoRepository;
import br.com.csh.service.ProfissaoService;

public class ProfissaoServiceImpl implements ProfissaoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProfissaoRepository repository;
	
	@Override
	public void save(ProfissaoBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();
	}

	@Override
	public void update(ProfissaoBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();
	}

	@Override
	public void delete(ProfissaoBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();
	}

	@Override
	public ProfissaoBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<ProfissaoBean> findAll() {
		return repository.findAll();
	}

}