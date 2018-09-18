/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.gen.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.utils.IdGen;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 合同附件表Entity
 * @author YangDong
 * @version 2017-02-21
 */
public class ContractFile extends DataEntity<ContractFile> {
	
	private static final long serialVersionUID = 1L;
	private String id; 	
	private String name;   //附件名称
	private String crtContractId; 	//关联合同编号
	private Date uploadDate;		//上传时间
	private String fileName;  //附件文件名称
	private String fileNote; //附件说明
	private int fileVersion; //附件版本
	private String filePosition; //文件位置
	private String fileSort; //附件类型
	private String fileStatus; //附件状态
	private String fileAuthor; //上传人
	private Date fileUpdateDate; //最后修改时间

	
	public ContractFile() {
		super();
	}

	public ContractFile(String id){
		super(id);
	}
	
	@Length(min=1, max=200)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrtContractId() {
		return crtContractId;
	}

	public void setCrtContractId(String crtContractId) {
		this.crtContractId = crtContractId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileNote() {
		return fileNote;
	}

	public void setFileNote(String fileNote) {
		this.fileNote = fileNote;
	}

	public String getFilePosition() {
		return filePosition;
	}

	public void setFilePosition(String filePosition) {
		this.filePosition = filePosition;
	}

	public String getFileSort() {
		return fileSort;
	}

	public void setFileSort(String fileSort) {
		this.fileSort = fileSort;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getFileAuthor() {
		return fileAuthor;
	}

	public void setFileAuthor(String fileAuthor) {
		this.fileAuthor = fileAuthor;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	public int getFileVersion() {
		return fileVersion;
	}

	public void setFileVersion(int fileVersion) {
		this.fileVersion = fileVersion;
	}

	public Date getFileUpdateDate() {
		return fileUpdateDate;
	}

	public void setFileUpdateDate(Date fileUpdateDate) {
		this.fileUpdateDate = fileUpdateDate;
	}
	
	@Override
	public void preInsert(){
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
		setId(IdGen.uuid());
	}
	
	public void verSion(){
		int i = 0;
        for(i=i; i<=20; i++){
        	i = i+=1;
        	break;
        }
        setFileVersion(i);
	}
}


