/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.cont_num.web;

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
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.cont_num.entity.TContractNum;
import com.thinkgem.jeesite.modules.cont_num.service.TContractNumService;

/**
 * 合同流水号生成Controller
 * @author liuzz
 * @version 2017-03-09
 */
@Controller
@RequestMapping(value = "${adminPath}/cont_num/tContractNum")
public class TContractNumController extends BaseController {

	@Autowired
	private TContractNumService tContractNumService;
	
	@ModelAttribute
	public TContractNum get(@RequestParam(required=false) String id) {
		TContractNum entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tContractNumService.get(id);
		}
		if (entity == null){
			entity = new TContractNum();
		}
		return entity;
	}
	
	@RequiresPermissions("cont_num:tContractNum:view")
	@RequestMapping(value = {"list", ""})
	public String list(TContractNum tContractNum, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TContractNum> page = tContractNumService.findPage(new Page<TContractNum>(request, response), tContractNum); 
		model.addAttribute("page", page);
		return "modules/cont_num/tContractNumList";
	}

	@RequiresPermissions("cont_num:tContractNum:view")
	@RequestMapping(value = "form")
	public String form(TContractNum tContractNum, Model model) {
		model.addAttribute("tContractNum", tContractNum);
		return "modules/cont_num/tContractNumForm";
	}

	@RequiresPermissions("cont_num:tContractNum:edit")
	@RequestMapping(value = "save")
	public String save(TContractNum tContractNum, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tContractNum)){
			return form(tContractNum, model);
		}
		tContractNumService.save(tContractNum);
		addMessage(redirectAttributes, "保存合同流水号生成成功");
		return "redirect:"+Global.getAdminPath()+"/cont_num/tContractNum/?repage";
	}
	
	@RequiresPermissions("cont_num:tContractNum:edit")
	@RequestMapping(value = "delete")
	public String delete(TContractNum tContractNum, RedirectAttributes redirectAttributes) {
		tContractNumService.delete(tContractNum);
		addMessage(redirectAttributes, "删除合同流水号生成成功");
		return "redirect:"+Global.getAdminPath()+"/cont_num/tContractNum/?repage";
	}

}