package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ReservaBean;

@RequestScoped
public interface ReservaRepository extends
		GenericRepository<ReservaBean, Integer> {

}