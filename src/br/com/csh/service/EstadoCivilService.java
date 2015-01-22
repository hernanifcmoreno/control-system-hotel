package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.EstadoCivilBean;

@RequestScoped
public interface EstadoCivilService extends GenericService<EstadoCivilBean, Integer>{

}