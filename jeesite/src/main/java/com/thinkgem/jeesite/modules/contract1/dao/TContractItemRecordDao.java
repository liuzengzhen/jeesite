/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.contract1.entity.TContractItemRecord;

/**
 * 增删改查DAO接口
 * @author liuzz
 * @version 2017-03-09
 */
@MyBatisDao
public interface TContractItemRecordDao extends CrudDao<TContractItemRecord> {
	/**
	 * 获取单条数据
	 * @param getByContractNum
	 * @return
	 */
	public TContractItemRecord getByContractNum(String ContractNum);
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int updateByNum(TContractItemRecord ContractNum);
	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * @param entity
	 * @return
	 */
	public int deleteByNum(String ContractNum);
}