package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoTelefoneBean;

@RequestScoped
public interface TipoTelefoneService extends GenericService<TipoTelefoneBean, Integer>{

}