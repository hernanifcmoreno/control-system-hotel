package br.com.csh.service;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ServicoPrestadoBean;

@RequestScoped
public interface ServicoPrestadoService extends GenericService<ServicoPrestadoBean, Integer>{

}