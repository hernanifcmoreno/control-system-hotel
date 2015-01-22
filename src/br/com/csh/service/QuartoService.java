package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoBean;

@RequestScoped
public interface QuartoService extends GenericService<QuartoBean, Integer>{

}