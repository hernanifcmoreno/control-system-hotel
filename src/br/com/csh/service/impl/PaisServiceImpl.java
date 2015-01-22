package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.PaisBean;
import br.com.csh.model.repository.PaisRepository;
import br.com.csh.model.repository.UsuarioRepository;
import br.com.csh.service.PaisService;

public class PaisServiceImpl implements	PaisService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private PaisRepository paisRepository;
	
	@Override
	public void save(PaisBean element) {
		paisRepository.beginTransaction();
		paisRepository.save(element);
		paisRepository.commit();

	}

	@Override
	public void update(PaisBean element) {
		paisRepository.beginTransaction();
		paisRepository.update(element);
		paisRepository.commit();

	}

	@Override
	public void delete(PaisBean element) {
		paisRepository.beginTransaction();
		paisRepository.delete(element);
		paisRepository.commit();

	}

	@Override
	public PaisBean findById(Integer key) {
		return paisRepository.findById(key);
	}

	@Override
	public Collection<PaisBean> findAll() {
		return paisRepository.findAll();

	}

	@Override
	public Collection<PaisBean> buscarPorDescricao(String descricao) {
		return paisRepository.buscarPorDescricao(descricao);
	}

	

}