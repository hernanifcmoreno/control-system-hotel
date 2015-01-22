package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.FornecedorBean;

@RequestScoped
public interface FornecedorService extends GenericService<FornecedorBean, Integer>{

}