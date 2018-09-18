/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.contract1.entity.TContractOperator2;

/**
 * 增删改查DAO接口
 * @author liuzz
 * @version 2017-03-09
 */
@MyBatisDao
public interface TContractOperator2Dao extends CrudDao<TContractOperator2> {
	/**
	 * 通过合同id带出相关信息
	 * @param contractId
	 * @return
	 */
	public TContractOperator2 getByContractId(String contractId);
}