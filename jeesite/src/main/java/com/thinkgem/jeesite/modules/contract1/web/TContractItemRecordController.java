/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.cont_num.service.TContractNumService;
import com.thinkgem.jeesite.modules.contract1.entity.TContractBasic2;
import com.thinkgem.jeesite.modules.contract1.entity.TContractItemRecord;
import com.thinkgem.jeesite.modules.contract1.entity.TContractOperator2;
import com.thinkgem.jeesite.modules.contract1.service.TContractBasic2Service;
import com.thinkgem.jeesite.modules.contract1.service.TContractItemRecordService;
import com.thinkgem.jeesite.modules.contract1.service.TContractOperator2Service;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;

/**
 * 增删改查Controller
 * 
 * @author liuzz
 * @version 2017-03-09
 */
@Controller
@RequestMapping(value = "${adminPath}/contract1/tContractItemRecord")
public class TContractItemRecordController extends BaseController {
	@Autowired
	private TContractBasic2Service tContractBasic2Service;
	@Autowired
	private TContractItemRecordService tContractItemRecordService;
	@Autowired
	private TContractOperator2Service tContractOperator2Service;
	@Autowired
	private TContractNumService tContractNumService;

	@ModelAttribute
	public TContractItemRecord get(@RequestParam(required = false) String id) {
		TContractItemRecord entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = tContractItemRecordService.get(id);
		}
		if (entity == null) {
			entity = new TContractItemRecord();
		}
		return entity;
	}

	@RequiresPermissions("contract1:tContractItemRecord:view")
	@RequestMapping(value = { "list", "" })
	public String list(TContractItemRecord tContractItemRecord, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		Page<TContractItemRecord> page = tContractItemRecordService
				.findPage(new Page<TContractItemRecord>(request, response), tContractItemRecord);
		model.addAttribute("page", page);
		return "modules/contract1/tContractItemRecordList";
	}

	@RequiresPermissions("contract1:tContractItemRecord:view")
	@RequestMapping(value = "form")
	public String form(TContractItemRecord tContractItemRecord, Model model) {
		model.addAttribute("tContractItemRecord", tContractItemRecord);
		return "modules/contract1/tContractItemRecordForm";
	}

	// 保存
	@RequestMapping(value = "save")
	public String save(TContractItemRecord tContractItemRecord, Model model, RedirectAttributes redirectAttributes)
			throws ParseException {
		TContractItemRecord flag = tContractItemRecordService.getByContractNum(tContractItemRecord.getContractNum());
		String ContractNum = tContractItemRecord.getContractNum();		
		// 制单时间
		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = sdf.format(currentTime);
		Date date = sdf.parse(dateString);
		tContractItemRecord.setMakeDate(date);
		// 如果本合同编号存在事件单执行update，没有新数据执行save
		if (flag == null) {
			// 记录单编号
			String RecordNum = tContractNumService.RecordNum(ContractNum);
			tContractItemRecord.setRecordNum(RecordNum);
			tContractItemRecordService.save(tContractItemRecord);
		} else {

			tContractItemRecordService.updateByNum(tContractItemRecord);
		}
		model.addAttribute("message",  "保存成功");
		this.skipRecord(ContractNum, model);
		return "modules/gen/enclosure2";
	}

	// 提交
	@RequestMapping(value = "submit")
	public String submit(String ContractNum, Model model, RedirectAttributes redirectAttributes) throws ParseException {
		// 通过流水号查询
		TContractItemRecord tContractItemRecord = tContractItemRecordService.getByContractNum(ContractNum);
		// 如果直接提交没有执行保存生产制单时间

		if (tContractItemRecord.getMakeDate() == null) {
			// 制单时间
			Date currentTime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdf.format(currentTime);
			Date date = sdf.parse(dateString);
			tContractItemRecord.setMakeDate(date);

		}
		// 加判断如果有提交时间返回flase
		if (tContractItemRecord.getCommitDate() != null) {
			// 加文本提示信息
		} else {
			// 提交时间
			Date currentTime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdf.format(currentTime);
			Date date = sdf.parse(dateString);
			tContractItemRecord.setCommitDate(date);
			tContractItemRecord.setStatus("1");
			tContractItemRecordService.save(tContractItemRecord);
		}
		model.addAttribute("message",  "提交成功");		
		this.skipRecord(ContractNum, model);
		return "modules/gen/enclosure2";
	}
	// 修改
	@RequestMapping(value = "update")
	public String update(Model model,String ContractNum, String recordExplain, String recordName, RedirectAttributes redirectAttributes) throws ParseException{
		// 通过流水号查询
		
		TContractItemRecord tContractItemRecord = tContractItemRecordService.getByContractNum(ContractNum);
		                    tContractItemRecord.setRecordExplain(recordExplain);
		                    tContractItemRecord.setRecordName(recordName);
		tContractItemRecordService.updateByNum(tContractItemRecord);
		model.addAttribute("message",  "修改成功");
		this.skipRecord(ContractNum, model);
		return "modules/gen/enclosure2";
	}
	
   //跳转
	@RequestMapping(value = "skipRecord")
	public String skipRecord(String contractnum, Model model) {
		// 获取事件单对象
		TContractItemRecord TContractItemRecord = tContractItemRecordService.getByContractNum(contractnum);
		TContractBasic2 contractBasic = tContractBasic2Service.getnum(contractnum);
		String contract_id = contractBasic.getId();
		TContractOperator2 contractOperator = tContractOperator2Service.getByContractId(contract_id);
		// 获取制表人信息
		User user = UserUtils.getUser();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(new Date());
		// 名称
		String recordName = contractBasic.getContractName() + time;
		String recordState = "草稿";
		model.addAttribute("recordState", recordState);
		model.addAttribute("contractBasic", contractBasic);
		model.addAttribute("contractOperator", contractOperator);
		model.addAttribute("user", user);
		model.addAttribute("recordName", recordName);
		model.addAttribute("TContractItemRecord", TContractItemRecord);
		// addMessage(redirectAttributes, "删除增删改成功");

		return "modules/gen/enclosure2";
	}

}