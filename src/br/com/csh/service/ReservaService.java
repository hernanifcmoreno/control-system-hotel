package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ReservaBean;

@RequestScoped
public interface ReservaService extends GenericService<ReservaBean, Integer>{

}