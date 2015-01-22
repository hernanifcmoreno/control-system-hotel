package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.FuncionarioBean;

@RequestScoped
public interface FuncionarioService extends GenericService<FuncionarioBean, Integer>{

}