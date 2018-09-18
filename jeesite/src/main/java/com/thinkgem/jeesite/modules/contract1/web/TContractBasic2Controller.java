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
import com.thinkgem.jeesite.modules.contract1.entity.TContractBasic2;
import com.thinkgem.jeesite.modules.contract1.service.TContractBasic2Service;

/**
 * 增删改Controller
 * @author liuzz
 * @version 2017-03-09
 */
@Controller
@RequestMapping(value = "${adminPath}/contract1/tContractBasic2")
public class TContractBasic2Controller extends BaseController {

	@Autowired
	private TContractBasic2Service tContractBasic2Service;
	
	@ModelAttribute
	public TContractBasic2 get(@RequestParam(required=false) String id) {
		TContractBasic2 entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tContractBasic2Service.get(id);
		}
		if (entity == null){
			entity = new TContractBasic2();
		}
		return entity;
	}
	
	@RequiresPermissions("contract1:tContractBasic2:view")
	@RequestMapping(value = {"list", ""})
	public String list(TContractBasic2 tContractBasic2, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TContractBasic2> page = tContractBasic2Service.findPage(new Page<TContractBasic2>(request, response), tContractBasic2); 
		model.addAttribute("page", page);
		return "modules/contract1/tContractBasic2List";
	}

	@RequiresPermissions("contract1:tContractBasic2:view")
	@RequestMapping(value = "form")
	public String form(TContractBasic2 tContractBasic2, Model model) {
		model.addAttribute("tContractBasic2", tContractBasic2);
		return "modules/contract1/tContractBasic2Form";
	}

	@RequiresPermissions("contract1:tContractBasic2:edit")
	@RequestMapping(value = "save")
	public String save(TContractBasic2 tContractBasic2, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tContractBasic2)){
			return form(tContractBasic2, model);
		}
		tContractBasic2Service.save(tContractBasic2);
		addMessage(redirectAttributes, "保存增删改成功");
		return "redirect:"+Global.getAdminPath()+"/contract1/tContractBasic2/?repage";
	}
	
	@RequiresPermissions("contract1:tContractBasic2:edit")
	@RequestMapping(value = "delete")
	public String delete(TContractBasic2 tContractBasic2, RedirectAttributes redirectAttributes) {
		tContractBasic2Service.delete(tContractBasic2);
		addMessage(redirectAttributes, "删除增删改成功");
		return "redirect:"+Global.getAdminPath()+"/contract1/tContractBasic2/?repage";
	}

}