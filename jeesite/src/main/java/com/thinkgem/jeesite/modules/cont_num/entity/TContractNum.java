/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cont_num.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 合同流水号生成Entity
 * @author liuzz
 * @version 2017-03-09
 */
public class TContractNum extends DataEntity<TContractNum> {
	
	private static final long serialVersionUID = 1L;
	private String organizedId;		// 组织编码
	private String year;		// 年限
	private String lastnum;		// 最新流水号
	
	public TContractNum() {
		super();
	}

	public TContractNum(String id){
		super(id);
	}

	@Length(min=1, max=50, message="组织编码长度必须介于 1 和 50 之间")
	public String getOrganizedId() {
		return organizedId;
	}

	public void setOrganizedId(String organizedId) {
		this.organizedId = organizedId;
	}
	
	@Length(min=0, max=50, message="年限长度必须介于 0 和 50 之间")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	@Length(min=0, max=50, message="最新流水号长度必须介于 0 和 50 之间")
	public String getLastnum() {
		return lastnum;
	}

	public void setLastnum(String lastnum) {
		this.lastnum = lastnum;
	}
	
}