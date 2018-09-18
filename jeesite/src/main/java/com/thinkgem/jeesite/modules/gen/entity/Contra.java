/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 业务表Entity
 * @author ThinkGem
 * @version 2013-10-15
 */
public class Contra extends DataEntity<Contra> {
	
	private static final long serialVersionUID = 1L;
	private String id; 	
	private String htbh; 
	private String zdybh; 	
	private String htmc;		
	private String xmbh;  //
	private String htfl; //
	private String htlx; //
	private String htzt; //
	private String lyfs; //

	public Contra() {
		super();
	}

	public Contra(String id){
		super(id);
	}
	
	@Length(min=1, max=200)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHtbh() {
		return htbh;
	}

	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	public String getZdybh() {
		return zdybh;
	}

	public void setZdybh(String zdybh) {
		this.zdybh = zdybh;
	}

	public String getHtmc() {
		return htmc;
	}

	public void setHtmc(String htmc) {
		this.htmc = htmc;
	}

	public String getXmbh() {
		return xmbh;
	}

	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}

	public String getHtfl() {
		return htfl;
	}

	public void setHtfl(String htfl) {
		this.htfl = htfl;
	}

	public String getHtlx() {
		return htlx;
	}

	public void setHtlx(String htlx) {
		this.htlx = htlx;
	}

	public String getHtzt() {
		return htzt;
	}

	public void setHtzt(String htzt) {
		this.htzt = htzt;
	}

	public String getLyfs() {
		return lyfs;
	}

	public void setLyfs(String lyfs) {
		this.lyfs = lyfs;
	}
	
}


