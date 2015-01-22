package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ProfissaoBean;

@RequestScoped
public interface ProfissaoService extends GenericService<ProfissaoBean, Integer>{

}