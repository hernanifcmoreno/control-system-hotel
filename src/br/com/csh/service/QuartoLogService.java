package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoLogBean;

@RequestScoped
public interface QuartoLogService extends GenericService<QuartoLogBean, Integer>{

}