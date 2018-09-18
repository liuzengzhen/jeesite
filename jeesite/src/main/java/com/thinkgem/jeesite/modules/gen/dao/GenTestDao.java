/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.gen.entity.GenTable;

/**
 * 合同表DAO接口
 * @author YangDong
 * @version 2017-02-16
 */
@MyBatisDao
public interface GenTestDao extends CrudDao<GenTable> {
	
}
