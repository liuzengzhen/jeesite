package com.thinkgem.jeesite.modules.cont.entity;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 合同类型Entity
 * @author XK
 *
 */
public class Type extends DataEntity<Type> {

	private static final long serialVersionUID = -3712163562322880696L;
	
	private String code;              //类型编码
	private String name;              //类型名称
	
	private ContCategory contCategory;        //类别ID

	public Type() {
		super();
	}
	
	public Type(String id) {
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

	public ContCategory getContCategory() {
		return contCategory;
	}

	public void setCategory(ContCategory contCategory) {
		this.contCategory = contCategory;
	}

}
