package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.EstadoBean;
import br.com.csh.model.repository.EstadoRepository;
import br.com.csh.service.EstadoService;

public class EstadoServiceImpl implements	EstadoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EstadoRepository estadoRepository;

	@Override
	public void save(EstadoBean element) {
		estadoRepository.beginTransaction();
		estadoRepository.save(element);
		estadoRepository.commit();

	}

	@Override
	public void update(EstadoBean element) {
		estadoRepository.beginTransaction();
		estadoRepository.update(element);
		estadoRepository.commit();

	}

	@Override
	public void delete(EstadoBean element) {
		estadoRepository.beginTransaction();
		estadoRepository.delete(element);
		estadoRepository.commit();

	}

	@Override
	public EstadoBean findById(Integer key) {
		return estadoRepository.findById(key);
	}

	@Override
	public Collection<EstadoBean> findAll() {
		return estadoRepository.findAll();

	}

	@Override
	public Collection<EstadoBean> buscarPorDescricao(String descricao) {
		return estadoRepository.buscarPorDescricao(descricao);
	}

	

}