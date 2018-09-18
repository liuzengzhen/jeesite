/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.gen.entity.CtrContract;
import com.thinkgem.jeesite.modules.gen.entity.Enclosure;


/**
 * 合同表DAO接口
 * @author YangDong
 * @version 2017-02-21
 */
@MyBatisDao
public interface CtrContractDao extends CrudDao<CtrContract> {
	//保存信息
	public int insertInfo(CtrContract ctrContract);
	
}
