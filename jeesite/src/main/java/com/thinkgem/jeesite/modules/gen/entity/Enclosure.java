/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.utils.StringUtils;

/**
 * 业务表Entity
 * @author ThinkGem
 * @version 2013-10-15
 */
public class Enclosure extends DataEntity<Enclosure> {
	
	private static final long serialVersionUID = 1L;
	private String id; 	
	private String fjfl; 
	private String fjmc; 	
	private String glhtbh;		
	private String scsj;  //
	private String fjwjm; //
	private String bexx; //

	public Enclosure() {
		super();
	}

	public Enclosure(String id){
		super(id);
	}
	
	@Length(min=1, max=200)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFjfl() {
		return fjfl;
	}

	public void setFjfl(String fjfl) {
		this.fjfl = fjfl;
	}

	public String getFjmc() {
		return fjmc;
	}

	public void setFjmc(String fjmc) {
		this.fjmc = fjmc;
	}

	public String getGlhtbh() {
		return glhtbh;
	}

	public void setGlhtbh(String glhtbh) {
		this.glhtbh = glhtbh;
	}

	public String getScsj() {
		return scsj;
	}

	public void setScsj(String scsj) {
		this.scsj = scsj;
	}

	public String getFjwjm() {
		return fjwjm;
	}

	public void setFjwjm(String fjwjm) {
		this.fjwjm = fjwjm;
	}

	public String getBexx() {
		return bexx;
	}

	public void setBexx(String bexx) {
		this.bexx = bexx;
	}
}


