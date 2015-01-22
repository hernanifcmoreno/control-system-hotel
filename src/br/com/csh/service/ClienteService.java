package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.PessoaBean;

@RequestScoped
public interface ClienteService extends GenericService<PessoaBean, Integer>{

}