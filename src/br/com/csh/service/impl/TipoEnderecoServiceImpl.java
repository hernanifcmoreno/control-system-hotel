package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;

import br.com.csh.model.bean.TipoEnderecoBean;
import br.com.csh.model.repository.TipoEnderecoRepository;
import br.com.csh.service.TipoEnderecoService;

public class TipoEnderecoServiceImpl implements	TipoEnderecoService {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private TipoEnderecoRepository tipoEnderecoRepository;

	@Override
	public void save(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.save(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public void update(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.update(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public void delete(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.delete(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public TipoEnderecoBean findById(Integer key) {
		return tipoEnderecoRepository.FindById(key);
	}

	@Override
	public Collection<TipoEnderecoBean> findAll() {
		return tipoEnderecoRepository.findAll();

	}

	@Override
	public Collection<TipoEnderecoBean> buscarPorDescricao(String descricao) {
		return tipoEnderecoRepository.buscarPorDescricao(descricao);
	}

	

}
