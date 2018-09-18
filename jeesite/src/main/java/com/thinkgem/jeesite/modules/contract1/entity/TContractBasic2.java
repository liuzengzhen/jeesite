/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 增删改Entity
 * @author liuzz
 * @version 2017-03-09
 */
public class TContractBasic2 extends DataEntity<TContractBasic2> {
	
	private static final long serialVersionUID = 1L;
	private String contractNum;		// 合同编号
	private String contractCusNum;		// 自定义编号
	private String contractName;		// 合同名称
	private String sourceMethodCode;		// 来源方式
	private String categoryCode;		// 合同分类
	private String typeCode;		// 合同类型
	private String status;		// 合同状态
	private Date effectiveDate;		// 生效日期
	private Date endDate;		// 结束日期
	private String importantLevel;		// 重要级别
	private String currency;		// 原币种
	private String originTotalsum;		// 合同总金额(原币)
	private String totalsum;		// 合同总金额
	private String totalsumUpper;		// 合同金额(大写)
	private String guaranteeMoney;		// 质保金
	private String qiDepositPercent;		// 质保金比例
	private Date qiDepositEndDate;		// 质保金到期日期
	private String workflowId;		// 流程ID
	private String relationFlag;		// 是否存在关联关系
	private String ispayStamptax;		// 是否缴纳印花税
	private String stamptaxType;		// 印花税税目类型
	private String stamptaxRate;		// 印花税率
	private String stampTax;		// 印花税额
	private String stampTaxComment;		// 印花税说明
	private String sealMethod;		// 用印方式
	private String projectNum;		// 项目编号
	private String budgetProjectNum;		// 预算项目编号
	private String description;		// 合同说明
	private String recordId;		// 记录单ID
	
	public TContractBasic2() {
		super();
	}

	public TContractBasic2(String id){
		super(id);
	}

	@Length(min=0, max=50, message="合同编号长度必须介于 0 和 50 之间")
	public String getContractNum() {
		return contractNum;
	}

	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}
	
	@Length(min=0, max=50, message="自定义编号长度必须介于 0 和 50 之间")
	public String getContractCusNum() {
		return contractCusNum;
	}

	public void setContractCusNum(String contractCusNum) {
		this.contractCusNum = contractCusNum;
	}
	
	@Length(min=0, max=200, message="合同名称长度必须介于 0 和 200 之间")
	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	
	@Length(min=1, max=11, message="来源方式长度必须介于 1 和 11 之间")
	public String getSourceMethodCode() {
		return sourceMethodCode;
	}

	public void setSourceMethodCode(String sourceMethodCode) {
		this.sourceMethodCode = sourceMethodCode;
	}
	
	@Length(min=1, max=11, message="合同分类长度必须介于 1 和 11 之间")
	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	@Length(min=1, max=11, message="合同类型长度必须介于 1 和 11 之间")
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	@Length(min=1, max=11, message="合同状态长度必须介于 1 和 11 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Length(min=1, max=11, message="重要级别长度必须介于 1 和 11 之间")
	public String getImportantLevel() {
		return importantLevel;
	}

	public void setImportantLevel(String importantLevel) {
		this.importantLevel = importantLevel;
	}
	
	@Length(min=1, max=11, message="原币种长度必须介于 1 和 11 之间")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getOriginTotalsum() {
		return originTotalsum;
	}

	public void setOriginTotalsum(String originTotalsum) {
		this.originTotalsum = originTotalsum;
	}
	
	public String getTotalsum() {
		return totalsum;
	}

	public void setTotalsum(String totalsum) {
		this.totalsum = totalsum;
	}
	
	@Length(min=0, max=50, message="合同金额(大写)长度必须介于 0 和 50 之间")
	public String getTotalsumUpper() {
		return totalsumUpper;
	}

	public void setTotalsumUpper(String totalsumUpper) {
		this.totalsumUpper = totalsumUpper;
	}
	
	public String getGuaranteeMoney() {
		return guaranteeMoney;
	}

	public void setGuaranteeMoney(String guaranteeMoney) {
		this.guaranteeMoney = guaranteeMoney;
	}
	
	public String getQiDepositPercent() {
		return qiDepositPercent;
	}

	public void setQiDepositPercent(String qiDepositPercent) {
		this.qiDepositPercent = qiDepositPercent;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getQiDepositEndDate() {
		return qiDepositEndDate;
	}

	public void setQiDepositEndDate(Date qiDepositEndDate) {
		this.qiDepositEndDate = qiDepositEndDate;
	}
	
	@Length(min=1, max=11, message="流程ID长度必须介于 1 和 11 之间")
	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}
	
	@Length(min=1, max=1, message="是否存在关联关系长度必须介于 1 和 1 之间")
	public String getRelationFlag() {
		return relationFlag;
	}

	public void setRelationFlag(String relationFlag) {
		this.relationFlag = relationFlag;
	}
	
	@Length(min=1, max=1, message="是否缴纳印花税长度必须介于 1 和 1 之间")
	public String getIspayStamptax() {
		return ispayStamptax;
	}

	public void setIspayStamptax(String ispayStamptax) {
		this.ispayStamptax = ispayStamptax;
	}
	
	@Length(min=0, max=20, message="印花税税目类型长度必须介于 0 和 20 之间")
	public String getStamptaxType() {
		return stamptaxType;
	}

	public void setStamptaxType(String stamptaxType) {
		this.stamptaxType = stamptaxType;
	}
	
	public String getStamptaxRate() {
		return stamptaxRate;
	}

	public void setStamptaxRate(String stamptaxRate) {
		this.stamptaxRate = stamptaxRate;
	}
	
	public String getStampTax() {
		return stampTax;
	}

	public void setStampTax(String stampTax) {
		this.stampTax = stampTax;
	}
	
	@Length(min=0, max=1000, message="印花税说明长度必须介于 0 和 1000 之间")
	public String getStampTaxComment() {
		return stampTaxComment;
	}

	public void setStampTaxComment(String stampTaxComment) {
		this.stampTaxComment = stampTaxComment;
	}
	
	@Length(min=1, max=11, message="用印方式长度必须介于 1 和 11 之间")
	public String getSealMethod() {
		return sealMethod;
	}

	public void setSealMethod(String sealMethod) {
		this.sealMethod = sealMethod;
	}
	
	@Length(min=0, max=50, message="项目编号长度必须介于 0 和 50 之间")
	public String getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}
	
	@Length(min=0, max=50, message="预算项目编号长度必须介于 0 和 50 之间")
	public String getBudgetProjectNum() {
		return budgetProjectNum;
	}

	public void setBudgetProjectNum(String budgetProjectNum) {
		this.budgetProjectNum = budgetProjectNum;
	}
	
	@Length(min=0, max=1000, message="合同说明长度必须介于 0 和 1000 之间")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Length(min=1, max=20, message="记录单ID长度必须介于 1 和 20 之间")
	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	
}