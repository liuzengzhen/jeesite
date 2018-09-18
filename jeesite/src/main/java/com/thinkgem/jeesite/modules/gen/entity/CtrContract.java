/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 *合同表Entity
 * @author YangDong
 * @version 2017-02-21
 */
public class CtrContract extends DataEntity<CtrContract> {
	
	private static final long serialVersionUID = 1L;
	private String id; 	
	private String sysOfficeId; //经办部门
	private String telePhone; 	//联系电话
	private String sysUserId;	//经办人	
	private String contractId;  //所属合同
	private String contractType; //合同类别
	private String contractSort; //合同种类
	private String contractName; //合同名称
	private String projectName;  //项目名称
	private String code;    //合同编号
	private String contractSource ; //合同来源
	private String isLink;  //是否关联合同
	private Date   startDate;   //生效日期
	private Date   endDate;   //结束日期
	private Date   contractDirDate  ;   //合同创建日期
	private String sealType  ;   //用印方式
	private String note ;   //备注
	private String terminaTion;   //是否废止
	private String contractLevel ;   //合同重要级别
	private String contractYbz;    //原 币 种
	private String contractMoney;    //合同原币金额
	private String contractMoneyCap;  //合同金额（大写）
	private String contractWarranty;  //质保金（原币）
	private String isprintTax ;   //是否缴纳印花税
	private String contractPrintType;   //印花税合同类型
	private int printRate;    //印花税率
	private int printMoney;   //印花税率
	private String printNote; //印花税说明
	private String payCondition; //收/付款条件
	private String otheyCondition ;   //其他条款
	private String isValid  ;   //是否有效
	
	private List<ContractFile> contractFile; //合同附件表

	public CtrContract() {
		super();
	}

	public CtrContract(String id){
		super(id);
	}

	@Length(min=1, max=200)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ContractFile> getContractFile() {
		return contractFile;
	}

	public void setContractFile(List<ContractFile> contractFile) {
		this.contractFile = contractFile;
	}

	public String getSysOfficeId() {
		return sysOfficeId;
	}

	public void setSysOfficeId(String sysOfficeId) {
		this.sysOfficeId = sysOfficeId;
	}

	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getSysUserId() {
		return sysUserId;
	}

	public void setSysUserId(String sysUserId) {
		this.sysUserId = sysUserId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractSort() {
		return contractSort;
	}

	public void setContractSort(String contractSort) {
		this.contractSort = contractSort;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContractSource() {
		return contractSource;
	}

	public void setContractSource(String contractSource) {
		this.contractSource = contractSource;
	}

	public String getIsLink() {
		return isLink;
	}

	public void setIsLink(String isLink) {
		this.isLink = isLink;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getContractDirDate() {
		return contractDirDate;
	}

	public void setContractDirDate(Date contractDirDate) {
		this.contractDirDate = contractDirDate;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTerminaTion() {
		return terminaTion;
	}

	public void setTerminaTion(String terminaTion) {
		this.terminaTion = terminaTion;
	}

	public String getContractLevel() {
		return contractLevel;
	}

	public void setContractLevel(String contractLevel) {
		this.contractLevel = contractLevel;
	}

	public String getContractYbz() {
		return contractYbz;
	}

	public void setContractYbz(String contractYbz) {
		this.contractYbz = contractYbz;
	}

	public String getContractMoney() {
		return contractMoney;
	}

	public void setContractMoney(String contractMoney) {
		this.contractMoney = contractMoney;
	}

	public String getContractMoneyCap() {
		return contractMoneyCap;
	}

	public void setContractMoneyCap(String contractMoneyCap) {
		this.contractMoneyCap = contractMoneyCap;
	}

	public String getContractWarranty() {
		return contractWarranty;
	}

	public void setContractWarranty(String contractWarranty) {
		this.contractWarranty = contractWarranty;
	}

	public String getIsprintTax() {
		return isprintTax;
	}

	public void setIsprintTax(String isprintTax) {
		this.isprintTax = isprintTax;
	}

	public String getContractPrintType() {
		return contractPrintType;
	}

	public void setContractPrintType(String contractPrintType) {
		this.contractPrintType = contractPrintType;
	}

	public Number getPrintRate() {
		return printRate;
	}

	public void setPrintRate(int printRate) {
		this.printRate = printRate;
	}

	public Number getPrintMoney() {
		return printMoney;
	}

	public void setPrintMoney(int printMoney) {
		this.printMoney = printMoney;
	}

	public String getPrintNote() {
		return printNote;
	}

	public void setPrintNote(String printNote) {
		this.printNote = printNote;
	}

	public String getPayCondition() {
		return payCondition;
	}

	public void setPayCondition(String payCondition) {
		this.payCondition = payCondition;
	}

	public String getOtheyCondition() {
		return otheyCondition;
	}

	public void setOtheyCondition(String otheyCondition) {
		this.otheyCondition = otheyCondition;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	
}


