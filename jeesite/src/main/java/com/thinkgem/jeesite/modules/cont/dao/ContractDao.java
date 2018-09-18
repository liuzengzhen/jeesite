package com.thinkgem.jeesite.modules.cont.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.cont.entity.Contract;

@MyBatisDao
public interface ContractDao extends CrudDao<Contract> {

}
