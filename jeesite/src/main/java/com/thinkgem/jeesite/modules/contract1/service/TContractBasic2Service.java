/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.contract1.entity.TContractBasic2;
import com.thinkgem.jeesite.modules.contract1.dao.TContractBasic2Dao;

/**
 * 增删改Service
 * @author liuzz
 * @version 2017-03-09
 */
@Service
@Transactional(readOnly = true)
public class TContractBasic2Service extends CrudService<TContractBasic2Dao, TContractBasic2> {

	public TContractBasic2 get(String id) {
		return super.get(id);
	}
	//合同编号查询
	public TContractBasic2 getnum(String contractNum) {
		return dao.getnum(contractNum);
	}
	
	public List<TContractBasic2> findList(TContractBasic2 tContractBasic2) {
		return super.findList(tContractBasic2);
	}
	
	public Page<TContractBasic2> findPage(Page<TContractBasic2> page, TContractBasic2 tContractBasic2) {
		return super.findPage(page, tContractBasic2);
	}
	
	@Transactional(readOnly = false)
	public void save(TContractBasic2 tContractBasic2) {
		super.save(tContractBasic2);
	}
	
	@Transactional(readOnly = false)
	public void delete(TContractBasic2 tContractBasic2) {
		super.delete(tContractBasic2);
	}
	
}