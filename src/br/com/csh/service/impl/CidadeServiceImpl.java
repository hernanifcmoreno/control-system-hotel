package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.CidadeBean;
import br.com.csh.model.repository.CidadeRepository;
import br.com.csh.service.CidadeService;

public class CidadeServiceImpl implements	CidadeService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CidadeRepository cidadeRepository;

	@Override
	public void save(CidadeBean element) {
		cidadeRepository.beginTransaction();
		cidadeRepository.save(element);
		cidadeRepository.commit();

	}

	@Override
	public void update(CidadeBean element) {
		cidadeRepository.beginTransaction();
		cidadeRepository.update(element);
		cidadeRepository.commit();

	}

	@Override
	public void delete(CidadeBean element) {
		cidadeRepository.beginTransaction();
		cidadeRepository.delete(element);
		cidadeRepository.commit();

	}

	@Override
	public CidadeBean findById(Integer key) {
		return cidadeRepository.findById(key);
	}

	@Override
	public Collection<CidadeBean> findAll() {
		return cidadeRepository.findAll();

	}

	@Override
	public Collection<CidadeBean> buscarPorDescricao(String descricao) {
		return cidadeRepository.buscarPorDescricao(descricao);
	}

	

}