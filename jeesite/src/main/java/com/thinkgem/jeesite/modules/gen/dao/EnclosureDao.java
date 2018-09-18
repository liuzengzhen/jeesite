/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.gen.entity.Enclosure;

/**
 * 附件信息表DAO接口
 * @author YangDong
 * @version 2017-02-20
 */
@MyBatisDao
public interface EnclosureDao extends CrudDao<Enclosure> {

	//保存信息
	public int insertInfo(Enclosure enclosure);

	public Enclosure getState(String id);
	
}
