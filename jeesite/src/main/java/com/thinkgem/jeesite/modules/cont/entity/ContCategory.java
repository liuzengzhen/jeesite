package com.thinkgem.jeesite.modules.cont.entity;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 合同类别Entity
 * @author XK
 *
 */
public class ContCategory extends DataEntity<ContCategory> {

	private static final long serialVersionUID = -4332174157829362466L;
	
	private String code;             //类别编码
	private String name;             //类别名称
	
	public ContCategory() {
		super();
	}
	
	public ContCategory(String id) {
		super(id);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
