package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.UsuarioBean;

@RequestScoped
public interface UsuarioRepository extends
		GenericRepository<UsuarioBean, Integer> {

}