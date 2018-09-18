/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 增删改查Entity
 * @author liuzz
 * @version 2017-03-09
 */
public class TContractOperator2 extends DataEntity<TContractOperator2> {
	
	private static final long serialVersionUID = 1L;
	private String contractId;		// 合同ID
	private String operatorName;		// 操作人姓名
	private String operatorPhone;		// 操作人联系方式
	private String operateDept;		// 操作部门
	private String operatorType;		// 操作人类型
	private Date startDate;		// 开始日期
	private Date endDate;		// 结束日期
	private String status;		// 状态
	private String recordId;		// 记录单ID
	
	public TContractOperator2() {
		super();
	}

	public TContractOperator2(String id){
		super(id);
	}

	@Length(min=1, max=11, message="合同ID长度必须介于 1 和 11 之间")
	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	
	@Length(min=0, max=50, message="操作人姓名长度必须介于 0 和 50 之间")
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	@Length(min=0, max=20, message="操作人联系方式长度必须介于 0 和 20 之间")
	public String getOperatorPhone() {
		return operatorPhone;
	}

	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}
	
	@Length(min=0, max=50, message="操作部门长度必须介于 0 和 50 之间")
	public String getOperateDept() {
		return operateDept;
	}

	public void setOperateDept(String operateDept) {
		this.operateDept = operateDept;
	}
	
	@Length(min=0, max=20, message="操作人类型长度必须介于 0 和 20 之间")
	public String getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Length(min=1, max=1, message="状态长度必须介于 1 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=1, max=20, message="记录单ID长度必须介于 1 和 20 之间")
	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	
}