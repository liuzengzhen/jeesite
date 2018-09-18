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
import com.thinkgem.jeesite.modules.gen.entity.ContractFile;
import com.thinkgem.jeesite.modules.gen.entity.CtrContract;
import com.thinkgem.jeesite.modules.gen.entity.Enclosure;
import com.thinkgem.jeesite.modules.gen.entity.GenTable;
import com.thinkgem.jeesite.modules.gen.entity.GenTableColumn;
import com.thinkgem.jeesite.modules.gen.util.GenUtils;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.gen.dao.ContractFileDao;

/**
 * 合同附件信息表Service
 * @author YangDong
 * @version 2017-02-18
 */
@Service
@Transactional
public class ContractFileService extends BaseService {

	@Autowired
	private ContractFileDao contractFileDao;
	
	public ContractFile get(String id) {
		ContractFile contractFile = contractFileDao.get(id);
		return contractFile;
	}
	/**
	 *  @Title: findAll
	 * @Description: 获取合同附件表信息数据
	 * @author yd
	 */
	public List<ContractFile> list(ContractFile contractFile) {
		List<ContractFile> contractFile1 =  contractFileDao.findAllList(contractFile);
		 return contractFile1;
	}
	/**
	 *  @Title: insertInfo
	 * @Description: 保存信息
	 * @author yd
	 */
	public void insertInfo(ContractFile contractFile) {
		contractFileDao.insertInfo(contractFile);
	}
	/**
	 *  @Title: getState
	 * @Description:  获取单条数据
	 * @author yd
	 */
	public ContractFile getState(String id) {
		ContractFile contractFile = contractFileDao.get(id);
		return contractFile;
	}
	/**
	 *  @Title: insert
	 * @Description: 保存合同附件表信息数据
	 * @author yd
	 */
	public void insert(ContractFile contractFile) {
		if (StringUtils.isBlank(contractFile.getId())){
			contractFile.preInsert();
			contractFileDao.insert(contractFile);
		}
	}
	/**
	 *  @Title: save
	 * @Description: 保存合同附件表信息数据
	 * @author yd
	 */
	public void save(ContractFile contractFile) {
		contractFile.preInsert();
		contractFile.verSion();
		contractFileDao.save(contractFile);
	}
	/**
	 *  @Title: update
	 * @Description: 更新附件信息
	 * @author yd
	 */
	public void update(ContractFile contractFile) {
		contractFileDao.update(contractFile);
	}
	/**
	 *  @Title: delete
	 * @Description: 删除附件信息
	 * @author yd
	 */
	@SuppressWarnings("deprecation")
	public void delete(String s) {
		contractFileDao.delete(s);
	}
}
