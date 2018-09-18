/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.gen.entity.Contra;
import com.thinkgem.jeesite.modules.gen.entity.ContractFile;
import com.thinkgem.jeesite.modules.gen.entity.CtrContract;
import com.thinkgem.jeesite.modules.gen.entity.Enclosure;
import com.thinkgem.jeesite.modules.gen.entity.GenTable;
import com.thinkgem.jeesite.modules.gen.entity.GenTableColumn;
import com.thinkgem.jeesite.modules.gen.util.GenUtils;
import com.thinkgem.jeesite.modules.gen.dao.EnclosureDao;
import com.thinkgem.jeesite.modules.gen.dao.GenDataBaseDictDao;
import com.thinkgem.jeesite.modules.gen.dao.GenTableColumnDao;
import com.thinkgem.jeesite.modules.gen.dao.ContraDao;
import com.thinkgem.jeesite.modules.gen.dao.ContractFileDao;
import com.thinkgem.jeesite.modules.gen.dao.CtrContractDao;

/**
 * 合同信息表Service
 * @author YangDong
 * @version 2017-02-18
 */
@Service
@Transactional
public class CtrContractService extends BaseService {

	@Autowired
	private CtrContractDao ctrContractDao;
	
	@Autowired
	private ContractFileDao contractFileDao;
	/**
	 * @Title: list
	 * @Description: 获取合同信息表数据
	 * @author yd
	 */
	public List<CtrContract> list(CtrContract ctrContract) {
		return ctrContractDao.findAllList(new CtrContract());
	}
	/**
	 * @Title: get
	 * @Description: 根据合同编号查询合同表信息
	 * @author yd
	 */
	public CtrContract get(String code) {
		CtrContract ctrContract = ctrContractDao.get(code);
		return ctrContract;
	}
	/**
	 * @Title: save
	 * @Description: 保存合同表信息
	 * @author yd
	 */
	public void save(CtrContract ctrContract) {
		if (StringUtils.isBlank(ctrContract.getId())){
			ctrContract.preInsert();
			ctrContractDao.insert(ctrContract);
		}
	}
	/**
	 * @Title: update
	 * @Description: 更新合同表信息
	 * @author yd
	 */
	public void update(CtrContract ctrContract) {
		ctrContractDao.update(ctrContract);
	}
}
