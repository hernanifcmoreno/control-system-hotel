package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoLogBean;

@RequestScoped
public interface QuartoLogRepository extends
		GenericRepository<QuartoLogBean, Integer> {

}