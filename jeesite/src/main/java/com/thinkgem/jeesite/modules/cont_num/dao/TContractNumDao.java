/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cont_num.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.cont_num.entity.TContractNum;

/**
 * 合同流水号生成DAO接口
 * @author liuzz
 * @version 2017-03-09
 */
@MyBatisDao
public interface TContractNumDao extends CrudDao<TContractNum> {
	/**
	 * 获取单条数据
	 * @param organizedId
	 * @return
	 */
	public TContractNum getnum(String organizedId);
	
	/**
	 * 通过organizeID更新数据
	 * @param entity
	 * @return
	 */
	public int updateByorganizdeId(TContractNum entity);
	
}