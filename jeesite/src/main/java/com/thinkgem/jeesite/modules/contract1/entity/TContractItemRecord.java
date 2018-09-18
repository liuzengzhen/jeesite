/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 增删改查Entity
 * @author liuzz
 * @version 2017-03-09
 */
public class TContractItemRecord extends DataEntity<TContractItemRecord> {
	
	private static final long serialVersionUID = 1L;
	private Date makeDate;		// 制作日期
	private Date commitDate;		// 提交日期
	private String contractNum;		// 合同编号
	private String recordNum;		// 记录单编号
	private String recordName;		// 记录单名称
	private String contractCusNum;		// 自定义编号
	private String contractName;		// 合同名称
	private String operatorName;		// 执行人
	private String operatorPhone;		// 执行人联系电话
	private String operatorType;		// 执行部门
	private String recordPName;		// 制作人
	private String recordPDept;		// 制单部门
	private String recordExplain;		// 事件说明
	private String status;		// 记录单状态
	
	public TContractItemRecord() {
		super();
	}

	public TContractItemRecord(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCommitDate() {
		return commitDate;
	}

	public void setCommitDate(Date commitDate) {
		this.commitDate = commitDate;
	}
	
	@Length(min=0, max=200, message="合同编号长度必须介于 0 和 200 之间")
	public String getContractNum() {
		return contractNum;
	}

	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}
	
	@Length(min=0, max=50, message="记录单编号长度必须介于 0 和 50 之间")
	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}
	
	@Length(min=0, max=200, message="记录单名称长度必须介于 0 和 200 之间")
	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
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
	
	@Length(min=0, max=50, message="执行人长度必须介于 0 和 50 之间")
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	@Length(min=0, max=20, message="执行人联系电话长度必须介于 0 和 20 之间")
	public String getOperatorPhone() {
		return operatorPhone;
	}

	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}
	
	@Length(min=0, max=20, message="执行部门长度必须介于 0 和 20 之间")
	public String getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	
	@Length(min=0, max=50, message="制作人长度必须介于 0 和 50 之间")
	public String getRecordPName() {
		return recordPName;
	}

	public void setRecordPName(String recordPName) {
		this.recordPName = recordPName;
	}
	
	@Length(min=0, max=50, message="制单部门长度必须介于 0 和 50 之间")
	public String getRecordPDept() {
		return recordPDept;
	}

	public void setRecordPDept(String recordPDept) {
		this.recordPDept = recordPDept;
	}
	
	@Length(min=0, max=4000, message="事件说明长度必须介于 0 和 4000 之间")
	public String getRecordExplain() {
		return recordExplain;
	}

	public void setRecordExplain(String recordExplain) {
		this.recordExplain = recordExplain;
	}
	
	@Length(min=0, max=1, message="记录单状态长度必须介于 0 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}