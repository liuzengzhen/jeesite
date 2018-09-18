package com.thinkgem.jeesite.modules.cont.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 合同Entity
 * @author XK
 *
 */
public class Contract extends DataEntity<Contract> {

	private static final long serialVersionUID = -1598766239248293706L;
	
	private String contractNum;                //合同编号
	private String contractName;               //合同名称
	private BigDecimal totalSum;               //合同金额
	private String conludeBase;                //订立依据
	private String description;                //描述
	private String oppositeEnterprise;         //对方单位
	private String files;                      //附件
	private String status;                     //合同状态
	private Date performStartDate;             //履行开始日期
	private Date performEndDate;               //履行结束日期
	
	private boolean isSelf;                    //是否只查询自己起草的合同
	
	private ContCategory contCategory;                 //合同类别ID
	private String type;                         //合同类型ID
	
	public Contract() {
		super();
	}
	
	public Contract(String id) {
		super(id);
	}

	public String getContractNum() {
		return contractNum;
	}

	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public BigDecimal getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(BigDecimal totalSum) {
		this.totalSum = totalSum;
	}

	public String getConludeBase() {
		return conludeBase;
	}

	public void setConludeBase(String conludeBase) {
		this.conludeBase = conludeBase;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOppositeEnterprise() {
		return oppositeEnterprise;
	}

	public void setOppositeEnterprise(String oppositeEnterprise) {
		this.oppositeEnterprise = oppositeEnterprise;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPerformStartDate() {
		return performStartDate;
	}

	public void setPerformStartDate(Date performStartDate) {
		this.performStartDate = performStartDate;
	}

	public Date getPerformEndDate() {
		return performEndDate;
	}

	public void setPerformEndDate(Date performEndDate) {
		this.performEndDate = performEndDate;
	}

	public boolean isSelf() {
		return isSelf;
	}

	public void setSelf(boolean isSelf) {
		this.isSelf = isSelf;
	}

	public ContCategory getContCategory() {
		return contCategory;
	}

	public void setCategory(ContCategory contCategory) {
		this.contCategory = contCategory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
