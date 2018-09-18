/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract1.web;

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
import com.thinkgem.jeesite.modules.contract1.entity.TContractOperator2;
import com.thinkgem.jeesite.modules.contract1.service.TContractOperator2Service;

/**
 * 增删改查Controller
 * @author liuzz
 * @version 2017-03-09
 */
@Controller
@RequestMapping(value = "${adminPath}/contract1/tContractOperator2")
public class TContractOperator2Controller extends BaseController {

	@Autowired
	private TContractOperator2Service tContractOperator2Service;
	
	@ModelAttribute
	public TContractOperator2 get(@RequestParam(required=false) String id) {
		TContractOperator2 entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tContractOperator2Service.get(id);
		}
		if (entity == null){
			entity = new TContractOperator2();
		}
		return entity;
	}
	
	@RequiresPermissions("contract1:tContractOperator2:view")
	@RequestMapping(value = {"list", ""})
	public String list(TContractOperator2 tContractOperator2, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TContractOperator2> page = tContractOperator2Service.findPage(new Page<TContractOperator2>(request, response), tContractOperator2); 
		model.addAttribute("page", page);
		return "modules/contract1/tContractOperator2List";
	}

	@RequiresPermissions("contract1:tContractOperator2:view")
	@RequestMapping(value = "form")
	public String form(TContractOperator2 tContractOperator2, Model model) {
		model.addAttribute("tContractOperator2", tContractOperator2);
		return "modules/contract1/tContractOperator2Form";
	}

	@RequiresPermissions("contract1:tContractOperator2:edit")
	@RequestMapping(value = "save")
	public String save(TContractOperator2 tContractOperator2, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tContractOperator2)){
			return form(tContractOperator2, model);
		}
		tContractOperator2Service.save(tContractOperator2);
		addMessage(redirectAttributes, "保存增删改成功");
		return "redirect:"+Global.getAdminPath()+"/contract1/tContractOperator2/?repage";
	}
	
	@RequiresPermissions("contract1:tContractOperator2:edit")
	@RequestMapping(value = "delete")
	public String delete(TContractOperator2 tContractOperator2, RedirectAttributes redirectAttributes) {
		tContractOperator2Service.delete(tContractOperator2);
		addMessage(redirectAttributes, "删除增删改成功");
		return "redirect:"+Global.getAdminPath()+"/contract1/tContractOperator2/?repage";
	}

}