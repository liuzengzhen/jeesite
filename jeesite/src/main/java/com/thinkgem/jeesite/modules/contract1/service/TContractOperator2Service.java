/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.contract1.entity.TContractOperator2;
import com.thinkgem.jeesite.modules.contract1.dao.TContractOperator2Dao;

/**
 * 增删改查Service
 * @author liuzz
 * @version 2017-03-09
 */
@Service
@Transactional(readOnly = true)
public class TContractOperator2Service extends CrudService<TContractOperator2Dao, TContractOperator2> {

	public TContractOperator2 get(String id) {
		return super.get(id);
	}
	//合同id查询相关人
	public TContractOperator2 getByContractId(String contractId) {
		return dao.getByContractId(contractId);
	}
	public List<TContractOperator2> findList(TContractOperator2 tContractOperator2) {
		return super.findList(tContractOperator2);
	}
	
	public Page<TContractOperator2> findPage(Page<TContractOperator2> page, TContractOperator2 tContractOperator2) {
		return super.findPage(page, tContractOperator2);
	}
	
	@Transactional(readOnly = false)
	public void save(TContractOperator2 tContractOperator2) {
		super.save(tContractOperator2);
	}
	
	@Transactional(readOnly = false)
	public void delete(TContractOperator2 tContractOperator2) {
		super.delete(tContractOperator2);
	}
	
}