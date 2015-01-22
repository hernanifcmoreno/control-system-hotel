package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.UsuarioBean;

@RequestScoped
public interface UsuarioService extends GenericService<UsuarioBean, Integer>{

}