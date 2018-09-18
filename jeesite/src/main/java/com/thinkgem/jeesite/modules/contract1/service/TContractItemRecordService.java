/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.contract1.entity.TContractItemRecord;
import com.thinkgem.jeesite.modules.contract1.dao.TContractItemRecordDao;

/**
 * 增删改查Service
 * @author liuzz
 * @version 2017-03-09
 */
@Service
@Transactional(readOnly = false)
public class TContractItemRecordService extends CrudService<TContractItemRecordDao, TContractItemRecord> {

	public TContractItemRecord get(String id) {
		return super.get(id);
	}
	//根据合同编号查询
	public TContractItemRecord getByContractNum(String getByContractNum){
		return dao.getByContractNum(getByContractNum);
	}
	//根据合同编号更新
	public int updateByNum(TContractItemRecord TContractItemRecord){
		return dao.updateByNum(TContractItemRecord);
	}
	//根据合同编号删除
	public int deleteByNum(String ContractNum){
		return dao.deleteByNum(ContractNum);
	}
	public List<TContractItemRecord> findList(TContractItemRecord tContractItemRecord) {
		return super.findList(tContractItemRecord);
	}
	
	public Page<TContractItemRecord> findPage(Page<TContractItemRecord> page, TContractItemRecord tContractItemRecord) {
		return super.findPage(page, tContractItemRecord);
	}
	
	@Transactional(readOnly = false)
	public void save(TContractItemRecord tContractItemRecord) {
		super.save(tContractItemRecord);
	}
	
	@Transactional(readOnly = false)
	public void delete(TContractItemRecord tContractItemRecord) {
		super.delete(tContractItemRecord);
	}
	
}