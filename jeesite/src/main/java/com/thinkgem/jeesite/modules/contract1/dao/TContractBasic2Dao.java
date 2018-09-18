/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.contract1.entity.TContractBasic2;

/**
 * 增删改DAO接口
 * @author liuzz
 * @version 2017-03-09
 */
@MyBatisDao
public interface TContractBasic2Dao extends CrudDao<TContractBasic2> {
	/**
	 * 获取单条数据
	 * @param contractNum
	 * @return
	 */
	public TContractBasic2 getnum(String contractNum);
}