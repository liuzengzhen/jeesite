package com.thinkgem.jeesite.modules.cont.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.cont.dao.ContractDao;
import com.thinkgem.jeesite.modules.cont.entity.Contract;

/**
 * 合同Service
 * @author XK
 *
 */
@Service
@Transactional(readOnly = true)
public class ContractService extends CrudService<ContractDao, Contract> {
	
	/**
	 * 根据ID获取合同数据
	 */
	public Contract get (String id) {
		Contract entity = dao.get(id);
		return entity;
	}
	
	/**
	 * 分页查询合同列表
	 * @param page
	 * @param contract
	 * @return
	 */
	public Page<Contract> find (Page<Contract> page, Contract contract) {
		contract.setPage(page);
		page.setList(dao.findList(contract));
		
		return page;
	}
	
	/**
	 * 保存合同信息
	 */
	@Transactional(readOnly = false)
	public void save (Contract contract) {
		super.save(contract);
	}

}
