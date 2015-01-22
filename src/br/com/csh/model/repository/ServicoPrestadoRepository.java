package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ServicoPrestadoBean;

@RequestScoped
public interface ServicoPrestadoRepository extends
		GenericRepository<ServicoPrestadoBean, Integer> {

}