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
import com.thinkgem.jeesite.modules.gen.entity.Enclosure;
import com.thinkgem.jeesite.modules.gen.entity.GenTable;
import com.thinkgem.jeesite.modules.gen.entity.GenTableColumn;
import com.thinkgem.jeesite.modules.gen.util.GenUtils;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.gen.dao.EnclosureDao;
import com.thinkgem.jeesite.modules.gen.dao.GenDataBaseDictDao;
import com.thinkgem.jeesite.modules.gen.dao.GenTableColumnDao;
import com.thinkgem.jeesite.modules.gen.dao.GenTableDao;

/**
 * 附件信息表Service
 * @author YangDong
 * @version 2017-02-18
 */
@Service
@Transactional
public class EnclosureService extends BaseService {

	@Autowired
	private EnclosureDao enclosureDao;
	
	public Enclosure get(String id) {
		Enclosure enclosure = enclosureDao.get(id);
		return enclosure;
	}
	
	public List<Enclosure> findAll(Enclosure enclosure) {
		return enclosureDao.findAllList(new Enclosure());
	}

	public void insertInfo(Enclosure enclosure) {
		enclosureDao.insertInfo(enclosure);
	}

	public Enclosure getState(String id) {
		Enclosure enclosure = enclosureDao.get(id);
		return enclosure;
	}
	
}
