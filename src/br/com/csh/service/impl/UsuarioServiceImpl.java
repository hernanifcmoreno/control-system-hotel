package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.UsuarioBean;
import br.com.csh.model.repository.UsuarioRepository;
import br.com.csh.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioRepository repository;
	
	@Override
	public void save(UsuarioBean element) {
		repository.beginTransaction();
		repository.save(element);
		repository.commit();

	}

	@Override
	public void update(UsuarioBean element) {
		repository.beginTransaction();
		repository.update(element);
		repository.commit();

	}

	@Override
	public void delete(UsuarioBean element) {
		repository.beginTransaction();
		repository.delete(element);
		repository.commit();

	}

	@Override
	public UsuarioBean findById(Integer key) {
		return repository.findById(key);
	}

	@Override
	public Collection<UsuarioBean> findAll() {
		return repository.findAll();
	}

}